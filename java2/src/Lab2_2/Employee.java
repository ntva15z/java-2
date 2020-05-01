/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_2;

/**
 *
 * @author HOANG
 */
public abstract  class Employee {
	private String fullname;
	public Employee(String fullname){
		this.fullname = fullname;
	}
	public abstract float getSalary();
	public void print(){
		System.out.println("Fullname:" + this.fullname);
		System.out.println("Salary:" +this.getSalary());
	}
}
