/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_4;

/**
 *
 * @author HOANG
 */
public class Student {
	public String name;
	public float point;
	public Student(){
		
	}
	public Student(String name,float point){
		this.name = name;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}
	public String getHocLuc(){
		String hocluc = "";
		if(this.point<3){
			hocluc = "Yếu";
		}else if(this.point<=5){
		hocluc = "Trung bình";
		}else if(this.point<=7.5){
			hocluc = "Khá";
		}else{
			hocluc = "Giỏi";
		}
		return hocluc;
	}
	public boolean getPhanthuong(){
		if(this.point>=7.5){
			return true;
		}
		return false;
	}
}
