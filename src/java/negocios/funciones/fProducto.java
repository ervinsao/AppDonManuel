/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.producto;
/**
 *
 * @author Ervin
 */
public class fProducto {
    
    ///////insertar Producto
    public static boolean insertarProducto(producto producto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_producto(?, ?, ?, ?, ?, ?, ?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, producto.getDetalle_producto()));
            lstP.add(new Parametro(2, producto.getPrecio_producto()));
            lstP.add(new Parametro(3, producto.getFecha_elaboracion_producto()));
            lstP.add(new Parametro(4, producto.getFecha_caducidad_producto()));
            lstP.add(new Parametro(5, producto.getEstado_producto()));
            lstP.add(new Parametro(6, producto.getId_unidad_medida_producto()));
            lstP.add(new Parametro(7, producto.getContenido_neto_producto()));
            lstP.add(new Parametro(8, producto.getCantidad()));
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
    
    ///////Eliminar Producto
    public static boolean eliminarProducto(int idProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_producto(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idProducto));
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
    
    ///////Update Producto
    public static boolean updateProducto(producto producto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_producto(?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, producto.getId_producto()));
            lstP.add(new Parametro(2, producto.getDetalle_producto()));
            lstP.add(new Parametro(3, producto.getPrecio_producto()));
            lstP.add(new Parametro(4, producto.getFecha_elaboracion_producto()));
            lstP.add(new Parametro(5, producto.getFecha_caducidad_producto()));
            lstP.add(new Parametro(6, producto.getEstado_producto()));
            lstP.add(new Parametro(7, producto.getId_unidad_medida_producto()));
            lstP.add(new Parametro(8, producto.getContenido_neto_producto()));
            lstP.add(new Parametro(9, producto.getCantidad()));
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
    public static ArrayList<producto> llenarProducto(ConjuntoResultado rs) throws Exception {
        ArrayList<producto> lst = new ArrayList<producto>();
        producto producto = null;
        try {
            while (rs.next()) {
                producto = new producto(rs.getInt(0), rs.getString(1), rs.getDouble(2), rs.getDate(3), rs.getDate(4), (rs.getString(5).charAt(0)), rs.getInt(6),rs.getDouble(7),rs.getInt(8)); //Como utilizar el char con el get String
                lst.add(producto);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los productos
    public static ArrayList<producto> obtenerTodosProductos() throws Exception {
        ArrayList<producto> lst = new ArrayList<producto>();
        try {
            String sql = "select * from fn_select_producto()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarProducto(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar producto dado id
    public static producto obtenerProductoId(int idProducto) throws Exception {
        producto obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_producto_id(?)";
            lstP.add(new Parametro(1, idProducto));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new producto();
            obj = llenarProducto(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
    
    ///////Update Clasificacion Materia
    public static boolean updateInventarioProducto(producto producto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Clasificacion Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_inventario_producto(?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, producto.getId_producto()));
            lstP.add(new Parametro(2, producto.getCantidad()));
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
