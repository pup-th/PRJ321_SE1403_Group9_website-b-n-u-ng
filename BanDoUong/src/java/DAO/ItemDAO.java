/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Itemall;
import Entities.Items;
import Entities.OrderDetail;
import java.sql.Connection;
import java.sql.Date;
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
public class ItemDAO {

    public Connection conn;

    public ItemDAO() {
        this.conn = new DBConnection().getConnection();
    }

    public Itemall getNameOfItem(int iId) {
        try {
            String sql = "SELECT * FROM `item` WHERE `iId`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, iId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Itemall i = new Itemall(
                        rs.getInt("bId"),
                        rs.getString("iName"),
                        rs.getInt("blockId"),
                        rs.getString("size"),
                        rs.getInt("pId"),
                        rs.getInt("outputPrice"),
                        rs.getString("orginCode"),
                        rs.getInt("status"),
                        rs.getInt("quantity"),
                        rs.getInt("discoutnStatus"),
                        rs.getInt("vouId"),
                        rs.getString("taste"),
                        rs.getDate("expiryDate"),
                        rs.getString("iPic"));
                return i;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean insertItem(Itemall i) {
        String sql = "INSERT INTO `item`( `bId`, `iName`, `blockId`, `size`, "
                + "`pId`, `outputPrice`, `orginCode`, `status`, "
                + "`quantity`, `discoutnStatus`, `vouId`, `taste`, `expiryDate`, `iPic`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, i.getbId());
            pst.setString(2, i.getiName());
            pst.setInt(3, i.getBlockId());
            pst.setString(4, i.getSize());
            pst.setInt(5, i.getpId());
            pst.setInt(6, i.getOutputPrice());
            pst.setString(7, i.getOriginCode());
            pst.setInt(8, i.getStatus());
            pst.setInt(9, i.getQuantity());
            pst.setInt(10, i.getDiscoutnStatus());
            pst.setInt(11, i.getVouId());
            pst.setString(12, i.getTaste());
            pst.setDate(13, i.getExpiryDate());
            pst.setString(14, i.getiPic());

            return pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Itemall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int updateItem(Itemall i, int iId) {
        String sql = "UPDATE `item` SET `bId`=?,`iName`=?,`blockId`=?,`size`=?,`pId`=?,"
                + "`outputPrice`=?,`orginCode`=?,`status`=?,`quantity`=?,"
                + "`discoutnStatus`=?,`vouId`=?,`taste`=?,`expiryDate`=?,`iPic`=? WHERE iID=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, i.getbId());
            pst.setString(2, i.getiName());
            pst.setInt(3, i.getBlockId());
            pst.setString(4, i.getSize());
            pst.setInt(5, i.getpId());
            pst.setInt(6, i.getOutputPrice());
            pst.setString(7, i.getOriginCode());
            pst.setInt(8, i.getStatus());
            pst.setInt(9, i.getQuantity());
            pst.setInt(10, i.getDiscoutnStatus());
            pst.setInt(11, i.getVouId());
            pst.setString(12, i.getTaste());
            pst.setDate(13, i.getExpiryDate());
            pst.setString(14, i.getiPic());
            pst.setInt(15, iId);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int deleteItem(int iId) {
        String sql = "DELETE FROM `item` WHERE ID=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, iId);
            return pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList getNameOfItems() {
        try {
            ArrayList<Items> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` WHERE 1";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByPricelowhigh() {
        try {
            ArrayList<Items> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `outputPrice` ASC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByPricehighlow() {
        try {
            ArrayList<Items> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `outputPrice` DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByNameaz() {
        try {
            ArrayList<Items> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `iName` ASC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByNameza() {
        try {
            ArrayList<Items> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `iName` DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Entities.Items getItemById(int id) {
        try {
            String sql = "SELECT * FROM `item` where iId=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Items i = new Items(rs.getInt("iId"), rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic"));
                return i;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int inserTotOrder(String uMail) {
        try {
            PreparedStatement pst1 = conn.prepareStatement("INSERT INTO `orders`(`uMail`) "
                    + "VALUES (?)");
            pst1.setString(1, uMail);
            return pst1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int inserTotOrderDetail(int iId, OrderDetail oDetail) {
        try {
            PreparedStatement pst2 = conn.prepareStatement("INSERT INTO `orderdetail`(`oId`, `payId`, `uMail`, `iId`, `quantity`, `note`, `orderDate`)"
                    + "VALUES (?,?,?,?,?,?,?)");
            pst2.setInt(1, oDetail.getoId());
            pst2.setInt(2, oDetail.getPayId());
            pst2.setString(3, oDetail.getuMail());
            pst2.setInt(4, iId);
            pst2.setInt(5, oDetail.getQuantity());
            pst2.setString(6, oDetail.getNote());
            pst2.setDate(7, (java.sql.Date) oDetail.getOrderDate());
            return pst2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int getoId() {
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT `oId` FROM orders WHERE oId=(SELECT max(oId) FROM orders)");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("oId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
