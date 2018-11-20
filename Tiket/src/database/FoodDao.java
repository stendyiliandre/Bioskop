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
import tiket.Makanan;
/**
 *
 * @author Stendy Iliandre
 */
public class FoodDao {
    public static void insertData(Makanan m){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try {
            String query = "Insert into Makanan(id_makanan, menu, harga, directory)"
                    + "value (?,?,?,?)";
            System.out.println(query);
            PreparedStatement st= con.prepareStatement(query);
            st.setString(1, Integer.toString(m.getId()));
            st.setString(2, m.getMenu());
            st.setString(3, Integer.toString(m.getHarga()));
            st.setString(4, m.getDirectory());
            
        } catch (SQLException ex) {
            ex.printStackTrace (System.err);
        }
        conMan.logOff();
    }
    
    public static List<Makanan> selectAllMakanan(){
        List<Makanan> listFood= new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from makanan";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Makanan m = new Makanan();
                m.setId(Integer.parseInt(rs.getString("id_makanan")));
                m.setMenu(rs.getString("menu"));
                m.setHarga(Integer.parseInt(rs.getString("harga")));
                m.setDirectory(rs.getString("directory"));
                listFood.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listFood;
    }
}
