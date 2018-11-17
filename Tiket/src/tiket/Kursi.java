/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kevin suwanda
 */
public class Kursi extends JLabel {

    public String id;
    public String number;

    public Kursi(String number) {
        this.number = number;
        this.setText(number);
       // this
    }

}
