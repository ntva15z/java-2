/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luufile;

import java.io.Serializable;



/**
 *
 * @author HOANG
 */
public class Product implements Serializable{
    private String maSP ,tenSP;
    private double giaSP;
    public Product(){
        
    }
    public Product(String maSP,String tenSP,double giaSP){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    @Override
    public String toString(){
        return("MaSP: "+ this.maSP + " TenSP: " +this.tenSP + " GiaSP: " + this.giaSP);
        
    }
}
