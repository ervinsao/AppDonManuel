/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ervin
 */
@ManagedBean
@ViewScoped
public class menuC {

    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
     
    public void frmRol() {
        this.ruta = "faces/Formulario/frmRol.xhtml";
    }
    
    public void frmUsuario() {
        this.ruta = "faces/Formulario/frmUsuario.xhtml";
    }
    
    public void frmProveedor() {
        this.ruta = "faces/Formulario/frmProveedor.xhtml";
    }
    public void frmTipo_Materia() {
        this.ruta = "faces/Formulario/frmTipoMateria.xhtml";
    }
       
    public void frmClasificacionMateria() {
        this.ruta = "faces/Formulario/frmClasificacionMateria.xhtml";
    }
    
    public void Index() {
        this.ruta = "faces/index.xhtml";
    }

    /**
     * Creates a new instance of menuControlador
     */
    public menuC() {
    }

}
