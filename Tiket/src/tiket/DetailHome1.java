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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author kevin suwanda
 */
public class DetailHome1 extends JFrame{
    public DetailHome1() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(820,350);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("DetailHome1");
        this.setLayout(null);
        this.setResizable(false);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0,0,900,700);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);
        
        movie1 = new JLabel();
        movie1.setBounds(25,0,300,300);
        movie1.setIcon(new ImageIcon(resizeImage("home/cars.jpg", 250, 250)));
        pnlPanel1.add(movie1);
        
        text1 = new JLabel("Cars");
        text1.setBounds(120, 0, 300, 25);
        text1.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(text1);
        
        txttgl = new JLabel("TANGGAL");
        txttgl.setBounds(320, 30, 100, 10);
        txttgl.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(txttgl);
        
        tgl1 = new JButton("28-07-2018");
        tgl1.setBounds(320, 50, 110, 25);
        tgl1.setFont(new Font("Arial",Font.BOLD,14));
        tgl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bks1.setVisible(true);
                bks2.setVisible(true);
                bks3.setVisible(true);
                jam1.setVisible(true);
                jam2.setVisible(true);
                jam3.setVisible(true);
                jam4.setVisible(true);
                jam5.setVisible(true);
                jam6.setVisible(true);
                jam7.setVisible(true);
                jam8.setVisible(true);
                jam9.setVisible(true);
                bks4.setVisible(false);
                bks5.setVisible(false);
                bks6.setVisible(false);
                jam10.setVisible(false);
                jam11.setVisible(false);
                jam12.setVisible(false);
                jam13.setVisible(false);
                jam14.setVisible(false);
                jam15.setVisible(false);
                jam16.setVisible(false);
                jam17.setVisible(false);
                jam18.setVisible(false);
                bks7.setVisible(false);
                bks8.setVisible(false);
                bks9.setVisible(false);
                jam19.setVisible(false);
                jam20.setVisible(false);
                jam21.setVisible(false);
                jam22.setVisible(false);
                jam23.setVisible(false);
                jam24.setVisible(false);
                jam25.setVisible(false);
                jam26.setVisible(false);
                jam27.setVisible(false);
            }
            
        });
        pnlPanel1.add(tgl1);
        
        tgl2 = new JButton("29-07-2018");
        tgl2.setBounds(440, 50, 110, 25);
        tgl2.setFont(new Font("Arial",Font.BOLD,14));
        tgl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bks1.setVisible(false);
                bks2.setVisible(false);
                bks3.setVisible(false);
                jam1.setVisible(false);
                jam2.setVisible(false);
                jam3.setVisible(false);
                jam4.setVisible(false);
                jam5.setVisible(false);
                jam6.setVisible(false);
                jam7.setVisible(false);
                jam8.setVisible(false);
                jam9.setVisible(false);
                bks4.setVisible(true);
                bks5.setVisible(true);
                bks6.setVisible(true);
                jam10.setVisible(true);
                jam11.setVisible(true);
                jam12.setVisible(true);
                jam13.setVisible(true);
                jam14.setVisible(true);
                jam15.setVisible(true);
                jam16.setVisible(true);
                jam17.setVisible(true);
                jam18.setVisible(true);
                bks7.setVisible(false);
                bks8.setVisible(false);
                bks9.setVisible(false);
                jam19.setVisible(false);
                jam20.setVisible(false);
                jam21.setVisible(false);
                jam22.setVisible(false);
                jam23.setVisible(false);
                jam24.setVisible(false);
                jam25.setVisible(false);
                jam26.setVisible(false);
                jam27.setVisible(false);
            }
            
        });
        pnlPanel1.add(tgl2);
        
        tgl3 = new JButton("30-07-2018");
        tgl3.setBounds(560, 50, 110, 25);
        tgl3.setFont(new Font("Arial",Font.BOLD,14));
        tgl3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                bks1.setVisible(false);
                bks2.setVisible(false);
                bks3.setVisible(false);
                jam1.setVisible(false);
                jam2.setVisible(false);
                jam3.setVisible(false);
                jam4.setVisible(false);
                jam5.setVisible(false);
                jam6.setVisible(false);
                jam7.setVisible(false);
                jam8.setVisible(false);
                jam9.setVisible(false);
                bks4.setVisible(false);
                bks5.setVisible(false);
                bks6.setVisible(false);
                jam10.setVisible(false);
                jam11.setVisible(false);
                jam12.setVisible(false);
                jam13.setVisible(false);
                jam14.setVisible(false);
                jam15.setVisible(false);
                jam16.setVisible(false);
                jam17.setVisible(false);
                jam18.setVisible(false);
                bks7.setVisible(true);
                bks8.setVisible(true);
                bks9.setVisible(true);
                jam19.setVisible(true);
                jam20.setVisible(true);
                jam21.setVisible(true);
                jam22.setVisible(true);
                jam23.setVisible(true);
                jam24.setVisible(true);
                jam25.setVisible(true);
                jam26.setVisible(true);
                jam27.setVisible(true);
            }
            
        });
        pnlPanel1.add(tgl3);
        
        bks1 = new JLabel("PVJ");
        bks1.setBounds(320, 90, 100,25);
        bks1.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks1);
        
        jam1 = new JButton("12.00");
        jam1.setBounds(320, 120, 70, 25);
        jam1.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam1);
        
        jam2 = new JButton("14.00");
        jam2.setBounds(400, 120, 70, 25);
        jam2.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam2);
        
        jam3 = new JButton("18.00");
        jam3.setBounds(480, 120, 70, 25);
        jam3.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam3);
        
        bks2 = new JLabel("IP");
        bks2.setBounds(320, 150, 100,25);
        bks2.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks2);
        
        jam4 = new JButton("07.00");
        jam4.setBounds(320, 180, 70, 25);
        jam4.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam4);
        
        jam5 = new JButton("14.00");
        jam5.setBounds(400, 180, 70, 25);
        jam5.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam5);
        
        jam6 = new JButton("22.00");
        jam6.setBounds(480, 180, 70, 25);
        jam6.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam6);
        
        bks3 = new JLabel("FCL");
        bks3.setBounds(320, 210, 100,25);
        bks3.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks3);
        
        jam7 = new JButton("08.00");
        jam7.setBounds(320, 240, 70, 25);
        jam7.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam7);
        
        jam8 = new JButton("13.00");
        jam8.setBounds(400, 240, 70, 25);
        jam8.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam8);
        
        jam9 = new JButton("15.00");
        jam9.setBounds(480, 240, 70, 25);
        jam9.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam9);
        
        bks4 = new JLabel("PVJ");
        bks4.setBounds(320, 90, 100,25);
        bks4.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks4);
        
        jam10 = new JButton("10.00");
        jam10.setBounds(320, 120, 70, 25);
        jam10.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam10);
        
        jam11 = new JButton("22.00");
        jam11.setBounds(400, 120, 70, 25);
        jam11.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam11);
        
        jam12 = new JButton("23.00");
        jam12.setBounds(480, 120, 70, 25);
        jam12.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam12);
        
        bks5 = new JLabel("IP");
        bks5.setBounds(320, 150, 100,25);
        bks5.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks5);
        
        jam13 = new JButton("09.00");
        jam13.setBounds(320, 180, 70, 25);
        jam13.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam13);
        
        jam14 = new JButton("16.00");
        jam14.setBounds(400, 180, 70, 25);
        jam14.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam14);
        
        jam15 = new JButton("23.00");
        jam15.setBounds(480, 180, 70, 25);
        jam15.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam15);
        
        bks6 = new JLabel("FCL");
        bks6.setBounds(320, 210, 100,25);
        bks6.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks6);
        
        jam16 = new JButton("06.00");
        jam16.setBounds(320, 240, 70, 25);
        jam16.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam16);
        
        jam17 = new JButton("11.00");
        jam17.setBounds(400, 240, 70, 25);
        jam17.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam17);
        
        jam18 = new JButton("17.00");
        jam18.setBounds(480, 240, 70, 25);
        jam18.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam18);
        
        bks7 = new JLabel("PVJ");
        bks7.setBounds(320, 90, 100,25);
        bks7.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks7);
        
        jam19 = new JButton("09.00");
        jam19.setBounds(320, 120, 70, 25);
        jam19.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam19);
        
        jam20 = new JButton("10.00");
        jam20.setBounds(400, 120, 70, 25);
        jam20.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam20);
        
        jam21 = new JButton("19.00");
        jam21.setBounds(480, 120, 70, 25);
        jam21.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam21);
        
        bks8 = new JLabel("IP");
        bks8.setBounds(320, 150, 100,25);
        bks8.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks8);
        
        jam22 = new JButton("09.00");
        jam22.setBounds(320, 180, 70, 25);
        jam22.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam22);
        
        jam23 = new JButton("19.00");
        jam23.setBounds(400, 180, 70, 25);
        jam23.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam23);
        
        jam24 = new JButton("21.00");
        jam24.setBounds(480, 180, 70, 25);
        jam24.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam24);
        
        bks9 = new JLabel("FCL");
        bks9.setBounds(320, 210, 100,25);
        bks9.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(bks9);
        
        jam25 = new JButton("09.00");
        jam25.setBounds(320, 240, 70, 25);
        jam25.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam25);
        
        jam26 = new JButton("16.00");
        jam26.setBounds(400, 240, 70, 25);
        jam26.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam26);
        
        jam27 = new JButton("20.00");
        jam27.setBounds(480, 240, 70, 25);
        jam27.setFont(new Font("Arial",Font.BOLD,14));
        pnlPanel1.add(jam27);
        
        home = new JButton("Home");
        home.setBounds(680, 50, 110, 25);
        home.setFont(new Font("Arial",Font.BOLD,14));
        home.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        pnlPanel1.add(home);
        
        roll = new JLabel();
        roll.setBounds(520,50,300,300);
        roll.setIcon(new ImageIcon(resizeImage("home/roll.jpg", 320, 250)));
        pnlPanel1.add(roll);
    }
    
    public void Home() throws IOException{
        new Home().setVisible(true);
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
    JLabel movie1;
    JLabel text1;
    JButton jam1;
    JButton jam2;
    JButton jam3;
    JButton jam4;
    JButton jam5;
    JButton jam6;
    JButton jam7;
    JButton jam8;
    JButton jam9;
    JButton jam10;
    JButton jam11;
    JButton jam12;
    JButton jam13;
    JButton jam14;
    JButton jam15;
    JButton jam16;
    JButton jam17;
    JButton jam18;
    JButton jam19;
    JButton jam20;
    JButton jam21;
    JButton jam22;
    JButton jam23;
    JButton jam24;
    JButton jam25;
    JButton jam26;
    JButton jam27;
    JButton home;
    JLabel txttgl;
    JButton tgl1;
    JButton tgl2;
    JButton tgl3;
    JLabel bks1;
    JLabel bks2;
    JLabel bks3;
    JLabel bks4;
    JLabel bks5;
    JLabel bks6;
    JLabel bks7;
    JLabel bks8;
    JLabel bks9;
    JLabel roll;
}


