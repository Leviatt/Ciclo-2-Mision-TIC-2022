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
public class MatriculasModel {

    private int id_matricula = 0;
    private int id_tutoria;
    private String id_estudiante;

    public MatriculasModel(int id_matricula, int id_tutoria, String id_estudiante) {
        this.id_matricula = id_matricula;
        this.id_tutoria = id_tutoria;
        this.id_estudiante = id_estudiante;
    }

    public MatriculasModel(int id_tutoria, String id_estudiante) {
        this.id_tutoria = id_tutoria;
        this.id_estudiante = id_estudiante;
    }
    
    /**
     * @return the id_matricula
     */
    public int getId_matricula() {
        return id_matricula;
    }

    /**
     * @return the id_tutoria
     */
    public int getId_tutoria() {
        return id_tutoria;
    }

    /**
     * @return the id_estudiante
     */
    public String getId_estudiante() {
        return id_estudiante;
    }
    
}
