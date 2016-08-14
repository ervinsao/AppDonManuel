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
import negocios.clases.tipoMateria;
import negocios.funciones.fTipoMateria;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class tipoMateriaC implements Serializable {

    private tipoMateria objTipoMateria;
    private tipoMateria objTipoMateriaSel;
    private ArrayList<tipoMateria> lstTiposMaterias;

    public tipoMateriaC() {
        this.reinit();
    }

    private void reinit(){
    this.objTipoMateria = new tipoMateria();
    this.objTipoMateriaSel = new tipoMateria();
    this.lstTiposMaterias = new ArrayList<>();
    this.cargarTiposMaterias();
    this.objTipoMateriaSel = this.lstTiposMaterias.get(0);   
    }

    public tipoMateria getObjTipoMateria() {
        return objTipoMateria;
    }

    public void setObjTipoMateria(tipoMateria objTipoMateria) {
        this.objTipoMateria = objTipoMateria;
    }

    public tipoMateria getObjTipoMateriaSel() {
        return objTipoMateriaSel;
    }

    public void setObjTipoMateriaSel(tipoMateria objTipoMateriaSel) {
        this.objTipoMateriaSel = objTipoMateriaSel;
    }

    public ArrayList<tipoMateria> getLstTiposMaterias() {
        return lstTiposMaterias;
    }

    public void setLstTiposMaterias(ArrayList<tipoMateria> lstTiposMaterias) {
        this.lstTiposMaterias = lstTiposMaterias;
    }
    
private void cargarTiposMaterias() {
        try {
            this.lstTiposMaterias = fTipoMateria.obtenerTodosTiposMaterias();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }
    
     public void insertarTipoMateria() {
        try {
            if (fTipoMateria.insertarTipoMateria(objTipoMateria)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertTipoMateria.hide()");
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

    public String actualizarTipoMateria() {
        try {
            if (fTipoMateria.updateTipoMateria(objTipoMateriaSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatTipoMateria.hiden()");
                this.objTipoMateriaSel = new tipoMateria();
                cargarTiposMaterias();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmTipoMateria.xhtml";
    }

    public String eliminarTipoMateria() {
        try {
            if (fTipoMateria.eliminarTipoMateria(objTipoMateriaSel.getId_tipo_materia())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletTipoMateria.hiden()");
                this.objTipoMateriaSel = new tipoMateria();
                cargarTiposMaterias();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmTipoMateria.xhtml";
    }

}

