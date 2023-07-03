/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Sach;
import model.TaiKhoan;


/**
 *
 * @author ADMIN
 */
public class DAO {
    private Connection conn;
    
    public DAO(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-PH1QOHI\\SQLEXPRESS;databasename=QuanLyThuVien;username=sa;password=quanlythuvien;integratedSecurity=false;trustServerCertificate=true;");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean ThemSach(Sach sach){
        String sql = "INSERT INTO Sach(MaSach, TenSach, TenTacGia, TheLoai, HienTrang, SoLuong, LuotMuon) VALUES(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sach.getMaSach());
            ps.setString(2, sach.getTenSach());
            ps.setString(3, sach.getTenTacGia());
            ps.setString(4, sach.getTheLoai());
            ps.setString(5, sach.getHienTrang());
            ps.setInt(6, sach.getSoLuong());
            ps.setInt(7, 0);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public ArrayList<Sach> getlistSach(){
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM Sach";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach = new Sach();
                sach.setMaSach(rs.getInt("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setTenTacGia(rs.getString("TenTacGia"));
                sach.setTheLoai(rs.getString("TheLoai"));
                sach.setHienTrang(rs.getString("HienTrang"));
                sach.setSoLuong(rs.getInt("SoLuong"));
                
                list.add(sach);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    public boolean SuaSach(Sach sach) {
        String sql = "UPDATE Sach SET TenSach = ?, TenTacGia = ?, TheLoai = ?, HienTrang = ?, SoLuong = ? WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sach.getTenSach());
            ps.setString(2, sach.getTenTacGia());
            ps.setString(3, sach.getTheLoai());
            ps.setString(4, sach.getHienTrang());
            ps.setInt(5, sach.getSoLuong());
            ps.setInt(6, sach.getMaSach());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void XoaSach(int masach) {
        String sql = "DELETE FROM Sach WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, masach); 
            ps.executeUpdate();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Sach> getSelectedSach(Sach sach){
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM Sach where TenSach like ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + sach.getTenSach() + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach1 = new Sach();
                sach1.setMaSach(rs.getInt("MaSach"));
                sach1.setTenSach(rs.getString("TenSach"));
                sach1.setTenTacGia(rs.getString("TenTacGia"));
                sach1.setTheLoai(rs.getString("TheLoai"));
                sach1.setHienTrang(rs.getString("HienTrang"));
                sach1.setSoLuong(rs.getInt("SoLuong"));
                
                list.add(sach1);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<Sach> getlistSachMuon(String user){
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM SachMuon where NguoiMuon = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach = new Sach();
                sach.setMaSach(rs.getInt("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setTenTacGia(rs.getString("TenTacGia"));
                sach.setTheLoai(rs.getString("TheLoai"));
                sach.setHienTrang(rs.getString("HienTrang"));
                
                list.add(sach);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public boolean MuonSach(Sach sach, String user){
        String sql = "INSERT INTO SachMuon(MaSach, TenSach, TenTacGia, TheLoai, HienTrang, NguoiMuon) VALUES(?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sach.getMaSach());
            ps.setString(2, sach.getTenSach());
            ps.setString(3, sach.getTenTacGia());
            ps.setString(4, sach.getTheLoai());
            ps.setString(5, sach.getHienTrang());
            ps.setString(6, user);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean TraSach(Sach sach, String user) {
        String sql = "DELETE FROM SachMuon WHERE MaSach = ? AND NguoiMuon = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, sach.getMaSach());
            ps.setString(2, user);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean ThemTaiKhoanThuThu(TaiKhoan taikhoan){
        String sql = "INSERT INTO TaiKhoanThuThu(TaiKhoan, MatKhau) VALUES(?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ps.setString(2, taikhoan.getMatKhau());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean ThemTaiKhoanSinhVien(TaiKhoan taikhoan){
        String sql = "INSERT INTO TaiKhoanSinhVien(TaiKhoan, MatKhau) VALUES(?, ?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ps.setString(2, taikhoan.getMatKhau());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    public TaiKhoan CheckTaiKhoanThuThu(TaiKhoan taikhoan){
        TaiKhoan taikhoan1 = new TaiKhoan();
        String sql = "SELECT * FROM TaiKhoanThuThu where TaiKhoan = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                taikhoan1.setTaiKhoan(rs.getString("TaiKhoan"));
                taikhoan1.setMatKhau(rs.getString("MatKhau"));              
            }
        } catch(Exception e) {
            e.printStackTrace();
        }               
   
        return taikhoan1;
    }
    
    public TaiKhoan CheckTaiKhoanSinhVien(TaiKhoan taikhoan){
        TaiKhoan taikhoan1 = new TaiKhoan();
        String sql = "SELECT * FROM TaiKhoanSinhVien where TaiKhoan = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getTaiKhoan());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                taikhoan1.setTaiKhoan(rs.getString("TaiKhoan"));
                taikhoan1.setMatKhau(rs.getString("MatKhau"));              
            }
        } catch(Exception e) {
            e.printStackTrace();
        }               
   
        return taikhoan1;
    }
    
    public boolean DoiMatKhau(TaiKhoan taikhoan) {
        String sql = "UPDATE TaiKhoanThuThu SET MatKhau = ? where TaiKhoan = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getMatKhau());
            ps.setString(2, taikhoan.getTaiKhoan());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean DoiMatKhauSV(TaiKhoan taikhoan) {
        String sql = "UPDATE TaiKhoanSinhVien SET MatKhau = ? where TaiKhoan = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan.getMatKhau());
            ps.setString(2, taikhoan.getTaiKhoan());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<TaiKhoan> getSelectedTaiKhoan(TaiKhoan taikhoan){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM TaiKhoanSinhVien where TaiKhoan like ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + taikhoan.getTaiKhoan() + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){    
                TaiKhoan taikhoan1 = new TaiKhoan();
                taikhoan1.setTaiKhoan(rs.getString("TaiKhoan"));
                taikhoan1.setMatKhau(rs.getString("MatKhau"));
               
                list.add(taikhoan1);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void XoaTaiKhoan(String taikhoan) {
        String sql = "DELETE FROM TaiKhoanSinhVien WHERE TaiKhoan = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taikhoan);
            
            ps.executeUpdate();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public int getSoLuongSach(Sach sach){
        int soluong = 0;
        String sql = "SELECT * FROM Sach WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ps.setInt(1, sach.getMaSach());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                soluong = rs.getInt("SoLuong");              
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return soluong;
    }
    
    public boolean setSoLuongSach(Sach sach, int soluong){
        String sql = "UPDATE Sach SET SoLuong = ? WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ps.setInt(1, soluong);
            ps.setInt(2, sach.getMaSach());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<TaiKhoan> getlistTaiKhoan(){
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM TaiKhoanSinhVien";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                TaiKhoan taikhoan = new TaiKhoan();
                taikhoan.setTaiKhoan(rs.getString("TaiKhoan"));
                taikhoan.setMatKhau(rs.getString("MatKhau"));
                
                list.add(taikhoan);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public int getLuotMuon(Sach sach){
        int luotmuon = 0;
        String sql = "SELECT * FROM Sach WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ps.setInt(1, sach.getMaSach());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                luotmuon = rs.getInt("LuotMuon");              
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return luotmuon;
    }
    
    public boolean setLuotMuon(Sach sach, int luotmuon) {
        String sql = "UPDATE Sach SET LuotMuon = ? WHERE MaSach = ?";        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);            
            ps.setInt(1, luotmuon);
            ps.setInt(2, sach.getMaSach());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public int getLuotMuonMax(){
        int luotmuonmax = 0;
        String sql = "SELECT MAX(LuotMuon) AS LuotMuonMax FROM Sach";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                luotmuonmax = rs.getInt("LuotMuonMax");              
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return luotmuonmax;
    }
    
    public int getLuotMuonMin(){
        int luotmuonmin = 0;
        String sql = "SELECT MIN(LuotMuon) AS LuotMuonMin FROM Sach";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);           
            ResultSet rs = ps.executeQuery();
            while (rs.next()){               
                luotmuonmin = rs.getInt("LuotMuonMin");              
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return luotmuonmin;
    }
    
    public ArrayList<Sach> getSachMaxMin(int maxmin){
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM Sach where LuotMuon = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maxmin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach1 = new Sach();
                sach1.setMaSach(rs.getInt("MaSach"));
                sach1.setTenSach(rs.getString("TenSach"));
                sach1.setTenTacGia(rs.getString("TenTacGia"));
                sach1.setTheLoai(rs.getString("TheLoai"));
                sach1.setHienTrang(rs.getString("HienTrang"));
                sach1.setSoLuong(rs.getInt("SoLuong"));
                sach1.setLuotMuon(rs.getInt("LuotMuon"));
                
                list.add(sach1);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void XoaSachMuon(int masach) {
        String sql = "DELETE FROM SachMuon WHERE MaSach = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, masach);  
            ps.executeUpdate();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean XoaAllSach() {
        String sql = "DELETE FROM Sach";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void XoaAllSachMuon() {
        String sql = "DELETE FROM SachMuon";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);    
            ps.executeUpdate();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Sach> getlistSachMuonSelectedUser(Sach sach1, String user){
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "SELECT * FROM SachMuon WHERE TenSach like ? AND NguoiMuon = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + sach1.getTenSach() + "%");
            ps.setString(2, user);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach = new Sach();
                sach.setMaSach(rs.getInt("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setTenTacGia(rs.getString("TenTacGia"));
                sach.setTheLoai(rs.getString("TheLoai"));
                sach.setHienTrang(rs.getString("HienTrang"));
                
                list.add(sach);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public Sach TimSach(int masach){
        Sach sach = new Sach();
        String sql = "SELECT * FROM Sach where MaSach = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, masach);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Sach sach1 = new Sach();
                sach1.setMaSach(rs.getInt("MaSach"));
                sach1.setTenSach(rs.getString("TenSach"));
                sach1.setTenTacGia(rs.getString("TenTacGia"));
                sach1.setTheLoai(rs.getString("TheLoai"));
                sach1.setHienTrang(rs.getString("HienTrang"));
                sach1.setSoLuong(rs.getInt("SoLuong"));
                
                sach = sach1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return sach;
    }
    
}
