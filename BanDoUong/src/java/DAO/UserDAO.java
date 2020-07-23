/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.OrderDetail;
import Entities.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class UserDAO {

    public Connection conn;

    public UserDAO() {
        this.conn = new DBConnection().getConnection();
    }

    public String checkLogin(String mail, String password) {
        try {
            String sql = "SELECT * FROM `users` WHERE `uMail`=? and `uPassword` = MD5(?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, mail);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("uMail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String checkLoginByGoogle(String email) {
        try {
            String sql = "SELECT * FROM `users` WHERE `uMail` = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("uMail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public void register(Users u) throws SQLException {
        String sql = "INSERT INTO `users`(`uMail`, `uPassword`, `uName`, `uPhone`, `uAddress`) VALUES (?,MD5(?),?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, u.getuMail());
        pst.setString(2, u.getuPassword());
        pst.setString(3, u.getuName());
        pst.setString(4, u.getuPhone());
        pst.setString(5, u.getuAddress());
        pst.executeUpdate();
    }

    public Users getUserByEmail(String email) {
        try {
            String sql = "SELECT * FROM `users` WHERE `uMail` = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return new Users(rs.getString("uMail"),
                        rs.getString("uPassword"),
                        rs.getString("uName"),
                        rs.getString("uPhone"),
                        rs.getString("uAddress"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Entities.Users getInfoUser(String mail) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM `users` WHERE `uMail`=?");
            pst.setString(1, mail);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Entities.Users u = new Users(rs.getString("uMail"), rs.getString("uPassword"), rs.getString("uName"), rs.getString("uPhone"), rs.getString("uAddress"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int updateInfo(String cemail, String cname, String cphone, String caddress, String omail) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE `users` SET `uMail`=?,`uName`=?,`uPhone`=?,`uAddress`=? WHERE `uMail`=?");
            pst.setString(1, cemail);
            pst.setString(2, cname);
            pst.setString(3, cphone);
            pst.setString(4, caddress);
            pst.setString(5, omail);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

     public int updatePassword(String email, String newpass) {
        try {
            PreparedStatement pst = conn.prepareStatement("UPDATE `users` SET `uPassword`=MD5(?) WHERE `uMail`= ?");
            pst.setString(1, newpass);
            pst.setString(2, email);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<Entities.OrderDetail> getHisPurchase(String mail) {
        try {
            ArrayList<Entities.OrderDetail> list = new ArrayList<>();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM `orderdetail` WHERE `uMail`=?");
            pst.setString(1, mail);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new OrderDetail(
                        rs.getInt("oId"),
                        rs.getInt("payId"),
                        rs.getString("uMail"), 
                        rs.getInt("iId"), 
                        rs.getInt("quantity"), 
                        rs.getString("note"), 
                        rs.getDate("orderDate")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public String getPassword(String mail) {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT `uPassword` FROM `users` WHERE `uMail`=?");
            pst.setString(1, mail);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("uPassword");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
