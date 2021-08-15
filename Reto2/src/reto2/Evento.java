/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author perei
 */

class Persona{
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

class Deportista extends Persona{
    
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

class Entrenador extends Persona{
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

public class Evento {
    private static final ArrayList<Persona> personas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       procesarComando();
        
    }

    public static void agregarParticipante(Persona persona){
        personas.add(persona);
    }
    public static ArrayList obtenerParticipantes(){
        return personas;
    }
    public static void procesarComando(){
         Scanner scan = new Scanner(System.in);
         int command=0;
        while (command !=4){
            String line = scan.nextLine();

            String[] info = line.split("&");
            command =Integer.parseInt(info[0]);
            switch(command){
                case 1: //Agregar deportista
                    Deportista deportista = new Deportista(info[3],info[4],info[2]
                            ,info[8],Integer.parseInt(info[5]),info[6],info[7],info[1]);
                    agregarParticipante(deportista);
                    break;
                case 2:
                    Entrenador entrenador = new Entrenador(info[3],info[4],info[2]
                            ,info[7],Integer.parseInt(info[5]),info[6],
                            info[8].toLowerCase().equals("si"),info[1]);
                    agregarParticipante(entrenador);
                    break;
                case 3:
                    System.out.println("***** Participantes Juegos Olimpicos *****");
                    for(var persona: personas){
                        System.out.println(persona.toString());
                    }
                    break;
                case 4:
                    System.out.println("Ejecución finalizada!");
                    break;
                default: 
                    //System.out.println("ERROR:COMMAND NO EXIST");
                    break;
            }
        }
    }
}
