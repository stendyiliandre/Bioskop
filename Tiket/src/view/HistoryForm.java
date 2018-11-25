/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.HistoryDao;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import tiket.History;

/**
 *
 * @author William Johann
 */
public class HistoryForm extends JFrame {
    HistoryForm(String id){
        this.id=id;
        initComponents();
    }
    
    private void initComponents(){
        this.setResizable(false);
        this.setSize(750,400);
        this.setTitle("History");
        this.setLocationRelativeTo(null);
        List <History> listHistory;
        listHistory = new ArrayList<>();
        listHistory= HistoryDao.selectAllHistory();
        String [][] hh=new String[listHistory.size()][5];
        for (int i = 0; i <listHistory.size(); i++) {
            if(listHistory.get(i).getId_user().equals(id)){
                hh[i][0]=listHistory.get(i).getId_user();
                hh[i][1]=listHistory.get(i).getTanggal();
                hh[i][2]=listHistory.get(i).getJudul();
                hh[i][3]=listHistory.get(i).getStudio();
                hh[i][4]=listHistory.get(i).getKursi(); 
            }
            
        }
        String judul[] = {"Id_user","Tanggal","Judul","Studio","Kursi"};
        tblHistory  = new JTable(hh,judul);
        tblHistory.setBounds(0, 300, 750, 300);
        spTbl = new JScrollPane(tblHistory);
        pnlButton =new JPanel();
        pnlButton.setBackground(Color.white);
        pnlButton.setBounds(0, 300, 750, 100);
        
        btnHome = new JButton("Home");
        btnHome.setBounds(350, 25, 100, 35);
        btnHome.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new Home2(id).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HistoryForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        pnlButton.add(btnHome);
        this.add(pnlButton);
        this.add(spTbl);
    }
    
    JTable tblHistory;
    JScrollPane spTbl;
    String id;
    JPanel pnlButton;
    JButton btnHome;
}
