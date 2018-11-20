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
import tiket.Studio;

/**
 *
 * @author Stendy Iliandre
 */
public class StudioMovie {
     public static List<Studio> selectAllStudio(){
        List<Studio> listStudio = new ArrayList<>();
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from studio";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Studio s = new Studio();
                s.setId(Integer.parseInt(rs.getString("id_studio")));
                s.setId_room(rs.getString("id_room"));
                
                listStudio.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listStudio;
    }
}
