/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.DAO;
import controller.Function;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;
import java.awt.Toolkit;
import java.awt.Image;

/**
 *
 * @author ADMIN
 */
public class TraSach extends javax.swing.JDialog {

    /**
     * Creates new form TimSach
     */
    
    private HomeSV homesv;
    private ArrayList<Sach> list;
    private int index;
    private DefaultTableModel model;
    private String User;
    
    public TraSach(java.awt.Frame parent, boolean modal, String user) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        User = user;
        homesv = (HomeSV) parent;
        model = (DefaultTableModel) listSelectedSach.getModel();
        this.setTitle("Trả Sách");
        list = new DAO().getlistSachMuon(User);
        showTable();
        Image iconImage = Toolkit.getDefaultToolkit().getImage("" + "C:\\Users\\Del\\Documents\\NetBeansProjects\\QuanLyThuVien-master\\src\\view\\logohuce.jpg");
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

        TraSach = new javax.swing.JLabel();
        txtTimSachTheoTen = new javax.swing.JTextField();
        btnTimSachTheoTen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSelectedSach = new javax.swing.JTable();
        btnTraSach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TraSach.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TraSach.setForeground(new java.awt.Color(255, 255, 255));
        TraSach.setText("TRẢ SÁCH");
        TraSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TraSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 60));

        txtTimSachTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSachTheoTenActionPerformed(evt);
            }
        });
        getContentPane().add(txtTimSachTheoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 370, 30));

        btnTimSachTheoTen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimSachTheoTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search_find_magnifier_zoom_glass_icon_196483.png"))); // NOI18N
        btnTimSachTheoTen.setText("Tìm");
        btnTimSachTheoTen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimSachTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSachTheoTenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimSachTheoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, 31));

        listSelectedSach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSelectedSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Tên Tác Giả", "Thể Loại", "Hiện Trạng", "Trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listSelectedSach);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 540, 200));

        btnTraSach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/b.png"))); // NOI18N
        btnTraSach.setText("Trả");
        btnTraSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTraSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraSachActionPerformed(evt);
            }
        });
        getContentPane().add(btnTraSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 70, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 680, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimSachTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSachTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimSachTheoTenActionPerformed

    private void btnTimSachTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSachTheoTenActionPerformed
        String TenSach = ""; 
   
        TenSach = new Function().xoacach(txtTimSachTheoTen.getText().toCharArray());
        TenSach = new Function().xoacachsau(TenSach.toCharArray());
        TenSach = new Function().inhoachudau(TenSach.toCharArray());
        
        Sach sach = new Sach(TenSach);
              
        getSelectedSach(sach, User);  
    }//GEN-LAST:event_btnTimSachTheoTenActionPerformed

    private void btnTraSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraSachActionPerformed
        index = listSelectedSach.getSelectedRow();
        int check = list.size();
        if(check == 0){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa mượn sách nào !");
        } else if (index < 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn sách để trả !");
        } else {
            for (int i = 0; i < listSelectedSach.getRowCount(); i++) {
            Boolean chek = Boolean.valueOf(listSelectedSach.getValueAt(i, 5).toString());
            if (chek){
                int masach = Integer.parseInt(listSelectedSach.getValueAt(i, 0).toString());
                Sach sach = new Sach(masach);
                if(new DAO().TraSach(sach, User)){
                    int soluong = 0;
                    soluong = new DAO().getSoLuongSach(sach) + 1;
                
                    if(new DAO().setSoLuongSach(sach, soluong)){
                    
                }
            }                                
            }                      
        } 
            list = new DAO().getlistSachMuon(User);
            JOptionPane.showMessageDialog(rootPane, "Trả thành công !");
            showTable();
            homesv.showTable();
        }       
    }//GEN-LAST:event_btnTraSachActionPerformed

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
            java.util.logging.Logger.getLogger(TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TraSach;
    private javax.swing.JButton btnTimSachTheoTen;
    private javax.swing.JButton btnTraSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listSelectedSach;
    private javax.swing.JTextField txtTimSachTheoTen;
    // End of variables declaration//GEN-END:variables

    public void getSelectedSach(Sach sach, String user) {
        list = new DAO().getlistSachMuonSelectedUser(sach, user);
        model.setRowCount(0);
        for (Sach sach1 : list){
            model.addRow(new Object[]{
            sach1.getMaSach(), sach1.getTenSach(), sach1.getTenTacGia(), sach1.getTheLoai(), sach1.getHienTrang(), false
        });
        }    
    }
    
    public void showTable(){
        model.setRowCount(0);
        for (Sach sach : list){
            model.addRow(new Object[]{
            sach.getMaSach(), sach.getTenSach(), sach.getTenTacGia(), sach.getTheLoai(), sach.getHienTrang(), false
        });
        }      
    }
}
