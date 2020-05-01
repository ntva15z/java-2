/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author HOANG
 */
public class main {
	public static void main(String[] args) {
		A o1 = new A(5);
		A o2 = new A(5, 6);
		A o3 = new B(5, 6, 7);
		o1.print();
		o2.print();
		o3.print();
	}
}
