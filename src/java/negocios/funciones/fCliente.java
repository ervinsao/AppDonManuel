/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.cliente;
/**
 *
 * @author Ervin
 */
public class fCliente {
    
    ///////insertar Cliente
    public static boolean insertarCliente(cliente cliente) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla cliente
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, cliente.getIdentificacion_cliente()));
            lstP.add(new Parametro(2, cliente.getNombre_cliente()));
            lstP.add(new Parametro(3, cliente.getApellido_cliente()));
            lstP.add(new Parametro(4, cliente.getDireccion_cliente()));
            lstP.add(new Parametro(5, cliente.getConvencional_cliente()));
            lstP.add(new Parametro(6, cliente.getCelular_cliente()));
            lstP.add(new Parametro(7, cliente.getCorreo_cliente()));
            lstP.add(new Parametro(8, cliente.getEstado_cliente()));
            lstP.add(new Parametro(9, cliente.getId_tipo_identificacion_cliente()));
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
    
    ///////Eliminar Cliente
    public static boolean eliminarCliente(int idCliente) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Cliente
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_cliente(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idCliente));
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
    
    ///////Update Cliente
    public static boolean updateCliente(cliente cliente) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Cliente
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_cliente(?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, cliente.getId_cliente()));
            lstP.add(new Parametro(2, cliente.getIdentificacion_cliente()));
            lstP.add(new Parametro(3, cliente.getNombre_cliente()));
            lstP.add(new Parametro(4, cliente.getApellido_cliente()));
            lstP.add(new Parametro(5, cliente.getDireccion_cliente()));
            lstP.add(new Parametro(6, cliente.getConvencional_cliente()));
            lstP.add(new Parametro(7, cliente.getCelular_cliente()));
            lstP.add(new Parametro(8, cliente.getCorreo_cliente()));
            lstP.add(new Parametro(9, cliente.getEstado_cliente()));
            lstP.add(new Parametro(10, cliente.getId_tipo_identificacion_cliente()));
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
