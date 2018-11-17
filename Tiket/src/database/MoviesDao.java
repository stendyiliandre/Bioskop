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
import tiket.Movies;
/**
 *
 * @author William Johann
 */
public class MoviesDao {
    public static void insertData(Movies m){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.logOn();
        try {
            String query = "Insert into Movies(id_movie,judul,durasi,genre,directory)"
                    + "value (?,?,?,?,?)";
            System.out.println(query);
            PreparedStatement st= con.prepareStatement(query);
            st.setString(1, Integer.toString(m.getId()));
            st.setString(2, m.getJudul());
            st.setString(3, m.getDurasi());
            st.setString(4, m.getGenre());
            st.setString(5, m.getDirectory());
            
        } catch (SQLException ex) {
            ex.printStackTrace (System.err);
        }
        conMan.logOff();
    }
    
    public static List<Movies> selectAllMovies(){
        List<Movies> listMovies= new ArrayList<>();
        ConnectionManager conMan= new ConnectionManager();
        Connection con = conMan.logOn();
        String query = "select * from movies";
        try {
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                Movies m = new Movies();
                m.setId(Integer.parseInt(rs.getString("id_movie")));
                m.setJudul(rs.getString("judul"));
                m.setDurasi(rs.getString("durasi"));
                m.setGenre(rs.getString("genre"));
                m.setDirectory(rs.getString("directory"));
                listMovies.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.logOff();
        return listMovies;
    }
}
