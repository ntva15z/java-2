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
public class SinhVienBiz extends SinhVienPoly{
	protected float marketing,sales;
	public SinhVienBiz(String hoten, String nganh,float marketing,float sales) {
		super(hoten, nganh);
		this.marketing = marketing;
		this.sales = sales;
	}

	@Override
	public float getDiem() {
		return (2*marketing + sales)/3;
	}
	
}
