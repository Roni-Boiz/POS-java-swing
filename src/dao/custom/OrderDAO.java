/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.custom;

import dao.SuperDAO;
import model.Order;

/**
 *
 * @author Ronila
 */
public interface OrderDAO extends SuperDAO<Order, String>{
public  String getLastOid() throws Exception ;   
}
