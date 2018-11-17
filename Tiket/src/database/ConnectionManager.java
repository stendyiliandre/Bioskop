/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author William Johann
 */
public class ConnectionManager {
    private Connection conn;
    private static String server = "jdbc:mysql://localhost/bioskop";
    private String username = "root";
    private String password = "";
    
    public ConnectionManager(){
        
    }
    public Connection logOn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(server,username,password);
            System.out.println("Koneksi Sukses");
        }catch(SQLException e){
            e.printStackTrace(System.err);
            System.out.println("Koneksi gagal"+e.toString());
        }catch(ClassNotFoundException ex){
            ex.printStackTrace(System.err);
            System.out.println("JDBC.ODBC driver tidak ditemukan");
        }
        return conn;
    }
    
    public void logOff(){
        try {
            conn.close();
            System.out.println("Koneksi Close");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
