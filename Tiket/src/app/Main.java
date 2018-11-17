/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.io.IOException;

/**
 *
 * @author kevin suwanda
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LoginForm lgn = new LoginForm();
        Register rgs = new Register();
        rgs.setVisible(true);
        lgn.setVisible(true);
    }
}
