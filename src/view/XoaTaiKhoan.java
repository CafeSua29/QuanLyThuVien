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
import model.TaiKhoan;
import java.awt.Toolkit;
import java.awt.Image;
import model.Sach;

/**
 *
 * @author ADMIN
 */
public class XoaTaiKhoan extends javax.swing.JDialog {

    /**
     * Creates new form TimSach
     */
    
    private Home home;
    private ArrayList<TaiKhoan> list;
    private ArrayList<Sach> list2;
    private int index;
    private DefaultTableModel model;
    
    public XoaTaiKhoan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (Home) parent;
        model = (DefaultTableModel) listSelectedTaiKhoan.getModel();
        this.setTitle("Xóa Tài Khoản");
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

        TimTaiKhoanTheoTen = new javax.swing.JLabel();
        txtTimTaiKhoanTheoTen = new javax.swing.JTextField();
        btnTimTaiKhoanTheoTen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSelectedTaiKhoan = new javax.swing.JTable();
        btnXoaTaiKhoan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TimTaiKhoanTheoTen.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TimTaiKhoanTheoTen.setForeground(new java.awt.Color(255, 255, 255));
        TimTaiKhoanTheoTen.setText("TÀI KHOẢN CẦN XÓA");
        TimTaiKhoanTheoTen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TimTaiKhoanTheoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 65));

        txtTimTaiKhoanTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimTaiKhoanTheoTenActionPerformed(evt);
            }
        });
        getContentPane().add(txtTimTaiKhoanTheoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 112, 390, 30));

        btnTimTaiKhoanTheoTen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTimTaiKhoanTheoTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search_find_magnifier_zoom_glass_icon_196483.png"))); // NOI18N
        btnTimTaiKhoanTheoTen.setText("Tìm");
        btnTimTaiKhoanTheoTen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTimTaiKhoanTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTaiKhoanTheoTenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimTaiKhoanTheoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 80, 31));

        listSelectedTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        listSelectedTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài Khoản", "Mật Khẩu", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listSelectedTaiKhoan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 575, 200));

        btnXoaTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/xoataikhoan24.png"))); // NOI18N
        btnXoaTaiKhoan.setText("Xóa");
        btnXoaTaiKhoan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTaiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoaTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/a1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 710, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimTaiKhoanTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimTaiKhoanTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimTaiKhoanTheoTenActionPerformed

    private void btnTimTaiKhoanTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTaiKhoanTheoTenActionPerformed
        String user = "";

        user = new Function().xoacach(txtTimTaiKhoanTheoTen.getText().toCharArray());
        user = new Function().xoacachsau(user.toCharArray());
        
        TaiKhoan taikhoan = new TaiKhoan(user);
              
        getSelectedTaiKhoan(taikhoan);                                       
    }//GEN-LAST:event_btnTimTaiKhoanTheoTenActionPerformed

    private void btnXoaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTaiKhoanActionPerformed
        index = listSelectedTaiKhoan.getSelectedRow();
        boolean chek2 = true;
        int check = list.size();
        if(check == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có tài khoản để xóa !");
        } else if (index < 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn tài khoản để xóa !");
        } else {
            Object[] options = { "Yes", "No" };
        int n = JOptionPane.showOptionDialog(null, "Bạn có muốn xóa dữ liệu này không?", "Confirm to Delete?",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == 0){
            for (int i = 0; i < listSelectedTaiKhoan.getRowCount(); i++) {
            Boolean chek = Boolean.valueOf(listSelectedTaiKhoan.getValueAt(i, 2).toString());
            if (chek){
                String user = listSelectedTaiKhoan.getValueAt(i, 0).toString();
                list2 = new DAO().getlistSachMuon(user);
                for(int j=0; j<list2.size(); j++){
                    chek2 = true;
                    if(list2.get(j).getTenSach() != null){
                        JOptionPane.showMessageDialog(rootPane, "Tài khoản chưa trả hết sách !");
                        chek2 = false;
                        break;
                    }
                } 
                
                if(chek2){
                    new DAO().XoaTaiKhoan(listSelectedTaiKhoan.getValueAt(i, 0).toString()); 
                }                                             
            }
        }     
        }
        showTable();
        }            
    }//GEN-LAST:event_btnXoaTaiKhoanActionPerformed

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
            java.util.logging.Logger.getLogger(XoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                XoaTaiKhoan dialog = new XoaTaiKhoan(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel TimTaiKhoanTheoTen;
    private javax.swing.JButton btnTimTaiKhoanTheoTen;
    private javax.swing.JButton btnXoaTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listSelectedTaiKhoan;
    private javax.swing.JTextField txtTimTaiKhoanTheoTen;
    // End of variables declaration//GEN-END:variables

    public void getSelectedTaiKhoan(TaiKhoan taikhoan) {
        list = new DAO().getSelectedTaiKhoan(taikhoan);
        model.setRowCount(0);
        for (TaiKhoan taikhoan1 : list){
            model.addRow(new Object[]{
            taikhoan1.getTaiKhoan(), taikhoan1.getMatKhau(), false
        }); 
        }
    }
    
    public void showTable(){
        list = new DAO().getlistTaiKhoan();
        model.setRowCount(0);
        for (TaiKhoan taikhoan : list){
            model.addRow(new Object[]{
            taikhoan.getTaiKhoan(), taikhoan.getMatKhau(), false
        });
        }      
    }
}