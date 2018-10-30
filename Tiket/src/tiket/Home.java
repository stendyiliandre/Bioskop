/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

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

/**
 *
 * @author kevin suwanda
 */
public class Home extends JFrame{
    public Home() throws IOException{
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
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0,0,900, 25);
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
        pnlPanel3.setBounds(0, 325, 900, 25);
        add(pnlPanel3);
        
        pnlPanel4 = new JPanel();
        pnlPanel4.setBounds(0,350,900,330);
        pnlPanel4.setLayout(null);
        pnlPanel4.setBackground(Color.white);
        add(pnlPanel4);

        movie1 = new JLabel();
        movie1.setBounds(25,0,300,300);
        movie1.setIcon(new ImageIcon(resizeImage("home/cars.jpg", 250, 250)));
        movie1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome1();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
       
        movie2 = new JLabel();       
        movie2.setBounds(325,0,300,300);
        movie2.setIcon(new ImageIcon(resizeImage("home/kingsman.jpg", 250, 250)));
        movie2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        movie3 = new JLabel();  
        movie3.setBounds(625,0,300,300);
        movie3.setIcon(new ImageIcon(resizeImage("home/dispicable.jpg", 250, 250)));
        movie3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome3();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        movie4 = new JLabel();  
        movie4.setBounds(25,0,300,300);
        movie4.setIcon(new ImageIcon(resizeImage("home/susahsinyal.jpg", 250, 250)));
        movie4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome4();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        movie5 = new JLabel();  
        movie5.setBounds(325,0,300,300);
        movie5.setIcon(new ImageIcon(resizeImage("home/spiderman.jpg", 250, 250)));
        movie5.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        movie6 = new JLabel();  
        movie6.setBounds(625,0,300,300);
        movie6.setIcon(new ImageIcon(resizeImage("home/bossbaby.jpg", 250, 250)));
        movie6.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    DetailHome6();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        
        text1 = new JLabel("Cars");
        text1.setBounds(120, 0, 300, 25);
        text1.setFont(new Font("Arial",Font.BOLD,14));
        
        text2 = new JLabel("Kingsman");
        text2.setBounds(420, 0, 300, 25);
        text2.setFont(new Font("Arial",Font.BOLD,14));
        
        text3 = new JLabel("Despicable Me");
        text3.setBounds(710, 0, 300, 25);
        text3.setFont(new Font("Arial",Font.BOLD,14));
        
        text4 = new JLabel("Susah Sinyal");
        text4.setBounds(100, 0, 300, 25);
        text4.setFont(new Font("Arial",Font.BOLD,14));
        
        text5 = new JLabel("Spiderman");
        text5.setBounds(420, 0, 300, 25);
        text5.setFont(new Font("Arial",Font.BOLD,14));
        
        text6 = new JLabel("Boss Baby");
        text6.setBounds(710, 0, 300, 25);
        text6.setFont(new Font("Arial",Font.BOLD,14));
        
        fb = new JButton("Food");
        fb.setBounds(400, 290, 110, 25);
        fb.setFont(new Font("Arial",Font.BOLD,14));
        fb.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    FoodBeverage();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel4.add(fb);
        
        pnlPanel1.add(text1);
        pnlPanel1.add(text2);
        pnlPanel1.add(text3);
        pnlPanel2.add(movie1);
        pnlPanel2.add(movie2);
        pnlPanel2.add(movie3);
        
        pnlPanel3.add(text4);
        pnlPanel3.add(text5);
        pnlPanel3.add(text6);
        pnlPanel4.add(movie4);
        pnlPanel4.add(movie5);
        pnlPanel4.add(movie6);
      }
    
    public void FoodBeverage() throws IOException{
        new FoodBeverage().setVisible(true);
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
    
    public void DetailHome1() throws IOException{
        new DetailHome1().setVisible(true);
        this.setVisible(false);
    }
    
    public void DetailHome2() throws IOException{
        new DetailHome2().setVisible(true);
        this.setVisible(false);
    }
    
    public void DetailHome3() throws IOException{
        new DetailHome3().setVisible(true);
        this.setVisible(false);
    }
    
    public void DetailHome4() throws IOException{
        new DetailHome4().setVisible(true);
        this.setVisible(false);
    }
    
    public void DetailHome5() throws IOException{
        new DetailHome5().setVisible(true);
        this.setVisible(false);
    }
    
    public void DetailHome6() throws IOException{
        new DetailHome6().setVisible(true);
        this.setVisible(false);
    }
    
    JPanel pnlPanel1;
    JPanel pnlPanel2;
    JPanel pnlPanel3;
    JPanel pnlPanel4;
    JLabel movie1;
    JLabel movie2;
    JLabel movie3;
    JLabel movie4;
    JLabel movie5;
    JLabel movie6;
    JLabel text1;
    JLabel text2;
    JLabel text3;
    JLabel text4;
    JLabel text5;
    JLabel text6;
    JButton fb;

}