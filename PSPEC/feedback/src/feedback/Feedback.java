/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;

import java.util.Scanner;

/**
 *
 * @author Yoan Nur Amalia
 */
public class Feedback {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner feedback = new Scanner(System.in);
        System.out.println("isi rating(1-5): ");
        feedback.nextLine();
        Scanner deskripsi = new Scanner(System.in);
        System.out.println("isi deskripsi: ");
        deskripsi.nextLine();
        System.out.println("terima kasih atas feedbacknya");
        
        
    }
    
}
