/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOFactory;
import dao.custom.impl.CustomerDAOImpl;
import dao.SuperDAO;
import dao.custom.CustomerDAO;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Ronila
 */
public class CustomerController {
  static CustomerDAO dao = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
   
    
    
    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException, Exception{

     return dao.add(customer);  
    }
    
    public static boolean updateCustomer(Customer customer) throws SQLException, ClassNotFoundException, Exception{

     return dao.update(customer);
    }
        
    
    public static boolean removeCustomer(String customerID) throws ClassNotFoundException, SQLException, Exception{

     return dao.remove(customerID);
    }
    
    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException, Exception{

          return (Customer) dao.search(id);
    }
    
    public static ArrayList<Customer> loadAllCustomer() throws ClassNotFoundException, SQLException, Exception{

          return dao.loadAll();
    }   
}
