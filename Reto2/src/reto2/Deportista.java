/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
public class Deportista extends Persona{
    
    private String marcaClasificacion;

    public Deportista(String nombres, String apellidos, String identificacion, 
            String nacionalidad, int edad, String deporte,String marcaClasificacion,String tipo) {
        super(nombres, apellidos, identificacion, nacionalidad, edad, deporte, tipo);
        this.marcaClasificacion = marcaClasificacion;
    }      

    @Override
    public String toString() {
        String toReturn = "Deportista\n";
        toReturn += "\t " + this.nombres + " " + this.apellidos + "\n";
        toReturn += "\t Identidad: " + this.identificacion + "\n";
        toReturn += "\t Edad: " + Integer.toString(this.edad) + "\n";
        toReturn += "\t Deporte: " + this.deporte + "\n";
        toReturn += "\t Marca Clasificación: " + this.marcaClasificacion + "\n";
        toReturn += "\t Nacionalidad: " + this.nacionalidad + "\n";          
        toReturn += "\t \t ------";      
        return toReturn; //To change body of generated methods, choose Tools | Templates.
    }
    
}