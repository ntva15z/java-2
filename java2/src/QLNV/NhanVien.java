/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNV;

import java.io.Serializable;


/**
 *
 * @author HOANG
 */
public class NhanVien implements Serializable {
    String MaNV,TenNV,PhongBan;
    String Ngaysinh;
    boolean GioiTinh;
    double Hesoluong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
        
    }

    public boolean isGioiTinh() {
        
        return GioiTinh;
    }

    public String setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
        if(GioiTinh ==true){
            return "Nam";
        }
        else{
            return "Nữ";
        }
    }

    public double getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(double Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String PhongBan, String Ngaysinh, boolean GioiTinh, double Hesoluong) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.PhongBan = PhongBan;
        this.Ngaysinh = Ngaysinh;
        this.GioiTinh = GioiTinh;
        this.Hesoluong = Hesoluong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", TenNV=" + TenNV + ", PhongBan=" + PhongBan + ", Ngaysinh=" + Ngaysinh + ", GioiTinh=" + GioiTinh + ", Hesoluong=" + Hesoluong + '}';
    }

    
    
}
