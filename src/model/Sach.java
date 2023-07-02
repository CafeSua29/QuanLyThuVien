/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Sach {
    private int MaSach;
    private String TenSach;
    private String TheLoai;
    private String TenTacGia;
    private String HienTrang;
    private int SoLuong;
    private int LuotMuon;
  
    public Sach(){
        LuotMuon = 0;
    }
    
    public Sach(int maSach){
        MaSach = maSach;
        LuotMuon = 0;
    }

    public Sach(String tenSach){
        TenSach = tenSach;
        LuotMuon = 0;
    }

    public Sach(int maSach, String tenSach, String theLoai, String tenTacGia, String hienTrang, int soLuong) {
        MaSach = maSach;
        TenSach = tenSach;
        TheLoai = theLoai;
        TenTacGia = tenTacGia;
        HienTrang = hienTrang;
        SoLuong = soLuong;
        LuotMuon = 0;
    }
    
    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int maSach) {
        MaSach = maSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public String getHienTrang() {
        return HienTrang;
    }

    public void setHienTrang(String hienTrang) {       
        HienTrang = hienTrang;    
    }
    
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    public int getLuotMuon() {
        return LuotMuon;
    }

    public void setLuotMuon(int LuotMuon) {
        this.LuotMuon = LuotMuon;
    }
    
}
