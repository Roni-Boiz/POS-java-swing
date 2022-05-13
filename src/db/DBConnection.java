/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import pos.database.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ronila
 */
public class DBConnection {
    
private Connection connection;
public static DBConnection dbConnection;
    
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_NAME","DB_USER","DB_PASSWORD");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection==null) {
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
    
    public Connection getConnection(){
    return connection;
    }
    
}
