/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import database.LoginDao;
import tiket.User;
import database.UpdateUserDao;
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

/**
 *
 * @author kevin suwanda
 */
public class UpdateUser extends JFrame {
    List<User> listUser = LoginDao.selectAllUser();
    String id_lgn;
    public UpdateUser(String id_lgn) throws IOException{
        this.id_lgn = id_lgn;
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400,420);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Update User");
        this.setResizable(false);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setSize(400,100);
        pnlPanel1.setBackground(null);
        add(pnlPanel1);
                
        icon1 = new JLabel();
        icon1.setBounds(0,0,400,100);
        icon1.setLayout(null);
        icon1.setIcon(new ImageIcon(resizeImage("img/gambar1.jpg",400,100)));
        pnlPanel1.add(icon1);
        
        pnlPanel2 = new JPanel();
        pnlPanel2.setLayout(null);
        pnlPanel2.setBounds(0,0,400,350);
        add(pnlPanel2);
        
        password = new JLabel("Password : ");
        password.setBounds(30,130,110,30);
        password.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(password);
        
        passtxt = new JPasswordField(7);
        passtxt.setBounds(120,132,230,25);
        pnlPanel2.add(passtxt);
        
        nama = new JLabel("Nama : ");
        nama.setBounds(30,170,110,30);
        nama.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(nama);
        
        namatxt = new JTextField(7);
        namatxt.setBounds(120,172,230,25);
        pnlPanel2.add(namatxt);
        
        nohp = new JLabel("No HP : ");
        nohp.setBounds(30,210,110,30);
        nohp.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(nohp);
        
        nohptxt = new JTextField(7);
        nohptxt.setBounds(120,212,230,25);
        pnlPanel2.add(nohptxt);
        
        ttl = new JLabel("TTL : ");
        ttl.setBounds(30,250,110,30);
        ttl.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(ttl);
        
        ttltxt = new JTextField(7);
        ttltxt.setBounds(120,252,230,25);
        pnlPanel2.add(ttltxt);
        
        email = new JLabel("Email : ");
        email.setBounds(30,290,110,30);
        email.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(email);
        
        emailtxt = new JTextField(7);
        emailtxt.setBounds(120,292,230,25);
        pnlPanel2.add(emailtxt);
        
        btnUpdate = new JButton("Update");
        btnUpdate.setPreferredSize(new Dimension(100, 20));
        btnUpdate.setBounds(160,330,100,30);
        btnUpdate.setLayout(null);
        btnUpdate.setFont(new Font("Arial",Font.BOLD,15));
        btnUpdate.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    btnOkOnClick();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(btnUpdate);
        
        btnHm = new JButton("Home");
        btnHm.setBounds(30,330,100,30);
        btnHm.setPreferredSize(new Dimension (100,20));
        btnHm.setFont(new Font("Arial",Font.BOLD,15));
        btnHm.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(btnHm);
    }
    public void Home2() throws IOException{
        new Home2(id_lgn).setVisible(true);
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
        String pass = passtxt.getText().trim();
        String namaa = namatxt.getText().trim();
        String no_hp = nohptxt.getText().trim();
        String lahir = ttltxt.getText().trim();
        String emaill = emailtxt.getText().trim();

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
        
        if(pass.length() != 0 && namaa.length() != 0 && no_hp.length() != 0 && lahir.length() != 0 && emaill.length() != 0){
            int confirm = JOptionPane.showConfirmDialog(null, "Ubah Data?", "Konfirmasi", JOptionPane.YES_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                String nama = namatxt.getText() + "";
                String tlp = nohptxt.getText() + "";
                String tl = ttltxt.getText() + "";
                String emaila = emailtxt.getText() + "";
                String passs = passtxt.getText() + "";

                User u = new User(nama,tlp,tl,emaill,pass) {};
                JOptionPane.showMessageDialog(null, "Data Sukses DiSubmit");
                UpdateUserDao.addUpdate(u, id_lgn);
                try {
                    Home2();
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
    private JButton btnUpdate;
    private JButton btnHm;
}
