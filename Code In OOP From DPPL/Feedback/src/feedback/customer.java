/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;

/**
 *
 * @author Farhan
 */
public class customer implements Feedback{
    String nama;
    int no_id;
    String tgl_lhr;
    String gender;
    String alamat;
    String kendaraan;

    public customer(String nama, int no_id, String tgl_lhr, String gender, String alamat, String kendaraan) {
        this.nama = nama;
        this.no_id = no_id;
        this.tgl_lhr = tgl_lhr;
        this.gender = gender;
        this.alamat = alamat;
        this.kendaraan = kendaraan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNo_id() {
        return no_id;
    }

    public void setNo_id(int no_id) {
        this.no_id = no_id;
    }

    public String getTgl_lhr() {
        return tgl_lhr;
    }

    public void setTgl_lhr(String tgl_lhr) {
        this.tgl_lhr = tgl_lhr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    @Override
    public void feedback() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFeedback() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFeedback() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getNilai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
