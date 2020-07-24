/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Itemall {

    private int bId;
    private String iName;
    private int blockId;
    private String size;
    private int pId;
    private int outputPrice;
    private String originCode;
    private int status;
    private int quantity;
    private int discoutnStatus;
    private int vouId;
    private String taste ;
    private Date expiryDate;
    private String iPic;

    public Itemall() {
    }

    public Itemall(int bId, String iName, int blockId, String size, int pId, int outputPrice, String originCode, int status, int quantity, int discoutnStatus, int vouId, String taste, Date expiryDate, String iPic) {
        this.bId = bId;
        this.iName = iName;
        this.blockId = blockId;
        this.size = size;
        this.pId = pId;
        this.outputPrice = outputPrice;
        this.originCode = originCode;
        this.status = status;
        this.quantity = quantity;
        this.discoutnStatus = discoutnStatus;
        this.vouId = vouId;
        this.taste = taste;
        this.expiryDate = expiryDate;
        this.iPic = iPic;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getOutputPrice() {
        return outputPrice;
    }

    public void setOutputPrice(int outputPrice) {
        this.outputPrice = outputPrice;
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode;
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

    public int getDiscoutnStatus() {
        return discoutnStatus;
    }

    public void setDiscoutnStatus(int discoutnStatus) {
        this.discoutnStatus = discoutnStatus;
    }

    public int getVouId() {
        return vouId;
    }

    public void setVouId(int vouId) {
        this.vouId = vouId;
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

    public String getiPic() {
        return iPic;
    }

    public void setiPic(String iPic) {
        this.iPic = iPic;
    }

    
  
}
