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
public class Customer {
    private String id;
    private String fName;
    private String lNmae;
    private String address;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlNmae() {
        return lNmae;
    }

    public void setlNmae(String lNmae) {
        this.lNmae = lNmae;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Customer(String id, String fName, String lNmae, String address, double salary) {
        this.id = id;
        this.fName = fName;
        this.lNmae = lNmae;
        this.address = address;
        this.salary = salary;
    }


    public Customer() {
    }
    
    
}
