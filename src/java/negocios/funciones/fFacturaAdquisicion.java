/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;


import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.facturaAdquisicion;
/**
 *
 * @author Ervin
 */
public class fFacturaAdquisicion {
    
    ///////insertar Factura Adquisicion
    public static boolean insertarFacturaAdquisicion(facturaAdquisicion facturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla factura adquisicion
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_factura_adquisicion(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, facturaAdquisicion.getNumero_factura_adquisicion()));
            lstP.add(new Parametro(2, facturaAdquisicion.getCiudad_factura_adquisicion()));
            lstP.add(new Parametro(3, facturaAdquisicion.getFecha_factura_adquisicion()));
            lstP.add(new Parametro(4, facturaAdquisicion.getSub_total_factura_adquisicion()));
            lstP.add(new Parametro(5, facturaAdquisicion.getDescuento_factura_adquisicion()));
            lstP.add(new Parametro(6, facturaAdquisicion.getIva_0_factura_adquisicion()));
            lstP.add(new Parametro(7, facturaAdquisicion.getIva_12_factura_adquisicion()));
            lstP.add(new Parametro(8, facturaAdquisicion.getImporte_iva_factura_adquisicion()));
            lstP.add(new Parametro(9, facturaAdquisicion.getTotal_factura_adquisicion()));
            lstP.add(new Parametro(10, facturaAdquisicion.getEstado_factura_adquisicion()));
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
    
    ///////Eliminar Factura Adquisicion
    public static boolean eliminarFacturaAdquisicion(int idFacturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Rol
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_factura_adquisicion(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idFacturaAdquisicion));
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
    
    ///////Update Factura Adquisicion
    public static boolean updateFacturaAdquisicion(facturaAdquisicion facturaAdquisicion) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Factura Adquisicion
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_factura_adquisicion(?,?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, facturaAdquisicion.getId_factura_adquisicion()));
            lstP.add(new Parametro(2, facturaAdquisicion.getNumero_factura_adquisicion()));
            lstP.add(new Parametro(3, facturaAdquisicion.getCiudad_factura_adquisicion()));
            lstP.add(new Parametro(4, facturaAdquisicion.getFecha_factura_adquisicion()));
            lstP.add(new Parametro(5, facturaAdquisicion.getSub_total_factura_adquisicion()));
            lstP.add(new Parametro(6, facturaAdquisicion.getDescuento_factura_adquisicion()));
            lstP.add(new Parametro(7, facturaAdquisicion.getIva_0_factura_adquisicion()));
            lstP.add(new Parametro(8, facturaAdquisicion.getIva_12_factura_adquisicion()));
            lstP.add(new Parametro(9, facturaAdquisicion.getImporte_iva_factura_adquisicion()));
            lstP.add(new Parametro(10, facturaAdquisicion.getTotal_factura_adquisicion()));
            lstP.add(new Parametro(11, facturaAdquisicion.getEstado_factura_adquisicion()));
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
    
     //////////////////////////////////////////////////////////////
    //para  llenar en memoria los datos que provienen de la BD hacemos lo siguiente
    public static ArrayList<facturaAdquisicion> llenarFacturaAdquisicion(ConjuntoResultado rs) throws Exception {
        ArrayList<facturaAdquisicion> lst = new ArrayList<facturaAdquisicion>();
        facturaAdquisicion facturaAdquisicion = null;
        try {
            while (rs.next()) {
                facturaAdquisicion = new facturaAdquisicion(rs.getInt(0), rs.getString(1),rs.getString(2),rs.getDate(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7),rs.getDouble(8),rs.getDouble(9), (rs.getString(10).charAt(0))); //Como utilizar el char con el get String
                lst.add(facturaAdquisicion);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los roles
    public static ArrayList<facturaAdquisicion> obtenerTodasFacturasAdquisiciones() throws Exception {
        ArrayList<facturaAdquisicion> lst = new ArrayList<facturaAdquisicion>();
        try {
            String sql = "select * from fn_select_factura_adquisicion()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarFacturaAdquisicion(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar rol dado id
    public static facturaAdquisicion obtenerFacturaAdquisicionId(int idFacturaAdquisicion) throws Exception {
        facturaAdquisicion obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_factura_adquisicion_id(?)";
            lstP.add(new Parametro(1, idFacturaAdquisicion));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new facturaAdquisicion();
            obj = llenarFacturaAdquisicion(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
