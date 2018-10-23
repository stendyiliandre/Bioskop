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
public class Movies implements Info {
    public int id;
    public String judul;
    public String director;
    public String durasi;
    public String genre;
    public String pemain;
    public String subtitle;

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
