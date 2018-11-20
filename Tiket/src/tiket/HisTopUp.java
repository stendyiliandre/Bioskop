/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author kevin suwanda
 */
public class HisTopUp implements Info{
    private String id_lgn;
    private String jumlah;
    private String tanggal;
    private String jenis;
    
    public HisTopUp() {
    }

    public HisTopUp(String id_lgn, String jml, String jenis) {
       this.id_lgn = id_lgn;
       this.jumlah = jml;
       this.jenis = jenis;
    }

    public String getId_lgn() {
        return id_lgn;
    }

    public void setId_lgn(String id_lgn) {
        this.id_lgn = id_lgn;
    }
    
    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

   

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
