/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;


public class Persona{
    protected String nombres;
    protected String apellidos;
    protected String identificacion;
    protected String nacionalidad;
    protected int edad;
    protected String deporte;
    protected String tipo;

    public Persona(String nombres, String apellidos, String identificacion,
            String nacionalidad, int edad, String deporte, String tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.deporte = deporte;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.nombres; //To change body of generated methods, choose Tools | Templates.
    }
    
}