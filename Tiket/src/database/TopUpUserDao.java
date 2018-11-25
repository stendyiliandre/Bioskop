/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tiket.HisTopUp;
import tiket.User;
/**
 *
 * @author kevin suwanda
 */
public class TopUpUserDao {
    public static List<HisTopUp> selectAllTopUp(){
        List<HisTopUp> listTp = new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from histopup";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                HisTopUp tp = new HisTopUp();
                tp.setId_lgn(rs.getString("id_user"));
                tp.setJumlah(rs.getInt("jumlah"));
                tp.setJenis(rs.getString("jenis"));                
                listTp.add(tp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listTp;
    }
    public static void addTopUp(HisTopUp tu, String id_lgn){
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        String query = "INSERT INTO histopup(id_user,jumlah,jenis) VALUES (?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, tu.getId_lgn());
            st.setInt(2, tu.getJumlah());
            st.setString(3, tu.getJenis());
            
            st.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
    } 
    public static void addSaldo(HisTopUp tu, String id_lgn) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        User u = new User() {};
        String query1 = "select saldo from users where id_lgn='" + id_lgn + "'";
        try {
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery(query1);
            while (rs1.next()) {
                int saldo = rs1.getInt("saldo");
                u.setSaldo(saldo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        int temp = u.getSaldo();
        temp += tu.getJumlah();
        String query2 = "UPDATE users set saldo = " + temp
                + " WHERE id_lgn = '" + id_lgn + "'";
        try {
            Statement st1 = con.createStatement();

            st1.execute(query2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
    }
}
