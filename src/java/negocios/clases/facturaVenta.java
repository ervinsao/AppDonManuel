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
public class facturaVenta {

    private int id_factura_venta;
    private String numero_factura_venta;
    private String ciudad_factura_venta;
    private Date fecha_factura_venta;
    private double sub_total_factura_venta;
    private double descuento_factura_venta;
    private double iva_0_factura_venta;
    private double iva_factura_venta;
    private double importe_iva_factura_venta;
    private double total_factura_venta;
    private int id_cliente;
    private int id_empresa;
    private int id_empleado_venta;
    private char estado_factura_venta;

    public facturaVenta() {
    }

    public facturaVenta(int id_factura_venta, String numero_factura_venta, String ciudad_factura_venta, Date fecha_factura_venta, double sub_total_factura_venta, double descuento_factura_venta, double iva_0_factura_venta, double iva_factura_venta, double importe_iva_factura_venta, double total_factura_venta, int id_cliente, int id_empresa, int id_empleado_venta, char estado_factura_venta) {
        this.id_factura_venta = id_factura_venta;
        this.numero_factura_venta = numero_factura_venta;
        this.ciudad_factura_venta = ciudad_factura_venta;
        this.fecha_factura_venta = fecha_factura_venta;
        this.sub_total_factura_venta = sub_total_factura_venta;
        this.descuento_factura_venta = descuento_factura_venta;
        this.iva_0_factura_venta = iva_0_factura_venta;
        this.iva_factura_venta = iva_factura_venta;
        this.importe_iva_factura_venta = importe_iva_factura_venta;
        this.total_factura_venta = total_factura_venta;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
        this.id_empleado_venta = id_empleado_venta;
        this.estado_factura_venta = estado_factura_venta;
    }

    /**
     * @return the id_factura_venta
     */
    public int getId_factura_venta() {
        return id_factura_venta;
    }

    /**
     * @param id_factura_venta the id_factura_venta to set
     */
    public void setId_factura_venta(int id_factura_venta) {
        this.id_factura_venta = id_factura_venta;
    }

    /**
     * @return the numero_factura_venta
     */
    public String getNumero_factura_venta() {
        return numero_factura_venta;
    }

    /**
     * @param numero_factura_venta the numero_factura_venta to set
     */
    public void setNumero_factura_venta(String numero_factura_venta) {
        this.numero_factura_venta = numero_factura_venta;
    }

    /**
     * @return the ciudad_factura_venta
     */
    public String getCiudad_factura_venta() {
        return ciudad_factura_venta;
    }

    /**
     * @param ciudad_factura_venta the ciudad_factura_venta to set
     */
    public void setCiudad_factura_venta(String ciudad_factura_venta) {
        this.ciudad_factura_venta = ciudad_factura_venta;
    }

    /**
     * @return the fecha_factura_venta
     */
    public Date getFecha_factura_venta() {
        return fecha_factura_venta;
    }

    /**
     * @param fecha_factura_venta the fecha_factura_venta to set
     */
    public void setFecha_factura_venta(Date fecha_factura_venta) {
        this.fecha_factura_venta = fecha_factura_venta;
    }

    /**
     * @return the sub_total_factura_venta
     */
    public double getSub_total_factura_venta() {
        return sub_total_factura_venta;
    }

    /**
     * @param sub_total_factura_venta the sub_total_factura_venta to set
     */
    public void setSub_total_factura_venta(double sub_total_factura_venta) {
        this.sub_total_factura_venta = sub_total_factura_venta;
    }

    /**
     * @return the descuento_factura_venta
     */
    public double getDescuento_factura_venta() {
        return descuento_factura_venta;
    }

    /**
     * @param descuento_factura_venta the descuento_factura_venta to set
     */
    public void setDescuento_factura_venta(double descuento_factura_venta) {
        this.descuento_factura_venta = descuento_factura_venta;
    }

    /**
     * @return the iva_0_factura_venta
     */
    public double getIva_0_factura_venta() {
        return iva_0_factura_venta;
    }

    /**
     * @param iva_0_factura_venta the iva_0_factura_venta to set
     */
    public void setIva_0_factura_venta(double iva_0_factura_venta) {
        this.iva_0_factura_venta = iva_0_factura_venta;
    }

    /**
     * @return the iva_factura_venta
     */
    public double getIva_factura_venta() {
        return iva_factura_venta;
    }

    /**
     * @param iva_factura_venta the iva_factura_venta to set
     */
    public void setIva_factura_venta(double iva_factura_venta) {
        this.iva_factura_venta = iva_factura_venta;
    }

    /**
     * @return the importe_iva_factura_venta
     */
    public double getImporte_iva_factura_venta() {
        return importe_iva_factura_venta;
    }

    /**
     * @param importe_iva_factura_venta the importe_iva_factura_venta to set
     */
    public void setImporte_iva_factura_venta(double importe_iva_factura_venta) {
        this.importe_iva_factura_venta = importe_iva_factura_venta;
    }

    /**
     * @return the total_factura_venta
     */
    public double getTotal_factura_venta() {
        return total_factura_venta;
    }

    /**
     * @param total_factura_venta the total_factura_venta to set
     */
    public void setTotal_factura_venta(double total_factura_venta) {
        this.total_factura_venta = total_factura_venta;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_empresa
     */
    public int getId_empresa() {
        return id_empresa;
    }

    /**
     * @param id_empresa the id_empresa to set
     */
    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    /**
     * @return the id_empleado_venta
     */
    public int getId_empleado_venta() {
        return id_empleado_venta;
    }

    /**
     * @param id_empleado_venta the id_empleado_venta to set
     */
    public void setId_empleado_venta(int id_empleado_venta) {
        this.id_empleado_venta = id_empleado_venta;
    }

    /**
     * @return the estado_factura_venta
     */
    public char getEstado_factura_venta() {
        return estado_factura_venta;
    }

    /**
     * @param estado_factura_venta the estado_factura_venta to set
     */
    public void setEstado_factura_venta(char estado_factura_venta) {
        this.estado_factura_venta = estado_factura_venta;
    }

    
}
