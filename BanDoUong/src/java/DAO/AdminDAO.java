/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class AdminDAO {
    public Connection conn;

    public AdminDAO() {
        this.conn = new DBConnection().getConnection();
    }
    public String checkLogin(String mail, String password) {
        try {
            String sql = "SELECT * FROM `admin` WHERE `aMail`=? and `aPassword` = MD5(?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, mail);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("aMail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
     public String checkLoginByGoogle(String email) {
        try {
            String sql = "SELECT * FROM `admin` WHERE `aMail` = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString("aMail");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
