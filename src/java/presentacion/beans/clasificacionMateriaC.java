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
import negocios.clases.clasificacionMateria;
import negocios.funciones.fClasificacionMateria;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class clasificacionMateriaC implements Serializable {

    private clasificacionMateria objClasificacionMateria;
    private clasificacionMateria objClasificacionMateriaSel;
    private ArrayList<clasificacionMateria> lstClasificacionesMaterias;

    public clasificacionMateriaC() {
        this.reinit();
    }

    private void reinit() {
        this.objClasificacionMateria = new clasificacionMateria();
        this.objClasificacionMateriaSel = new clasificacionMateria();
        this.lstClasificacionesMaterias = new ArrayList<>();
        this.cargarClasificacionesMaterias();
        this.objClasificacionMateriaSel = this.lstClasificacionesMaterias.get(0);
    }

    public clasificacionMateria getObjClasificacionMateria() {
        return objClasificacionMateria;
    }

    public void setObjClasificacionMateria(clasificacionMateria objClasificacionMateria) {
        this.objClasificacionMateria = objClasificacionMateria;
    }

    public clasificacionMateria getObjClasificacionMateriaSel() {
        return objClasificacionMateriaSel;
    }

    public void setObjClasificacionMateriaSel(clasificacionMateria objClasificacionMateriaSel) {
        this.objClasificacionMateriaSel = objClasificacionMateriaSel;
    }

    public ArrayList<clasificacionMateria> getLstClasificacionesMaterias() {
        return lstClasificacionesMaterias;
    }

    public void setLstClasificacionesMaterias(ArrayList<clasificacionMateria> lstClasificacionesMaterias) {
        this.lstClasificacionesMaterias = lstClasificacionesMaterias;
    }
    
  private void cargarClasificacionesMaterias() {
        try {
            this.lstClasificacionesMaterias = fClasificacionMateria.obtenerTodosClasificacionesMaterias();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }
    
     public void insertarClasificacionMateria() {
        try {
            if (fClasificacionMateria.insertarClasificacionMateria(objClasificacionMateria)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertClasificacionMateria.hide()");
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

    public String actualizarClasificacionMateria() {
        try {
            if (fClasificacionMateria.updateClasificacionMateria(objClasificacionMateriaSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatClasificacionMateria.hiden()");
                this.objClasificacionMateriaSel = new clasificacionMateria();
                cargarClasificacionesMaterias();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmClasificacionMateria.xhtml";
    }

    public String eliminarClasificacionMateria() {
        try {
            if (fClasificacionMateria.eliminarClasificacionMateria(objClasificacionMateriaSel.getId_clasificacion_materia())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletTipoMateria.hiden()");
                this.objClasificacionMateriaSel = new clasificacionMateria();
                cargarClasificacionesMaterias();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmClasificacionMateria.xhtml";
    }

}

