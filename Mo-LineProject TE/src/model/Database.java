/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import Model.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Farhan
 */
public class Database {

/**
 *
 * @author Farhan
 */
private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<mLogin> login = new ArrayList<>();
    private ArrayList<mSign_Up> signup = new ArrayList<>();
    
    public Database() {
        loadUser();
    }
    
    public void clearDataArray(){
        login.clear();
        signup.clear();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/mo-line";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    
    public void loadUser() {
        connect();
        try {
            String query = "SELECT * FROM customer";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                signup.add(new mSign_Up(rs.getString("id_cust"), 
                    rs.getString("password"),
                    rs.getString("nama"),
                    rs.getString("tgl_lahir"), 
                    rs.getString("gender"), 
                    rs.getString("alamat"),
                    rs.getString("no_telp"))
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<mLogin> getLogin() {
        return login;
    }

    public ArrayList<mSign_Up> getSignup() {
        return signup;
    }
    
    public void addUser(mSign_Up s) {
        connect();
        
        String query = "INSERT INTO customer VALUES (";
            query += "'" + s.getEmail() + "',";
            query += "'" + s.getPassword() + "',";
            query += "'" + s.getNama() + "',";
            query += "'" + s.getTgl_lahir() + "',";
            query += "'" + s.getJns_klmn() + "',";
            query += "'" + s.getAlamat() + "',";
            query += "'" + s.getNo_telp() + "'";
            query += ")";
        
        if (manipulate(query)) signup.add(s);
            disconnect();
    }
     
    public boolean checkDuplicateEmail(String id_cust){
        boolean check = false;
        for (mSign_Up sgnp : signup) {
            if (sgnp.getEmail().equals(id_cust)){
                check = true;
                break;
            }
        }
        return check;
    }
    
    public boolean checkDuplicatePassword(String id_cust, String password){
        boolean check = false;
        for (mSign_Up sgnp : signup) {
            if (sgnp.getEmail().equals(id_cust) && sgnp.getPassword().equals(password)){
                check = true;
                break;
            }
        }
        return check;
    }
    
    
    public void changePassword(String id_cust, String new_pw) {
        connect();
        String query = "UPDATE customer SET password = '"+new_pw+"' WHERE id_cust ='"+id_cust+"';";
        manipulate(query);
        disconnect();
        
    }
}
