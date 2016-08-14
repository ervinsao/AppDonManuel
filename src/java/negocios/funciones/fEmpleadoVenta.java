/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.empleadoVenta;
/**
 *
 * @author Ervin
 */
public class fEmpleadoVenta {
    
     ///////insertar Empleado Venta
    public static boolean insertarEmpleadoVenta(empleadoVenta empleadoVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla empleado venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_empleado_venta(?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, empleadoVenta.getCedula_empleado_venta()));
            lstP.add(new Parametro(2, empleadoVenta.getNombre_empleado_venta()));
            lstP.add(new Parametro(3, empleadoVenta.getApellido_empleado_venta()));
            lstP.add(new Parametro(4, empleadoVenta.getDireccion_empleado_venta()));
            lstP.add(new Parametro(5, empleadoVenta.getConvencional_empleado_venta()));
            lstP.add(new Parametro(6, empleadoVenta.getCelular_empleado_venta()));
            lstP.add(new Parametro(7, empleadoVenta.getCorreo_empleado_venta()));
            lstP.add(new Parametro(8, empleadoVenta.getEstado_empleado_venta()));
            //////declaro Un resultSet para que me guarde los resultados ejecudatos por el query
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            ////recorre el registro en memoria
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                bandera = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        ///retoramos true si inserta caso contrario devuelve un mensaje de error
        return bandera;
    }
    
    ///////Eliminar Empleado Venta
    public static boolean eliminarEmpleadoVenta(int idEmpleadoVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Empleado Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_empleado_venta(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idEmpleadoVenta));
            //////declaro Un resultSet para que me guarde los resultados ejecudatos por el query
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            ////recorre el registro en memoria
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                bandera = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        ///retoramos true si inserta caso contrario devuelve un mensaje de error
        return bandera;
    }
    
    ///////Update Empleado Venta
    public static boolean updateEmpleadoVenta(empleadoVenta empleadoVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Empleado Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_empleado_venta(?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, empleadoVenta.getId_empleado_venta()));
            lstP.add(new Parametro(2, empleadoVenta.getCedula_empleado_venta()));
            lstP.add(new Parametro(3, empleadoVenta.getNombre_empleado_venta()));
            lstP.add(new Parametro(4, empleadoVenta.getApellido_empleado_venta()));
            lstP.add(new Parametro(5, empleadoVenta.getDireccion_empleado_venta()));
            lstP.add(new Parametro(6, empleadoVenta.getConvencional_empleado_venta()));
            lstP.add(new Parametro(7, empleadoVenta.getCelular_empleado_venta()));
            lstP.add(new Parametro(8, empleadoVenta.getCorreo_empleado_venta()));
            lstP.add(new Parametro(9, empleadoVenta.getEstado_empleado_venta()));
            //////declaro Un resultSet para que me guarde los resultados ejecudatos por el query
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            ////recorre el registro en memoria
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                bandera = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        ///retoramos true si inserta caso contrario devuelve un mensaje de error
        return bandera;
    }
}
