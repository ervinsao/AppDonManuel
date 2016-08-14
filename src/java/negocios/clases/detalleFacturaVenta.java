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
public class detalleFacturaVenta {

    private int id_detalle_factura_venta;
    private int id_producto;
    private int id_factura_venta;
    private int cantidad_detalle_factura_venta;
    private double val_unitario_detalle_factura_venta;
    private double val_total_detalle_factura_venta;
    private char estado_detalle_factura_venta;

    public detalleFacturaVenta() {
    }

    public detalleFacturaVenta(int id_detalle_factura_venta, int id_producto, int id_factura_venta, int cantidad_detalle_factura_venta, double val_unitario_detalle_factura_venta, double val_total_detalle_factura_venta, char estado_detalle_factura_venta) {
        this.id_detalle_factura_venta = id_detalle_factura_venta;
        this.id_producto = id_producto;
        this.id_factura_venta = id_factura_venta;
        this.cantidad_detalle_factura_venta = cantidad_detalle_factura_venta;
        this.val_unitario_detalle_factura_venta = val_unitario_detalle_factura_venta;
        this.val_total_detalle_factura_venta = val_total_detalle_factura_venta;
        this.estado_detalle_factura_venta = estado_detalle_factura_venta;
    }

    /**
     * @return the id_detalle_factura_venta
     */
    public int getId_detalle_factura_venta() {
        return id_detalle_factura_venta;
    }

    /**
     * @param id_detalle_factura_venta the id_detalle_factura_venta to set
     */
    public void setId_detalle_factura_venta(int id_detalle_factura_venta) {
        this.id_detalle_factura_venta = id_detalle_factura_venta;
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
     * @return the cantidad_detalle_factura_venta
     */
    public int getCantidad_detalle_factura_venta() {
        return cantidad_detalle_factura_venta;
    }

    /**
     * @param cantidad_detalle_factura_venta the cantidad_detalle_factura_venta to set
     */
    public void setCantidad_detalle_factura_venta(int cantidad_detalle_factura_venta) {
        this.cantidad_detalle_factura_venta = cantidad_detalle_factura_venta;
    }

    /**
     * @return the val_unitario_detalle_factura_venta
     */
    public double getVal_unitario_detalle_factura_venta() {
        return val_unitario_detalle_factura_venta;
    }

    /**
     * @param val_unitario_detalle_factura_venta the val_unitario_detalle_factura_venta to set
     */
    public void setVal_unitario_detalle_factura_venta(double val_unitario_detalle_factura_venta) {
        this.val_unitario_detalle_factura_venta = val_unitario_detalle_factura_venta;
    }

    /**
     * @return the val_total_detalle_factura_venta
     */
    public double getVal_total_detalle_factura_venta() {
        return val_total_detalle_factura_venta;
    }

    /**
     * @param val_total_detalle_factura_venta the val_total_detalle_factura_venta to set
     */
    public void setVal_total_detalle_factura_venta(double val_total_detalle_factura_venta) {
        this.val_total_detalle_factura_venta = val_total_detalle_factura_venta;
    }

    /**
     * @return the estado_detalle_factura_venta
     */
    public char getEstado_detalle_factura_venta() {
        return estado_detalle_factura_venta;
    }

    /**
     * @param estado_detalle_factura_venta the estado_detalle_factura_venta to set
     */
    public void setEstado_detalle_factura_venta(char estado_detalle_factura_venta) {
        this.estado_detalle_factura_venta = estado_detalle_factura_venta;
    }

   
    
}
