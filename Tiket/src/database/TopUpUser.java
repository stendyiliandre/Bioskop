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
import tiket.HisTopUp;
/**
 *
 * @author kevin suwanda
 */
public class TopUpUser {
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
                tp.setJumlah(rs.getString("jumlah"));
                tp.setJenis(rs.getString("jenis"));                
                listTp.add(tp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listTp;
    }
}
