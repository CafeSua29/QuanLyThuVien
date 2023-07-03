/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.DAO;
import controller.Function;
import javax.swing.JOptionPane;
import model.Sach;
import java.awt.Toolkit;
import java.awt.Image;

/**
 *
 * @author ADMIN
 */
public class SuaSach extends javax.swing.JDialog {

    /**
     * Creates new form ThemSach
     */
    
    private Home home;
    
    public SuaSach(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (Home) parent;
        this.setTitle("Sửa Sách");
        Image iconImage = Toolkit.getDefaultToolkit().getImage("" + "C:\\DoAn\\QuanLyThuVien-master\\src\\view\\logohuce.jpg");
        setIconImage(iconImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MaSach = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        TenSach = new javax.swing.JLabel();
        txtTenTacGia = new javax.swing.JTextField();
        TenTacGia = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        TheLoai = new javax.swing.JLabel();
        txtHienTrang = new javax.swing.JTextField();
        HienTrang = new javax.swing.JLabel();
        btnXong = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        SoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN CẦN SỬA");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 60));

        MaSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MaSach.setForeground(new java.awt.Color(255, 255, 255));
        MaSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/code.png"))); // NOI18N
        MaSach.setText("Mã Sách");
        MaSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(MaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 40));
        getContentPane().add(txtMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, 40));
        getContentPane().add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 200, 40));

        TenSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TenSach.setForeground(new java.awt.Color(255, 255, 255));
        TenSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/b.png"))); // NOI18N
        TenSach.setText("Tên Sách");
        TenSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 150, 40));
        getContentPane().add(txtTenTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, 40));

        TenTacGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TenTacGia.setForeground(new java.awt.Color(255, 255, 255));
        TenTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/nahnvien.png"))); // NOI18N
        TenTacGia.setText("Tên Tác Giả");
        TenTacGia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TenTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 40));
        getContentPane().add(txtTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 200, 40));

        TheLoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TheLoai.setForeground(new java.awt.Color(255, 255, 255));
        TheLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/type.png"))); // NOI18N
        TheLoai.setText("Thể Loại");
        TheLoai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 40));
        getContentPane().add(txtHienTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 40));

        HienTrang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HienTrang.setForeground(new java.awt.Color(255, 255, 255));
        HienTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/status.png"))); // NOI18N
        HienTrang.setText("Hiện Trạng");
        HienTrang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(HienTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 40));

        btnXong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXong.setText("Hủy");
        btnXong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXongActionPerformed(evt);
            }
        });
        getContentPane().add(btnXong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 100, 40));

        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 100, 40));

        SoLuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SoLuong.setForeground(new java.awt.Color(255, 255, 255));
        SoLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/count.jpg"))); // NOI18N
        SoLuong.setText("Số Lượng");
        SoLuong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, 40));
        getContentPane().add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 560, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int MaSach = 0;
        String TenSach = "";
        String TenTacGia = "";
        String TheLoai = "";
        String HienTrang = "";
        int SoLuong = 0;
        boolean isOK = true;
        
        isOK = checknull();
        
        try {
            MaSach = Integer.parseInt(txtMaSach.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Mã sách chỉ được chứa ký tự số !");
            isOK = false;
        }
        
        try {
            MaSach = Integer.parseInt(txtMaSach.getText());
            if(MaSach < 0){
                JOptionPane.showMessageDialog(rootPane, "Mã sách không hợp lệ !");
                isOK = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Mã sách không hợp lệ !");
            isOK = false;
        }
        
        TenSach = new Function().xoacach(txtTenSach.getText().toCharArray());
        TenSach = new Function().xoacachsau(TenSach.toCharArray());
        TenSach = new Function().inhoachudau(TenSach.toCharArray());
        
        TenTacGia = new Function().xoacach(txtTenTacGia.getText().toCharArray()); 
        TenTacGia = new Function().xoacachsau(TenTacGia.toCharArray());
        TenTacGia = new Function().inhoachudau(TenTacGia.toCharArray()); 
        
        TheLoai = new Function().xoacach(txtTheLoai.getText().toCharArray()); 
        TheLoai = new Function().xoacachsau(TheLoai.toCharArray());
        TheLoai = new Function().inhoachudau(TheLoai.toCharArray()); 
        
        HienTrang = new Function().xoacach(txtHienTrang.getText().toCharArray()); 
        HienTrang = new Function().xoacachsau(HienTrang.toCharArray());
        HienTrang = new Function().inhoachudau(HienTrang.toCharArray()); 
        
        try {
            SoLuong = Integer.parseInt(txtSoLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng chỉ được chứa ký tự số !");
            isOK = false;
        }
        
        try {
            SoLuong = Integer.parseInt(txtSoLuong.getText());
            if(SoLuong < 0){
                JOptionPane.showMessageDialog(rootPane, "Số lượng không hợp lệ !");
                isOK = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng không hợp lệ !");
            isOK = false;
        }
                
        if(isOK){
            Sach sach = new Sach(MaSach, TenSach, TheLoai, TenTacGia, HienTrang, SoLuong);
            if(new DAO().SuaSach(sach)){
                home.SuaSach(sach);
                
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
                
                this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Mã sách không được trùng !");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

       
    private void btnXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnXongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaSach dialog = new SuaSach(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HienTrang;
    private javax.swing.JLabel MaSach;
    private javax.swing.JLabel SoLuong;
    private javax.swing.JLabel TenSach;
    private javax.swing.JLabel TenTacGia;
    private javax.swing.JLabel TheLoai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtHienTrang;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTenTacGia;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables

    public void setEditData(Sach sach) {
        txtMaSach.setText(sach.getMaSach() + "");
        txtMaSach.setEditable(false);
        txtTenSach.setText(sach.getTenSach());
        txtTenTacGia.setText(sach.getTenTacGia());
        txtTheLoai.setText(sach.getTheLoai());
        txtHienTrang.setText(sach.getHienTrang());
        txtSoLuong.setText(sach.getSoLuong() + "");
    }

    private boolean checknull() {
        if(txtMaSach.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Mã sách không được để trống !");
            return false;
        }
        
        if(txtTenSach.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tên sách không được để trống !");
            return false;
        }
        
        if(txtTenTacGia.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Tên tác giả không được để trống !");
            return false;
        }
        
        if(txtTheLoai.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Thể loại không được để trống !");
            return false;
        }
        
        if(txtHienTrang.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Hiện trạng không được để trống !");
            return false;
        }
        
        if(txtSoLuong.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Số lượng không được để trống !");
            return false;
        }
        
        return true;
    }
}
