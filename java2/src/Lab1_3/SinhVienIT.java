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
public class SinhVienIT extends SinhVienPoly{
	protected float java,html,css;
	public SinhVienIT(String hoten,String nganh, float java,float html,float css){
		super(hoten,nganh);
		this.java = java;
		this.html = html;
		this.css = css;
		
	}
	@Override
	public float getDiem(){
		return (2*java +html+ css)/4;
	}
	
}
