/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.proveedor;

/**
 *
 * @author Ervin
 */
public class fProveedor {

    ///////insertar Proveedor

    public static boolean insertarProveedor(proveedor proveedor) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla proveedor
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from public.fn_insert_proveedor(?,?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, proveedor.getRuc_proveedor()));
            lstP.add(new Parametro(2, proveedor.getNombre_proveedor()));
            lstP.add(new Parametro(3, proveedor.getApellido_proveedor()));
            lstP.add(new Parametro(4, proveedor.getNombre_comercial_proveedor()));
            lstP.add(new Parametro(5, proveedor.getDireccion_proveedor()));
            lstP.add(new Parametro(6, proveedor.getConvencional_proveedor()));
            lstP.add(new Parametro(7, proveedor.getCelular_proveedor()));
            lstP.add(new Parametro(8, proveedor.getCorreo_proveedor()));
            lstP.add(new Parametro(9, proveedor.getNombre_banco_proveedor()));
            lstP.add(new Parametro(10, proveedor.getCuenta_bancaria_proveedor()));
            lstP.add(new Parametro(11, "1"));
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

    ///////Eliminar Proveedor
    public static boolean eliminarProveedor(int idProveedor) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla proveedor
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_proveedor(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idProveedor));
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

    ///////Update Proveedor
    public static boolean updateProveedor(proveedor proveedor) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla proveedor
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_proveedor(?,?,?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, proveedor.getId_proveedor()));
            lstP.add(new Parametro(2, proveedor.getRuc_proveedor()));
            lstP.add(new Parametro(3, proveedor.getNombre_proveedor()));
            lstP.add(new Parametro(4, proveedor.getApellido_proveedor()));
            lstP.add(new Parametro(5, proveedor.getNombre_comercial_proveedor()));
            lstP.add(new Parametro(6, proveedor.getDireccion_proveedor()));
            lstP.add(new Parametro(7, proveedor.getConvencional_proveedor()));
            lstP.add(new Parametro(8, proveedor.getCelular_proveedor()));
            lstP.add(new Parametro(9, proveedor.getCorreo_proveedor()));
            lstP.add(new Parametro(10, proveedor.getNombre_banco_proveedor()));
            lstP.add(new Parametro(11, proveedor.getCuenta_bancaria_proveedor()));
            lstP.add(new Parametro(12, proveedor.getEstado_proveedor()));
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
    public static ArrayList<proveedor> llenarProveedor(ConjuntoResultado rs) throws Exception {
        ArrayList<proveedor> lst = new ArrayList<proveedor>();
        proveedor proveedor = null;
        try {
            while (rs.next()) {
                proveedor = new proveedor(rs.getInt(0), rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), (rs.getString(11).charAt(0))); //Como utilizar el char con el get String
                lst.add(proveedor);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los proveedores
    public static ArrayList<proveedor> obtenerTodosProveedores() throws Exception {
        ArrayList<proveedor> lst = new ArrayList<proveedor>();
        try {
            String sql = "select * from fn_select_proveedor()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarProveedor(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar proveedor dado id
    public static proveedor obtenerProveedorId(int idProveedor) throws Exception {
        proveedor obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_proveedor_id(?)";
            lstP.add(new Parametro(1, idProveedor));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new proveedor();
            obj = llenarProveedor(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }  
}
