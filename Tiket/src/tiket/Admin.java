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
public class Admin extends User{
    private String namaproduk;
    private String jamproduk;
    private String theater;
    private int gaji;
    private int kerja;

    public String getNamaproduk() {
        return namaproduk;
    }

    public void setNamaproduk(String namaproduk) {
        this.namaproduk = namaproduk;
    }

    public String getJamproduk() {
        return jamproduk;
    }

    public void setJamproduk(String jamproduk) {
        this.jamproduk = jamproduk;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getKerja() {
        return kerja;
    }

    public void setKerja(int kerja) {
        this.kerja = kerja;
    }

    public void bayar(Admin ad){
        int a = ad.getKerja();
        int b = a * 5000;
        ad.setGaji(b);
    }

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
