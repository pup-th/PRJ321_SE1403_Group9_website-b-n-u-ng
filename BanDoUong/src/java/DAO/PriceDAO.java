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
 * @author Asus
 */
public class PriceDAO {
    public Connection conn;

    public PriceDAO() {
        this.conn = new DBConnection().getConnection();
    }
    
    public int getPriceByPId(int pId){
        try {
            String sql = "SELECT * FROM `price` WHERE `priceId` = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, pId);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return rs.getInt("price");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PriceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
