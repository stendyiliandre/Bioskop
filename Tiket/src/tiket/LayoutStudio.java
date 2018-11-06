/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;


/**
 *
 * @author William Johann
 */
public class LayoutStudio extends JFrame{
    LayoutStudio(){
        initComponents();
    }
    
    private JPanel pnlPanel0;
    private JPanel pnlPanel1;
    private JPanel pnlPanel2;
    private JPanel pnlPanel3;
    private JPanel pnlBesar;
    private JLabel lblLayar;

    private void initComponents(){
        this.setResizable(false);
        this.setSize(1000,900);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBackground(Color.white);
        
        pnlBesar= new JPanel();
        pnlBesar.setBounds(0, 0, 1000, 900);
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
                final JToggleButton btnButton1= new JToggleButton("A"+i+j);
                btnButton1.setBackground(Color.white);
                btnButton1.setForeground(Color.red);
                btnButton1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        
                        if (btnButton1.isSelected()==false){ 
                            btnButton1.setBackground(Color.white);
                            
                        }
                    }
            });
                pnlPanel1.add(btnButton1);
            }
        }
        
        pnlPanel2= new JPanel();    
        pnlPanel2.setBounds(225, 125,550,700);
        pnlPanel2.setLayout(new GridLayout(10,10,5,5));
        pnlPanel2.setBackground(new Color(244,242,229));
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                final JToggleButton btnButton2= new JToggleButton("B"+i+j);
                btnButton2.setBackground(Color.white);
                btnButton2.setForeground(Color.red);
                btnButton2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (btnButton2.isSelected()==false) {
                            btnButton2.setBackground(Color.white);
                           
                        }
                    }
            });
                pnlPanel2.add(btnButton2); 
            }
        }
        
        pnlPanel3=new JPanel();
        pnlPanel3.setBounds(805, 125,120,700);
        pnlPanel3.setLayout(new GridLayout(10,2,5,5));
        pnlPanel3.setBackground(new Color(244,242,229));
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                final JToggleButton btnButton3= new JToggleButton("C"+i+j); 
                btnButton3.setBackground(Color.white);
                btnButton3.setForeground(Color.red);
                btnButton3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        if (btnButton3.isSelected()==false) {
                            btnButton3.setBackground(Color.white);
                            
                        }
                    }
            });
                pnlPanel3.add(btnButton3);
            }
        }
        pnlBesar.add(pnlPanel3);
        pnlBesar.add(pnlPanel2);
        pnlBesar.add(pnlPanel1);
        pnlBesar.add(pnlPanel0);
        add(pnlBesar);

    }
    
}
