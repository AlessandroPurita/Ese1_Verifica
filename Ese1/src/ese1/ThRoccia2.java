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
public class ThRoccia2 extends Thread {
    DatiCondivisi ptrDati;

    public ThRoccia2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    @Override
    public void run()
    {
        try {
            ptrDati.waitSem3();//rimetto a zero il semaforo
            
            System.out.println("INIZIO DISINTEGRAZIONE ROCCIA 2");//la roccia inizia a disintegrarsi
            
            Random r = new Random();
            
            int n = r.nextInt(1)+2;
            
            Thread.sleep(n*1000);// generazione random tempo di attesa
            
            System.out.println("FINE DISINTEGRAZIONE ROCCIA 2");//la roccia finisce a disintegrarsi
            
            ptrDati.signalSem4();// ritorno al thread razzo per rimettere il semaforo a zero
            
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRoccia1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
}
