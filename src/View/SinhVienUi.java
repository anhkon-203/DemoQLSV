/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.SinhVien;
import Repository.DBconnection;
import Service.impl.SinhVienServiceImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SinhVienUi extends javax.swing.JFrame {

    private SinhVienServiceImpl lstSvService = new SinhVienServiceImpl();
    private DBconnection connection;
    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcm;

    /**
     * Creates new form SinhVienUi
     */
    public SinhVienUi() {
        initComponents();
        AddCbb();
        LoadData(lstSvService.getList());

    }
  
    

    private void LoadData(ArrayList<SinhVien> list) {
        dtm = (DefaultTableModel) tblSV.getModel();
        dtm.setRowCount(0);
        for (SinhVien sv : list) {
            dtm.addRow(new Object[]{
                sv.getId(),
                sv.getTen_sinh_vien(),
                sv.getDiem(),
                sv.getGioi_tinh() == 1 ? "Nam" : "Nữ",
                sv.getLop()
            });
        }
    }

    private void AddCbb() {
        ArrayList<String> lstCbb = new ArrayList<>();
        lstCbb.add("CNTT");
        lstCbb.add("UDPM");
        lstCbb.add("WEB");
        dcm = (DefaultComboBoxModel) cbbLop.getModel();
        for (String x : lstCbb) {
            dcm.addElement(x);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cbbLop = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Tên sinh viên");

        jLabel3.setText("Điểm");

        jLabel4.setText("Giới tính");

        jLabel5.setText("Lớp");

        txtTen.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTenCaretUpdate(evt);
            }
        });
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        cbbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLopActionPerformed(evt);
            }
        });

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên SV", "Điểm", "Giới tính", "Lớp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtTen)
                            .addComponent(txtID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rdoNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoNu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnXoa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rdoNam)
                                    .addComponent(rdoNu)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnSua)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnTimKiem))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
//        String id = txtID.getText();
        String ten = txtTen.getText();
        String diem = txtDiem.getText();
        int gioiTinh = rdoNam.isSelected() ? 1 : 0;
        String lop = cbbLop.getSelectedItem().toString();
        SinhVien sv = new SinhVien();

        if (ten.trim().equals("") || diem.trim().equals("") || lop.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "không được để trống");
            return;
        }
        try {
            int Diem = Integer.parseInt(txtDiem.getText());
            if (Diem < 0) {
                JOptionPane.showMessageDialog(this, "Điểm phải lớn hơn hoặc bằng 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            System.out.println(e);
        }
//        sv.setId(Integer.parseInt(id));
        sv.setTen_sinh_vien(ten);
        sv.setDiem(Integer.parseInt(diem));
        sv.setGioi_tinh(gioiTinh);
        sv.setLop(lop);
        if (lstSvService.Them(sv)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            LoadData(lstSvService.getList());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        
        String ten = txtTen.getText();
        ArrayList<SinhVien> lstSV = lstSvService.timKiem(ten);
        LoadData(lstSV);

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtTenCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTenCaretUpdate
        // TODO add your handling code here:
//          String ten = txtTen.getText();
//        ArrayList<SinhVien> lstSV = lstSvService.timKiem(ten);
//        LoadData(lstSV);
    }//GEN-LAST:event_txtTenCaretUpdate

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        SinhVien sv = new SinhVien();
        String id = txtID.getText();
       int row = tblSV.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn vào 1 dòng trên table");
            return;
        }
        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập id");
            return;
        }
        if (lstSvService.Xoa(Integer.parseInt(id))) {
            JOptionPane.showMessageDialog(this, "Xoá thành công");
            LoadData(lstSvService.getList());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        // TODO add your handling code here:
        int row = tblSV.getSelectedRow();
        
        String id = tblSV.getValueAt(row, 0).toString();
        String ten = tblSV.getValueAt(row, 1).toString();
        String diem = tblSV.getValueAt(row, 2).toString();
        String gioiTinh = tblSV.getValueAt(row, 3).toString();
        String lop = tblSV.getValueAt(row, 4).toString();
        
       txtID.setText(id);
       txtTen.setText(ten);
       txtDiem.setText(diem);
        if (gioiTinh.equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        }else{
            rdoNu.setSelected(true);            
        }
        cbbLop.setSelectedItem(lop);
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String id = txtID.getText();
         String ten = txtTen.getText();
        String diem = txtDiem.getText();
        int gioiTinh = rdoNam.isSelected() ? 1 : 0;
        String lop = cbbLop.getSelectedItem().toString();
        SinhVien sv = new SinhVien();
     
        if (id.trim().equals("") || ten.trim().equals("") || diem.trim().equals("") || lop.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "không được để trống");
            return;
        }
        try {
            int Diem = Integer.parseInt(txtDiem.getText());
            if (Diem < 0) {
                JOptionPane.showMessageDialog(this, "Điểm phải lớn hơn hoặc bằng 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            System.out.println(e);
        }
        sv.setId(Integer.parseInt(id));
        sv.setTen_sinh_vien(ten);
        sv.setDiem(Integer.parseInt(diem));
        sv.setGioi_tinh(gioiTinh);
        sv.setLop(lop);
        if (lstSvService.Sua(Integer.parseInt(id), sv) ){
            JOptionPane.showMessageDialog(this, "sửa thành công");
            LoadData(lstSvService.getList());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void cbbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLopActionPerformed

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
            java.util.logging.Logger.getLogger(SinhVienUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

}
