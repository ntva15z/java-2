/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_1;

import java.io.Serializable;

/**
 *
 * @author HOANG
 */
public class Student implements Serializable{
    private String name, major;
    private double marks;
    public Student(){
        
    }
    public Student(String name, double marks, String major){
        this.name =name;
        this.marks = marks;
        this.major= major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String getGrade(){
        if(this.marks<3){
            return "kem";
        }
        if(this.marks<5){
            return "yeu";
        }
        if(this.marks<6.5){
            return "trung binh";
        }
        if(this.marks<7.5){
            return "kha";
        }
        if(this.marks<9){
            return "gioi";
        }
        return "xuat sac";
    }
    public boolean isBonus(){
        return this.marks>=7.5;
    }
}
