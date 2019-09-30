/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrasi;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Registrasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Registrasi ");
        
        String nama [] = new String [100];
        String Alamat [] = new String [100] ;
        String NoTelp []  = new String [100];
        String Email []  = new String [100];
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Nama =   ");
        String Nama = a.next();
        System.out.print("alamat =  ");
        String alamat = a.next();
        System.out.print("Nomor Telepon = ");
        String noTelp = a.next();
        System.out.print("Email =   ");
        String email = a.next();
         System.out.print("Gender =  ");
        String gender = a.next();
        
        String cek = null;
        if(Nama==cek && alamat==cek && noTelp==cek && email==cek && gender == cek){
            System.out.println("anda belum registrasi");
        }else{
            System.out.println("Anda berhasil registrasi");
        }
        
        
    }
    
}
