/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.beans;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import negocios.clases.usuario;
import negocios.funciones.fUsuario;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class usuarioC implements Serializable {

    private usuario objUsuario;
    private usuario objUsuarioSel;
    private ArrayList<usuario> lstUsuarios;

    public usuarioC() {
        this.reinit();
    }

    private void reinit() {
        this.objUsuario = new usuario();
        this.objUsuarioSel = new usuario();
        this.lstUsuarios = new ArrayList<>();
        this.cargarUsuarios();
        this.objUsuarioSel = this.lstUsuarios.get(0);
    }

    public usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public usuario getObjUsuarioSel() {
        return objUsuarioSel;
    }

    public void setObjUsuarioSel(usuario objUsuarioSel) {
        this.objUsuarioSel = objUsuarioSel;
    }

    public ArrayList<usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    public void setLstUsuarios(ArrayList<usuario> lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

    private void cargarUsuarios() {
        try {
            this.lstUsuarios = fUsuario.obtenerTodosUsuarios();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }

    public void insertarUsuario() {
        try {
            if (fUsuario.insertarUsuario(objUsuario)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertUsuario.hide()");
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos Insertados", "Datos Insertados");
                FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
            } else {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", "Error");
                FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
            }
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }

    public String actualizarUsuario() {
        try {
            if (fUsuario.updateUsuario(objUsuarioSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatUsuario.hiden()");
                this.objUsuarioSel = new usuario();
                cargarUsuarios();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmUsuario.xhtml";
    }

    public String eliminarUsuario() {
        try {
            if (fUsuario.eliminarUsuario(objUsuarioSel.getId_usuario())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletUsuario.hiden()");
                this.objUsuarioSel = new usuario();
                cargarUsuarios();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmUsuario.xhtml";
    }

}
