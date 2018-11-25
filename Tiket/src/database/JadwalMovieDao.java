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
import tiket.Jadwal;

/**
 *
 * @author kevin suwanda
 */
public class JadwalMovieDao {
     public static List<Jadwal> selectAllJadwal(){
        List<Jadwal> listJadwal= new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from jadwal";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Jadwal j = new Jadwal();
                j.setId_jadwal(Integer.parseInt(rs.getString("id_jadwal")));
                j.setTanggal(rs.getString("tanggal"));
                j.setId_studio(Integer.parseInt(rs.getString("id_studio")));
                
                listJadwal.add(j);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listJadwal;
    }
}
