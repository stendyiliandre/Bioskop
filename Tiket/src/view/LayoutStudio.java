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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tiket.Kursi;
import tiket.Transaksi;


/**
 *
 * @author William Johann
 */
public class LayoutStudio extends JFrame{
    int id_jadwal;
    String judul;
    String jadwal[];
    List<Transaksi> listTransaksi = TransaksiDao.selectAllTransaksi();
    
    public LayoutStudio(int id_jadwal, String judul, String jadwal,String id_user){
        this.judul=judul;
        this.id_jadwal = id_jadwal;
        this.jadwal=jadwal.split(" ");
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
    private JButton next;
    private JButton btnbuy;
    public ArrayList<Kursi> arrayKursi;
    public ArrayList <String>arrayTemp;

    private void initComponents(){             
        arrayKursi = new ArrayList<>();
        arrayTemp = new ArrayList<>();
        this.setResizable(false);
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        pnlBesar= new JPanel();
        pnlBesar.setBounds(0, 0, 1000, 1000);
        pnlBesar.setLayout(null);
        pnlBesar.setBackground(new Color(244,242,229));
        
        pnlPanel0=new JPanel();
        pnlPanel0.setBounds(0, 0, 1000, 100);
        pnlPanel0.setLayout(null);
        pnlPanel0.setBackground(new Color(244,242,229));
        
        lblLayar =new JLabel("SCREEN",JLabel.CENTER);
        lblLayar.setOpaque(true);
        lblLayar.setFont(new Font("Arial", Font.BOLD, 20));
        lblLayar.setBounds(250,25,500,50);
        
        pnlPanel0.add(lblLayar);

        pnlPanel1=new JPanel();
        pnlPanel1.setBounds(75, 125,120,700);
        pnlPanel1.setLayout(new GridLayout(10,2,5,5));
        pnlPanel1.setBackground(new Color(244,242,229));
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                Kursi k = new Kursi("A"+i+j);
                k.id="A"+i+j;
                arrayKursi.add(k);
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                k.setBackground(Color.white);
                for (int l = 0; l < listTransaksi.size(); l++) {
                    if(listTransaksi.get(l).kursi.equals(k.id)&& listTransaksi.get(l).id_jadwal==id_jadwal){
                        k.setBackground(Color.gray);
                    }else{
                        k.addMouseListener(new MouseAdapter(){
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if(k.getBackground()==Color.red){
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if(arrayTemp.get(l) == k.id){
                                            arrayTemp.remove(l);
                                        }
                                    }  
                                }else if (k.getBackground().equals(Color.gray)){
                                    
                                }else{
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
        
        pnlPanel2= new JPanel();    
        pnlPanel2.setBounds(225, 125,550,700);
        pnlPanel2.setLayout(new GridLayout(10,10,5,5));
        pnlPanel2.setBackground(new Color(244,242,229));
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                Kursi k = new Kursi("B"+i+j);
                k.id="B"+i+j;
                arrayKursi.add(k);
                k.setBackground(Color.white);
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                for (int l = 0; l < listTransaksi.size(); l++) {
                    if(listTransaksi.get(l).kursi.equals(k.id)&& listTransaksi.get(l).id_jadwal==id_jadwal){
                        k.setBackground(Color.gray);
                    }else{
                        k.addMouseListener(new MouseAdapter(){
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if(k.getBackground()==Color.red){
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if(arrayTemp.get(l) == k.id){
                                            arrayTemp.remove(l);
                                        }
                                    }  
                                }else if (k.getBackground().equals(Color.gray)){
                                    
                                }else{
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
        
        pnlPanel3=new JPanel();
        pnlPanel3.setBounds(805, 125,120,700);
        pnlPanel3.setLayout(new GridLayout(10,2,5,5));
        pnlPanel3.setBackground(new Color(244,242,229));
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                Kursi k = new Kursi("C"+i+j);
                k.id="C"+i+j;
                arrayKursi.add(k);
                
                k.setHorizontalAlignment(JLabel.CENTER);
                k.setOpaque(true);
                for (int l = 0; l < listTransaksi.size(); l++) {
                    if(listTransaksi.get(l).kursi.equals(k.id)&& listTransaksi.get(l).id_jadwal==id_jadwal){
                        k.setBackground(Color.gray);
                    }else{
                        k.setBackground(Color.white);
                        k.addMouseListener(new MouseAdapter(){
                            @Override
                            public void mouseClicked(MouseEvent me) {
                                if(k.getBackground().equals(Color.red)){
                                    k.setBackground(Color.white);
                                    for (int l = 0; l < arrayTemp.size(); l++) {
                                        if(arrayTemp.get(l) == k.id){
                                            arrayTemp.remove(l);
                                        }
                                    }  
                                }else if (k.getBackground().equals(Color.gray)){
                                    
                                }else{
                                    k.setBackground(Color.red);
                                    arrayTemp.add(k.id);
                                }
                            }
                        });
                    }
                }                
                pnlPanel3.add(k);
            }
        }

        btnbuy=new JButton("Next");
        btnbuy.setBounds(800, 875, 125, 50);
        btnbuy.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {               
                for (int i = 0; i < arrayTemp.size(); i++) {
         //           System.out.print(arrayTemp.get(i)+" ");
                }
                setVisible(false);
                new Bayar(arrayTemp,judul,jadwal[1],jadwal[0],id_jadwal).setVisible(true);
            } 
        });
        
        for (int i = 0; i < arrayKursi.size(); i++) {
            for (int j = 0; j < listTransaksi.size(); j++) {
                if(arrayKursi.get(i).id==listTransaksi.get(j).kursi){
                    arrayKursi.get(i).setBackground(Color.gray);  
                }
            }
        }

        pnlBesar.add(btnbuy);
        pnlBesar.add(pnlPanel3);
        pnlBesar.add(pnlPanel2);
        pnlBesar.add(pnlPanel1);
        pnlBesar.add(pnlPanel0);
        add(pnlBesar);

    }
    
}
