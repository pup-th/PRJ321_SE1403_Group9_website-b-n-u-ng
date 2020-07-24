/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Items;
import Entities.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public ArrayList<Entities.OrderDetail> reportListTopUser() {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT COUNT(`oId`)as oId,`payId`, `uMail`,`iId`, SUM(`quantity`)as quantity,`note`,`orderDate` FROM orderdetail GROUP BY `uMail` ORDER BY COUNT(`oId`) DESC");
            ResultSet rs = pst.executeQuery();
            ArrayList<OrderDetail> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new OrderDetail(rs.getInt("oId"), rs.getInt("payId"), rs.getString("uMail"), rs.getInt("iId"), rs.getInt("quantity"), rs.getString("note"), rs.getDate("orderDate")));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Entities.Items> reportListTopDrink() {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT `iId`, sum(`quantity`) AS quantity FROM `orderdetail` WHERE 1 GROUP BY `iId`");
            ResultSet rs = pst.executeQuery();
            ItemDAO iDAO = new ItemDAO();
            ArrayList<Items> list = new ArrayList<>();
            while (rs.next()) {
                list.add(new Items(iDAO.getItemById(rs.getInt("iId")).getName(), rs.getInt("quantity")));
            }
            System.out.println("adf");
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
