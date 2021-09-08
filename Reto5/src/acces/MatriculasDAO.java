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
import model.MatriculasModel;
import utils.ConnectionDB;

/**
 *
 * @author perei
 */
public class MatriculasDAO {

    private Connection conn = null;

    /**
     *
     * @return
     */
    public ArrayList<MatriculasModel> getAllTutorias() {
        ArrayList<MatriculasModel> matriculas = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT id_matricula, id_tutoria, id_estudiante"
                    + " FROM matriculas"
                    + " ORDER BY id_estudiante ASC";

            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                MatriculasModel matricula = new MatriculasModel(result.getInt(1),
                        result.getInt(2), result.getString(3));
                matriculas.add(matricula);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return matriculas;
    }

    public ArrayList<MatriculasModel> getFilteredTutorias(String estudiante) {
        ArrayList<MatriculasModel> matriculas = new ArrayList();
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT id_matricula, id_tutoria, id_estudiante"
                    + " FROM matriculas"
                    + " WHERE id_estudiante LIKE ?"
                    + " ORDER BY id_estudiante ASC";
            //System.out.println(case_);            
            PreparedStatement statement = conn.prepareStatement(sql);
            //System.out.println(sql);            
            statement.setString(1, "%" + estudiante + "%");

            //System.out.println(statement.toString());
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                MatriculasModel matricula = new MatriculasModel(result.getInt(1),
                        result.getInt(2), result.getString(3));
                matriculas.add(matricula);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return matriculas;
    }

    public void insertMatricula(MatriculasModel matricula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "INSERT INTO matriculas(id_estudiante, id_tutoria)"
                    + " VALUES(?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, matricula.getId_estudiante());
            statement.setInt(2, matricula.getId_tutoria());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

    public void updateMatricula(MatriculasModel matricula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "UPDATE matriculas"
                    + "SET id_tutoria=?, id_estudiante=?"
                    + "WHERE id_matricula=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, matricula.getId_tutoria());
            statement.setString(2, matricula.getId_estudiante());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue editado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }

    }

    public void deleteTutoria(int id_matricula) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM matriculas"
                    + " WHERE id_matricula = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id_matricula);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {

                JOptionPane.showMessageDialog(null, "El registro fue eliminado exitosamente !");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

}
