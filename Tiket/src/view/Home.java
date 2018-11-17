/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import javax.swing.JScrollPane;
import tiket.Register;

/**
 *
 * @author kevin suwanda
 */
public class Home extends JFrame{
    List<Movies> listMovies=MoviesDao.selectAllMovies();
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

        lblMovie1 = new JLabel();
        lblMovie1.setBounds(25,0,300,300);
        lblMovie1.setIcon(new ImageIcon(resizeImage(listMovies.get(0).getDirectory(), 250, 250)));
        lblMovie1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(0).getJudul(),listMovies.get(0).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
       
        lblMovie2 = new JLabel();       
        lblMovie2.setBounds(325,0,300,300);
        lblMovie2.setIcon(new ImageIcon(resizeImage(listMovies.get(1).getDirectory(), 250, 250)));
        lblMovie2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(1).getJudul(),listMovies.get(1).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        lblMovie3 = new JLabel();  
        lblMovie3.setBounds(625,0,300,300);
        lblMovie3.setIcon(new ImageIcon(resizeImage(listMovies.get(2).getDirectory(), 250, 250)));
        lblMovie3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(2).getJudul(),listMovies.get(2).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        lblMovie4 = new JLabel();  
        lblMovie4.setBounds(25,0,300,300);
        lblMovie4.setIcon(new ImageIcon(resizeImage(listMovies.get(3).getDirectory(), 250, 250)));
        lblMovie4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(3).getJudul(),listMovies.get(3).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        lblMovie5 = new JLabel();  
        lblMovie5.setBounds(325,0,300,300);
        lblMovie5.setIcon(new ImageIcon(resizeImage(listMovies.get(4).getDirectory(), 250, 250)));
        lblMovie5.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(4).getJudul(),listMovies.get(4).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        lblMovie6 = new JLabel();  
        lblMovie6.setBounds(625,0,300,300);
        lblMovie6.setIcon(new ImageIcon(resizeImage(listMovies.get(5).getDirectory(), 250, 250)));
        lblMovie6.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailHome(listMovies.get(5).getJudul(),listMovies.get(5).getDirectory()).setVisible(true);
                    setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        
        btnFb = new JButton("Food");
        btnFb.setBounds(400, 290, 110, 25);
        btnFb.setFont(new Font("Arial",Font.BOLD,14));
        btnFb.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    FoodBeverage();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel4.add(btnFb);
        
        btnLogin = new JButton("Login");
        btnLogin.setBounds(630, 290, 110, 25);
        btnLogin.setFont(new Font("Arial",Font.BOLD,14));
        btnLogin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Login();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel4.add(btnLogin);
        
        btnRegister = new JButton("Register");
        btnRegister.setBounds(765, 290, 110, 25);
        btnRegister.setFont(new Font("Arial",Font.BOLD,14));
        btnRegister.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Register();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel4.add(btnRegister);
        
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
        for (int i = 0; i < listMovies.size(); i++) {
            System.out.print(listMovies.get(i).getJudul()+", ");
            System.out.println("");
        }
      }
    
    public void FoodBeverage() throws IOException{
        new FoodBeverage().setVisible(true);
        this.setVisible(false);
    }
    
    public void Login() throws IOException{
        new LoginForm().setVisible(true);
        this.setVisible(false);
    }
    
    public void Register() throws IOException{
        new Register().setVisible(true);
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
    JButton btnFb;
    JButton btnLogin;
    JButton btnRegister;
    
}
