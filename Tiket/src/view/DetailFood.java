/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Stendy Iliandre
 */
public class DetailFood extends JFrame {
    String id_lgn;
    String menu;
    int harga;
    String directory;
    int n = 0;

    public DetailFood(String id_lgn, String menu, int harga, String directory) throws IOException {
        this.menu = menu;
        this.harga = harga;
        this.directory = directory;
        this.id_lgn = id_lgn;
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(550, 350);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setTitle("Detail Food");
        this.setLayout(null);
        this.setResizable(false);

        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0, 0, 900, 700);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);

        lblFood1 = new JLabel();
        lblFood1.setBounds(25, 0, 300, 300);
        lblFood1.setIcon(new ImageIcon(resizeImage(directory, 250, 250)));
        pnlPanel1.add(lblFood1);

        lblText1 = new JLabel(menu);
        lblText1.setBounds(120, 0, 300, 25);
        lblText1.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(lblText1);

        but1 = new JButton("-");
        but1.setBounds(320, 100, 45, 40);
        but1.setFont(new Font("Calibri", Font.BOLD, 16));
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (n > 0) {
                    n--;
                    val.setText(Integer.toString(n));
                }
            }

        });
        pnlPanel1.add(but1);

        val = new JLabel(Integer.toString(n));
        val.setBounds(395, 100, 40, 40);
        val.setFont(new Font("Calibri", Font.BOLD, 16));
        pnlPanel1.add(val);

        but2 = new JButton("+");
        but2.setBounds(435, 100, 45, 40);
        but2.setFont(new Font("Calibri", Font.BOLD, 16));
        but2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                n++;
                val.setText(Integer.toString(n));
            }

        });
        pnlPanel1.add(but2);

        btnBack = new JButton("Back");
        btnBack.setBounds(325, 250, 90, 30);
        btnBack.setFont(new Font("Arial", Font.BOLD, 14));
        btnBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    FoodBeverage();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        pnlPanel1.add(btnBack);

        btnNext = new JButton("Next");
        btnNext.setBounds(425, 250, 90, 30);
        btnNext.setFont(new Font("Arial", Font.BOLD, 14));
        btnNext.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Next();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        pnlPanel1.add(btnNext);
    }

    public void FoodBeverage() throws IOException {
        new FoodBeverage(id_lgn).setVisible(true);
        this.setVisible(false);
    }

    public void Home2() throws IOException {
        new Home2(id_lgn).setVisible(true);
        this.setVisible(false);
    }

    public void Next() throws IOException {
//        new Bayar(array kursi, judul, jam, tanggal).setVisible(true);
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
    JLabel lblFood1;
    JLabel lblText1;
    JLabel val;
    JButton but1;
    JButton but2;
    JButton btnBack;
    JButton btnNext;
}
