/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.TransaksiDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tiket.Transaksi;

/**
 *
 * @author William Johann
 */
public class Bayar extends JFrame{
    ArrayList <String> kursi = new ArrayList<>();
    String judul;
    String jam;
    String tanggal;
    int id_jadwal;
    Bayar(ArrayList <String> selected,String judul,String jam,String tanggal,int idJadwal){
        this.judul=judul;
        this.jam=jam;
        this.tanggal=tanggal;
        id_jadwal=(idJadwal);
        for (int i = 0; i < selected.size(); i++) {
            kursi.add(selected.get(i));
        }
        initComponent();
    }
    
    JPanel pnlBesar;
    JPanel pnlJudul;
    JPanel pnlIsi;
    JPanel pnlButton;
    JLabel lblPembayaran;
    JLabel lblJudul;
    JLabel lblIsiJudul;
    JLabel lblJam;
    JLabel lblIsiJam;
    JLabel lblKursi;
    JLabel lblIsiKursi;
    JLabel lblDate;
    JLabel lblIsiDate;
    JLabel lblTotal;
    JLabel lblIsiTotal;
    JLabel lblJumlah;
    JLabel lblIsiJumlah;
    JButton btnBayar;
    
    private void initComponent(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        
        String strkursi = new String();
        for (int i = 0; i < kursi.size(); i++) {
            strkursi += kursi.get(i)+" ";
        }
        int jumlah = kursi.size();
        pnlBesar = new JPanel();
        pnlBesar.setBounds(0, 0, 400, 100);
        pnlBesar.setBackground(new Color(224,59,48));
        pnlBesar.setLayout(null);
        lblPembayaran = new JLabel("Payment",JLabel.CENTER);
        lblPembayaran.setBounds(125,35,150,40);
        lblPembayaran.setFont(new Font("Arial",Font.BOLD,18));
        lblPembayaran.setForeground(Color.white);
        pnlBesar.add(lblPembayaran);
        
        pnlIsi = new JPanel();
        pnlIsi.setBounds(0,100,400,300);
        pnlIsi.setBackground(new Color(244,242,229));
        pnlIsi.setLayout(null);
        
        lblJudul = new JLabel("Judul: ");
        lblJudul.setFont(new Font("Arial",Font.PLAIN,14));
        lblIsiJudul = new JLabel(judul);
        lblIsiJudul.setFont(new Font("Arial",Font.PLAIN,14));
        lblDate = new JLabel("Date: ");
        lblDate.setFont(new Font("Arial",Font.PLAIN,14));
        lblIsiDate = new JLabel(tanggal);
        lblIsiDate.setFont(new Font("Arial",Font.PLAIN,14));
        lblJam = new JLabel("Jam: ");
        lblJam.setFont(new Font("Arial",Font.PLAIN,14));
        lblIsiJam = new JLabel(jam);
        lblIsiJam.setFont(new Font("Arial",Font.PLAIN,14));
        lblKursi = new JLabel("Kursi: ");
        lblKursi.setFont(new Font("Arial",Font.PLAIN,14));
        lblIsiKursi= new JLabel(strkursi);
        lblIsiKursi.setFont(new Font("Arial",Font.BOLD,14));
        lblJumlah = new JLabel("Jumlah: ");
        lblJumlah.setFont(new Font("Arial",Font.BOLD,14));
        lblIsiJumlah = new JLabel(Integer.toString(jumlah));
        lblIsiJumlah.setFont(new Font("Arial",Font.BOLD,14));
        lblTotal = new JLabel("Total: ");
        lblTotal.setFont(new Font("Arial",Font.BOLD,14));
        lblIsiTotal = new JLabel(Integer.toString(jumlah*25000));
        lblIsiTotal.setFont(new Font("Arial",Font.BOLD,14));
        
        for (int i = 0; i < kursi.size(); i++) {
            System.out.print(kursi.get(i)+" ");
        }
        lblJudul.setBounds(15,0,75, 35);
        lblIsiJudul.setBounds(80, 0,200,35);
        lblDate.setBounds(15,35,75, 35);
        lblIsiDate.setBounds(80,35,200,35);
        lblJam.setBounds(15,70,75, 35);
        lblIsiJam.setBounds(80,70,200,35);
        lblKursi.setBounds(15,105,75, 35);
        lblIsiKursi.setBounds(80, 105, 200, 35);
        lblJumlah.setBounds(15,140,75, 35);
        lblIsiJumlah.setBounds(80,140,75,35);
        lblTotal.setBounds(15,175,75, 35);
        lblIsiTotal.setBounds(80,175,200,35);
        btnBayar=new JButton("Buy");
        btnBayar.setBounds(250, 200, 125, 40);
        
        pnlIsi.add(lblJudul);
        pnlIsi.add(lblIsiJudul);
        pnlIsi.add(lblDate);
        pnlIsi.add(lblIsiDate);
        pnlIsi.add(lblJam);
        pnlIsi.add(lblIsiJam);
        pnlIsi.add(lblKursi);
        pnlIsi.add(lblIsiKursi);
        pnlIsi.add(lblJumlah);
        pnlIsi.add(lblIsiJumlah);
        pnlIsi.add(lblTotal);
        pnlIsi.add(lblIsiTotal);
        pnlIsi.add(btnBayar);

        this.add(pnlBesar);
        this.add(pnlIsi);
        
        btnBayar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < kursi.size(); i++) {
                    Transaksi t = new Transaksi();
                    t.setId_jadwal(id_jadwal);
                    t.setKursi(kursi.get(i));
                    TransaksiDao.insertData(t);
                    System.out.println("berhasil");
                    setVisible(false);
                    try {
                        new Home2().setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(Bayar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  
                }
            }
            
        });
        
    }
    
}
