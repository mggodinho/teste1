/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Login;
import util.ConectaBanco;

/**
 *
 * @author godinho
 */
public class LoginDAO {
   private static final String Select_Count = "SELECT COUNT(*) AS contagem FROM usuarios WHERE usuarios.nome = ? and usuarios.senha = ?";
   public int VerificaLogin(Login l) throws ClassNotFoundException, SQLException{
       Connection bdcon = null;
       int quantos = 0;
       try {
           bdcon = ConectaBanco.getConexao();
           PreparedStatement pstm = bdcon.prepareStatement(Select_Count);
           pstm.setString(1,l.getNome());
           pstm.setString(2,l.getSenha());
           pstm.executeQuery();
           ResultSet rs = pstm.getResultSet();
           while (rs.next()){
                  quantos = rs.getInt("contagem");
           }
           return quantos;
       } catch (ClassNotFoundException cnfex){
           throw new RuntimeException(cnfex);
       } catch (SQLException ex){
           throw new RuntimeException(ex);
       } finally {
           try {
               bdcon.close();
           } catch(SQLException ex){
               throw new RuntimeException (ex);
           }
       }
   }
}
