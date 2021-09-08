/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acces;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.TutoriasModel;
import utils.ConnectionDB;

/**
 *
 * @author perei
 */
public class TutoriasDAO {

    private Connection conn = null;

    /**
     *
     * @return
     */
    public ArrayList<TutoriasModel> getAllTutorias() {
        ArrayList<TutoriasModel> tutorias = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT id_tutoria, titulo, descripcion, año, nombres, apellidos, id_docente_encargado"
                    + " FROM tutorias JOIN usuarios"
                    + " ON tutorias.id_docente_encargado=usuarios.correo_electronico ORDER BY tutorias.titulo ASC";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                TutoriasModel tutoria = new TutoriasModel(result.getInt(1),
                        result.getString(2), result.getString(3), result.getInt(4),
                        result.getString(5), result.getString(6), result.getString(7));
                tutorias.add(tutoria);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return tutorias;
    }

    public ArrayList<TutoriasModel> getFilteredTutorias(String titulo, String correo, String apellidos) {
        ArrayList<TutoriasModel> tutorias = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT id_tutoria, titulo, descripcion, año, nombres, apellidos, id_docente_encargado"
                    + "FROM tutorias JOIN usuarios"+
                    " ON tutorias.id_docente_encargado=usuarios.correo_electronico"
                    + " WHERE titulo LIKE ? AND id_docente_encargado LIKE ? AND apellidos LIKE ?"
                    + " ORDER BY tutorias.titulo ASC";

            //System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            
            statement.setString(1, "%" + titulo + "%");
            statement.setString(2, "%" + correo + "%");
            statement.setString(3, "%" + apellidos + "%");

            //System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                TutoriasModel tutoria = new TutoriasModel(result.getInt(1),
                        result.getString(2), result.getString(3), result.getInt(4),
                        result.getString(5), result.getString(6), result.getString(7));
                tutorias.add(tutoria);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return tutorias;
    }

    public void insertTutoria(TutoriasModel tutoria) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "INSERT INTO tutorias (titulo, descripcion, año, id_docente_encargado)"
                    + " VALUES(?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, tutoria.getTitulo());
            statement.setString(2, tutoria.getDescripcion());
            statement.setInt(3, tutoria.getAño());
            statement.setString(4, tutoria.getId_docente_encargado_FK());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    public void updateTutoria(TutoriasModel tutoria) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE tutorias"
                    + " SET titulo=?, descripcion=?, año=?,id_docente_encargado=?"
                    + " WHERE id_tutoria=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, tutoria.getTitulo());
            statement.setString(2, tutoria.getDescripcion());
            statement.setInt(3, tutoria.getAño());
            statement.setString(4, tutoria.getId_docente_encargado_FK());
            statement.setInt(5, tutoria.getId_turoria());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue editado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }

    }

    public void deleteTutoria(int id_tutoria) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM matriculas"
                    + " WHERE id_tutoria = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id_tutoria);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                sql = "DELETE FROM tutorias"
                        + " WHERE id_tutoria = ?";
                statement = conn.prepareStatement(sql);
                statement.setInt(1, id_tutoria);
                rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "El registro fue eliminado exitosamente !");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }
}
