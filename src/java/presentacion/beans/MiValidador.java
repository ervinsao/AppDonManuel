/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.beans;
 import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
/**
 *
 * @author USER
 */
public class MiValidador implements Validator {

    @Override
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
            throws ValidatorException {
        if (!(arg2 instanceof Integer)) {
            throw new ValidatorException(new FacesMessage("Debe ser un entero"));
        }

        int valor = (Integer) arg2;

        if ((valor < -10) || (valor > 10)) {
            throw new ValidatorException(new FacesMessage(
                    "Debe estar entre -10 y 10"));
        }
    }
}