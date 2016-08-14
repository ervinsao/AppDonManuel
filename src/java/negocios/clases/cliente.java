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
public class cliente {

    private int id_cliente;
    private String identificacion_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion_cliente;
    private String convencional_cliente;
    private String celular_cliente;
    private String correo_cliente;
    private char estado_cliente; 
    private int id_tipo_identificacion_cliente;

    public cliente() {
    }

    public cliente(int id_cliente, String identificacion_cliente, String nombre_cliente, String apellido_cliente, String direccion_cliente, String convencional_cliente, String celular_cliente, String correo_cliente, char estado_cliente, int id_tipo_identificacion_cliente) {
        this.id_cliente = id_cliente;
        this.identificacion_cliente = identificacion_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion_cliente = direccion_cliente;
        this.convencional_cliente = convencional_cliente;
        this.celular_cliente = celular_cliente;
        this.correo_cliente = correo_cliente;
        this.estado_cliente = estado_cliente;
        this.id_tipo_identificacion_cliente = id_tipo_identificacion_cliente;
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
     * @return the identificacion_cliente
     */
    public String getIdentificacion_cliente() {
        return identificacion_cliente;
    }

    /**
     * @param identificacion_cliente the identificacion_cliente to set
     */
    public void setIdentificacion_cliente(String identificacion_cliente) {
        this.identificacion_cliente = identificacion_cliente;
    }

    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the apellido_cliente
     */
    public String getApellido_cliente() {
        return apellido_cliente;
    }

    /**
     * @param apellido_cliente the apellido_cliente to set
     */
    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    /**
     * @return the direccion_cliente
     */
    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    /**
     * @param direccion_cliente the direccion_cliente to set
     */
    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    /**
     * @return the convencional_cliente
     */
    public String getConvencional_cliente() {
        return convencional_cliente;
    }

    /**
     * @param convencional_cliente the convencional_cliente to set
     */
    public void setConvencional_cliente(String convencional_cliente) {
        this.convencional_cliente = convencional_cliente;
    }

    /**
     * @return the celular_cliente
     */
    public String getCelular_cliente() {
        return celular_cliente;
    }

    /**
     * @param celular_cliente the celular_cliente to set
     */
    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    /**
     * @return the correo_cliente
     */
    public String getCorreo_cliente() {
        return correo_cliente;
    }

    /**
     * @param correo_cliente the correo_cliente to set
     */
    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    /**
     * @return the estado_cliente
     */
    public char getEstado_cliente() {
        return estado_cliente;
    }

    /**
     * @param estado_cliente the estado_cliente to set
     */
    public void setEstado_cliente(char estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    /**
     * @return the id_tipo_identificacion_cliente
     */
    public int getId_tipo_identificacion_cliente() {
        return id_tipo_identificacion_cliente;
    }

    /**
     * @param id_tipo_identificacion_cliente the id_tipo_identificacion_cliente to set
     */
    public void setId_tipo_identificacion_cliente(int id_tipo_identificacion_cliente) {
        this.id_tipo_identificacion_cliente = id_tipo_identificacion_cliente;
    }

    

}
