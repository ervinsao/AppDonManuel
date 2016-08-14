/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

/**
 *
 * @author Diego
 */
public class ListItem {

    private Object value;
    private String nombre;

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListItem() {
    }

    public ListItem(Object value, String nombre) {
        this.value = value;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
