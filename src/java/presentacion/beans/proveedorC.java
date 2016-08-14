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
import negocios.clases.proveedor;
import negocios.funciones.fProveedor;
import org.primefaces.context.DefaultRequestContext;
/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class proveedorC implements Serializable{
    private proveedor objProveedor;
    private proveedor objProveedorSel;
    private ArrayList<proveedor> lstProveedores;

    public proveedorC() {
        this.reinit();
    }

    private void reinit() {
        this.objProveedor = new proveedor();
        this.objProveedorSel = new proveedor();
        this.lstProveedores = new ArrayList<>();
        this.cargarProveedores();
        this.objProveedorSel = this.lstProveedores.get(0);
    }

    public proveedor getObjProveedor() {
        return objProveedor;
    }

    public void setObjProveedor(proveedor objProveedor) {
        this.objProveedor = objProveedor;
    }

    public proveedor getObjProveedorSel() {
        return objProveedorSel;
    }

    public void setObjProveedorSel(proveedor objProveedorSel) {
        this.objProveedorSel = objProveedorSel;
    }

    public ArrayList<proveedor> getLstProveedores() {
        return lstProveedores;
    }

    public void setLstProveedores(ArrayList<proveedor> lstProveedores) {
        this.lstProveedores = lstProveedores;
    }
    
    private void cargarProveedores() {
        try {
            this.lstProveedores = fProveedor.obtenerTodosProveedores();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }
    
     public void insertarProveedor() {
        try {
            if (fProveedor.insertarProveedor(objProveedor)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertProveedor.hide()");
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

    public String actualizarProveedor() {
        try {
            if (fProveedor.updateProveedor(objProveedorSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatProveedor.hiden()");
                this.objProveedorSel = new proveedor();
                cargarProveedores();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmProveedor.xhtml";
    }

    public String eliminarProveedor() {
        try {
            if (fProveedor.eliminarProveedor(objProveedorSel.getId_proveedor())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletProveedor.hiden()");
                this.objProveedorSel = new proveedor();
                cargarProveedores();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmProveedor.xhtml";
    }

}
