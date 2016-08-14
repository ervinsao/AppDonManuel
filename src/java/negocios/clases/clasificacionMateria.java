/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.clases;

/**
 *
 * @author Ervin
 */
public class clasificacionMateria {

    private int id_clasificacion_materia;
    private String descripcion_clasificacion_materia;
    private char estado_clasificacion_materia;
    private double total_clasificacion_materia;

    public clasificacionMateria() {
    }

    public clasificacionMateria(int id_clasificacion_materia, String descripcion_clasificacion_materia, char estado_clasificacion_materia, double total_clasificacion_materia) {
        this.id_clasificacion_materia = id_clasificacion_materia;
        this.descripcion_clasificacion_materia = descripcion_clasificacion_materia;
        this.estado_clasificacion_materia = estado_clasificacion_materia;
        this.total_clasificacion_materia = total_clasificacion_materia;
    }

    /**
     * @return the id_clasificacion_materia
     */
    public int getId_clasificacion_materia() {
        return id_clasificacion_materia;
    }

    /**
     * @param id_clasificacion_materia the id_clasificacion_materia to set
     */
    public void setId_clasificacion_materia(int id_clasificacion_materia) {
        this.id_clasificacion_materia = id_clasificacion_materia;
    }

    /**
     * @return the descripcion_clasificacion_materia
     */
    public String getDescripcion_clasificacion_materia() {
        return descripcion_clasificacion_materia;
    }

    /**
     * @param descripcion_clasificacion_materia the descripcion_clasificacion_materia to set
     */
    public void setDescripcion_clasificacion_materia(String descripcion_clasificacion_materia) {
        this.descripcion_clasificacion_materia = descripcion_clasificacion_materia;
    }

    /**
     * @return the estado_clasificacion_materia
     */
    public char getEstado_clasificacion_materia() {
        return estado_clasificacion_materia;
    }

    /**
     * @param estado_clasificacion_materia the estado_clasificacion_materia to set
     */
    public void setEstado_clasificacion_materia(char estado_clasificacion_materia) {
        this.estado_clasificacion_materia = estado_clasificacion_materia;
    }

    /**
     * @return the total_clasificacion_materia
     */
    public double getTotal_clasificacion_materia() {
        return total_clasificacion_materia;
    }

    /**
     * @param total_clasificacion_materia the total_clasificacion_materia to set
     */
    public void setTotal_clasificacion_materia(double total_clasificacion_materia) {
        this.total_clasificacion_materia = total_clasificacion_materia;
    }
    
    

}