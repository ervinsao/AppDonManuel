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
public class producto {

    private int id_producto;
    private String detalle_producto;
    private double precio_producto;
    private Date fecha_elaboracion_producto;
    private Date fecha_caducidad_producto;
    private char estado_producto;
    private int id_unidad_medida_producto;
    private double contenido_neto_producto;
    private int cantidad;

    public producto() {
    }

    public producto(int id_producto, String detalle_producto, double precio_producto, Date fecha_elaboracion_producto, Date fecha_caducidad_producto, char estado_producto, int id_unidad_medida_producto, double contenido_neto_producto, int cantidad) {
        this.id_producto = id_producto;
        this.detalle_producto = detalle_producto;
        this.precio_producto = precio_producto;
        this.fecha_elaboracion_producto = fecha_elaboracion_producto;
        this.fecha_caducidad_producto = fecha_caducidad_producto;
        this.estado_producto = estado_producto;
        this.id_unidad_medida_producto = id_unidad_medida_producto;
        this.contenido_neto_producto = contenido_neto_producto;
        this.cantidad = cantidad;
    }

    /**
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the detalle_producto
     */
    public String getDetalle_producto() {
        return detalle_producto;
    }

    /**
     * @param detalle_producto the detalle_producto to set
     */
    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }

    /**
     * @return the precio_producto
     */
    public double getPrecio_producto() {
        return precio_producto;
    }

    /**
     * @param precio_producto the precio_producto to set
     */
    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    /**
     * @return the fecha_elaboracion_producto
     */
    public Date getFecha_elaboracion_producto() {
        return fecha_elaboracion_producto;
    }

    /**
     * @param fecha_elaboracion_producto the fecha_elaboracion_producto to set
     */
    public void setFecha_elaboracion_producto(Date fecha_elaboracion_producto) {
        this.fecha_elaboracion_producto = fecha_elaboracion_producto;
    }

    /**
     * @return the fecha_caducidad_producto
     */
    public Date getFecha_caducidad_producto() {
        return fecha_caducidad_producto;
    }

    /**
     * @param fecha_caducidad_producto the fecha_caducidad_producto to set
     */
    public void setFecha_caducidad_producto(Date fecha_caducidad_producto) {
        this.fecha_caducidad_producto = fecha_caducidad_producto;
    }

    /**
     * @return the estado_producto
     */
    public char getEstado_producto() {
        return estado_producto;
    }

    /**
     * @param estado_producto the estado_producto to set
     */
    public void setEstado_producto(char estado_producto) {
        this.estado_producto = estado_producto;
    }

    /**
     * @return the id_unidad_medida_producto
     */
    public int getId_unidad_medida_producto() {
        return id_unidad_medida_producto;
    }

    /**
     * @param id_unidad_medida_producto the id_unidad_medida_producto to set
     */
    public void setId_unidad_medida_producto(int id_unidad_medida_producto) {
        this.id_unidad_medida_producto = id_unidad_medida_producto;
    }

    /**
     * @return the contenido_neto_producto
     */
    public double getContenido_neto_producto() {
        return contenido_neto_producto;
    }

    /**
     * @param contenido_neto_producto the contenido_neto_producto to set
     */
    public void setContenido_neto_producto(double contenido_neto_producto) {
        this.contenido_neto_producto = contenido_neto_producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    
}
