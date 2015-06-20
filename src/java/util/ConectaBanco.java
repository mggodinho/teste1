/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author godinho
 */
public class ConectaBanco {
    public static Connection getConexao() throws ClassNotFoundException{
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetologin","postgres","postgres");
          } catch (ClassNotFoundException cnfex){
             Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE,null, cnfex);
          } catch (SQLException ex) {    
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
          return conn;
}
    }