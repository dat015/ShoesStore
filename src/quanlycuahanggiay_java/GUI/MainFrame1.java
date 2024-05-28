/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlycuahanggiay_java.GUI;

import java.awt.CardLayout;

/**
 *
 * @author Admin
 */
public class MainFrame1 extends javax.swing.JFrame {

    
    public MainFrame1() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel(Memory.nhanvien.getHo() + " " + Memory.nhanvien.getTen());
        jLabel2 = new javax.swing.JLabel("ID: " + Memory.nhanvien.getMaNV());
        jLabel3 = new javax.swing.JLabel("Chức vụ: " + Memory.nhanvien.getChucVu());
        Nhaphang = new javax.swing.JButton();
        Hanghoa = new javax.swing.JButton();
        Excel = new javax.swing.JButton();
        Thongke = new javax.swing.JButton();
        Dangxuat = new javax.swing.JLabel();
        Hoadon = new javax.swing.JButton();
        body_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 0, new java.awt.Color(169, 169, 169)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlycuahanggiay_java/images/boy 1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nhaphang.setBackground(new java.awt.Color(70, 130, 180));
        Nhaphang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Nhaphang.setText("NHẬP HÀNG");
        Nhaphang.setBorder(null);
        Nhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhaphangActionPerformed(evt);
            }
        });

        Hanghoa.setBackground(new java.awt.Color(70, 130, 180));
        Hanghoa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Hanghoa.setText("HÀNG HÓA");
        Hanghoa.setBorder(null);
        Hanghoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HanghoaActionPerformed(evt);
            }
        });

        Excel.setBackground(new java.awt.Color(70, 130, 180));
        Excel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Excel.setText("XUẤT EXCEL");
        Excel.setBorder(null);
        Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelActionPerformed(evt);
            }
        });

        Thongke.setBackground(new java.awt.Color(70, 130, 180));
        Thongke.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Thongke.setText("THỐNG KÊ");
        Thongke.setBorder(null);

        Dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlycuahanggiay_java/images/Logout (1).png"))); // NOI18N

        Hoadon.setBackground(new java.awt.Color(70, 130, 180));
        Hoadon.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Hoadon.setText("HÓA ĐƠN");
        Hoadon.setBorder(null);
        Hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hanghoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hanghoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Excel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(Dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        body_panel.setBackground(new java.awt.Color(250, 243, 224));
        body_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(169, 169, 169)));
        body_panel.setLayout(new java.awt.CardLayout());
        getContentPane().add(body_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhaphangActionPerformed
        NhapHang_panel nhp = new NhapHang_panel();
        body_panel.add(nhp,"NhapHang");
         CardLayout cl = (CardLayout) (body_panel.getLayout());
        cl.show(body_panel, "NhapHang");
        body_panel.revalidate();
        body_panel.repaint();
    }//GEN-LAST:event_NhaphangActionPerformed

    private void ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcelActionPerformed

    private void HoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoadonActionPerformed
        HoaDonGUI_panel hdp = new HoaDonGUI_panel();
        body_panel.add(hdp, "HoaDonGUI");
        CardLayout cl = (CardLayout) (body_panel.getLayout());
        cl.show(body_panel, "HoaDonGUI");
        body_panel.revalidate();
        body_panel.repaint();
        
    }//GEN-LAST:event_HoadonActionPerformed

    private void HanghoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HanghoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HanghoaActionPerformed

    
    public javax.swing.JPanel getBody_panel(){
        return body_panel;
    }
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
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dangxuat;
    private javax.swing.JButton Excel;
    private javax.swing.JButton Hanghoa;
    private javax.swing.JButton Hoadon;
    private javax.swing.JButton Nhaphang;
    private javax.swing.JButton Thongke;
    private javax.swing.JPanel body_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
