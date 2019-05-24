/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author purita_alessandro
 */
public class ThRazzo2 extends Thread{
    DatiCondivisi ptrDati;

    public ThRazzo2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    @Override
    public void run()
    {
    
      
        try {
            ptrDati.waitSem4();
            System.out.println("RAZZO 2 PARTITO");
            
            
            Random r = new Random();
            
            int n = r.nextInt(1)+2;
            
            Thread.sleep(n*1000);
            
            System.out.println("ROCCIA 2 COLPITA");
            ptrDati.signalSem3();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
}
