/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author William Johann
 */
public class Bayar extends JFrame{

    Bayar(){
        initComponent();
    }
    JPanel pnlBesar;
    JPanel pnlJudul;
    JPanel pnlIsi;
    JPanel pnlButton;
    JLabel lblPembayaran;
    JLabel lblJudul;
    JLabel lblJam;
    JLabel lblKursi;
    JLabel lblDate;
    JLabel lblTotal;
    JLabel lblJumlah;
    JButton btnBayar;
    
    private void initComponent(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        
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
        
        lblJudul = new JLabel("Date: ");
        lblJudul.setFont(new Font("Arial",Font.PLAIN,14));
        lblDate = new JLabel("Date: ");
        lblDate.setFont(new Font("Arial",Font.PLAIN,14));
        lblJam = new JLabel("Jam: ");
        lblJam.setFont(new Font("Arial",Font.PLAIN,14));
        lblKursi = new JLabel("Kursi: ");
        lblKursi.setFont(new Font("Arial",Font.PLAIN,14));
        lblJumlah = new JLabel("Jumlah: ");
        lblJumlah.setFont(new Font("Arial",Font.BOLD,14));
        lblTotal = new JLabel("Total: ");
        lblTotal.setFont(new Font("Arial",Font.BOLD,14));
        
        lblJudul.setBounds(15,0,75, 35);
        lblDate.setBounds(15,35,75, 35);
        lblJam.setBounds(15,70,75, 35);
        lblKursi.setBounds(15,105,75, 35);
        lblJumlah.setBounds(15,140,75, 35);
        lblTotal.setBounds(15,175,75, 35);
        
        btnBayar=new JButton("Buy");
        btnBayar.setBounds(250, 200, 125, 40);
        
        pnlIsi.add(lblJudul);
        pnlIsi.add(lblDate);
        pnlIsi.add(lblJam);
        pnlIsi.add(lblKursi);
        pnlIsi.add(lblJumlah);
        pnlIsi.add(lblTotal);
        pnlIsi.add(btnBayar);

        
        this.add(pnlBesar);
        this.add(pnlIsi);
        
        
        
        
        
    }
    
}
