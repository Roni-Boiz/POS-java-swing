/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ronila
 */
public class DBLearn {
    private Connection connection;
    public static DBLearn dbLearn;

    private DBLearn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos");
        
    }
    
    public static DBLearn getInstance() throws ClassNotFoundException, SQLException{
        if (dbLearn==null) {
            dbLearn=new DBLearn();
        }
        return dbLearn;
    }
    
   public Connection getConnection(){
   return connection;
   }
    
    
    
    
}
