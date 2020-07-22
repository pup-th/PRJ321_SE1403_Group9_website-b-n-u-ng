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
public class OrderDetail {
    private int oId;
    private int payId;
    private String uMail;
    private int iId;
    private int quantity;
    private String note;
    private Date orderDate;

    public OrderDetail() {
    }

    public OrderDetail(int oId, int payId, String uMail, int iId, int quantity, String note, Date orderDate) {
        this.oId = oId;
        this.payId = payId;
        this.uMail = uMail;
        this.iId = iId;
        this.quantity = quantity;
        this.note = note;
        this.orderDate = orderDate;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
   
}
