/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tiket.User;
/**
 *
 * @author kevin suwanda
 */
public class LoginDao {
     public static List<User> selectAllUser(){
        List<User> listUser = new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from users";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                User u = new User() {};
                u.setId_lgn(rs.getString("id_lgn"));
                u.setPassword(rs.getString("password"));                
                listUser.add(u);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listUser;
    }
}
