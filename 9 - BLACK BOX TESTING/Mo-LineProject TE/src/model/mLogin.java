/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionListener;
import java.io.Serializable;
/**
 *
 * @author Farhan
 */
public class mLogin extends mCustomer implements Serializable{
    private String id_cust;
    private String password;
    public mLogin(String id_cust, String password) {
        super(id_cust, password);
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
}
