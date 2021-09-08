/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author perei
 */
public class RolesModel {
    private int id;
    private String rol;

    public int getId() {
        return id;
    }

    public String getRol() {
        return rol;
    }

    public RolesModel(int id, String rol) {
        this.id = id;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return this.id + " " + this.rol; //To change body of generated methods, choose Tools | Templates.
    }
    
}
