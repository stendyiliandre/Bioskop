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
public class Movies{
    public  int id;
    private String judul;
    private String durasi;
    private String genre;
    private String directory;
    

    public Movies() {
       
    }
    public Movies(String movi, String drsa, String genn, String dicc) {
        this.judul = movi;
        this.durasi = drsa;
        this.genre = genn;
        this.directory = dicc;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDurasi() {
        return durasi;
    }

    public String getGenre() {
        return genre;
    }

    public String getJudul() {
        return judul;
    }

    public String getDirectory() {
        return directory;
    }
}
