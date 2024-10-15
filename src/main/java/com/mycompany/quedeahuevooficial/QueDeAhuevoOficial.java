

package com.mycompany.quedeahuevooficial;

import com.back.BaseDatos;
import java.sql.Connection;

/**
 *
 * @author aries
 */
public class QueDeAhuevoOficial {

    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        Connection cnx = bd.getConexion();
        var principal = new Principal();
        principal.setVisible(true);
    }
}
