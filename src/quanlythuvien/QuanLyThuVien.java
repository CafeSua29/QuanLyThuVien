/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlythuvien;

import view.Home;

/**
 *
 * @author ADMIN
 */
public class QuanLyThuVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
      arr[10] = 11;
    }
        
        
        
        catch (IndexOutOfBoundsException e2) {
      System.out.println("deo du cho");
    }
    
    catch (NumberFormatException e1) {
      System.out.println("cai nay deo catch dc");
    }
    
    
    
    catch (Exception e) {
      System.out.println("cai nay thi dc");
    }
    
    
                
    }
    
}
