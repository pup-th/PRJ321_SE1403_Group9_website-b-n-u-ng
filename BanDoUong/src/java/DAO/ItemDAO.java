/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Itemall;
import Entities.Items;
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
public class ItemDAO {

    public Connection conn;

    public ItemDAO() {
        this.conn = new DBConnection().getConnection();
    }

    public ArrayList getNameOfItems() {
        try {
            ArrayList<Itemall> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` WHERE 1";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(new Itemall(rs.getInt("iId"), 
                        rs.getInt("tId"), 
                        rs.getInt("bId"),
                        rs.getString("iName"),
                        rs.getInt("blockId"), 
                        rs.getString("size"), 
                        rs.getInt("pId"), 
                        rs.getInt("outputPrice"), 
                        rs.getString("orginCode"),
                        rs.getInt("status"), 
                        rs.getInt("quantity"), 
                        rs.getInt("rId"), 
                        rs.getInt("discoutnStatus"),
                        rs.getInt("vouId"), 
                        rs.getString("taste"), 
                        rs.getDate("expiryDate"), 
                        rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Itemall getItemById(int iId) {
        try {
            String sql = "SELECT * FROM `item` WHERE `iId`=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, iId);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Itemall i = new Itemall(rs.getInt("iId"), 
                        rs.getInt("tId"), 
                        rs.getInt("bId"),
                        rs.getString("iName"),
                        rs.getInt("blockId"), 
                        rs.getString("size"), 
                        rs.getInt("pId"), 
                        rs.getInt("outputPrice"), 
                        rs.getString("orginCode"),
                        rs.getInt("status"), 
                        rs.getInt("quantity"), 
                        rs.getInt("rId"), 
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

    public boolean insert(Itemall i) {
        String sql = "INSERT INTO `item`( `tId`, `bId`, `iName`, `blockId`, `size`, "
                + "`pId`, `outputPrice`, `orginCode`, `status`, "
                + "`quantity`, `rId`, `discoutnStatus`, `vouId`, `taste`, `expiryDate`, `iPic`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, i.gettId());
            pst.setInt(2, i.getbId());
            pst.setString(3, i.getiName());
            pst.setInt(4, i.getBlockId());
            pst.setString(5, i.getSize());
            pst.setInt(6, i.getpId());
            pst.setInt(7, i.getOutputPrice());
            pst.setString(8, i.getOriginCode());
            pst.setInt(9, i.getStatus());
            pst.setInt(10, i.getQuantity());
            pst.setInt(11, i.getrId());
            pst.setInt(12, i.getDiscoutnStatus());
            pst.setInt(13, i.getVouId());
            pst.setString(14, i.getTaste());
            pst.setDate(15, i.getExpiryDate());
            pst.setString(16, i.getiPic());

            return pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Itemall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int updateItem(Itemall i) {
        String sql = "UPDATE `item` SET `tId`=?,`bId`=?,`iName`=?,`blockId`=?,`size`=?,`pId`=?,"
                + "`outputPrice`=?,`orginCode`=?,`status`=?,`quantity`=?,`rId`=?,"
                + "`discoutnStatus`=?,`vouId`=?,`taste`=?,`expiryDate`=?,`iPic`=? WHERE iID=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, i.gettId());
            pst.setInt(2, i.getbId());
            pst.setString(3, i.getiName());
            pst.setInt(4, i.getBlockId());
            pst.setString(5, i.getSize());
            pst.setInt(6, i.getpId());
            pst.setInt(7, i.getOutputPrice());
            pst.setString(8, i.getOriginCode());
            pst.setInt(9, i.getStatus());
            pst.setInt(10, i.getQuantity());
            pst.setInt(11, i.getrId());
            pst.setInt(12, i.getDiscoutnStatus());
            pst.setInt(13, i.getVouId());
            pst.setString(14, i.getTaste());
            pst.setDate(15, i.getExpiryDate());
            pst.setString(16, i.getiPic());
            pst.setInt(17, i.getiId());

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

    public ArrayList sortItemByPriceASC() {
        try {
            ArrayList<String> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `outputPrice` ASC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(rs.getInt("outputPrice"), rs.getString("iPic"));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByPriceDES() {
        try {
            ArrayList<String> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `outputPrice` DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(rs.getInt("outputPrice"), rs.getString("iPic"));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByNameASC() {
        try {
            ArrayList<String> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `iName` ASC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(rs.getInt("outputPrice"), rs.getString("iPic"));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList sortItemByNameDES() {
        try {
            ArrayList<String> listName = new ArrayList<>();

            String sql = "SELECT * FROM `item` ORDER BY `iName` DESC";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                listName.add(rs.getInt("outputPrice"), rs.getString("iPic"));
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
                listName.add(new Items(rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
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
                listName.add(new Items(rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
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
                listName.add(new Items(rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
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
                listName.add(new Items(rs.getString("iName"), rs.getString("size"), rs.getInt("outputPrice"), rs.getInt("status"), rs.getInt("quantity"),
                        rs.getInt("rId"), rs.getInt("discoutnStatus"), rs.getString("taste"), rs.getDate("expiryDate"), rs.getString("iPic")));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
