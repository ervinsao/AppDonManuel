/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;


import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.materia;
/**
 *
 * @author Ervin
 */
public class fMateria {
    
    ///////insertar Materia
    public static boolean insertarMateria(materia materia) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_materia(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, materia.getDescripcion_materia()));
            lstP.add(new Parametro(2, materia.getCantidad_materia()));
            lstP.add(new Parametro(3, materia.getFecha_almacenamiento_materia()));
            lstP.add(new Parametro(4, materia.getFecha_caducidad_materia()));
            lstP.add(new Parametro(5, materia.getEstado_materia()));
            lstP.add(new Parametro(6, materia.getId_tipo_materia()));
            lstP.add(new Parametro(7, materia.getId_clasificacion_materia()));
            lstP.add(new Parametro(8, materia.getId_proveedor()));
            lstP.add(new Parametro(9, materia.getId_unidad_medida_materia()));
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
    
    ///////Eliminar Materia
    public static boolean eliminarMateria(int idMateria) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_mteria(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idMateria));
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
    
    ///////Update Materia
    public static boolean updateMateria(materia materia) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Materia
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_materia(?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, materia.getId_materia()));
            lstP.add(new Parametro(2, materia.getDescripcion_materia()));
            lstP.add(new Parametro(3, materia.getCantidad_materia()));
            lstP.add(new Parametro(4, materia.getFecha_almacenamiento_materia()));
            lstP.add(new Parametro(5, materia.getFecha_caducidad_materia()));
            lstP.add(new Parametro(6, materia.getEstado_materia()));
            lstP.add(new Parametro(7, materia.getId_tipo_materia()));
            lstP.add(new Parametro(8, materia.getId_clasificacion_materia()));
            lstP.add(new Parametro(9, materia.getId_proveedor()));
            lstP.add(new Parametro(10, materia.getId_unidad_medida_materia()));
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
    public static ArrayList<materia> llenarMateria(ConjuntoResultado rs) throws Exception {
        ArrayList<materia> lst = new ArrayList<materia>();
        materia materia = null;
        try {
            while (rs.next()) {
                materia = new materia(rs.getInt(0), rs.getString(1),rs.getInt(2),rs.getDate(3),rs.getDate(4), (rs.getString(5).charAt(0)),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9)); //Como utilizar el char con el get String
                lst.add(materia);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    ///////seleccionar todos los roles
    public static ArrayList<materia> obtenerTodasMaterias() throws Exception {
        ArrayList<materia> lst = new ArrayList<materia>();
        try {
            String sql = "select * from fn_select_materia()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarMateria(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar rol dado id
    public static materia obtenerMateriaId(int idMateria) throws Exception {
        materia obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_materia_id(?)";
            lstP.add(new Parametro(1, idMateria));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new materia();
            obj = llenarMateria(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
