/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String TaiKhoan;
    private String MatKhau;
    
    public TaiKhoan(){
        
    }
    
    public TaiKhoan(String TaiKhoan){
        this.TaiKhoan = TaiKhoan;
    }
    
    public TaiKhoan(String TaiKhoan, String MatKhau){
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }
    
    public String getTaiKhoan() {
        if(TaiKhoan == null){
            return "";
        }
        
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
