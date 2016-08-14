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
public class unidadMedidaProducto {

    private int id_unidad_medida_producto;
    private String descripcion_unidad_medida_producto;
    private char estado_unidad_medida_producto;

    public unidadMedidaProducto() {
    }

    public unidadMedidaProducto(int id_unidad_medida_producto, String descripcion_unidad_medida_producto, char estado_unidad_medida_producto) {
        this.id_unidad_medida_producto = id_unidad_medida_producto;
        this.descripcion_unidad_medida_producto = descripcion_unidad_medida_producto;
        this.estado_unidad_medida_producto = estado_unidad_medida_producto;
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
     * @return the descripcion_unidad_medida_producto
     */
    public String getDescripcion_unidad_medida_producto() {
        return descripcion_unidad_medida_producto;
    }

    /**
     * @param descripcion_unidad_medida_producto the descripcion_unidad_medida_producto to set
     */
    public void setDescripcion_unidad_medida_producto(String descripcion_unidad_medida_producto) {
        this.descripcion_unidad_medida_producto = descripcion_unidad_medida_producto;
    }

    /**
     * @return the estado_unidad_medida_producto
     */
    public char getEstado_unidad_medida_producto() {
        return estado_unidad_medida_producto;
    }

    /**
     * @param estado_unidad_medida_producto the estado_unidad_medida_producto to set
     */
    public void setEstado_unidad_medida_producto(char estado_unidad_medida_producto) {
        this.estado_unidad_medida_producto = estado_unidad_medida_producto;
    }

   
}
