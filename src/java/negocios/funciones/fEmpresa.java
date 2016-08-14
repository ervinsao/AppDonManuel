/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import accesodatos.*;
import java.sql.SQLException;
import java.util.ArrayList;
import negocios.clases.empresa;
/**
 *
 * @author Ervin
 */
public class fEmpresa {
    
    ///////insertar Empresa
    public static boolean insertarEmpresa(empresa empresa) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla empresa
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_insert_empresa(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, empresa.getRuc_empresa()));
            lstP.add(new Parametro(2, empresa.getNombre_comercial_empresa()));
            lstP.add(new Parametro(3, empresa.getNombre_gerente_empresa()));
            lstP.add(new Parametro(4, empresa.getApellido_gerente_empresa()));
            lstP.add(new Parametro(5, empresa.getDireccion_empresa()));
            lstP.add(new Parametro(6, empresa.getConvencional_empresa()));
            lstP.add(new Parametro(7, empresa.getCelular_empresa()));
            lstP.add(new Parametro(8, empresa.getIva_empresa()));
            lstP.add(new Parametro(9, empresa.getEstado_empresa()));
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
    
    ///////Eliminar Empresa
    public static boolean eliminarEmpresa(int idEmpresa) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se eliminara en la tabla Empresa
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_delete_empresa(?)";
            //////lenamos cada parametro de acuerdo al id y orden establecido en la funcion
            lstP.add(new Parametro(1, idEmpresa));
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
    
    ///////Update Empresa
    public static boolean updateEmpresa(empresa empresa) throws Exception {
        boolean bandera = false;
        try {
            ////declaro un arreglo de parametros para llenar la informacion que se insertara en la tabla Empresa
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();

            ////declaro una variable de tipo String que guardar el llamado a la funcion de postgres con los parametros representados por signo de integrracion
            String sql = "select * from fn_update_empresa(?,?,?,?,?,?,?,?,?,?)";
            //////lenamos cada parametro de acuerdo al nuimer y orden establecido en la funcion
            lstP.add(new Parametro(1, empresa.getId_empresa()));
            lstP.add(new Parametro(2, empresa.getRuc_empresa()));
            lstP.add(new Parametro(3, empresa.getNombre_comercial_empresa()));
            lstP.add(new Parametro(4, empresa.getNombre_gerente_empresa()));
            lstP.add(new Parametro(5, empresa.getApellido_gerente_empresa()));
            lstP.add(new Parametro(6, empresa.getDireccion_empresa()));
            lstP.add(new Parametro(7, empresa.getConvencional_empresa()));
            lstP.add(new Parametro(8, empresa.getCelular_empresa()));
            lstP.add(new Parametro(9, empresa.getIva_empresa()));
            lstP.add(new Parametro(10, empresa.getEstado_empresa()));
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
