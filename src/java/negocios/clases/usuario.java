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
public class usuario {
    private int id_usuario;
    private String usuario;
    private String contrasenia_usuario;
    private char estado_usuario;
    private int id_rol;

    public usuario() {
    }

    public usuario(int id_usuario, String usuario, String contrasenia_usuario, char estado_usuario, int id_rol) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.contrasenia_usuario = contrasenia_usuario;
        this.estado_usuario = estado_usuario;
        this.id_rol = id_rol;
    }

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasenia_usuario
     */
    public String getContrasenia_usuario() {
        return contrasenia_usuario;
    }

    /**
     * @param contrasenia_usuario the contrasenia_usuario to set
     */
    public void setContrasenia_usuario(String contrasenia_usuario) {
        this.contrasenia_usuario = contrasenia_usuario;
    }

    /**
     * @return the estado_usuario
     */
    public char getEstado_usuario() {
        return estado_usuario;
    }

    /**
     * @param estado_usuario the estado_usuario to set
     */
    public void setEstado_usuario(char estado_usuario) {
        this.estado_usuario = estado_usuario;
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

    
    
    
}
