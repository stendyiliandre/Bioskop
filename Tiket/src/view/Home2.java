/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.JadwalMovieDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import tiket.Movies;
import database.MoviesDao;
import java.util.List;
import tiket.Jadwal;

/**
 *
 * @author kevin suwanda
 */
public class Home2 extends JFrame{
    List<Movies> listMovies = MoviesDao.selectAllMovies();
    List<Jadwal> listJadwal = JadwalMovieDao.selectAllJadwal();
    String id_lgn;
    public Home2(String id_lgn) throws IOException{
        this.id_lgn = id_lgn;
        initComponents();
    }
    

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(900,720);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Home");
        this.setResizable(false);
        this.setLayout(null);
        this.setBackground(Color.white);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0,20,900, 25);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setBounds(0, 25,900,300);
        pnlPanel2.setLayout(null);
        pnlPanel2.setBackground(Color.white);
        add(pnlPanel2);
        
        pnlPanel3 = new JPanel();
        pnlPanel3.setBackground(Color.white);
        pnlPanel3.setLayout(null);
        pnlPanel3.setBounds(0, 345, 900, 25);
        add(pnlPanel3);
        
        pnlPanel4 = new JPanel();
        pnlPanel4.setBounds(0,350,900,330);
        pnlPanel4.setLayout(null);
        pnlPanel4.setBackground(Color.white);
        add(pnlPanel4);

        lblMovie1 = new JLabel();
        lblMovie1.setBounds(25,0,300,300);
        lblMovie1.setIcon(new ImageIcon(resizeImage(listMovies.get(0).getDirectory(), 250, 250)));
        lblMovie1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(0).getJudul(),listMovies.get(0).getDirectory(),
                            listJadwal.get(0).getId_jadwal(),listJadwal.get(0).getTanggal(), listJadwal.get(0).getId_studio(),
                            listJadwal.get(1).getId_jadwal(),listJadwal.get(1).getTanggal(), listJadwal.get(1).getId_studio(),
                            listJadwal.get(2).getId_jadwal(),listJadwal.get(2).getTanggal(), listJadwal.get(2).getId_studio(),
                            listMovies.get(0).getGenre(),listMovies.get(0).getDurasi()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
       
        lblMovie2 = new JLabel();       
        lblMovie2.setBounds(325,0,300,300);
        lblMovie2.setIcon(new ImageIcon(resizeImage(listMovies.get(1).getDirectory(), 250, 250)));
        lblMovie2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(1).getJudul(),listMovies.get(1).getDirectory(),
                            listJadwal.get(3).getId_jadwal(),listJadwal.get(3).getTanggal(), listJadwal.get(3).getId_studio(),
                            listJadwal.get(4).getId_jadwal(),listJadwal.get(4).getTanggal(), listJadwal.get(4).getId_studio(),
                            listJadwal.get(5).getId_jadwal(),listJadwal.get(5).getTanggal(), listJadwal.get(5).getId_studio(),
                            listMovies.get(1).getGenre(),listMovies.get(1).getDurasi()).setVisible(true);
                            
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        
        lblMovie3 = new JLabel();  
        lblMovie3.setBounds(625,0,300,300);
        lblMovie3.setIcon(new ImageIcon(resizeImage(listMovies.get(2).getDirectory(), 250, 250)));
        lblMovie3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(2).getJudul(),listMovies.get(2).getDirectory(),
                            listJadwal.get(6).getId_jadwal(),listJadwal.get(6).getTanggal(), listJadwal.get(6).getId_studio(),
                            listJadwal.get(7).getId_jadwal(),listJadwal.get(7).getTanggal(), listJadwal.get(7).getId_studio(),
                            listJadwal.get(8).getId_jadwal(),listJadwal.get(8).getTanggal(), listJadwal.get(8).getId_studio(),
                            listMovies.get(2).getGenre(),listMovies.get(2).getDurasi()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        
        lblMovie4 = new JLabel();  
        lblMovie4.setBounds(25,0,300,300);
        lblMovie4.setIcon(new ImageIcon(resizeImage(listMovies.get(3).getDirectory(), 250, 250)));
        lblMovie4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(3).getJudul(),listMovies.get(3).getDirectory(),
                            listJadwal.get(9).getId_jadwal(),listJadwal.get(9).getTanggal(), listJadwal.get(9).getId_studio(),
                            listJadwal.get(10).getId_jadwal(),listJadwal.get(10).getTanggal(), listJadwal.get(10).getId_studio(),
                            listJadwal.get(11).getId_jadwal(),listJadwal.get(11).getTanggal(), listJadwal.get(11).getId_studio(),
                            listMovies.get(3).getGenre(),listMovies.get(3).getDurasi()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        
        lblMovie5 = new JLabel();  
        lblMovie5.setBounds(325,0,300,300);
        lblMovie5.setIcon(new ImageIcon(resizeImage(listMovies.get(4).getDirectory(), 250, 250)));
        lblMovie5.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(4).getJudul(),listMovies.get(4).getDirectory(),
                            listJadwal.get(12).getId_jadwal(),listJadwal.get(12).getTanggal(), listJadwal.get(12).getId_studio(),
                            listJadwal.get(13).getId_jadwal(),listJadwal.get(13).getTanggal(), listJadwal.get(13).getId_studio(),
                            listJadwal.get(14).getId_jadwal(),listJadwal.get(14).getTanggal(), listJadwal.get(14).getId_studio(),
                            listMovies.get(4).getGenre(),listMovies.get(4).getDurasi()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        
        lblMovie6 = new JLabel();  
        lblMovie6.setBounds(625,0,300,300);
        lblMovie6.setIcon(new ImageIcon(resizeImage(listMovies.get(5).getDirectory(), 250, 250)));
        lblMovie6.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(id_lgn, listMovies.get(5).getJudul(),listMovies.get(5).getDirectory(),
                            listJadwal.get(15).getId_jadwal(),listJadwal.get(15).getTanggal(), listJadwal.get(15).getId_studio(),
                            listJadwal.get(16).getId_jadwal(),listJadwal.get(16).getTanggal(), listJadwal.get(16).getId_studio(),
                            listJadwal.get(17).getId_jadwal(),listJadwal.get(17).getTanggal(), listJadwal.get(17).getId_studio(),
                            listMovies.get(5).getGenre(),listMovies.get(5).getDurasi()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        
        lblText1 = new JLabel(listMovies.get(0).getJudul());
        lblText1.setBounds(120, 0, 300, 25);
        lblText1.setFont(new Font("Arial",Font.BOLD,14));
        
        lblText2 = new JLabel(listMovies.get(1).getJudul());
        lblText2.setBounds(420, 0, 300, 25);
        lblText2.setFont(new Font("Arial",Font.BOLD,14));
        
        lblText3 = new JLabel(listMovies.get(2).getJudul());
        lblText3.setBounds(710, 0, 300, 25);
        lblText3.setFont(new Font("Arial",Font.BOLD,14));
        
        lblText4 = new JLabel(listMovies.get(3).getJudul());
        lblText4.setBounds(100, 0, 300, 25);
        lblText4.setFont(new Font("Arial",Font.BOLD,14));
        
        lblText5 = new JLabel(listMovies.get(4).getJudul());
        lblText5.setBounds(420, 0, 300, 25);
        lblText5.setFont(new Font("Arial",Font.BOLD,14));
        
        lblText6 = new JLabel(listMovies.get(5).getJudul());
        lblText6.setBounds(710, 0, 300, 25);
        lblText6.setFont(new Font("Arial",Font.BOLD,14));       
        
        btnTopUp = new JButton("Top Up");
        btnTopUp.setBounds(540, 290, 110, 25);
        btnTopUp.setFont(new Font("Arial",Font.BOLD,14));
        btnTopUp.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    TopUp();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel4.add(btnTopUp);
        
        btnUpdate = new JButton("Update User");
        btnUpdate.setBounds(680, 290, 170, 25);
        btnUpdate.setFont(new Font("Arial",Font.BOLD,14));
        btnUpdate.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Update();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel4.add(btnUpdate);
        
        pnlPanel1.add(lblText1);
        pnlPanel1.add(lblText2);
        pnlPanel1.add(lblText3);
        pnlPanel2.add(lblMovie1);
        pnlPanel2.add(lblMovie2);
        pnlPanel2.add(lblMovie3);
        
        pnlPanel3.add(lblText4);
        pnlPanel3.add(lblText5);
        pnlPanel3.add(lblText6);
        pnlPanel4.add(lblMovie4);
        pnlPanel4.add(lblMovie5);
        pnlPanel4.add(lblMovie6);

      }
    public void Update() throws IOException{
        new UpdateUser(id_lgn).setVisible(true);
        this.setVisible(false);
    } 
    
    public void TopUp() throws IOException{
        new TopUpForm(id_lgn).setVisible(true);
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
    
    JPanel pnlPanel1;
    JPanel pnlPanel2;
    JPanel pnlPanel3;
    JPanel pnlPanel4;
    JLabel lblMovie1;
    JLabel lblMovie2;
    JLabel lblMovie3;
    JLabel lblMovie4;
    JLabel lblMovie5;
    JLabel lblMovie6;
    JLabel lblText1;
    JLabel lblText2;
    JLabel lblText3;
    JLabel lblText4;
    JLabel lblText5;
    JLabel lblText6;
    JButton btnLogin;
    JButton btnRegister;
    JButton btnTopUp;
    JButton btnUpdate;
}