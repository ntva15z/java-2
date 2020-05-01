/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_2;

/**
 *
 * @author HOANG
 */
public class Vuong extends ChuNhat{
	public Vuong(int x){
		super(x,x);
	}
	@Override
	public void print(){
		System.out.printf("Chu vi vuông là %d\n",getChuvi());
		System.out.printf("Diện tích vuông là %d\n",getDientich());
	}
}
