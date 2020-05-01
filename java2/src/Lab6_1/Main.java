/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_1;

/**
 *
 * @author HOANG
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
        Thread t2 = new Thread(new MyThread());
        t2.start();
        
    }
}
