/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;



/**
 *
 * @author ASUS
 */
public class Orders {
    private String name;
    private int quantity;
    private int iprice;
    private Date date;
    private int total;

    public Orders() {
    }

    public Orders(String name, int quantity, int iprice, Date date, int total) {
        this.name = name;
        this.quantity = quantity;
        this.iprice = iprice;
        this.date = date;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIprice() {
        return iprice;
    }

    public void setIprice(int iprice) {
        this.iprice = iprice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
