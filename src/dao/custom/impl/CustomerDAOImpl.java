/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom.impl;

import dao.CrudUtil;
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
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean add(Customer customer) throws ClassNotFoundException, SQLException  {
        String sql ="insert into customer values(?,?,?,?,?)";
          return CrudUtil.executeUpdate(sql, customer.getId(),customer.getfName(),customer.getlNmae(),customer.getAddress(),customer.getSalary());
              
    }

    @Override
    public boolean update(Customer customer) throws ClassNotFoundException, SQLException {
        String sql="update customer set firstName=?,lastName=?,address=?,Salary=? where custID=?";
        return CrudUtil.executeUpdate(sql, customer.getfName(),customer.getlNmae(),customer.getAddress(),customer.getSalary(),customer.getId());
    }

    @Override
    public boolean remove(String customerID) throws ClassNotFoundException, SQLException {
        String sql="delete from customer where custID=?";
        return CrudUtil.executeUpdate(sql, customerID);
        
    }

    @Override
    public Customer search(String id) throws ClassNotFoundException, SQLException  {
        String sql = "select * from customer where custID=?";
        ResultSet rst = CrudUtil.executeQuery(sql, id);
            Customer customer=null;
            while(rst.next()){
            customer=new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5));
            }
        return customer;
    }

    @Override
    public ArrayList<Customer> loadAll() throws ClassNotFoundException, SQLException {
        String sql="select * from customer";
        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers=new ArrayList<>();
        while(rst.next()){
        Customer temp=new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4),  rst.getDouble(5));
        allCustomers.add(temp);
        }
        return allCustomers;
    }
}
