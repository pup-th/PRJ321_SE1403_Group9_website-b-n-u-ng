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
    
    public ArrayList getNameOfItems(){
        try {
            ArrayList<String> listName = new ArrayList<>();
            
            String sql = "SELECT * FROM `item` WHERE 1";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                listName.add(rs.getString("iPic"));
            }
            return listName;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
