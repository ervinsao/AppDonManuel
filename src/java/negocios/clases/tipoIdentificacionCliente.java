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
public class tipoIdentificacionCliente {

    private int id_tipo_identificacion_cliente;
    private String descripcion_tipo_identificacion_cliente;
    private char estado_tipo_identificacion_cliente;

    public tipoIdentificacionCliente() {
    }

    public tipoIdentificacionCliente(int id_tipo_identificacion_cliente, String descripcion_tipo_identificacion_cliente, char estado_tipo_identificacion_cliente) {
        this.id_tipo_identificacion_cliente = id_tipo_identificacion_cliente;
        this.descripcion_tipo_identificacion_cliente = descripcion_tipo_identificacion_cliente;
        this.estado_tipo_identificacion_cliente = estado_tipo_identificacion_cliente;
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

    /**
     * @return the descripcion_tipo_identificacion_cliente
     */
    public String getDescripcion_tipo_identificacion_cliente() {
        return descripcion_tipo_identificacion_cliente;
    }

    /**
     * @param descripcion_tipo_identificacion_cliente the descripcion_tipo_identificacion_cliente to set
     */
    public void setDescripcion_tipo_identificacion_cliente(String descripcion_tipo_identificacion_cliente) {
        this.descripcion_tipo_identificacion_cliente = descripcion_tipo_identificacion_cliente;
    }

    /**
     * @return the estado_tipo_identificacion_cliente
     */
    public char getEstado_tipo_identificacion_cliente() {
        return estado_tipo_identificacion_cliente;
    }

    /**
     * @param estado_tipo_identificacion_cliente the estado_tipo_identificacion_cliente to set
     */
    public void setEstado_tipo_identificacion_cliente(char estado_tipo_identificacion_cliente) {
        this.estado_tipo_identificacion_cliente = estado_tipo_identificacion_cliente;
    }

    
    

}
