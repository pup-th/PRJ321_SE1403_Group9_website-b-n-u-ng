/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    public Users getUserByEmail(String email){
        try {
            String sql = "SELECT * FROM `users` WHERE `uMail` = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
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
}
