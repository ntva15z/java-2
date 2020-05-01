/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_3;

/**
 *
 * @author HOANG
 */
public abstract class SinhVienPoly {
	protected String hoten;
	protected String nganh;
	public SinhVienPoly(String hoten,String nganh){
		this.hoten = hoten;
		this.nganh = nganh;
	}
	public abstract float getDiem();
	public String getHocluc(){
		if(getDiem()<5){
			return "Yếu";
		}
		else if(getDiem()<6.5){
			return "Trung bình";
		}
		else if(getDiem()<7.5){
			return "Khá";
		}
		else if(getDiem()<9){
			return "Giỏi";
		}
		else {
			return "Xuất sắc";
		}
			
	}
	public void print(){
		System.out.println("Họ tên:" +this.hoten);
		System.out.println("Ngành:" +this.nganh);
		System.out.println("Điểm:" +this.getDiem());
		System.out.println("Học lực:" + this.getHocluc());
	}
}
