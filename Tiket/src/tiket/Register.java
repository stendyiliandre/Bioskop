/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

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
public class Register extends JFrame {
    public Register() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Register");
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(800,100);
        pnlPanel1.setBackground(null);
        add(pnlPanel1);
                
        icon1 = new JLabel();
        icon1.setBounds(0,0,800,100);
        icon1.setLayout(null);
        icon1.setIcon(new ImageIcon(resizeImage("img/gambar1.jpg",800,100)));
        pnlPanel1.add(icon1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setLayout(null);
        pnlPanel2.setBounds(0,0,800,350);
        add(pnlPanel2);
        
        id = new JLabel("ID : ");
        id.setBounds(30,130,110,30);
        id.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(id);
        
        idtxt = new JTextField(7);
        idtxt.setBounds(120,132,230,25);
        pnlPanel2.add(idtxt);
        
        password = new JLabel("Password : ");
        password.setBounds(30,170,110,30);
        password.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(password);
        
        passtxt = new JTextField(7);
        passtxt.setBounds(120,172,230,25);
        pnlPanel2.add(passtxt);
        
        nama = new JLabel("Nama : ");
        nama.setBounds(30,210,110,30);
        nama.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(nama);
        
        namatxt = new JTextField(7);
        namatxt.setBounds(120,212,230,25);
        pnlPanel2.add(namatxt);
        
        nohp = new JLabel("No HP : ");
        nohp.setBounds(30,250,110,30);
        nohp.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(nohp);
        
        nohptxt = new JTextField(7);
        nohptxt.setBounds(120,252,230,25);
        pnlPanel2.add(nohptxt);
        
        ttl = new JLabel("TTL : ");
        ttl.setBounds(30,290,110,30);
        ttl.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(ttl);
        
        ttltxt = new JTextField(7);
        ttltxt.setBounds(120,292,230,25);
        pnlPanel2.add(ttltxt);
        
        email = new JLabel("Email : ");
        email.setBounds(30,330,110,30);
        email.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(email);
        
        emailtxt = new JTextField(7);
        emailtxt.setBounds(120,332,230,25);
        pnlPanel2.add(emailtxt);
        
        login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 20));
        login.setBounds(160,390,100,30);
        login.setLayout(null);
        login.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(login);
        
        rgs = new JButton("Register");
        rgs.setBounds(30,390,100,30);
        rgs.setPreferredSize(new Dimension (100,20));
        rgs.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(rgs);
        
        back = new JButton("Back");
        back.setBounds(290,390,100,30);
        back.setPreferredSize(new Dimension (100,20));
        back.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(back);
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
    private JLabel lgn;
    private JPanel pnlPanel2;
    private JLabel id;
    private JLabel password;
    private JLabel nama;
    private JLabel nohp;
    private JLabel ttl;
    private JLabel email;
    private JTextField idtxt;
    private JTextField passtxt;
    private JTextField namatxt;
    private JTextField nohptxt;
    private JTextField ttltxt;
    private JTextField emailtxt;
    private JButton login;
    private JButton rgs;
    private JButton back;
}
