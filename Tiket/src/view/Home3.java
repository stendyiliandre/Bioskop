/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.JadwalMovieDao;
import java.awt.Color;
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
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import tiket.Movies;
import database.MoviesDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin suwanda
 */
public class Home3 extends JFrame {
    List<Movies> listMovies = MoviesDao.selectAllMovies();

    public Home3() throws IOException {
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
        this.setBackground(Color.white);

        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(0, 20, 900, 625);
        pnlPanel1.setLayout(null);
        pnlPanel1.setBackground(Color.white);
        add(pnlPanel1);

        pnlPanel2 = new JPanel();
        pnlPanel2.setBounds(0, 650, 900, 30);
        pnlPanel2.setLayout(null);
        pnlPanel2.setBackground(Color.white);
        add(pnlPanel2);

        lblText1 = new JLabel(listMovies.get(0).getJudul());
        lblText1.setBounds(120, 0, 300, 25);
        lblText1.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie1 = new JLabel();
        lblMovie1.setBounds(25, 10, 300, 300);
        lblMovie1.setIcon(new ImageIcon(resizeImage(listMovies.get(0).getDirectory(), 250, 250)));

        lblText2 = new JLabel(listMovies.get(1).getJudul());
        lblText2.setBounds(420, 0, 300, 25);
        lblText2.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie2 = new JLabel();
        lblMovie2.setBounds(325, 10, 300, 300);
        lblMovie2.setIcon(new ImageIcon(resizeImage(listMovies.get(1).getDirectory(), 250, 250)));

        lblText3 = new JLabel(listMovies.get(2).getJudul());
        lblText3.setBounds(710, 0, 300, 25);
        lblText3.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie3 = new JLabel();
        lblMovie3.setBounds(625, 10, 300, 300);
        lblMovie3.setIcon(new ImageIcon(resizeImage(listMovies.get(2).getDirectory(), 250, 250)));

        lblText4 = new JLabel(listMovies.get(3).getJudul());
        lblText4.setBounds(100, 325, 300, 25);
        lblText4.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie4 = new JLabel();
        lblMovie4.setBounds(25, 340, 300, 300);
        lblMovie4.setIcon(new ImageIcon(resizeImage(listMovies.get(3).getDirectory(), 250, 250)));

        lblText5 = new JLabel(listMovies.get(4).getJudul());
        lblText5.setBounds(420, 325, 300, 25);
        lblText5.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie5 = new JLabel();
        lblMovie5.setBounds(325, 340, 300, 300);
        lblMovie5.setIcon(new ImageIcon(resizeImage(listMovies.get(4).getDirectory(), 250, 250)));

        lblText6 = new JLabel(listMovies.get(5).getJudul());
        lblText6.setBounds(710, 325, 300, 25);
        lblText6.setFont(new Font("Arial", Font.BOLD, 14));

        lblMovie6 = new JLabel();
        lblMovie6.setBounds(625, 340, 300, 300);
        lblMovie6.setIcon(new ImageIcon(resizeImage(listMovies.get(5).getDirectory(), 250, 250)));

        btnAdd = new JButton("Add");
        btnAdd.setBounds(496, 5, 110, 25);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 14));
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Movie();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel2.add(btnAdd);

        btnDel = new JButton("Delete");
        btnDel.setBounds(630, 5, 110, 25);
        btnDel.setFont(new Font("Arial", Font.BOLD, 14));
        btnDel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Movies m =  new Movies();
                MoviesDao.deleteData(JOptionPane.showInputDialog("Movies Berapakah yang ingin Didelete ?"));
            }
        });
        pnlPanel2.add(btnDel);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(765, 290, 110, 25);
        btnLogout.setFont(new Font("Arial", Font.BOLD, 14));
        btnLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Home();
                } catch (IOException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlPanel2.add(btnLogout);

        pnlPanel1.add(lblText1);
        pnlPanel1.add(lblText2);
        pnlPanel1.add(lblText3);
        pnlPanel1.add(lblMovie1);
        pnlPanel1.add(lblMovie2);
        pnlPanel1.add(lblMovie3);

        pnlPanel1.add(lblText4);
        pnlPanel1.add(lblText5);
        pnlPanel1.add(lblText6);
        pnlPanel1.add(lblMovie4);
        pnlPanel1.add(lblMovie5);
        pnlPanel1.add(lblMovie6);
    }

    public void Movie() throws IOException {
        new Movie().setVisible(true);
        this.setVisible(false);
    }

    public void Home() throws IOException {
        new Home().setVisible(true);
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
    JLabel lblMovie1;
    JLabel lblMovie2;
    JLabel lblMovie3;
    JLabel lblMovie4;
    JLabel lblMovie5;
    JLabel lblMovie6;
    JLabel lblText1;
    JLabel lblText2;
    JLabel lblText3;
    JLabel lblText4;
    JLabel lblText5;
    JLabel lblText6;
    JButton btnFb;
    JButton btnAdd;
    JButton btnDel;
    JButton btnLogout;

}
