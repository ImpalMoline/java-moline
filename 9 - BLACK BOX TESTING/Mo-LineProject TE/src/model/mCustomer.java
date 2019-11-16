/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
/**
 *
 * @author Farhan
 */
public abstract class mCustomer {
    private String id_cust;
    private String password;
    private String nama;
    private String tgl_lahir;
    private String gender;
    private String alamat;
    private String no_telp;

    public mCustomer(String id_cust, String password, String nama, String tgl_lahir, String gender, String alamat, String no_telp) {
        this.id_cust = id_cust;
        this.password = password;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.gender = gender;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }

    public mCustomer(String id_cust, String password) {
        this.id_cust = id_cust;
        this.password = password;
    }

    public String getEmail() {
        return id_cust;
    }

    public void setEmail(String id_cust) {
        this.id_cust = id_cust;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJns_klmn() {
        return gender;
    }

    public void setJns_klmn(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
}
