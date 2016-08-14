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
import negocios.clases.rol;
import negocios.funciones.fRol;
import org.primefaces.context.DefaultRequestContext;
/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class rolC implements Serializable {
    private rol objRol;
    private rol objRolSel;
    private ArrayList<rol> lstRoles;

    public rolC() {
        this.reinit();
    }

    private void reinit() {
        this.objRol = new rol();
        this.objRolSel = new rol();
        this.lstRoles = new ArrayList<>();
        this.cargarRoles();
        this.objRolSel = this.lstRoles.get(0);
    }

    public rol getObjRol() {
        return objRol;
    }

    public void setObjRol(rol objRol) {
        this.objRol = objRol;
    }

    public rol getObjRolSel() {
        return objRolSel;
    }

    public void setObjRolSel(rol objRolSel) {
        this.objRolSel = objRolSel;
    }

    public ArrayList<rol> getLstRoles() {
        return lstRoles;
    }

    public void setLstRoles(ArrayList<rol> lstRoles) {
        this.lstRoles = lstRoles;
    }
    
     private void cargarRoles() {
        try {
            this.lstRoles = fRol.obtenerTodosRoles();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }
    
     public void insertarRol() {
        try {
            if (fRol.insertarRol(objRol)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertRol.hide()");
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
     
     public String actualizarRol() {
        try {
            if (fRol.updateRol(objRolSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatRol.hiden()");
                this.objRolSel = new rol();                
                cargarRoles();      
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmRol.xhtml";
    }
     
     public String eliminarRol() {
        try {
            if (fRol.eliminarRol(objRolSel.getId_rol())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletRol.hiden()");
                this.objRolSel=new rol();           
                cargarRoles();     
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmRol.xhtml";
    }
}
