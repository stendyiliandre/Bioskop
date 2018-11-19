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
import tiket.Transaksi;


/**
 *
 * @author William Johann
 */
public class TransaksiDao {
    public static void insertData(Transaksi t){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try {
            String query = "insert into transaksi(id_jadwal, kursi)"
                    + "value (" + t.getId_jadwal() + "," +"'" + t.getKursi() +"' )";
            System.out.println(query);
            Statement st = con.createStatement();
            boolean rs = st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace (System.err);
        }
        conMan.logOff();
    }
    
    public static List<Transaksi> selectAllTransaksi(){
        List<Transaksi> listTransaksi= new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from transaksi";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Transaksi t = new Transaksi();
                t.setId_jadwal(Integer.parseInt(rs.getString("id_jadwal")));
                t.setKursi(rs.getString("kursi"));
                listTransaksi.add(t);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listTransaksi;
    }
}
