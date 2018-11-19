/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Login;
import tiket.User;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
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
import view.Home;
import view.Register;
/**
 *
 * @author kevin suwanda
 */

public class LoginForm extends JFrame {
    List<User> listUser = Login.selectAllUser();
    public LoginForm() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException{
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,370);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Login");
     
        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(500,100);
        pnlPanel1.setBackground(null);
        add(pnlPanel1);
                
        lblIcon1 = new JLabel();
        lblIcon1.setBounds(0,0,300,100);
        lblIcon1.setLayout(null);
        lblIcon1.setIcon(new ImageIcon(resizeImage("img/gambar1.jpg",500,100)));
        pnlPanel1.add(lblIcon1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setLayout(null);
        pnlPanel2.setBounds(0,0,500,350);
        add(pnlPanel2);
        
        lblId = new JLabel("ID : ");
        lblId.setBounds(100,130,110,30);
        lblId.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lblId);
        
        idtxt = new JTextField(7);
        idtxt.setBounds(200,132,230,25);
        pnlPanel2.add(idtxt);
        
        lblPassword = new JLabel("Password : ");
        lblPassword.setBounds(100,170,110,30);
        lblPassword.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(lblPassword);
        
        passtxt = new JPasswordField(7);
        passtxt.setBounds(200,172,230,25);
        pnlPanel2.add(passtxt);
        
        btnLogin = new JButton("Login");
        btnLogin.setPreferredSize(new Dimension(100, 20));
        btnLogin.setBounds(130,230,100,30);
        btnLogin.setLayout(null);
        btnLogin.setFont(new Font("Arial",Font.BOLD,15));
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
        pnlPanel2.add(btnLogin);
        
        btnRgs = new JButton("Register");
        btnRgs.setBounds(250,230,100,30);
        btnRgs.setPreferredSize(new Dimension (100,20));
        btnRgs.setFont(new Font("Arial",Font.BOLD,15));
        btnRgs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    RegisterClick();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel2.add(btnRgs);
        
        hm = new JButton("Home");
        hm.setBounds(155,275,170,30);
        hm.setPreferredSize(new Dimension (100,20));
        hm.setFont(new Font("Arial",Font.BOLD,15));
        hm.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(hm);
        
    }
    
    public void RegisterClick() throws IOException{
        new Register().setVisible(true);
        this.setVisible(false);
    }
    
    public void Home() throws IOException{
        new Home().setVisible(true);
        this.setVisible(false);
    }
    
    public void Login() throws IOException{
        String uname = idtxt.getText().trim();
        String pass = passtxt.getText().trim();
        
        if(uname.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Username","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(pass.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Password","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int i;
        for(i = 0; i < listUser.size(); i++){
            if(uname.equals(listUser.get(i).id_lgn) && pass.equals(listUser.get(i).password)){
                JOptionPane.showMessageDialog(this,"Welcome aboard sir!","Succes",JOptionPane.INFORMATION_MESSAGE);
                new Home2().setVisible(true);
                this.setVisible(false);
                return;
            } else {
                JOptionPane.showMessageDialog(this,"Id atau Password Salah");
            }
        }
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
    private JLabel lblIcon1;
    private JPanel pnlPanel2;
    private JLabel lblId;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JButton btnRgs;
    private JButton hm;
    private JTextField idtxt;
    private JPasswordField passtxt;
}
