/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.ArrayList;
import java.util.Scanner;
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
