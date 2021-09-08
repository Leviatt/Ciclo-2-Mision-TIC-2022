/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class UsuariosModel {
    private String correo_electronico;
    private String nombres;
    private String apellidos;
    private int edad;
    private String contraseña;
    private String rol;

    /**
     * @return the correo_electronico
     */
    public String getCorreo_electronico() {
        return correo_electronico;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @return the id_rol
     */
    public String getRol() {
        return rol;
    }

    public UsuariosModel(String correo_electronico, String nombres, String apellidos, int edad, String contraseña, String rol) {
        this.correo_electronico = correo_electronico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return this.correo_electronico; //To change body of generated methods, choose Tools | Templates.
    }
    
}
