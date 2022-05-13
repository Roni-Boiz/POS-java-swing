/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOFactory;
import dao.custom.impl.ItemDAOImpl;
import dao.SuperDAO;
import dao.custom.ItemDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;
import pos.database.DBConnection;

/**
 *
 * @author Ronila
 */
public class ItemController {
 
   static ItemDAO dao = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    
    

    public static boolean AddItem(Item item) throws SQLException, ClassNotFoundException, Exception {
      
        return dao.add(item);
    }
    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException, Exception{
   
        return dao.update(item);
    }
    
    public static boolean removeItem(String item) throws ClassNotFoundException, SQLException, Exception{
  
        return dao.remove(item);
    }
    
    public static Item SearchItem(String id) throws SQLException, ClassNotFoundException, Exception{
  
        return dao.search(id);
    }
    
    public static ArrayList<Item> loadAllItem() throws SQLException, ClassNotFoundException, Exception{
 
        return dao.loadAll();
    }

}
