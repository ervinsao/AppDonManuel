/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.detalleFacturaAdquisicion;
/**
 *
 * @author Ervin
 */
public class fDetalleFacturaAdquisicion {
    
    ///////insertar Detalle Factura Adquisicion
    public static boolean insertarDetalleFacturaAdquisicion(detalleFacturaAdquisicion detalleFacturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla detalle factura adquisicion
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_detalle_factura_adquisicion(?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, detalleFacturaAdquisicion.getId_materia()));
            lstP.add(new Parametro(2, detalleFacturaAdquisicion.getId_factura_adquisicion()));
            lstP.add(new Parametro(3, detalleFacturaAdquisicion.getCantidad_detalle_factura_adquisicion()));
            lstP.add(new Parametro(4, detalleFacturaAdquisicion.getVal_unitario_detalle_factura_adquisicion()));
            lstP.add(new Parametro(5, detalleFacturaAdquisicion.getVal_total_detalle_factura_adquisicion()));
            lstP.add(new Parametro(6, detalleFacturaAdquisicion.getEstado_detalle_factura_adquisicion()));
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
    
    ///////Eliminar Detalle Factura Adquisicion
    public static boolean eliminarDetalleFacturaAdquisicion(int idDetalleFacturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla detalle factura adquisicion
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_detalle_factura_adquisicion(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idDetalleFacturaAdquisicion));
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
    
    ///////Update Detalle Factura Adquisicion
    public static boolean updateDetalleFacturaAdquisicion(detalleFacturaAdquisicion detalleFacturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Detalle Factura Adquisicion
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_detalle_factura_adquisicion(?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, detalleFacturaAdquisicion.getId_detalle_factura_adquisicion()));
            lstP.add(new Parametro(2, detalleFacturaAdquisicion.getId_materia()));
            lstP.add(new Parametro(3, detalleFacturaAdquisicion.getId_factura_adquisicion()));
            lstP.add(new Parametro(4, detalleFacturaAdquisicion.getCantidad_detalle_factura_adquisicion()));
            lstP.add(new Parametro(5, detalleFacturaAdquisicion.getVal_unitario_detalle_factura_adquisicion()));
            lstP.add(new Parametro(6, detalleFacturaAdquisicion.getVal_total_detalle_factura_adquisicion()));
            lstP.add(new Parametro(7, detalleFacturaAdquisicion.getEstado_detalle_factura_adquisicion()));
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
