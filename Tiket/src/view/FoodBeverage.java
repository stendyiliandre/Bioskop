/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.FoodDao;
import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import tiket.Makanan;

/**
 *
 * @author Stendy Iliandre
 */
public class FoodBeverage extends JFrame {
    List<Makanan> listFood = FoodDao.selectAllMakanan();
    public FoodBeverage() throws IOException {
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(900, 720);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Home");
        this.setResizable(false);
        this.setLayout(null);

        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0, 0, 900, 25);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);

        pnlPanel2 = new JPanel();
        pnlPanel2.setBounds(0, 25, 900, 300);
        pnlPanel2.setLayout(null);
        pnlPanel2.setBackground(Color.white);
        add(pnlPanel2);

        pnlPanel3 = new JPanel();
        pnlPanel3.setBackground(Color.white);
        pnlPanel3.setLayout(null);
        pnlPanel3.setBounds(0, 325, 900, 25);
        add(pnlPanel3);

        pnlPanel4 = new JPanel();
        pnlPanel4.setBounds(0, 350, 900, 330);
        pnlPanel4.setLayout(null);
        pnlPanel4.setBackground(Color.white);
        add(pnlPanel4);

        food1 = new JLabel();
        food1.setBounds(25, 0, 300, 300);
        food1.setIcon(new ImageIcon(resizeImage(listFood.get(0).getDirectory(), 250, 250)));
        food1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(0).getMenu(), listFood.get(0).getHarga(), listFood.get(0).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        food2 = new JLabel();
        food2.setBounds(325, 0, 300, 300);
        food2.setIcon(new ImageIcon(resizeImage(listFood.get(1).getDirectory(), 250, 250)));
        food2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(1).getMenu(), listFood.get(1).getHarga(), listFood.get(1).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        food3 = new JLabel();
        food3.setBounds(625, 0, 300, 300);
        food3.setIcon(new ImageIcon(resizeImage(listFood.get(2).getDirectory(), 250, 250)));
        food3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(2).getMenu(), listFood.get(2).getHarga(), listFood.get(2).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        food4 = new JLabel();
        food4.setBounds(25, 0, 300, 300);
        food4.setIcon(new ImageIcon(resizeImage(listFood.get(3).getDirectory(), 250, 250)));
        food4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(3).getMenu(), listFood.get(3).getHarga(), listFood.get(3).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        food5 = new JLabel();
        food5.setBounds(325, 0, 300, 300);
        food5.setIcon(new ImageIcon(resizeImage(listFood.get(4).getDirectory(), 250, 250)));
        food5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(4).getMenu(), listFood.get(4).getHarga(), listFood.get(4).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        food6 = new JLabel();
        food6.setBounds(625, 0, 300, 300);
        food6.setIcon(new ImageIcon(resizeImage(listFood.get(5).getDirectory(), 250, 250)));
        food6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    new DetailFood(listFood.get(5).getMenu(), listFood.get(5).getHarga(), listFood.get(5).getDirectory()).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }

        });

        text1 = new JLabel(listFood.get(0).getMenu());
        text1.setBounds(125, 0, 300, 25);
        text1.setFont(new Font("Calibri", Font.BOLD, 16));

        text2 = new JLabel(listFood.get(1).getMenu());
        text2.setBounds(420, 0, 300, 25);
        text2.setFont(new Font("Calibri", Font.BOLD, 16));

        text3 = new JLabel(listFood.get(2).getMenu());
        text3.setBounds(710, 0, 300, 25);
        text3.setFont(new Font("Calibri", Font.BOLD, 16));

        text4 = new JLabel(listFood.get(3).getMenu());
        text4.setBounds(135, 0, 300, 25);
        text4.setFont(new Font("Calibri", Font.BOLD, 16));

        text5 = new JLabel(listFood.get(4).getMenu());
        text5.setBounds(435, 0, 300, 25);
        text5.setFont(new Font("Calibri", Font.BOLD, 16));

        text6 = new JLabel(listFood.get(5).getMenu());
        text6.setBounds(710, 0, 300, 25);
        text6.setFont(new Font("Calibri", Font.BOLD, 16));
        
        home = new JButton("Home");
        home.setBounds(400, 290, 110, 25);
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
        pnlPanel4.add(home);

        pnlPanel2.add(food1);
        pnlPanel2.add(food2);
        pnlPanel2.add(food3);
        pnlPanel1.add(text1);
        pnlPanel1.add(text2);
        pnlPanel1.add(text3);

        pnlPanel4.add(food4);
        pnlPanel4.add(food5);
        pnlPanel4.add(food6);
        pnlPanel3.add(text4);
        pnlPanel3.add(text5);
        pnlPanel3.add(text6);
    }

    public void Home() throws IOException{
        new Home2().setVisible(true);
        this.setVisible(false);
    }
    
    private Image resizeImage(String url, int x, int y) throws IOException {
        Image dimg = null;
        try {
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(x, y, Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return dimg;
    }

    JPanel pnlPanel1;
    JPanel pnlPanel2;
    JPanel pnlPanel3;
    JPanel pnlPanel4;
    JLabel food1;
    JLabel food2;
    JLabel food3;
    JLabel food4;
    JLabel food5;
    JLabel food6;
    JLabel text1;
    JLabel text2;
    JLabel text3;
    JLabel text4;
    JLabel text5;
    JLabel text6;
    JButton home;

}
