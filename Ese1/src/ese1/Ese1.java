/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author purita_alessandro
 */
public class Ese1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            Scanner input = new Scanner(System.in);
            DatiCondivisi ptrDati= new DatiCondivisi();
            ThRazzo1 thr1= new ThRazzo1(ptrDati);
            ThRazzo2 thr2= new ThRazzo2(ptrDati);
            ThRoccia1 thr3 = new ThRoccia1(ptrDati);
            ThRoccia2 thr4 = new ThRoccia2(ptrDati);
           char c;
            do{
            System.out.println("Inserire s per far partire il gioco");
             c= input.next().charAt(0);
            
            
            }while(c!='s');
            
            thr1.start();
            thr2.start();
            thr3.start();
            thr4.start();
            
           
            thr1.join();
            thr2.join();
            thr3.join();
            thr4.join();
            System.out.println("ROCCE DISTRUTTE");
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Ese1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
