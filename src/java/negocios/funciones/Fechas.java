/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios.funciones;

import java.text.SimpleDateFormat;

/**
 *
 * @author BEVB
 */
public class Fechas {

    public static java.sql.Date FechaDadoString(String fecha) {
        long lnMilisegundos = 0;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date date = sdf.parse(fecha);
            lnMilisegundos = date.getTime();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        return sqlDate;
    }

}
