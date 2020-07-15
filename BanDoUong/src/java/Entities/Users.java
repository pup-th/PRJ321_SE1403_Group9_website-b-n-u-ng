/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Asus
 */
public class Users {
    private String uMail;
    private String uPassword;
    private String uName;
    private String uPhone;
    private String uAddress;

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public Users(String uMail, String uPassword, String uName, String uPhone, String uAddress) {
        this.uMail = uMail;
        this.uPassword = uPassword;
        this.uName = uName;
        this.uPhone = uPhone;
        this.uAddress = uAddress;
    }

    public Users() {
    }
}
