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
public class rol {
    private int id_rol;
    private String descripcion_rol;
    private char estado_rol;

    public rol() {
    }

    public rol(int id_rol, String descripcion_rol, char estado_rol) {
        this.id_rol = id_rol;
        this.descripcion_rol = descripcion_rol;
        this.estado_rol = estado_rol;
    }

    /**
     * @return the id_rol
     */
    public int getId_rol() {
        return id_rol;
    }

    /**
     * @param id_rol the id_rol to set
     */
    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    /**
     * @return the descripcion_rol
     */
    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    /**
     * @param descripcion_rol the descripcion_rol to set
     */
    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

    /**
     * @return the estado_rol
     */
    public char getEstado_rol() {
        return estado_rol;
    }

    /**
     * @param estado_rol the estado_rol to set
     */
    public void setEstado_rol(char estado_rol) {
        this.estado_rol = estado_rol;
    }

    
    
    
}
