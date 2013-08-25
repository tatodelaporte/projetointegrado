/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author suporte
 */
public class ConnectionFactory {
    
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/pisistemas?user=root&password=douglas";

    public static  Connection prepareConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        
        Connection con = DriverManager.getConnection(JDBC_URL);
        con.setAutoCommit(true);
        return con;
    }

   
    

}
