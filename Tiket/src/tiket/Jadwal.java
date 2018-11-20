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
public class Jadwal {
    private int id_jadwal;
    private String tanggal;
    private int id_studio;

    public int getId_studio() {
        return id_studio;
    }

    public void setId_studio(int id_studio) {
        this.id_studio = id_studio;
    }
    Studio studio;

    public int getId_jadwal() {
        return id_jadwal;
    }

    public void setId_jadwal(int id_jadwal) {
        this.id_jadwal = id_jadwal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
    
}
