/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.detalleFacturaVenta;
/**
 *
 * @author Ervin
 */
public class fDetalleFacturaVenta {
    
    ///////insertar Detalle Factura Venta
    public static boolean insertarDetalleFacturaVenta(detalleFacturaVenta detalleFacturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Detalle Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_detalle_factura_venta(?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, detalleFacturaVenta.getId_producto()));
            lstP.add(new Parametro(2, detalleFacturaVenta.getId_factura_venta()));
            lstP.add(new Parametro(3, detalleFacturaVenta.getCantidad_detalle_factura_venta()));
            lstP.add(new Parametro(4, detalleFacturaVenta.getVal_unitario_detalle_factura_venta()));
            lstP.add(new Parametro(5, detalleFacturaVenta.getVal_total_detalle_factura_venta()));
            lstP.add(new Parametro(6, detalleFacturaVenta.getEstado_detalle_factura_venta()));
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
    
    ///////Eliminar Detalle Factura Venta
    public static boolean eliminarDetalleFacturaVenta(int idDetalleFacturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Detalle Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_detalle_factura_venta(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idDetalleFacturaVenta));
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
    
    ///////Update Detalle Factura Venta
    public static boolean updateDetalleFacturaVenta(detalleFacturaVenta detalleFacturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Detalla Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_detalle_factura_venta(?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, detalleFacturaVenta.getId_detalle_factura_venta()));
            lstP.add(new Parametro(2, detalleFacturaVenta.getId_producto()));
            lstP.add(new Parametro(3, detalleFacturaVenta.getId_factura_venta()));
            lstP.add(new Parametro(4, detalleFacturaVenta.getCantidad_detalle_factura_venta()));
            lstP.add(new Parametro(5, detalleFacturaVenta.getVal_unitario_detalle_factura_venta()));
            lstP.add(new Parametro(6, detalleFacturaVenta.getVal_total_detalle_factura_venta()));
            lstP.add(new Parametro(7, detalleFacturaVenta.getEstado_detalle_factura_venta()));
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
