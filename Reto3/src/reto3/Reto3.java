/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author perei
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listaCarrerasConPremioDoble = {0, 3, 6};
        String caballo = "Spirit";
        ArrayList<String> listaGanadores= new ArrayList<>(List.of("Imperioso", 
                "Imperioso", "Babieca", "Pegazo", "Imperiozo", "Babieca", "Snow",
                "Amatista"));
        ArrayList<String>  listaGanadoresHoy = new ArrayList<>(List.of(
                "Imperioso", "Spirit", "Imperiozo", "Pegazo", "Imperiozo", 
                "Spirit", "Spirit", "Jumper"));
        System.out.println((Hipica.obtenerMinimoNuevosGanadores(listaGanadores,listaGanadoresHoy)));
    }

}
