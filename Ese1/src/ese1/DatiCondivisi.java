/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author purita_alessandro
 */
public class DatiCondivisi {
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    
    public DatiCondivisi()
    {
    this.sem1 = new Semaphore(0);
    this.sem2 = new Semaphore(1);
    this.sem3= new Semaphore(0);
    this.sem4=new Semaphore(1);
    
    
    }
    public void waitSem1()
    {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem2()
    {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem3()
    {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem4()
    {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void signalSem1()
    {
    
    sem1.release();
    
    }
    public void signalSem2()
    {
    
    sem2.release();
    }
    public void signalSem3()
    {
    
    sem3.release();
    }
    public void signalSem4()
    {
    
    sem4.release();
    }
}
