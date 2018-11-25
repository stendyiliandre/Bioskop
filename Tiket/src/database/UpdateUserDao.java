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
public class UpdateUserDao {
     public static void addUpdate(User us, String id_lgn){
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        String query = "UPDATE users set nama = ? , tlp = ? , ttl = ?, email = ?, password = ? WHERE id_lgn = '" + id_lgn + "'";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, us.getNama());
            st.setString(2, us.getTlp());
            st.setString(3, us.getTtl());
            st.setString(4, us.getEmail());
            st.setString(5, us.getPassword());
            
            st.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
    }
}
