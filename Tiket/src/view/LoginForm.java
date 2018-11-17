/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author kevin suwanda
 */
public class LoginForm extends JFrame {
    public LoginForm() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,370);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Login");
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(500,100);
        pnlPanel1.setBackground(null);
        add(pnlPanel1);
                
        icon1 = new JLabel();
        icon1.setBounds(0,0,300,100);
        icon1.setLayout(null);
        icon1.setIcon(new ImageIcon(resizeImage("img/gambar1.jpg",500,100)));
        pnlPanel1.add(icon1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setLayout(null);
        pnlPanel2.setBounds(0,0,500,350);
        add(pnlPanel2);
        
        id = new JLabel("ID : ");
        id.setBounds(100,130,110,30);
        id.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(id);
        
        idtxt = new JTextField(7);
        idtxt.setBounds(200,132,230,25);
        pnlPanel2.add(idtxt);
        
        password = new JLabel("Password : ");
        password.setBounds(100,170,110,30);
        password.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(password);
        
        passtxt = new JTextField(7);
        passtxt.setBounds(200,172,230,25);
        pnlPanel2.add(passtxt);
        
        login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 20));
        login.setBounds(130,230,100,30);
        login.setLayout(null);
        login.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(login);
        
        rgs = new JButton("Register");
        rgs.setBounds(250,230,100,30);
        rgs.setPreferredSize(new Dimension (100,20));
        rgs.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(rgs);
        
        frgtpass = new JButton("Forgot Password");
        frgtpass.setBounds(155,275,170,30);
        frgtpass.setPreferredSize(new Dimension (100,20));
        frgtpass.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(frgtpass);
        
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
    private JPanel pnlPanel1;
    private JLabel icon1;
    private JPanel pnlPanel2;
    private JLabel id;
    private JLabel password;
    private JButton login;
    private JButton rgs;
    private JButton frgtpass;
    private JTextField idtxt;
    private JTextField passtxt;
}
