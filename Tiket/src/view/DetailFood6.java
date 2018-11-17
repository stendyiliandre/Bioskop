/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.awt.Color;
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
 * @author Stendy Iliandre
 */
public class DetailFood6 extends JFrame{
    public DetailFood6() throws IOException{
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(820,350);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Detail Food 6");
        this.setLayout(null);
        this.setResizable(false);
        
        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0,0,900,700);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);
        
        food1 = new JLabel();
        food1.setBounds(25,0,300,300);
        food1.setIcon(new ImageIcon(resizeImage("food/orange.png", 250, 250)));
        pnlPanel1.add(food1);
        
        text1 = new JLabel("Orange Juice");
        text1.setBounds(110, 0, 300, 25);
        text1.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(text1);
        
        but1 = new JButton("-");
        but1.setBounds(320, 100, 45, 40);
        but1.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(but1);
        
        val = new JLabel("0");
        val.setBounds(395, 100, 40, 40);
        val.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(val);
        
        but2 = new JButton("+");
        but2.setBounds(435, 100, 45, 40);
        but2.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(but2);
        
        fb = new JButton("Back");
        fb.setBounds(680, 50, 110, 25);
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
        pnlPanel1.add(fb);
        
        foodlogo = new JLabel();
        foodlogo.setBounds(520,50,300,300);
        foodlogo.setIcon(new ImageIcon(resizeImage("food/lovefood.png", 320, 250)));
        pnlPanel1.add(foodlogo);
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
    
    JPanel pnlPanel1;
    JLabel food1;
    JLabel text1;
    JLabel foodlogo;
    JLabel val;
    JButton but1;
    JButton but2;
    JButton fb;
}


