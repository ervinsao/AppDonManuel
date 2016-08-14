/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.materiaProducto;
/**
 *
 * @author Ervin
 */
public class fMateriaProducto {
    
    ///////insertar Materia Producto
    public static boolean insertarMateriaProducto(materiaProducto materiaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla materia producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_materia_producto(?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, materiaProducto.getId_materia()));
            lstP.add(new Parametro(2, materiaProducto.getId_producto()));
            lstP.add(new Parametro(3, materiaProducto.getEstado_materia_producto()));
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
    
    ///////Eliminar Materia Producto
    public static boolean eliminarMateriaProducto(int idMateriaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Rol
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_materia_producto(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idMateriaProducto));
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
    
    ///////Update Materia Producto
    public static boolean updateMateriaProducto(materiaProducto materiaProducto) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Materia Producto
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_materia_producto(?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, materiaProducto.getId_materia_producto()));
            lstP.add(new Parametro(2, materiaProducto.getId_materia()));
            lstP.add(new Parametro(3, materiaProducto.getId_producto()));
            lstP.add(new Parametro(4, materiaProducto.getEstado_materia_producto()));
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
