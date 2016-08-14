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
public class materiaProducto {

    private int id_materia_producto;
    private int id_materia;
    private int id_producto;
    private char estado_materia_producto;

    public materiaProducto() {
    }

    public materiaProducto(int id_materia_producto, int id_materia, int id_producto, char estado_materia_producto) {
        this.id_materia_producto = id_materia_producto;
        this.id_materia = id_materia;
        this.id_producto = id_producto;
        this.estado_materia_producto = estado_materia_producto;
    }

    /**
     * @return the id_materia_producto
     */
    public int getId_materia_producto() {
        return id_materia_producto;
    }

    /**
     * @param id_materia_producto the id_materia_producto to set
     */
    public void setId_materia_producto(int id_materia_producto) {
        this.id_materia_producto = id_materia_producto;
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
     * @return the estado_materia_producto
     */
    public char getEstado_materia_producto() {
        return estado_materia_producto;
    }

    /**
     * @param estado_materia_producto the estado_materia_producto to set
     */
    public void setEstado_materia_producto(char estado_materia_producto) {
        this.estado_materia_producto = estado_materia_producto;
    }

    
}
