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
import database.Login;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
public class Register extends JFrame {
    List<User> listUser = Login.selectAllUser();
    public static void addLogin(User us){
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        String query = "INSERT INTO user(id_lgn,nama,tlp,ttl,email,password) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, us.getId());
            st.setString(2, us.getNama());
            st.setString(3, us.getTlp());
            st.setString(4, us.getTtl());
            st.setString(5, us.getEmail());
            st.setString(6, us.getPassword());
            
            st.execute();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
    }

    public Register() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Register");
        this.setResizable(false);
        
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
        
        passtxt = new JPasswordField(7);
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
        login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    LoginClick();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(login);
        
        rgs = new JButton("Register");
        rgs.setBounds(30,390,100,30);
        rgs.setPreferredSize(new Dimension (100,20));
        rgs.setFont(new Font("Arial",Font.BOLD,15));
        rgs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try { 
                    btnOkOnClick();
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } );
        pnlPanel2.add(rgs);
        
        hm = new JButton("Home");
        hm.setBounds(290,390,100,30);
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
    public void Home() throws IOException{
        new Home().setVisible(true);
        this.setVisible(false);
    }
    
    public void LoginClick() throws IOException{
        new LoginForm().setVisible(true);
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
        String uname = idtxt.getText().trim();
        String pass = passtxt.getText().trim();
        String namaa = namatxt.getText().trim();
        String no_hp = nohptxt.getText().trim();
        String lahir = ttltxt.getText().trim();
        String emaill = emailtxt.getText().trim();

        if(uname.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Username","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(pass.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Password","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(namaa.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Nama","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(no_hp.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your No HP","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(lahir.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your TTL","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(emaill.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Your Email","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int i;
        boolean cek = true;
        for(i = 0; i < listUser.size(); i++){
            if(uname.equals(listUser.get(i).id_lgn) && pass.equals(listUser.get(i).password)){
                JOptionPane.showMessageDialog(this,"Id Telah Digunakan Silahkan Ganti","Fail",JOptionPane.INFORMATION_MESSAGE);
                new Home2(listUser.get(i).id_lgn).setVisible(true);
                this.setVisible(false);
                cek = false;
                return;
            } 
        }
        
        if(uname.length() != 0 && pass.length() != 0 && namaa.length() != 0 && no_hp.length() != 0 && lahir.length() != 0 && emaill.length() != 0 && cek == true){
            int confirm = JOptionPane.showConfirmDialog(null, "Tambah Data?", "Konfirmasi", JOptionPane.YES_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                String id = idtxt.getText() + "";
                String nama = namatxt.getText() + "";
                String tlp = nohptxt.getText() + "";
                String tl = ttltxt.getText() + "";
                String emaila = emailtxt.getText() + "";
                String passs = passtxt.getText() + "";

                User u = new User(id,nama,tlp,tl,emaill,pass) {
                    @Override
                    public void getInfo() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                JOptionPane.showMessageDialog(null, "Data Sukses DiSubmit");
                Register.addLogin(u);
                try {
                    LoginClick();
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
    private JLabel id;
    private JLabel password;
    private JLabel nama;
    private JLabel nohp;
    private JLabel ttl;
    private JLabel email;
    private JTextField idtxt;
    private JPasswordField passtxt;
    private JTextField namatxt;
    private JTextField nohptxt;
    private JTextField ttltxt;
    private JTextField emailtxt;
    private JButton login;
    private JButton rgs;
    private JButton hm;
}
