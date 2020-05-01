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
public class Product implements DBAction{

	@Override
	public void insert() {
		System.out.println("insert product");
	}

	@Override
	public void update() {
		System.out.println("update product");
	}

	@Override
	public void delete() {
		System.out.println("delete product");
	}

	@Override
	public void select() {
		System.out.println("select product");
	}
	
}
