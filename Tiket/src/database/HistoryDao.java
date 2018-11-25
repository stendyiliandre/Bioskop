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
import tiket.History;
import tiket.Jadwal;

/**
 *
 * @author William Johann
 */
public class HistoryDao {
    public static void insertData(History h){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
            String query = "INSERT INTO history(id_user,kursi,studio,judul) VALUES (?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, h.getId_user());
            st.setString(2, h.getKursi());
            st.setString(3, h.getStudio());
            st.setString(4, h.getJudul());
            st.execute();
        } catch (SQLException ex) {
            ex.printStackTrace (System.err);
        }
        conMan.logOff();
    }
    
    public static List<History> selectAllHistory(){
        List<History> listHistory= new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from history";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                History h = new History();
                h.setId_user(rs.getString(1));
                h.setTanggal(rs.getString(2));
                h.setJudul(rs.getString(3));
                h.setStudio(rs.getString(4));
                h.setKursi(rs.getString(5));
                
                listHistory.add(h);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listHistory;
    }
}

