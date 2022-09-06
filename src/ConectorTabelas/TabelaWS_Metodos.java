/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectorTabelas;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author davip
 */
public class TabelaWS_Metodos {
    
    public boolean excluir(TabelaWS_GS ficha){
        
            try{
                
                Connection conn = TabelaWS.getConnection();
                String sql = "DELETE FROM `workshop` WHERE `Id_Projeto` = ?;";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, ficha.getId_Projeto());
                
                ps.executeUpdate();
                ps.close();
                conn.close();
                return true;
                
            } catch (Exception e){
                
               System.err.println("Erro: " +e.toString());
               e.printStackTrace();
               return false;
                
            }
            
        }
    
}
