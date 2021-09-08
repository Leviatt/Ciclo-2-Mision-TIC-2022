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
public class TutoriasModel {

    private int id_turoria;
    private String titulo;
    private String descripcion;
    private int año;
    private String id_docente_encargado_FK;
    private String nombres;
    private String apellidos;

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the id_turoria
     */
    public int getId_turoria() {
        return id_turoria;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @return the id_docente_encargado_FK
     */
    public String getId_docente_encargado_FK() {
        return id_docente_encargado_FK;
    }

    public TutoriasModel(int id_turoria, String titulo, String descripcion, int año, String id_docente_encargado_FK, String nombres, String apellidos) {
        this.id_turoria = id_turoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.año = año;
        this.id_docente_encargado_FK = id_docente_encargado_FK;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public TutoriasModel(String titulo, String descripcion, int año, String id_docente_encargado_FK, String nombres, String apellidos) {
        this.id_turoria = 0;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.año = año;
        this.id_docente_encargado_FK = id_docente_encargado_FK;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return this.titulo; //To change body of generated methods, choose Tools | Templates.
    }
    
}
