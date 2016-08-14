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
public class unidadMedidaMateria {

    private int id_unidad_medida_materia;
    private String descripcion_unidad_medida_materia;
    private char estado_unidad_medida_materia;

    public unidadMedidaMateria() {
    }

    public unidadMedidaMateria(int id_unidad_medida_materia, String descripcion_unidad_medida_materia, char estado_unidad_medida_materia) {
        this.id_unidad_medida_materia = id_unidad_medida_materia;
        this.descripcion_unidad_medida_materia = descripcion_unidad_medida_materia;
        this.estado_unidad_medida_materia = estado_unidad_medida_materia;
    }

    /**
     * @return the id_unidad_medida_materia
     */
    public int getId_unidad_medida_materia() {
        return id_unidad_medida_materia;
    }

    /**
     * @param id_unidad_medida_materia the id_unidad_medida_materia to set
     */
    public void setId_unidad_medida_materia(int id_unidad_medida_materia) {
        this.id_unidad_medida_materia = id_unidad_medida_materia;
    }

    /**
     * @return the descripcion_unidad_medida_materia
     */
    public String getDescripcion_unidad_medida_materia() {
        return descripcion_unidad_medida_materia;
    }

    /**
     * @param descripcion_unidad_medida_materia the descripcion_unidad_medida_materia to set
     */
    public void setDescripcion_unidad_medida_materia(String descripcion_unidad_medida_materia) {
        this.descripcion_unidad_medida_materia = descripcion_unidad_medida_materia;
    }

    /**
     * @return the estado_unidad_medida_materia
     */
    public char getEstado_unidad_medida_materia() {
        return estado_unidad_medida_materia;
    }

    /**
     * @param estado_unidad_medida_materia the estado_unidad_medida_materia to set
     */
    public void setEstado_unidad_medida_materia(char estado_unidad_medida_materia) {
        this.estado_unidad_medida_materia = estado_unidad_medida_materia;
    }

    
}
