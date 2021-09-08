/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import model.RolesModel;
import utils.ConnectionDB;

public class RolesDAO {
     
    private Connection conn = null;
    
    /**
     * 
     * @return 
     */
    public ArrayList<RolesModel> getAllRoles() {
        ArrayList<RolesModel> roles = new ArrayList<>();
        try {
            if(conn == null)
                conn = ConnectionDB.getConnection();
            
            String sql = "SELECT id_rol, rol FROM roles;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while (result.next()) {
                RolesModel presentation = new RolesModel(result.getInt(1), result.getString(2));
                roles.add( presentation );
            }
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog   (null, "Código : " + ex.getErrorCode() 
                                        + "\nError :" + ex.getMessage());
        }
        return roles;
    }
}
