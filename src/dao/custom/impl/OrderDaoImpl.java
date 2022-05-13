/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.OrderDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

/**
 *
 * @author Ronila
 */
public class OrderDaoImpl implements OrderDAO{

    @Override
    public boolean add(Order order) throws Exception {
        String sql = "Insert into CustomerOrder values(?,?,?)";
        return CrudUtil.executeUpdate(sql, order.getoID(),order.getoDate(),order.getCustID());
    }

    @Override
    public boolean update(Order order) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Order> loadAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLastOid() throws Exception {
            Connection connection = db.DBConnection.getInstance().getConnection();
            String sql = "select orderID from customerOrder order by orderDate desc, orderID desc limit 1";
            PreparedStatement pstm = connection.prepareStatement(sql);
            ResultSet rst = pstm.executeQuery();
            String lOid="OID0";
            while(rst.next()){
                lOid = rst.getString(1);
            }
        return lOid;
    }
    
}
