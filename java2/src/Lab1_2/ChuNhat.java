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
public class ChuNhat {
	protected int dai,rong;
	public ChuNhat(){
		
	}
	public ChuNhat(int x,int y){
		this.dai = x;
		this.rong = y;
	}
	public int getChuvi(){
		return (dai + rong)*2;
	}
	public int getDientich(){
		return dai*rong;
	}
	public void print(){
		System.out.printf("Chu vi chữ nhật là %d\n",getChuvi());
		System.out.printf("Diện tích chữ nhật là %d\n",getDientich());
	}
}
