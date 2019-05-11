/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrciziothread;

/**
 *
 * @author Gianni
 */
public class EsrcizioThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //primo modo di instanziare
        /*
        Thread n1 = new Thread (new Numeri(1));
        Thread n2 = new Thread (new Numeri(2));
        Thread n3 = new Thread (new Numeri(3));
        Thread n4 = new Thread (new Numeri(4));
        Thread n5 = new Thread (new Numeri(5));
        
        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
        */        

        //secondo modo per instanziare
        for (int i = 0 ; i < 10; i++)
        new Thread(new Numeri (i)).start();
        
        
        
    }
    
}
