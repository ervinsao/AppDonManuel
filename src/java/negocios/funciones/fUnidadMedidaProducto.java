/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.unidadMedidaProducto;
/**
 *
 * @author Ervin
 */
public class fUnidadMedidaProducto {
    
    ///////insertar Unidad Medida Producto
    public static boolean insertarUnidadMedidaProducto(unidadMedidaProducto unidadMedidaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla unidad medida producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_unidad_medida_producto(?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, unidadMedidaProducto.getDescripcion_unidad_medida_producto()));
            lstP.add(new Parametro(2, unidadMedidaProducto.getEstado_unidad_medida_producto()));
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
    
    ///////Eliminar Unidad Medida Producto
    public static boolean eliminarUnidadMedidaProducto(int idUnidadMedidaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla unidad medida producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_unidad_medida_producto(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idUnidadMedidaProducto));
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
    
    ///////Update Unidad Medida Producto
    public static boolean updateUnidadMedidaProducto(unidadMedidaProducto unidadMedidaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Unidad Medida Producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_unidad_medida_producto(?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, unidadMedidaProducto.getId_unidad_medida_producto()));
            lstP.add(new Parametro(2, unidadMedidaProducto.getDescripcion_unidad_medida_producto()));
            lstP.add(new Parametro(3, unidadMedidaProducto.getEstado_unidad_medida_producto()));
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
    public static ArrayList<unidadMedidaProducto> llenarUnidadMedidaProducto(ConjuntoResultado rs) throws Exception {
        ArrayList<unidadMedidaProducto> lst = new ArrayList<unidadMedidaProducto>();
        unidadMedidaProducto unidadMedidaProducto = null;
        try {
            while (rs.next()) {
                unidadMedidaProducto = new unidadMedidaProducto(rs.getInt(0), rs.getString(1), (rs.getString(2).charAt(0))); //Como utilizar el char con el get String
                lst.add(unidadMedidaProducto);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los roles
    public static ArrayList<unidadMedidaProducto> obtenerTodasUnidadesMedidasProductos() throws Exception {
        ArrayList<unidadMedidaProducto> lst = new ArrayList<unidadMedidaProducto>();
        try {
            String sql = "select * from fn_select_unidad_medida_producto()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarUnidadMedidaProducto(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar rol dado id
    public static unidadMedidaProducto obtenerUnidadMedidaProductoId(int idUnidadMedidaProducto) throws Exception {
        unidadMedidaProducto obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_unidad_medida_producto_id(?)";
            lstP.add(new Parametro(1, idUnidadMedidaProducto));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new unidadMedidaProducto();
            obj = llenarUnidadMedidaProducto(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
