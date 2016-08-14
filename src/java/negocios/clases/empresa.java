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
public class empresa {

    private int id_empresa;
    private String ruc_empresa;
    private String nombre_comercial_empresa;
    private String nombre_gerente_empresa;
    private String apellido_gerente_empresa;
    private String direccion_empresa;
    private String convencional_empresa;
    private String celular_empresa;
    private double iva_empresa;
    private char estado_empresa;

    public empresa() {
    }

    public empresa(int id_empresa, String ruc_empresa, String nombre_comercial_empresa, String nombre_gerente_empresa, String apellido_gerente_empresa, String direccion_empresa, String convencional_empresa, String celular_empresa, double iva_empresa, char estado_empresa) {
        this.id_empresa = id_empresa;
        this.ruc_empresa = ruc_empresa;
        this.nombre_comercial_empresa = nombre_comercial_empresa;
        this.nombre_gerente_empresa = nombre_gerente_empresa;
        this.apellido_gerente_empresa = apellido_gerente_empresa;
        this.direccion_empresa = direccion_empresa;
        this.convencional_empresa = convencional_empresa;
        this.celular_empresa = celular_empresa;
        this.iva_empresa = iva_empresa;
        this.estado_empresa = estado_empresa;
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
     * @return the ruc_empresa
     */
    public String getRuc_empresa() {
        return ruc_empresa;
    }

    /**
     * @param ruc_empresa the ruc_empresa to set
     */
    public void setRuc_empresa(String ruc_empresa) {
        this.ruc_empresa = ruc_empresa;
    }

    /**
     * @return the nombre_comercial_empresa
     */
    public String getNombre_comercial_empresa() {
        return nombre_comercial_empresa;
    }

    /**
     * @param nombre_comercial_empresa the nombre_comercial_empresa to set
     */
    public void setNombre_comercial_empresa(String nombre_comercial_empresa) {
        this.nombre_comercial_empresa = nombre_comercial_empresa;
    }

    /**
     * @return the nombre_gerente_empresa
     */
    public String getNombre_gerente_empresa() {
        return nombre_gerente_empresa;
    }

    /**
     * @param nombre_gerente_empresa the nombre_gerente_empresa to set
     */
    public void setNombre_gerente_empresa(String nombre_gerente_empresa) {
        this.nombre_gerente_empresa = nombre_gerente_empresa;
    }

    /**
     * @return the apellido_gerente_empresa
     */
    public String getApellido_gerente_empresa() {
        return apellido_gerente_empresa;
    }

    /**
     * @param apellido_gerente_empresa the apellido_gerente_empresa to set
     */
    public void setApellido_gerente_empresa(String apellido_gerente_empresa) {
        this.apellido_gerente_empresa = apellido_gerente_empresa;
    }

    /**
     * @return the direccion_empresa
     */
    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    /**
     * @param direccion_empresa the direccion_empresa to set
     */
    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    /**
     * @return the convencional_empresa
     */
    public String getConvencional_empresa() {
        return convencional_empresa;
    }

    /**
     * @param convencional_empresa the convencional_empresa to set
     */
    public void setConvencional_empresa(String convencional_empresa) {
        this.convencional_empresa = convencional_empresa;
    }

    /**
     * @return the celular_empresa
     */
    public String getCelular_empresa() {
        return celular_empresa;
    }

    /**
     * @param celular_empresa the celular_empresa to set
     */
    public void setCelular_empresa(String celular_empresa) {
        this.celular_empresa = celular_empresa;
    }

    /**
     * @return the iva_empresa
     */
    public double getIva_empresa() {
        return iva_empresa;
    }

    /**
     * @param iva_empresa the iva_empresa to set
     */
    public void setIva_empresa(double iva_empresa) {
        this.iva_empresa = iva_empresa;
    }

    /**
     * @return the estado_empresa
     */
    public char getEstado_empresa() {
        return estado_empresa;
    }

    /**
     * @param estado_empresa the estado_empresa to set
     */
    public void setEstado_empresa(char estado_empresa) {
        this.estado_empresa = estado_empresa;
    }

    
    

}
