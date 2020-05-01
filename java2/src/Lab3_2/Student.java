/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_2;

/**
 *
 * @author HOANG
 */
public class Student {
	public String name,major;
	public double marks;
	
	
	public Student(){

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
		if(marks <3){
			return "kém";
		}else if(marks<5){
			return "TB";
		}else if(marks<7.5){
			return "Khá";
		}else if(marks<9){
			return "Giỏi";
		}
		return "Xuất Sắc";
	}
	public boolean isBonus(){
		if(marks >=7.5){
			return true;
		}
		return false;
	}
}


