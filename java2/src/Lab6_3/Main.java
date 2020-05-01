/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_3;

/**
 *
 * @author HOANG
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new OddThread());
        t1.start();
        t1.join();
        Thread t2 = new Thread(new EvenThread());
        t2.start();
    }
}
