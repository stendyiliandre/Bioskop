/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.TransaksiDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import tiket.Kursi;
import tiket.Transaksi;

/**
 *
 * @author William Johann
 */
public class LayoutStudio extends JFrame {
    String id_lgn;
    int id_jadwal;
    String id_room;
    String judul;
    String jadwal[];
    int saldo;
    List<Transaksi> listTransaksi = TransaksiDao.selectAllTransaksi();

    public LayoutStudio(String id_lgn, int id_jadwal, String id_room, String judul, String jadwal) {
        this.id_lgn = id_lgn;
        this.judul = judul;
        this.id_jadwal = id_jadwal;
        this.id_room = id_room;
        this.jadwal = jadwal.split(" ");
        initComponents();
    }

    public ArrayList<String> getarrayTemp() {
        return arrayTemp;
    }

    public void setarrayTemp(ArrayList<String> arrayTemp) {
        this.arrayTemp = arrayTemp;
    }

    private JPanel pnlPanel0;
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JPanel pnlPanel3;
    private JPanel pnlPanel4;
    private JPanel pnlBesar;
    private JLabel lblLayar;
    private JButton btnBuy;
    private JButton btnHome;
    public ArrayList<Kursi> arrayKursi;
    public ArrayList<String> arrayTemp;

    private void initComponents() {
        arrayKursi = new ArrayList<>();
        arrayTemp = new ArrayList<>();
        this.setTitle("Layout Studio");
        this.setResizable(false);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        pnlBesar = new JPanel();
        pnlBesar.setBounds(0, 0, 1000, 1000);
        pnlBesar.setLayout(null);
        pnlBesar.setBackground(new Color(244, 242, 229));

        pnlPanel0 = new JPanel();
        pnlPanel0.setBounds(0, 0, 1000, 100);
        pnlPanel0.setLayout(null);
        pnlPanel0.setBackground(new Color(244, 242, 229));

        lblLayar = new JLabel("SCREEN", JLabel.CENTER);
        lblLayar.setOpaque(true);
        lblLayar.setFont(new Font("Arial", Font.BOLD, 20));
        lblLayar.setBounds(250, 25, 500, 50);

        pnlPanel0.add(lblLayar);

        pnlPanel1 = new JPanel();
        pnlPanel1.setBounds(75, 125, 120, 700);
        pnlPanel1.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPanel1.setBackground(new Color(244, 242, 229));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                Kursi k = new Kursi("A" + i + j);
                k.id = "A" + i + j;
                arrayKursi.add(k);
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                k.setBackground(Color.white);
                for (int l = 0; l < listTransaksi.size(); l++) {
                    if (listTransaksi.get(l).kursi.equals(k.id) && listTransaksi.get(l).id_jadwal == id_jadwal) {
                        k.setBackground(Color.gray);
                    } else {
                        k.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if (k.getBackground() == Color.red) {
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if (arrayTemp.get(l) == k.id) {
                                            arrayTemp.remove(l);
                                        }
                                    }
                                } else if (k.getBackground().equals(Color.gray)) {

                                } else {
                                    k.setBackground(Color.red);
                                    arrayTemp.add(k.id);
                                }
                            }
                        });
                    }
                }
                pnlPanel1.add(k);
            }
        }

        pnlPanel2 = new JPanel();
        pnlPanel2.setBounds(225, 125, 550, 700);
        pnlPanel2.setLayout(new GridLayout(10, 10, 5, 5));
        pnlPanel2.setBackground(new Color(244, 242, 229));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                Kursi k = new Kursi("B" + i + j);
                k.id = "B" + i + j;
                arrayKursi.add(k);
                k.setBackground(Color.white);
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                for (int l = 0; l < listTransaksi.size(); l++) {
                    if (listTransaksi.get(l).kursi.equals(k.id) && listTransaksi.get(l).id_jadwal == id_jadwal) {
                        k.setBackground(Color.gray);
                    } else {
                        k.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if (k.getBackground() == Color.red) {
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if (arrayTemp.get(l) == k.id) {
                                            arrayTemp.remove(l);
                                        }
                                    }
                                } else if (k.getBackground().equals(Color.gray)) {

                                } else {
                                    k.setBackground(Color.red);
                                    arrayTemp.add(k.id);
                                }
                            }
                        });
                    }
                }
                pnlPanel2.add(k);
            }
        }
        pnlPanel3 = new JPanel();
        pnlPanel3.setBounds(805, 125, 120, 700);
        pnlPanel3.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPanel3.setBackground(new Color(244, 242, 229));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                Kursi k = new Kursi("C" + i + j);
                k.id = "C" + i + j;
                arrayKursi.add(k);
                k.setBackground(Color.white);
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                k.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if (k.getBackground().equals(Color.red)) {
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if (arrayTemp.get(l) == k.id) {
                                            arrayTemp.remove(l);
                                        }
                                    }
                                } else if (k.getBackground().equals(Color.gray)) {

                                } else {
                                    k.setBackground(Color.red);
                                    arrayTemp.add(k.id);
                                }
                            }
                        });

                for (int l = 0; l < listTransaksi.size(); l++) {
                    if (listTransaksi.get(l).kursi.equals(k.id) && listTransaksi.get(l).id_jadwal == id_jadwal) {
                        k.setBackground(Color.gray);
                    }
                }
                pnlPanel3.add(k);
            }
        }

        btnBuy = new JButton("Next");
        btnBuy.setBounds(800, 875, 125, 50);
        btnBuy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < arrayTemp.size(); i++) {
                    //           System.out.print(arrayTemp.get(i)+" ");
                }
                setVisible(false);
                int dialogButton = JOptionPane.YES_NO_OPTION;
                
                if (JOptionPane.showConfirmDialog(null, "Buy Food&Beverage?", "WARNING", dialogButton) == JOptionPane.YES_OPTION) {
                    try {
                        new FoodBeverage(id_lgn).setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(LayoutStudio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    new Bayar(id_lgn, arrayTemp, judul, jadwal[1], jadwal[0], id_jadwal, id_room, saldo).setVisible(true);
                }
            }
        });

        btnHome = new JButton("Home");
        btnHome.setBounds(100, 875, 125, 50);
        btnHome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    setVisible(false);
                    new Home2(id_lgn).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LayoutStudio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        for (int i = 0; i < arrayKursi.size(); i++) {
            for (int j = 0; j < listTransaksi.size(); j++) {
                if (arrayKursi.get(i).id == listTransaksi.get(j).kursi) {
                    arrayKursi.get(i).setBackground(Color.gray);
                }
            }
        }

        pnlBesar.add(btnBuy);
        pnlBesar.add(btnHome);
        pnlBesar.add(pnlPanel3);
        pnlBesar.add(pnlPanel2);
        pnlBesar.add(pnlPanel1);
        pnlBesar.add(pnlPanel0);
        add(pnlBesar);

    }

}
