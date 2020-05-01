/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_4;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author HOANG
 */
public class ThreadXoSo implements Runnable {
    private JLabel jLabel;
    public ThreadXoSo(JLabel jLabel){
        this.jLabel = jLabel;
    }

    @Override
    public void run() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    try {
                    int ran = (int)(Math.random()*10);
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                } 
            }
        });
        t1.start();
    }
    
}
