/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.facturaVenta;
/**
 *
 * @author Ervin
 */
public class fFacturaVenta {
    
    ///////insertar Factura Venta
    public static boolean insertarFacturaVenta(facturaVenta facturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_factura_venta(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, facturaVenta.getNumero_factura_venta()));
            lstP.add(new Parametro(2, facturaVenta.getCiudad_factura_venta()));
            lstP.add(new Parametro(3, facturaVenta.getFecha_factura_venta()));
            lstP.add(new Parametro(4, facturaVenta.getSub_total_factura_venta()));
            lstP.add(new Parametro(5, facturaVenta.getDescuento_factura_venta()));
            lstP.add(new Parametro(6, facturaVenta.getIva_0_factura_venta()));
            lstP.add(new Parametro(7, facturaVenta.getIva_factura_venta()));
            lstP.add(new Parametro(8, facturaVenta.getImporte_iva_factura_venta()));
            lstP.add(new Parametro(9, facturaVenta.getTotal_factura_venta()));
            lstP.add(new Parametro(10, facturaVenta.getId_cliente()));
            lstP.add(new Parametro(11, facturaVenta.getId_empresa()));
            lstP.add(new Parametro(12, facturaVenta.getId_empleado_venta()));
            lstP.add(new Parametro(13, facturaVenta.getEstado_factura_venta()));
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
    
    ///////Eliminar Factura Venta
    public static boolean eliminarFacturaVenta(int idFacturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_factura_venta(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idFacturaVenta));
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
    
    ///////Update Factura Venta
    public static boolean updateFacturaVenta(facturaVenta facturaVenta) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Factura Venta
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_factura_venta(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, facturaVenta.getId_factura_venta()));
            lstP.add(new Parametro(2, facturaVenta.getNumero_factura_venta()));
            lstP.add(new Parametro(3, facturaVenta.getCiudad_factura_venta()));
            lstP.add(new Parametro(4, facturaVenta.getFecha_factura_venta()));
            lstP.add(new Parametro(5, facturaVenta.getSub_total_factura_venta()));
            lstP.add(new Parametro(6, facturaVenta.getDescuento_factura_venta()));
            lstP.add(new Parametro(7, facturaVenta.getIva_0_factura_venta()));
            lstP.add(new Parametro(8, facturaVenta.getIva_factura_venta()));
            lstP.add(new Parametro(9, facturaVenta.getImporte_iva_factura_venta()));
            lstP.add(new Parametro(10, facturaVenta.getTotal_factura_venta()));
            lstP.add(new Parametro(11, facturaVenta.getId_cliente()));
            lstP.add(new Parametro(12, facturaVenta.getId_empresa()));
            lstP.add(new Parametro(13, facturaVenta.getId_empleado_venta()));
            lstP.add(new Parametro(14, facturaVenta.getEstado_factura_venta()));
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
