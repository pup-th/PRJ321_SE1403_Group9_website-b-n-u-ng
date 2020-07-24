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
public class Items {

    private int iId;
    private String name;
    private String size;
    private int price;
    private int status;
    private int quantity;
    private int rId;
    private int discounstt;
    private String taste;
    private Date expiryDate;
    private String img;

    public Items() {
    }

    public Items(int iId, String name, String size, int price, int status, int quantity, int rId, int discounstt, String taste, Date expiryDate, String img) {
        this.iId = iId;
        this.name = name;
        this.size = size;
        this.price = price;
        this.status = status;
        this.quantity = quantity;
        this.rId = rId;
        this.discounstt = discounstt;
        this.taste = taste;
        this.expiryDate = expiryDate;
        this.img = img;
    }

    public Items(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getDiscounstt() {
        return discounstt;
    }

    public void setDiscounstt(int discounstt) {
        this.discounstt = discounstt;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
