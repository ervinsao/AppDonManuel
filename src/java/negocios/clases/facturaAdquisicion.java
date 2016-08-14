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
public class facturaAdquisicion {

    private int id_factura_adquisicion;
    private String numero_factura_adquisicion;
    private String ciudad_factura_adquisicion;
    private Date fecha_factura_adquisicion;
    private double sub_total_factura_adquisicion;
    private double descuento_factura_adquisicion;
    private double iva_0_factura_adquisicion;
    private double iva_12_factura_adquisicion;
    private double importe_iva_factura_adquisicion;
    private double total_factura_adquisicion;
    private char estado_factura_adquisicion;

    public facturaAdquisicion() {
    }

    public facturaAdquisicion(int id_factura_adquisicion, String numero_factura_adquisicion, String ciudad_factura_adquisicion, Date fecha_factura_adquisicion, double sub_total_factura_adquisicion, double descuento_factura_adquisicion, double iva_0_factura_adquisicion, double iva_12_factura_adquisicion, double importe_iva_factura_adquisicion, double total_factura_adquisicion, char estado_factura_adquisicion) {
        this.id_factura_adquisicion = id_factura_adquisicion;
        this.numero_factura_adquisicion = numero_factura_adquisicion;
        this.ciudad_factura_adquisicion = ciudad_factura_adquisicion;
        this.fecha_factura_adquisicion = fecha_factura_adquisicion;
        this.sub_total_factura_adquisicion = sub_total_factura_adquisicion;
        this.descuento_factura_adquisicion = descuento_factura_adquisicion;
        this.iva_0_factura_adquisicion = iva_0_factura_adquisicion;
        this.iva_12_factura_adquisicion = iva_12_factura_adquisicion;
        this.importe_iva_factura_adquisicion = importe_iva_factura_adquisicion;
        this.total_factura_adquisicion = total_factura_adquisicion;
        this.estado_factura_adquisicion = estado_factura_adquisicion;
    }

    /**
     * @return the id_factura_adquisicion
     */
    public int getId_factura_adquisicion() {
        return id_factura_adquisicion;
    }

    /**
     * @param id_factura_adquisicion the id_factura_adquisicion to set
     */
    public void setId_factura_adquisicion(int id_factura_adquisicion) {
        this.id_factura_adquisicion = id_factura_adquisicion;
    }

    /**
     * @return the numero_factura_adquisicion
     */
    public String getNumero_factura_adquisicion() {
        return numero_factura_adquisicion;
    }

    /**
     * @param numero_factura_adquisicion the numero_factura_adquisicion to set
     */
    public void setNumero_factura_adquisicion(String numero_factura_adquisicion) {
        this.numero_factura_adquisicion = numero_factura_adquisicion;
    }

    /**
     * @return the ciudad_factura_adquisicion
     */
    public String getCiudad_factura_adquisicion() {
        return ciudad_factura_adquisicion;
    }

    /**
     * @param ciudad_factura_adquisicion the ciudad_factura_adquisicion to set
     */
    public void setCiudad_factura_adquisicion(String ciudad_factura_adquisicion) {
        this.ciudad_factura_adquisicion = ciudad_factura_adquisicion;
    }

    /**
     * @return the fecha_factura_adquisicion
     */
    public Date getFecha_factura_adquisicion() {
        return fecha_factura_adquisicion;
    }

    /**
     * @param fecha_factura_adquisicion the fecha_factura_adquisicion to set
     */
    public void setFecha_factura_adquisicion(Date fecha_factura_adquisicion) {
        this.fecha_factura_adquisicion = fecha_factura_adquisicion;
    }

    /**
     * @return the sub_total_factura_adquisicion
     */
    public double getSub_total_factura_adquisicion() {
        return sub_total_factura_adquisicion;
    }

    /**
     * @param sub_total_factura_adquisicion the sub_total_factura_adquisicion to set
     */
    public void setSub_total_factura_adquisicion(double sub_total_factura_adquisicion) {
        this.sub_total_factura_adquisicion = sub_total_factura_adquisicion;
    }

    /**
     * @return the descuento_factura_adquisicion
     */
    public double getDescuento_factura_adquisicion() {
        return descuento_factura_adquisicion;
    }

    /**
     * @param descuento_factura_adquisicion the descuento_factura_adquisicion to set
     */
    public void setDescuento_factura_adquisicion(double descuento_factura_adquisicion) {
        this.descuento_factura_adquisicion = descuento_factura_adquisicion;
    }

    /**
     * @return the iva_0_factura_adquisicion
     */
    public double getIva_0_factura_adquisicion() {
        return iva_0_factura_adquisicion;
    }

    /**
     * @param iva_0_factura_adquisicion the iva_0_factura_adquisicion to set
     */
    public void setIva_0_factura_adquisicion(double iva_0_factura_adquisicion) {
        this.iva_0_factura_adquisicion = iva_0_factura_adquisicion;
    }

    /**
     * @return the iva_12_factura_adquisicion
     */
    public double getIva_12_factura_adquisicion() {
        return iva_12_factura_adquisicion;
    }

    /**
     * @param iva_12_factura_adquisicion the iva_12_factura_adquisicion to set
     */
    public void setIva_12_factura_adquisicion(double iva_12_factura_adquisicion) {
        this.iva_12_factura_adquisicion = iva_12_factura_adquisicion;
    }

    /**
     * @return the importe_iva_factura_adquisicion
     */
    public double getImporte_iva_factura_adquisicion() {
        return importe_iva_factura_adquisicion;
    }

    /**
     * @param importe_iva_factura_adquisicion the importe_iva_factura_adquisicion to set
     */
    public void setImporte_iva_factura_adquisicion(double importe_iva_factura_adquisicion) {
        this.importe_iva_factura_adquisicion = importe_iva_factura_adquisicion;
    }

    /**
     * @return the total_factura_adquisicion
     */
    public double getTotal_factura_adquisicion() {
        return total_factura_adquisicion;
    }

    /**
     * @param total_factura_adquisicion the total_factura_adquisicion to set
     */
    public void setTotal_factura_adquisicion(double total_factura_adquisicion) {
        this.total_factura_adquisicion = total_factura_adquisicion;
    }

    /**
     * @return the estado_factura_adquisicion
     */
    public char getEstado_factura_adquisicion() {
        return estado_factura_adquisicion;
    }

    /**
     * @param estado_factura_adquisicion the estado_factura_adquisicion to set
     */
    public void setEstado_factura_adquisicion(char estado_factura_adquisicion) {
        this.estado_factura_adquisicion = estado_factura_adquisicion;
    }

    
}
