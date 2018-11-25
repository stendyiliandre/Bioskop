/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.TopUpUserDao;
import tiket.*;
import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author kevin suwanda
 */
public class TopUpForm extends JFrame{
    String id_lgn;
    public TopUpForm(String id_lgn) throws IOException{
        this.id_lgn = id_lgn;
        initComponents();
    }

    private void initComponents() throws IOException{
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,330);
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
        
        jumlah = new JLabel("Jumlah : ");
        jumlah.setBounds(100,130,110,30);
        jumlah.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(jumlah);
        
        jumlahtxt = new JTextField(7);
        jumlahtxt.setBounds(200,132,230,25);
        pnlPanel2.add(jumlahtxt);
        
        payment = new JLabel("Payment : ");
        payment.setBounds(100,170,110,30);
        payment.setFont(new Font("Arial",Font.BOLD,15));
        pnlPanel2.add(payment);
        
        paytxt = new JTextField(7);
        paytxt.setBounds(200,172,230,25);
        pnlPanel2.add(paytxt);
        
        topUp = new JButton("Top Up");
        topUp.setPreferredSize(new Dimension(100, 20));
        topUp.setBounds(130,230,100,30);
        topUp.setLayout(null);
        topUp.setFont(new Font("Arial",Font.BOLD,15));
        topUp.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    TopUp();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(topUp);
        
        hm = new JButton("Home");
        hm.setBounds(250,230,100,30);
        hm.setPreferredSize(new Dimension (100,20));
        hm.setFont(new Font("Arial",Font.BOLD,15));
        hm.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel2.add(hm);
        
    }
    public void TopUp() throws IOException{
        String jml = jumlahtxt.getText().trim();
        String jenis = paytxt.getText().trim();
        
        if(jml.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Correct Value","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jenis.length() == 0){
            JOptionPane.showMessageDialog(this, "Please Enter Correct Value","Validation Failed",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jml.length() != 0 && jenis.length() != 0){
            int confirm = JOptionPane.showConfirmDialog(null, "Top Up?", "Konfirmasi", JOptionPane.YES_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                String id = id_lgn;
                int jmlh = Integer.parseInt(jumlahtxt.getText());
                String tipe =  paytxt.getText() + "";
                HisTopUp tp = new HisTopUp(id,jmlh,jenis);
                JOptionPane.showMessageDialog(this, "Terima Kasih Telah TopUp","Sukses",JOptionPane.INFORMATION_MESSAGE);
                TopUpUserDao.addTopUp(tp, id_lgn);
                TopUpUserDao.addSaldo(tp, id_lgn);
                try {
                    Home2();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            return;
            }
        }
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
    private JPanel pnlPanel1;
    private JLabel icon1;
    private JPanel pnlPanel2;
    private JLabel jumlah;
    private JLabel payment;
    private JButton topUp;
    private JButton hm;
    private JTextField jumlahtxt;
    private JTextField paytxt;
}

