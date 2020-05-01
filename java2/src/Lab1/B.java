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
public class B extends A{
	protected int z;
	public B(int x,int y,int z){
		super(x,y);
		this.z = z;
	}
	@Override
	public void print(){
		System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
	}
}
