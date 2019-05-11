/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrciziothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianni
 */
public class Numeri implements Runnable{
    
    public int numero;

    public Numeri(int numero) {
        this.numero = numero;
    }

    
    @Override
    public void run() {
        print(numero);
    }
    
    /*
    public static synchronized void print(int numero){
        
        
        System.out.println("Numero "+ numero);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Numeri.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Numero "+ numero);
    }
    */
    
    public static synchronized void print(int numero){
        
        System.out.println("Numero "+ numero);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Numeri.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Numero "+ numero);
    }
}
