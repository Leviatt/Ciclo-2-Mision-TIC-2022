/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author perei
 */
public class Entrenador extends Persona{
    private boolean esCertificado;

    public Entrenador(String nombres, String apellidos, String identificacion, 
            String nacionalidad, int edad, String deporte,boolean esCertificado,String tipo){
        super(nombres, apellidos, identificacion, nacionalidad, edad, deporte, tipo);
        this.esCertificado = esCertificado;
    }   
    @Override
    public String toString() {
        String toReturn = "Entrenador\n";
        toReturn += "\t " + this.nombres + " " + this.apellidos + "\n";
        toReturn += "\t Identidad: " + this.identificacion + "\n";
        toReturn += "\t Edad: " + Integer.toString(this.edad) + "\n";
        toReturn += "\t Deporte: " + this.nacionalidad + "\n";
        toReturn += "\t Certificado: " + (this.esCertificado? "Certificado":"No Certificado") + "\n";        
        toReturn += "\t \t ------";
        return toReturn; //To change body of generated methods, choose Tools | Templates.
    }
    
}    
