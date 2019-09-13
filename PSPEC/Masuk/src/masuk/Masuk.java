/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masuk;

import java.util.Scanner;

/**
 *
 * @author Farhan
 */
public class Masuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] username = new String[100];
        username[0] = "Anhar";
        String[] password = new String[100];
        password[0] = "123456";
        Scanner inputUser = new Scanner(System.in);
        Scanner inputPw = new Scanner(System.in);
        String usernames = null;
        String passwords = null;
        for (int i = 0; i < 10; i++) {
            System.out.println("Input Username: ");
            usernames = inputUser.nextLine();
            System.out.println("\nInput Password: ");
            passwords = inputPw.nextLine();
            break;
        }
        for (int i = 0; i < username.length; i++) {
            if(usernames.equals(username[i])&& passwords.equals(password[i])){
                System.out.println("\nBerhasil Login");
                System.exit(0);
            }
            
        }
        System.out.println("\nUsername tidak ditemukan / Password salah");
        
        
    }
    
}
