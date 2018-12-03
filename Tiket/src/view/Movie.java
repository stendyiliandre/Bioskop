/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import tiket.*;
import view.LoginForm;
import view.Home;
import tiket.User;
import database.ConnectionManager;
import database.LoginDao;
import database.MoviesDao;
import database.RegisterDao;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author kevin suwanda
 */
public class Movie extends JFrame {

    public Movie() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(430,380);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Movie");
        this.setResizable(false);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(430,100);
        pnlPanel1.setBackground(null);
        add(pnlPanel1);
                
        icon1 = new JLabel();
        icon1.setBounds(0,0,800,100);
        icon1.setLayout(null);
        icon1.setIcon(new ImageIcon(resizeImage("img/gambar1.jpg",430,100)));
        pnlPanel1.add(icon1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setLayout(null);
        pnlPanel2.setBounds(0,0,800,350);
        add(pnlPanel2);
        
        lblMovie = new JLabel("Nama Movie : ");
        lblMovie.setBounds(30,130,110,30);
        lblMovie.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lblMovie);
        
        movietxt = new JTextField(7);
        movietxt.setBounds(120,132,230,25);
        pnlPanel2.add(movietxt);
        
        lbldrsi = new JLabel("Durasi : ");
        lbldrsi.setBounds(30,170,110,30);
        lbldrsi.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lbldrsi);
        
        drstxt = new JTextField(7);
        drstxt.setBounds(120,172,230,25);
        pnlPanel2.add(drstxt);
        
        lblgenre = new JLabel("Genre : ");
        lblgenre.setBounds(30,210,110,30);
        lblgenre.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lblgenre);
        
        genretxt = new JTextField(7);
        genretxt.setBounds(120,212,230,25);
        pnlPanel2.add(genretxt);
        
        lbldirectory = new JLabel("Directory : ");
        lbldirectory.setBounds(30,250,110,30);
        lbldirectory.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lbldirectory);
        
        directorytxt = new JTextField(7);
        directorytxt.setBounds(120,252,230,25);
        pnlPanel2.add(directorytxt);
        
        btnadd = new JButton("Add");
        btnadd.setPreferredSize(new Dimension(100, 20));
        btnadd.setBounds(160,300,100,30);
        btnadd.setLayout(null);
        btnadd.setFont(new Font("Arial",Font.BOLD,15));
        btnadd.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    btnOkOnClick();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(btnadd);
        
        btnlogout = new JButton("Back");
        btnlogout.setBounds(290,300,100,30);
        btnlogout.setPreferredSize(new Dimension (100,20));
        btnlogout.setFont(new Font("Arial",Font.BOLD,15));
        btnlogout.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home3();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(btnlogout);
    }
    public void Home3() throws IOException{
        new Home3().setVisible(true);
        this.setVisible(false);
    }
    private Image resizeImage(String url,int x,int y) throws IOException{
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(x,y, Image.SCALE_SMOOTH);
            
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;
    }
    
    private void btnOkOnClick() throws IOException
    {
        String movie = movietxt.getText().trim();
        String drs = drstxt.getText().trim();
        String gen = genretxt.getText().trim();
        String dic = directorytxt.getText().trim();

        if(movie.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Username","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(drs.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Password","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(gen.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Nama","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(dic.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your No HP","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(movie.length() != 0 && drs.length() != 0 && gen.length() != 0 && dic.length() != 0 ){
            int confirm = JOptionPane.showConfirmDialog(null, "Tambah Data?", "Konfirmasi", JOptionPane.YES_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                String movi = movietxt.getText()+ "";
                String drsa = drstxt.getText()+ "";
                String genn = genretxt.getText()+ "";
                String dicc = directorytxt.getText()+ "";

                Movies m = new Movies(movi,drsa,genn,dicc);
                JOptionPane.showMessageDialog(null, "Data Sukses DiSubmit");
                MoviesDao.insertData(m);
                try {
                    Home3();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private JPanel pnlPanel1;
    private JLabel icon1;
    private JLabel lgn;
    private JPanel pnlPanel2;
    private JLabel lblMovie;
    private JLabel lbldrsi;
    private JLabel lblgenre;
    private JLabel lbldirectory;
    private JLabel ttl;
    private JLabel email;
    private JTextField movietxt;
    private JTextField drstxt;
    private JTextField genretxt;
    private JTextField directorytxt;
    private JTextField ttltxt;
    private JTextField emailtxt;
    private JButton btnadd;
    private JButton rgs;
    private JButton btnlogout;
}
