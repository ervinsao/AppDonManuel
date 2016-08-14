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
public class detalleFacturaAdquisicion {

    private int id_detalle_factura_adquisicion;
    private int id_materia;
    private int id_factura_adquisicion;
    private int cantidad_detalle_factura_adquisicion;
    private double val_unitario_detalle_factura_adquisicion;
    private double val_total_detalle_factura_adquisicion;
    private char estado_detalle_factura_adquisicion;

    public detalleFacturaAdquisicion() {
    }

    public detalleFacturaAdquisicion(int id_detalle_factura_adquisicion, int id_materia, int id_factura_adquisicion, int cantidad_detalle_factura_adquisicion, double val_unitario_detalle_factura_adquisicion, double val_total_detalle_factura_adquisicion, char estado_detalle_factura_adquisicion) {
        this.id_detalle_factura_adquisicion = id_detalle_factura_adquisicion;
        this.id_materia = id_materia;
        this.id_factura_adquisicion = id_factura_adquisicion;
        this.cantidad_detalle_factura_adquisicion = cantidad_detalle_factura_adquisicion;
        this.val_unitario_detalle_factura_adquisicion = val_unitario_detalle_factura_adquisicion;
        this.val_total_detalle_factura_adquisicion = val_total_detalle_factura_adquisicion;
        this.estado_detalle_factura_adquisicion = estado_detalle_factura_adquisicion;
    }

    /**
     * @return the id_detalle_factura_adquisicion
     */
    public int getId_detalle_factura_adquisicion() {
        return id_detalle_factura_adquisicion;
    }

    /**
     * @param id_detalle_factura_adquisicion the id_detalle_factura_adquisicion to set
     */
    public void setId_detalle_factura_adquisicion(int id_detalle_factura_adquisicion) {
        this.id_detalle_factura_adquisicion = id_detalle_factura_adquisicion;
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
     * @return the cantidad_detalle_factura_adquisicion
     */
    public int getCantidad_detalle_factura_adquisicion() {
        return cantidad_detalle_factura_adquisicion;
    }

    /**
     * @param cantidad_detalle_factura_adquisicion the cantidad_detalle_factura_adquisicion to set
     */
    public void setCantidad_detalle_factura_adquisicion(int cantidad_detalle_factura_adquisicion) {
        this.cantidad_detalle_factura_adquisicion = cantidad_detalle_factura_adquisicion;
    }

    /**
     * @return the val_unitario_detalle_factura_adquisicion
     */
    public double getVal_unitario_detalle_factura_adquisicion() {
        return val_unitario_detalle_factura_adquisicion;
    }

    /**
     * @param val_unitario_detalle_factura_adquisicion the val_unitario_detalle_factura_adquisicion to set
     */
    public void setVal_unitario_detalle_factura_adquisicion(double val_unitario_detalle_factura_adquisicion) {
        this.val_unitario_detalle_factura_adquisicion = val_unitario_detalle_factura_adquisicion;
    }

    /**
     * @return the val_total_detalle_factura_adquisicion
     */
    public double getVal_total_detalle_factura_adquisicion() {
        return val_total_detalle_factura_adquisicion;
    }

    /**
     * @param val_total_detalle_factura_adquisicion the val_total_detalle_factura_adquisicion to set
     */
    public void setVal_total_detalle_factura_adquisicion(double val_total_detalle_factura_adquisicion) {
        this.val_total_detalle_factura_adquisicion = val_total_detalle_factura_adquisicion;
    }

    /**
     * @return the estado_detalle_factura_adquisicion
     */
    public char getEstado_detalle_factura_adquisicion() {
        return estado_detalle_factura_adquisicion;
    }

    /**
     * @param estado_detalle_factura_adquisicion the estado_detalle_factura_adquisicion to set
     */
    public void setEstado_detalle_factura_adquisicion(char estado_detalle_factura_adquisicion) {
        this.estado_detalle_factura_adquisicion = estado_detalle_factura_adquisicion;
    }

    
    
}
