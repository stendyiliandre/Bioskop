/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kevin suwanda
 */
public class LoginDB {
    private static String server = "jdbc:mysql://localhost:3306/tiketing";
    private static String username = "root";
    private static String pass = "";
    private static Connection con;
    
    public static Connection getConnection(){
        if(con == null) {
            con = LogDB();
        }
        return con;
    }

    private static Connection LogDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("Koneksi Sukses");
            return DriverManager.getConnection(server,username,pass);
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            System.out.println("Koneksi Gagal" + e.toString());
        } catch (ClassNotFoundException ex){
            ex.printStackTrace(System.err);
            System.out.println("JDBC.ODBC driver tidak ditemukan");
        }
        return null;
    }
}
