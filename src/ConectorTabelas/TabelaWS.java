/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectorTabelas;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author davip
 */
public class TabelaWS {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "info_tabelaws";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        
        try {
            cnx = datasource.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(" Get Connection -> " + TabelaWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
 
    
    
}
