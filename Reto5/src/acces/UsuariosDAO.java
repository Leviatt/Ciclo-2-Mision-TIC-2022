package acces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import model.UsuariosModel;
import utils.ConnectionDB;

/**
 *
 * @author casierrav
 */
public class UsuariosDAO {

    private Connection conn = null;

    /**
     *
     * @return
     */
    public ArrayList<UsuariosModel> getAllUsuarios() {
        ArrayList<UsuariosModel> usuarios = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT correo_electronico,nombres,apellidos,edad,contraseña,rol"
                    + " FROM  usuarios JOIN roles"
                    + " ON usuarios.id_rol = roles.id_rol ORDER BY usuarios.apellidos ASC;";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                UsuariosModel usuario = new UsuariosModel(result.getString(1),
                        result.getString(2), result.getString(3), result.getInt(4), result.getString(5), result.getString(6));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return usuarios;
    }

    public ArrayList<UsuariosModel> getFilteredUsuarios(String rol, String nombre, String correo) {
        ArrayList<UsuariosModel> usuarios = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT correo_electronico,nombres,apellidos,edad,contraseña,rol"
                    + " FROM  usuarios JOIN roles"
                    + " ON usuarios.id_rol = roles.id_rol"
                    + " WHERE nombres LIKE ? OR correo_electronico LIKE ?  AND rol = ?;"
                    + " ORDER BY usuarios.apellidos ASC";

            //System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            
            statement.setString(1, "%" + nombre + "%");
            statement.setString(2, "%" + correo + "%");
            statement.setString(3, "%" + rol + "%");

            //System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                UsuariosModel usuario = new UsuariosModel(result.getString(1),
                        result.getString(2), result.getString(3), result.getInt(4), result.getString(5), result.getString(6));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return usuarios;
    }

    public void insertUsuario(UsuariosModel usuario) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "INSERT INTO usuarios (correo_electronico, nombres, apellidos, edad, contraseña, id_rol) VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, usuario.getCorreo_electronico());
            statement.setString(2, usuario.getNombres());
            statement.setString(3, usuario.getApellidos());
            statement.setInt(4, usuario.getEdad());
            statement.setString(5, usuario.getContraseña());
            statement.setInt(6, "Docente".equals(usuario.getRol()) ? 1 : 2);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    public void updateUsuario(UsuariosModel usuario, String correo_electronico) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE usurarios"
                    + " SET nombres=? , apellidos=?,edad=?,contaseña=?,id_rol=?"
                    + " WHERE correo_electronico=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, usuario.getNombres());
            statement.setString(2, usuario.getApellidos());
            statement.setInt(3, usuario.getEdad());
            statement.setString(4, usuario.getContraseña());
            statement.setInt(5, "Docente".equals(usuario.getRol()) ? 1 : 2);
            statement.setString(6, usuario.getCorreo_electronico());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue editado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }

    }

    public void deleteUsuario(String correo) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM matriculas"
                    + " WHERE id_estudiante = ? ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, correo);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                sql = "DELETE FROM tutorias"
                        + " WHERE id_docente_encargado = ?";
                statement = conn.prepareStatement(sql);
                statement.setString(1, correo);
                rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    sql = "DELETE FROM usuarios"
                            + " WHERE correo_electronico = ?";
                    statement = conn.prepareStatement(sql);
                    statement.setString(1, correo);
                    rowsInserted = statement.executeUpdate();

                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "El registro fue eliminado exitosamente !");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }
}
