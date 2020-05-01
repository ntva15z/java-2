/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_2;

import java.io.Serializable;

/**
 *
 * @author HOANG
 */
public class Staff implements Serializable{
    private String fullname;
    private double salary;
    public Staff(){
        
    }
    public Staff(String fullname,double salary){
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
