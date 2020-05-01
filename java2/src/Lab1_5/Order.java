/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_5;

/**
 *
 * @author HOANG
 */
public class Order implements DBAction {

	@Override
	public void insert() {
		System.out.println("Insert Order");
	}

	@Override
	public void update() {
		System.out.println("update Order");
	}

	@Override
	public void delete() {
		System.out.println("delete Order");
	}

	@Override
	public void select() {
		System.out.println("select Order");
	}
		 
	
}
