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
public class ThRazzo1 extends Thread{
    DatiCondivisi ptrDati;
    
    public ThRazzo1(DatiCondivisi ptrDati)
    {
    this.ptrDati=ptrDati;
    
    
    }
    
    @Override
    public void run()
    {
        try {
            
            ptrDati.waitSem2();
            System.out.println("RAZZO 1 PARTITO");
            
            
            Random r = new Random();
            
            int n = r.nextInt(1)+2;
            
            Thread.sleep(n*1000);
            
            
            System.out.println("ROCCIA 1 COLPITA");
            ptrDati.signalSem1();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
}
