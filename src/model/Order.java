/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ronila
 */
public class Order {
 private String oID;
 private String oDate;
 private String custID;

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getoDate() {
        return oDate;
    }

    public void setoDate(String oDate) {
        this.oDate = oDate;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public Order(String oID, String oDate, String custID) {
        this.oID = oID;
        this.oDate = oDate;
        this.custID = custID;
    }

    public Order() {
    }
   
}
