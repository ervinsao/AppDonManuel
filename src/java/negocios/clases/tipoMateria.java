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
public class tipoMateria {

    private int id_tipo_materia;
    private String descripcion_tipo_materia;
    private char estado_tipo_materia;

    public tipoMateria() {
    }

    public tipoMateria(int id_tipo_materia, String descripcion_tipo_materia, char estado_tipo_materia) {
        this.id_tipo_materia = id_tipo_materia;
        this.descripcion_tipo_materia = descripcion_tipo_materia;
        this.estado_tipo_materia = estado_tipo_materia;
    }

    /**
     * @return the id_tipo_materia
     */
    public int getId_tipo_materia() {
        return id_tipo_materia;
    }

    /**
     * @param id_tipo_materia the id_tipo_materia to set
     */
    public void setId_tipo_materia(int id_tipo_materia) {
        this.id_tipo_materia = id_tipo_materia;
    }

    /**
     * @return the descripcion_tipo_materia
     */
    public String getDescripcion_tipo_materia() {
        return descripcion_tipo_materia;
    }

    /**
     * @param descripcion_tipo_materia the descripcion_tipo_materia to set
     */
    public void setDescripcion_tipo_materia(String descripcion_tipo_materia) {
        this.descripcion_tipo_materia = descripcion_tipo_materia;
    }

    /**
     * @return the estado_tipo_materia
     */
    public char getEstado_tipo_materia() {
        return estado_tipo_materia;
    }

    /**
     * @param estado_tipo_materia the estado_tipo_materia to set
     */
    public void setEstado_tipo_materia(char estado_tipo_materia) {
        this.estado_tipo_materia = estado_tipo_materia;
    }

    

}
