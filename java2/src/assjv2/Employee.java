/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assjv2;

import java.io.Serializable;

/**
 *
 * @author HOANG
 */
public class Employee implements Serializable{

    String maNV;
    String ten;
    String tuoi;
    String email;
	int luong;
	
	public Employee(){
		
	}
	public Employee(String maNV,String ten,String tuoi, String email,int luong){
		this.maNV = maNV;
		this.ten = ten;
		this.tuoi = tuoi;
		this.email = email;
		this.luong = luong;
	}
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTuoi() {
		return tuoi;
	}

	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	@Override
    public String toString() {
       return this.maNV + "\t" + this.ten + "\t" + this.tuoi + "\t" + this.email + "\t" + this.luong;
    }
}
