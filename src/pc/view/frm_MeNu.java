/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pc.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pc.controler.NhanVienControl;
import pc.model.NhanVienModel;

/**
 *
 * @author Administrator
 */
public class frm_MeNu extends javax.swing.JFrame {
    
    private String userName;

    /**
     * Creates new form frm_MeNu
     */
    public frm_MeNu() {
        initComponents();
        //hienThiThongTinTaiKhoan();
        LoadThongTinTaiKhoan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelQuanLi = new javax.swing.JPanel();
        btnQuanLyBanHang = new javax.swing.JButton();
        btnQuanLyNhanSu = new javax.swing.JButton();
        btnQuanLyXuatNhapHang = new javax.swing.JButton();
        btnQuanLyThuChi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelThongTinCaNhan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemDangXuat = new javax.swing.JMenuItem();
        jMenuItemThoát = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemDoiMatKhau = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQuanLyBanHang.setIcon(new javax.swing.ImageIcon("D:\\javaprojectthu\\CUOIKIJAVANANGCAO_QUANLYBANHANG\\src\\image\\gio_hang.jpg")); // NOI18N
        btnQuanLyBanHang.setToolTipText("");
        btnQuanLyBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyBanHangActionPerformed(evt);
            }
        });

        btnQuanLyNhanSu.setIcon(new javax.swing.ImageIcon("D:\\javaprojectthu\\CUOIKIJAVANANGCAO_QUANLYBANHANG\\src\\image\\nguoidung.jpg")); // NOI18N
        btnQuanLyNhanSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanSuActionPerformed(evt);
            }
        });

        btnQuanLyXuatNhapHang.setIcon(new javax.swing.ImageIcon("D:\\javaprojectthu\\CUOIKIJAVANANGCAO_QUANLYBANHANG\\src\\image\\xnHang.jpg")); // NOI18N
        btnQuanLyXuatNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyXuatNhapHangActionPerformed(evt);
            }
        });

        btnQuanLyThuChi.setIcon(new javax.swing.ImageIcon("D:\\javaprojectthu\\CUOIKIJAVANANGCAO_QUANLYBANHANG\\src\\image\\thuchi.jpg")); // NOI18N
        btnQuanLyThuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyThuChiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Quản lý bán hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Quản lý nhân sự");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Quản lý xuất nhập hàng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Quản lý thu chi");

        javax.swing.GroupLayout jPanelQuanLiLayout = new javax.swing.GroupLayout(jPanelQuanLi);
        jPanelQuanLi.setLayout(jPanelQuanLiLayout);
        jPanelQuanLiLayout.setHorizontalGroup(
            jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLiLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyBanHang)
                    .addComponent(btnQuanLyXuatNhapHang))
                .addGap(153, 153, 153)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuanLyThuChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanelQuanLiLayout.createSequentialGroup()
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelQuanLiLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanelQuanLiLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(139, 139, 139))
        );
        jPanelQuanLiLayout.setVerticalGroup(
            jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuanLiLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuanLyBanHang)
                    .addComponent(btnQuanLyNhanSu))
                .addGap(18, 18, 18)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(71, 71, 71)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuanLyThuChi)
                    .addComponent(btnQuanLyXuatNhapHang))
                .addGap(18, 18, 18)
                .addGroup(jPanelQuanLiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lí", jPanelQuanLi);

        jLabel5.setText("Tên nhân viên");

        jLabel6.setText("Số điện thoại");

        jLabel7.setText("Địa chỉ");

        jLabel8.setText("Mã nhân viên");

        jLabel9.setText("Ngày sinh");

        txtMaNhanVien.setEditable(false);

        jButton1.setText("Cập Nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Chức vụ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelThongTinCaNhanLayout = new javax.swing.GroupLayout(jPanelThongTinCaNhan);
        jPanelThongTinCaNhan.setLayout(jPanelThongTinCaNhanLayout);
        jPanelThongTinCaNhanLayout.setHorizontalGroup(
            jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelThongTinCaNhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                        .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(57, 57, 57)
                        .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(65, 65, 65)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtChucVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
            .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelThongTinCaNhanLayout.setVerticalGroup(
            jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThongTinCaNhanLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(jPanelThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thông tin cá nhân", jPanelThongTinCaNhan);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 660));

        jMenuFile.setText("File");
        jMenuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFileActionPerformed(evt);
            }
        });

        jMenuItemDangXuat.setText("Đăng xuất");
        jMenuItemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDangXuatActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemDangXuat);

        jMenuItemThoát.setText("Thoát");
        jMenuItemThoát.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThoátActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemThoát);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEditActionPerformed(evt);
            }
        });

        jMenuItemDoiMatKhau.setText("Đổi mật khẩu");
        jMenuItemDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoiMatKhauActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemDoiMatKhau);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFileActionPerformed
        // TODO add your handling code here:
        frm_DangNhap formDangNhap = new frm_DangNhap();
        formDangNhap.setVisible(true);
    }//GEN-LAST:event_jMenuFileActionPerformed

    private void jMenuEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEditActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuEditActionPerformed

    private void jMenuItemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDangXuatActionPerformed
        // TODO add your handling code here:
        frm_DangNhap formDangNhap = new frm_DangNhap();
        formDangNhap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemDangXuatActionPerformed

    private void jMenuItemThoátActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThoátActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemThoátActionPerformed

    private void jMenuItemDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoiMatKhauActionPerformed
        // TODO add your handling code here:
        frm_DoiMatKhau formDoiMatKhau = new frm_DoiMatKhau();
        formDoiMatKhau.setVisible(true);
        formDoiMatKhau.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItemDoiMatKhauActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        updateThongTinTaiKhoan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuanLyXuatNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyXuatNhapHangActionPerformed
        // TODO add your handling code here:
        frm_XuatNhapHang formXuatNhapHang = new frm_XuatNhapHang();
        formXuatNhapHang.setVisible(true);
        formXuatNhapHang.setLocationRelativeTo(null);
        setVisible(false);
        //this.setVisible(false);
    }//GEN-LAST:event_btnQuanLyXuatNhapHangActionPerformed

    private void btnQuanLyBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyBanHangActionPerformed
        // TODO add your handling code here:
        frm_BanHang formBanHang = new frm_BanHang();
        formBanHang.setVisible(true);
        formBanHang.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btnQuanLyBanHangActionPerformed

    private void btnQuanLyNhanSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanSuActionPerformed
        // TODO add your handling code here:
        frm_NhanSu formNhanSu = new frm_NhanSu();
        formNhanSu.setVisible(true);
        formNhanSu.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btnQuanLyNhanSuActionPerformed

    private void btnQuanLyThuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyThuChiActionPerformed
        // TODO add your handling code here:
        frm_ThuChi formThuChi = new frm_ThuChi();
        formThuChi.setVisible(true);
        formThuChi.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_btnQuanLyThuChiActionPerformed

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
            java.util.logging.Logger.getLogger(frm_MeNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_MeNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_MeNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_MeNu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frm_MeNu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLyBanHang;
    private javax.swing.JButton btnQuanLyNhanSu;
    private javax.swing.JButton btnQuanLyThuChi;
    private javax.swing.JButton btnQuanLyXuatNhapHang;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemDangXuat;
    private javax.swing.JMenuItem jMenuItemDoiMatKhau;
    private javax.swing.JMenuItem jMenuItemThoát;
    private javax.swing.JPanel jPanelQuanLi;
    private javax.swing.JPanel jPanelThongTinCaNhan;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
    public void hienThiThongTinTaiKhoan() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            FileReader fr = new FileReader("luuTaiKhoan.txt");
            BufferedReader br = new BufferedReader(fr);
            userName = br.readLine();
            br.close();
            NhanVienControl controller = new NhanVienControl();
            ArrayList<NhanVienModel> model = controller.layThongTinTaiKhoan(userName);
            NhanVienModel nv = model.get(0);
            txtMaNhanVien.setText(nv.getMaNhanVien());
            txtTenNhanVien.setText(nv.getTenNhanVien());
            txtNgaySinh.setText(dateFormat.format(nv.getNgaySinh()));
            txtDiaChi.setText(nv.getDiaChi());
            txtSoDienThoai.setText(nv.getSoDienThoai());
            txtChucVu.setText(nv.getChucVu());
        } catch (Exception e) {
        }

        // Set other text fields with employee details
    }
    
    public void LoadThongTinTaiKhoan() {
        DefaultTableModel model = new DefaultTableModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        model.addColumn("Mã nhân viên");
        model.addColumn("Tên nhân viên");
        model.addColumn("Ngày sinh");
        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Chức vụ");
        try {
            FileReader fr = new FileReader("luuTaiKhoan.txt");
            BufferedReader br = new BufferedReader(fr);
            userName = br.readLine();
            br.close();
            NhanVienControl controller = new NhanVienControl();
            ArrayList<NhanVienModel> nd = controller.layThongTinTaiKhoan(userName);
            NhanVienModel nv = nd.get(0);
            txtMaNhanVien.setText(nv.getMaNhanVien());
            txtTenNhanVien.setText(nv.getTenNhanVien());
            txtNgaySinh.setText(dateFormat.format(nv.getNgaySinh()));
            txtDiaChi.setText(nv.getDiaChi());
            txtSoDienThoai.setText(nv.getSoDienThoai());
            txtChucVu.setText(nv.getChucVu());
            Object[] row = {
                nv.getMaNhanVien(),
                nv.getTenNhanVien(),
                dateFormat.format(nv.getNgaySinh()),
                nv.getDiaChi(),
                nv.getSoDienThoai(),
                nv.getChucVu()
            };
            model.addRow(row);
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    
    public void updateThongTinTaiKhoan() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            NhanVienModel nv = new NhanVienModel();
            nv.setTenNhanVien(txtTenNhanVien.getText());
            nv.setNgaySinh(dateFormat.parse(txtNgaySinh.getText()));
            nv.setDiaChi(txtDiaChi.getText());
            nv.setSoDienThoai(txtSoDienThoai.getText());
            nv.setChucVu(txtChucVu.getText());
            nv.setMaNhanVien(txtMaNhanVien.getText());
            
            NhanVienControl nvconControl = new NhanVienControl();
            int k = nvconControl.suaThongTinTaiKhoan(nv);
            
            if (nvconControl.suaThongTinTaiKhoan(nv) > 0) {
                LoadThongTinTaiKhoan();
                JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại!");
            }
        } catch (Exception e) {
        }
        
    }
    
}
