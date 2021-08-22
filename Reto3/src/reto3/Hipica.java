/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.util.ArrayList;

/**
 *
 * @author perei
 */

public class Hipica {
    public static ArrayList<String> obtenerAgregadoGanadores( ArrayList<String> listaGanadores ){
        ArrayList<String> s = new ArrayList();        
        for(String str : listaGanadores){
            if(!s.contains(str))s.add(str);
        }
        return s;
    }
    public static  ArrayList<Integer> obtenerPosicionesPremioDoble(ArrayList<Integer> listaCarrerasConPremioDoble, ArrayList<String> listaGanadores,String caballo ){
        ArrayList<Integer> s =new ArrayList<>();
        for(int p:listaCarrerasConPremioDoble){
            if(listaGanadores.get(p).equals(caballo)) s.add(p);
            
        }
        return s;
    }
    public static  ArrayList<String> obtenerCaballosNoGanadores(  ArrayList<String> listaGanadoresAyer,  ArrayList<String> listaGanadoresHoy ){
         ArrayList<String> s = new  ArrayList<>();
        int i = 0;
        for(String str : listaGanadoresAyer){
            if(!listaGanadoresHoy.contains(str))s.add(str);
        }
        return s;
    }
    
    public static Integer obtenerMinimoNuevosGanadores(  ArrayList<String> listaGanadoresAyer,  ArrayList<String> listaGanadoresHoy ){
        
        ArrayList<String> s =new  ArrayList<>();
        ArrayList<String> s2 =new  ArrayList<>();
        for(String str : listaGanadoresAyer){
            if(!listaGanadoresHoy.contains(str) && !s.contains(str))s.add(str);
        }
        for(String str : listaGanadoresHoy){
            if(!listaGanadoresAyer.contains(str) && !s2.contains(str))s2.add(str);
        }
        int i=s.size();
        int j=s2.size();
        return i>j?j:i;
    }
}
