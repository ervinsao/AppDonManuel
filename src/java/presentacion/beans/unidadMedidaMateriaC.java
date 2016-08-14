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
import negocios.clases.unidadMedidaMateria;
import negocios.funciones.fUnidadMedidaMateria;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author USER
 */
@ManagedBean
@ViewScoped
public class unidadMedidaMateriaC implements Serializable {

    private unidadMedidaMateria objUnidadMedidaMateria;
    private unidadMedidaMateria objUnidadMedidaMateriaSel;
    private ArrayList<unidadMedidaMateria> lstUnidadesMedidasMaterias;

    public unidadMedidaMateriaC() {
        this.reinit();
    }

    private void reinit() {
        this.objUnidadMedidaMateria = new unidadMedidaMateria();
        this.objUnidadMedidaMateriaSel = new unidadMedidaMateria();
        this.lstUnidadesMedidasMaterias = new ArrayList<>();
        this.cargarUnidadesMedidasMaterias();
        this.objUnidadMedidaMateriaSel = this.lstUnidadesMedidasMaterias.get(0);
    }

    public unidadMedidaMateria getObjUnidadMedidaMateria() {
        return objUnidadMedidaMateria;
    }

    public void setObjUnidadMedidaMateria(unidadMedidaMateria objUnidadMedidaMateria) {
        this.objUnidadMedidaMateria = objUnidadMedidaMateria;
    }

    public unidadMedidaMateria getObjUnidadMedidaMateriaSel() {
        return objUnidadMedidaMateriaSel;
    }

    public void setObjUnidadMedidaMateriaSel(unidadMedidaMateria objUnidadMedidaMateriaSel) {
        this.objUnidadMedidaMateriaSel = objUnidadMedidaMateriaSel;
    }

    public ArrayList<unidadMedidaMateria> getLstUnidadesMedidasMaterias() {
        return lstUnidadesMedidasMaterias;
    }

    public void setLstUnidadesMedidasMaterias(ArrayList<unidadMedidaMateria> lstUnidadesMedidasMaterias) {
        this.lstUnidadesMedidasMaterias = lstUnidadesMedidasMaterias;
    }
    
    private void cargarUnidadesMedidasMaterias() {
        try {
            this.lstUnidadesMedidasMaterias = fUnidadMedidaMateria.obtenerTodasUnidadesMedidasMaterias();
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Error", e.getMessage());
            FacesContext.getCurrentInstance().addMessage("Información", facesMsg);
        }
    }
    
     public void insertarUnidadMedidaMateria() {
        try {
            if (fUnidadMedidaMateria.insertarUnidadMedidaMateria(objUnidadMedidaMateria)) {
                this.reinit();
                DefaultRequestContext.getCurrentInstance().execute("wdlgInsertUnidadMedidaMateria.hide()");
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
     
     public String actualizarUnidadMedidaMateria() {
        try {
            if (fUnidadMedidaMateria.updateUnidadMedidaMateria(objUnidadMedidaMateriaSel)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos modificados correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglUpdatUnidadMedidaMateria.hiden()");
                this.objUnidadMedidaMateriaSel = new unidadMedidaMateria();                
                cargarUnidadesMedidasMaterias();      
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no modificados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmUnidadMedidaMateria.xhtml";
    }
     
     public String eliminarUnidadMedidaMateria() {
        try {
            if (fUnidadMedidaMateria.eliminarUnidadMedidaMateria(objUnidadMedidaMateriaSel.getId_unidad_medida_materia())) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Los datos se eliminaron correctamente"));
                DefaultRequestContext.getCurrentInstance().execute("wglDeletUnidadMedidaMateria.hiden()");
                this.objUnidadMedidaMateriaSel=new unidadMedidaMateria();           
                cargarUnidadesMedidasMaterias();     
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Los datos se eliminaron"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
        }
        return "frmUnidadMedidaMateria.xhtml";
    }
}
