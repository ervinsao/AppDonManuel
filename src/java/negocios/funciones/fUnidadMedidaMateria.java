/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.unidadMedidaMateria;
/**
 *
 * @author Ervin
 */
public class fUnidadMedidaMateria {
    
    ///////insertar Unidad Medida Materia
    public static boolean insertarUnidadMedidaMateria(unidadMedidaMateria unidadMedidaMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla unidad medida materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_unidad_medida_materia(?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, unidadMedidaMateria.getDescripcion_unidad_medida_materia()));
            lstP.add(new Parametro(2, unidadMedidaMateria.getEstado_unidad_medida_materia()));
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
    
    ///////Eliminar Unidad Medida Materia
    public static boolean eliminarUnidadMedidaMateria(int idUnidadMedidaMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla unidad medida materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_unidad_medida_materia(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idUnidadMedidaMateria));
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
    
    ///////Update Unidad Medida Materia
    public static boolean updateUnidadMedidaMateria(unidadMedidaMateria unidadMedidaMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Unidad Medida Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_unidad_medida_materia(?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, unidadMedidaMateria.getId_unidad_medida_materia()));
            lstP.add(new Parametro(2, unidadMedidaMateria.getDescripcion_unidad_medida_materia()));
            lstP.add(new Parametro(3, unidadMedidaMateria.getEstado_unidad_medida_materia()));
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
    public static ArrayList<unidadMedidaMateria> llenarUnidadMedidaMateria(ConjuntoResultado rs) throws Exception {
        ArrayList<unidadMedidaMateria> lst = new ArrayList<unidadMedidaMateria>();
        unidadMedidaMateria unidadMedidaMateria = null;
        try {
            while (rs.next()) {
                unidadMedidaMateria = new unidadMedidaMateria(rs.getInt(0), rs.getString(1), (rs.getString(2).charAt(0))); //Como utilizar el char con el get String
                lst.add(unidadMedidaMateria);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los roles
    public static ArrayList<unidadMedidaMateria> obtenerTodasUnidadesMedidasMaterias() throws Exception {
        ArrayList<unidadMedidaMateria> lst = new ArrayList<unidadMedidaMateria>();
        try {
            String sql = "select * from fn_select_unidad_medida_materia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarUnidadMedidaMateria(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar rol dado id
    public static unidadMedidaMateria obtenerUnidadMedidaMateriaId(int idUnidadMedidaMateria) throws Exception {
        unidadMedidaMateria obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_unidad_medida_materia_id(?)";
            lstP.add(new Parametro(1, idUnidadMedidaMateria));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new unidadMedidaMateria();
            obj = llenarUnidadMedidaMateria(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
