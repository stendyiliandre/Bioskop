/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tiket.User;

/**
 *
 * @author kevin suwanda
 */
public class RegisterDao {
    public static void addLogin(User us){
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        String query = "INSERT INTO users(id_lgn,nama,tlp,ttl,email,password) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, us.getId_lgn());
            st.setString(2, us.getNama());
            st.setString(3, us.getTlp());
            st.setString(4, us.getTtl());
            st.setString(5, us.getEmail());
            st.setString(6, us.getPassword());
            
            st.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
    }
}
