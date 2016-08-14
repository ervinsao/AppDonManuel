/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.clasificacionMateria;
/**
 *
 * @author Ervin
 */
public class fClasificacionMateria {
    
    ///////insertar Clasificacion Materia
    public static boolean insertarClasificacionMateria(clasificacionMateria clasificacionMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla clasificacion materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_clasificacion_materia(?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, clasificacionMateria.getDescripcion_clasificacion_materia()));
            lstP.add(new Parametro(2, "1"));
            lstP.add(new Parametro(3, clasificacionMateria.getTotal_clasificacion_materia()));
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
    
    ///////Eliminar Clasificacion Materia
    public static boolean eliminarClasificacionMateria(int idClasificacionMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla clasificacion materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_clasificacion_materia(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idClasificacionMateria));
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
    
    ///////Update Clasificacion Materia
    public static boolean updateClasificacionMateria(clasificacionMateria clasificacionMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Clasificacion Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_clasificacion_materia(?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, clasificacionMateria.getId_clasificacion_materia()));
            lstP.add(new Parametro(2, clasificacionMateria.getDescripcion_clasificacion_materia()));
            lstP.add(new Parametro(3, clasificacionMateria.getEstado_clasificacion_materia()));
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
    
    
    
    ///////////////////Suma de clasificacion materia totales
    
    ///////Update Clasificacion Materia
    public static boolean updateSumaClasificacionMateria(clasificacionMateria clasificacionMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Clasificacion Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_suma_total_clasificacion_materia(?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, clasificacionMateria.getId_clasificacion_materia()));
            lstP.add(new Parametro(2, clasificacionMateria.getTotal_clasificacion_materia()));
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
    public static ArrayList<clasificacionMateria> llenarClasificacionMateria(ConjuntoResultado rs) throws Exception {
        ArrayList<clasificacionMateria> lst = new ArrayList<clasificacionMateria>();
        clasificacionMateria clasificacionMateria = null;
        try {
            while (rs.next()) {
                clasificacionMateria = new clasificacionMateria(rs.getInt(0), rs.getString(1), (rs.getString(2).charAt(0)),rs.getDouble(3)); //Como utilizar el char con el get String
                lst.add(clasificacionMateria);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los roles
    public static ArrayList<clasificacionMateria> obtenerTodosClasificacionesMaterias() throws Exception {
        ArrayList<clasificacionMateria> lst = new ArrayList<clasificacionMateria>();
        try {
            String sql = "select * from fn_select_clasificacion_materia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarClasificacionMateria(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar rol dado id
    public static clasificacionMateria obtenerClasificacionMateriaId(int idClasificacionMateria) throws Exception {
        clasificacionMateria obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_clasificacion_materia_id(?)";
            lstP.add(new Parametro(1, idClasificacionMateria));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new clasificacionMateria();
            obj = llenarClasificacionMateria(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
