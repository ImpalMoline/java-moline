/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihmontir;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PilihMontir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Pilih montir");
        
        String namaMontir[] = new String [100];
        int rating[] = new int [100];
        String bengkel[] = new String [100];
        
        namaMontir[0] = " sujono ";
        rating[0]= 4;
        bengkel [0]= "Daihatsu karya jaya ";
        
        namaMontir[1] = " dadang ";
        rating[1]= 5;
        bengkel [1]= "Honda sembrani";
        
        namaMontir[2] = " Jefri ";
        rating[2]= 3;
        bengkel [2]= "Ferari karya malam ";
        
        System.out.println(" 1. Nama Montir = "+namaMontir[0]+"\n Rating =  " +rating[0]+"\n Bengkel = "+bengkel[0]);
        System.out.println("2. Nama Montir = "+namaMontir[1]+"\n Rating =  " +rating[1]+"\n Bengkel = "+bengkel[1]);
        System.out.println("3. Nama Montir = "+namaMontir[2]+"\n Rating =  " +rating[2]+"\n Bengkel = "+bengkel[2]);
        
        Scanner a = new Scanner(System.in);
        System.out.print("pilih = ");
        int b = a.nextInt();
        
        if (b == 1) {
          System.out.println("ANDA MEMILIH \n Nama Montir = "+namaMontir[0]+"\n Rating =  " +rating[0]+"\n Bengkel = "+bengkel[0]);
        }else if (b == 2){
           System.out.println("ANDA MEMILIH \n Nama Montir = "+namaMontir[1]+"\n Rating =  " +rating[1]+"\n Bengkel = "+bengkel[1]); 
        }
        else if (b== 3){
            System.out.println("ANDA MEMILIH \n Nama Montir = "+namaMontir[2]+"\n Rating =  " +rating[2]+"\n Bengkel = "+bengkel[2]);
        }else{
            System.out.println("tidak ada data montir");
        }
    }
    
}
