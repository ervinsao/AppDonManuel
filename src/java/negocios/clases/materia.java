/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.clases;

import java.sql.Date;

/**
 *
 * @author Ervin
 */
public class materia {

    private int id_materia;
    private String descripcion_materia;
    private int cantidad_materia;
    private Date fecha_almacenamiento_materia;
    private Date fecha_caducidad_materia;
    private char estado_materia;
    private int id_tipo_materia;
    private int id_clasificacion_materia;
    private int id_proveedor;
    private int id_unidad_medida_materia;

    public materia() {
    }

    public materia(int id_materia, String descripcion_materia, int cantidad_materia, Date fecha_almacenamiento_materia, Date fecha_caducidad_materia, char estado_materia, int id_tipo_materia, int id_clasificacion_materia, int id_proveedor, int id_unidad_medida_materia) {
        this.id_materia = id_materia;
        this.descripcion_materia = descripcion_materia;
        this.cantidad_materia = cantidad_materia;
        this.fecha_almacenamiento_materia = fecha_almacenamiento_materia;
        this.fecha_caducidad_materia = fecha_caducidad_materia;
        this.estado_materia = estado_materia;
        this.id_tipo_materia = id_tipo_materia;
        this.id_clasificacion_materia = id_clasificacion_materia;
        this.id_proveedor = id_proveedor;
        this.id_unidad_medida_materia = id_unidad_medida_materia;
    }

    /**
     * @return the id_materia
     */
    public int getId_materia() {
        return id_materia;
    }

    /**
     * @param id_materia the id_materia to set
     */
    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    /**
     * @return the descripcion_materia
     */
    public String getDescripcion_materia() {
        return descripcion_materia;
    }

    /**
     * @param descripcion_materia the descripcion_materia to set
     */
    public void setDescripcion_materia(String descripcion_materia) {
        this.descripcion_materia = descripcion_materia;
    }

    /**
     * @return the cantidad_materia
     */
    public int getCantidad_materia() {
        return cantidad_materia;
    }

    /**
     * @param cantidad_materia the cantidad_materia to set
     */
    public void setCantidad_materia(int cantidad_materia) {
        this.cantidad_materia = cantidad_materia;
    }

    /**
     * @return the fecha_almacenamiento_materia
     */
    public Date getFecha_almacenamiento_materia() {
        return fecha_almacenamiento_materia;
    }

    /**
     * @param fecha_almacenamiento_materia the fecha_almacenamiento_materia to set
     */
    public void setFecha_almacenamiento_materia(Date fecha_almacenamiento_materia) {
        this.fecha_almacenamiento_materia = fecha_almacenamiento_materia;
    }

    /**
     * @return the fecha_caducidad_materia
     */
    public Date getFecha_caducidad_materia() {
        return fecha_caducidad_materia;
    }

    /**
     * @param fecha_caducidad_materia the fecha_caducidad_materia to set
     */
    public void setFecha_caducidad_materia(Date fecha_caducidad_materia) {
        this.fecha_caducidad_materia = fecha_caducidad_materia;
    }

    /**
     * @return the estado_materia
     */
    public char getEstado_materia() {
        return estado_materia;
    }

    /**
     * @param estado_materia the estado_materia to set
     */
    public void setEstado_materia(char estado_materia) {
        this.estado_materia = estado_materia;
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
     * @return the id_proveedor
     */
    public int getId_proveedor() {
        return id_proveedor;
    }

    /**
     * @param id_proveedor the id_proveedor to set
     */
    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    
    
}
