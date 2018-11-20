/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.JadwalMovie;
import database.MoviesDao;
import database.StudioMovie;
import java.awt.Color;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import tiket.Jadwal;
import tiket.Movies;
import tiket.Studio;

/**
 *
 * @author kevin suwanda
 */
public class DetailHome extends JFrame{
    List<Studio> listStudio = StudioMovie.selectAllStudio();
    String id_lgn;
    int id_jadwal;
    int id_studio;
    int temp;
    int id_user=0;
    String judul;
    String directory;
    int id;
    String tanggal;
    int ids;
    
    int id1;
    String tanggal1;
    int ids1;
    
    int id2;
    String tanggal2;
    int ids2;
    public DetailHome(String id_lgn, String judul, String directory, int id, String tanggal, int ids, int id0, String tanggal0, int ids0, int id1, String tanggal1, int ids1) throws IOException {
        this.id_lgn = id_lgn;
        this.judul=judul;
        this.directory=directory;
        this.id=id;
        this.tanggal=tanggal;
        this.ids = ids;
        this.id1=id0;
        this.tanggal1=tanggal0;
        this.ids1 = ids0;
        this.id2=id1;
        this.tanggal2=tanggal1;
        this.ids2 = ids1;
        initComponents();
    }
    
    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(550,350);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Detail Movie");
        this.setLayout(null);
        this.setResizable(false);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0,0,900,700);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);
        
        lblMovie1 = new JLabel();
        lblMovie1.setBounds(25,0,300,300);
        lblMovie1.setIcon(new ImageIcon(resizeImage(directory, 250, 250)));
        pnlPanel1.add(lblMovie1);
        
        lblText1 = new JLabel(judul);
        lblText1.setBounds(120, 0, 300, 25);
        lblText1.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(lblText1);
        
        txtTgl = new JLabel("TANGGAL");
        txtTgl.setBounds(320, 30, 100, 10);
        txtTgl.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(txtTgl);
        
        lblBsk = new JLabel("PVJ");
        lblBsk.setBounds(400, 30, 100, 10);
        lblBsk.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(lblBsk);
        
        String[] arrpilih = {tanggal,tanggal1,tanggal2};
        cmPilih = new JComboBox(arrpilih);
        cmPilih.setBounds(320, 50, 205, 25);
        pnlPanel1.add(cmPilih);
                
        btnHome = new JButton("Home");
        btnHome.setBounds(320, 90, 100, 25);
        btnHome.setFont(new Font("Arial",Font.BOLD,14));
        btnHome.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        pnlPanel1.add(btnHome);
        
        lblRoll = new JLabel();
        lblRoll.setBounds(290,50,300,300);
        lblRoll.setIcon(new ImageIcon(resizeImage("home/roll.jpg", 270, 150)));
        pnlPanel1.add(lblRoll);
        
        btnNext = new JButton("Next");
        btnNext.setBounds(425, 90, 100, 25);
        btnNext.setFont(new Font("Arial",Font.BOLD,14));
        btnNext.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Next();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel1.add(btnNext);
    }
    
    public void Home2() throws IOException{
        new Home2(id_lgn).setVisible(true);
        this.setVisible(false);
    }
    
    public void Next() throws IOException{
        if (cmPilih.getSelectedItem().toString() == tanggal) {
            this.id_jadwal = id;
            this.id_studio = ids;
        } else if (cmPilih.getSelectedItem().toString() == tanggal1) {
            this.id_jadwal = id1;
            this.id_studio = ids1;
        } else if (cmPilih.getSelectedItem().toString() == tanggal2) {
            this.id_jadwal = id2;
            this.id_studio = ids2;
        }
        temp = id_studio - 1;
        new LayoutStudio(id_lgn, id_jadwal, listStudio.get(temp).getId_room(), judul, cmPilih.getSelectedItem().toString(),"1").setVisible(true);
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
    JLabel lblMovie1;
    JLabel lblText1;
    JButton btnHome;
    JLabel txtTgl;
    JLabel lblBsk;
    JLabel lblRoll;
    JButton btnNext;
    JComboBox cmPilih;
}


