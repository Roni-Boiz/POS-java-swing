/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOFactory;
import dao.custom.OrderDAO;
import dao.custom.OrderDetailDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Order;
import model.OrderDetail;

/**
 *
 * @author Ronila
 */
public class InvoiceController {

   
        static OrderDAO dao = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDER);
        static OrderDetailDAO dao1 = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAIL);
    
    
    public static boolean PurchaseOrder(Order order, ArrayList<OrderDetail> orderDetails) throws ClassNotFoundException, SQLException, Exception{
        Connection connection = db.DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        boolean orderAdded = dao.add(order);
        if (orderAdded) {
            for (OrderDetail orderDetail : orderDetails) {
                boolean orderDetailAdded = dao1.add(orderDetail);
                if (!orderDetailAdded) {
                    connection.rollback();
                    connection.setAutoCommit(true);
                    return false;
                }
            }
                connection.commit();
                connection.setAutoCommit(true);
                return true;
        }else{
        connection.rollback();
        connection.setAutoCommit(true);
        return false;
        }
    }
    public static String getLastOid() throws ClassNotFoundException, SQLException, Exception{
        
        return dao.getLastOid();
        
        
}
}