/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANG
 */
public class EvenThread extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            try {
                if(i %2==0){
                    System.out.println("So chan: " + i);
                 }
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
