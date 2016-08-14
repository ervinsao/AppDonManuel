/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;
import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.usuario;
/**
 *
 * @author Ervin
 */
public class fUsuario {
    
    

    //////validar usuario
    public static usuario validarUsuario(String Usuario, String Password) throws Exception {
        usuario obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_validar_usuario(?,?)";
            lstP.add(new Parametro(1, Usuario));
            lstP.add(new Parametro(2, Password));        
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new usuario();
            obj = llenarValidacion(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
    
    ///////insertar Usuario
    public static boolean insertarUsuario(usuario usuario) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla usuario
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from public.fn_insert_usuario(?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, usuario.getUsuario()));
            lstP.add(new Parametro(2, usuario.getContrasenia_usuario()));
            lstP.add(new Parametro(3, "1"));
            lstP.add(new Parametro(4, usuario.getId_rol()));
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
    
    ///////Eliminar Usuario
    public static boolean eliminarUsuario(int idUsuario) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla usuario
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_usuario(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idUsuario));
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
    
    ///////Update Usuario
    public static boolean updateUsuario(usuario usuario) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla usuario
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_usuario(?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, usuario.getId_usuario()));
            lstP.add(new Parametro(2, usuario.getUsuario()));
            lstP.add(new Parametro(3, usuario.getContrasenia_usuario()));
            lstP.add(new Parametro(4, usuario.getEstado_usuario()));
            lstP.add(new Parametro(5, usuario.getId_rol()));
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
    public static ArrayList<usuario> llenarUsuario(ConjuntoResultado rs) throws Exception {
        ArrayList<usuario> lst = new ArrayList<usuario>();
        usuario usuario = null;
        try {
            while (rs.next()) {
                usuario = new usuario(rs.getInt(0), rs.getString(1),rs.getString(2), (rs.getString(3).charAt(0)),rs.getInt(4)); //Como utilizar el char con el get String
                lst.add(usuario);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    
    //para  llenar en memoria los datos que provienen de la BD hacemos lo siguiente
    public static usuario llenarValidacion(ConjuntoResultado rs) throws Exception {
        usuario usuario = null;
        try {
            int r1=rs.getTamFil();
            if (r1 > 0) {
                 while (rs.next()) {
                usuario = new usuario(); 
                usuario.setId_rol(rs.getInt(0));
                usuario.setId_usuario(rs.getInt(1));
            } 
            } else {
              
            }
              
          
           
            
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
    ///////seleccionar todos los usuarios
    public static ArrayList<usuario> obtenerTodosUsuarios() throws Exception {
        ArrayList<usuario> lst = new ArrayList<usuario>();
        try {
            String sql = "select * from fn_select_usuario()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarUsuario(rs);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    //////seleccionar usuario dado id
    public static usuario obtenerUsuarioId(int idUsuario) throws Exception {
        usuario obj;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from fn_select_usuario_id(?)";
            lstP.add(new Parametro(1, idUsuario));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            obj = new usuario();
            obj = llenarUsuario(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return obj;
    }   
}
