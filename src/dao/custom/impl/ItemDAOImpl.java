package dao.custom.impl;

import dao.CrudUtil;
import dao.SuperDAO;
import dao.custom.ItemDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;
import pos.database.DBConnection;

public class ItemDAOImpl implements ItemDAO{

    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        String sql = "insert into item values(?,?,?,?)";
        return CrudUtil.executeUpdate(sql, item.getCode(),item.getDescription(),item.getQuantityOnHand(),item.getUnitPrice());
    }
  
    @Override
    public boolean update(Item item) throws ClassNotFoundException, SQLException{
        String sql="update item set description=?,qty=?,price=? where code=?";
        return CrudUtil.executeUpdate(sql, item.getDescription(),item.getQuantityOnHand(),item.getUnitPrice(),item.getCode());
    }
    
    @Override
    public boolean remove(String item) throws ClassNotFoundException, SQLException{
        String sql="delete from item where code=?";
        return CrudUtil.executeUpdate(sql, item);
    }
    
    @Override
    public Item search(String id) throws SQLException, ClassNotFoundException{
            String sql = "select * from item where code=?";
            ResultSet rst = CrudUtil.executeQuery(sql, id);
            Item item=null;
            while(rst.next()){
            item =new Item(rst.getString(1),rst.getString(2),rst.getInt(3),rst.getDouble(4));
            }
            return item;
    }
    
    @Override
    public ArrayList<Item> loadAll() throws SQLException, ClassNotFoundException{
        String sql="select * from item";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Item> allItems=new ArrayList<>();
        while(rst.next()){
        Item temp=new Item(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getDouble(4));
        allItems.add(temp);
        }
        return allItems;
    }  
}
