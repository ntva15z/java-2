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
public class EmployeeManager {
	public static void main(String[] args) {
	Employee e1 = new Employee("Hoàng"){
		@Override
		public float getSalary() {
			return 700000;
		}
	};
	Employee e2 = new Employee("Quân") {
		@Override
		public float getSalary() {
			return 500000;
		}
	};
	e1.print();
	e2.print();
	}
	
		
}
