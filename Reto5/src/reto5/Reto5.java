/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import acces.RolesDAO;
import java.util.ArrayList;
import model.RolesModel;


/**
 *
 * @author perei
 */
public class Reto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RolesDAO r = new RolesDAO();
        ArrayList<RolesModel> a = r.getAllRoles();
        for(RolesModel as : a){
            System.out.println(as.toString());
        }
    }

}
