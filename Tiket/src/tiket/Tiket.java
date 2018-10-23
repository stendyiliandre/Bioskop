/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author Kevin Suwanda, Stendy Iliandre, William Johann
 */
public class Tiket implements Info{
    Movies movie;
    Studio studio;
    Makanan makanan;
    public String seat;
    public String time;
    public int bayar;

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
