/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Farhan
 */
public class controller {
    public static void main(String[] args) {
        vRegistrasi vr = new vRegistrasi();
        vr.setVisible(true);
        
        System.out.println(vr.getCbBlnLhr());
        System.out.println(vr.getCbTglLhr());
        
        System.out.println(vr.getCbThnLhr());
        
        System.out.println(vr.getPfPassword());
        
        System.out.println(vr.getRbLaki());
        System.out.println(vr.getRbPerempuan());
        
        System.out.println(vr.getTaAlamat());
        
        System.out.println(vr.getTfEmail());
        
        System.out.println(vr.getTfNama());
        
        System.out.println(vr.getTfNo_Telp());
        
        System.out.println(vr.get_BgMaleFemale());
        
        System.out.println(vr.get_CbThnLhr());
        
        System.out.println(vr.get_CbBlnLhr());
        System.out.println(vr.get_CbTglLhr());
        
    }
    
}
