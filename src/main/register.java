/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author windows
 */
public class register extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form register
     */
    public register() {
        kon = new koneksi();
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

        konf_pw = new javax.swing.JLabel();
        pw_user = new javax.swing.JLabel();
        username_user = new javax.swing.JLabel();
        email_user = new javax.swing.JLabel();
        nama_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BT_Regist = new javax.swing.JButton();
        BT_Regist1 = new javax.swing.JButton();
        TF_emailuser = new javax.swing.JTextField();
        TF_userName = new javax.swing.JTextField();
        user_pw = new javax.swing.JPasswordField();
        pw_konf = new javax.swing.JPasswordField();
        TF_namauser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(775, 512));
        setPreferredSize(new java.awt.Dimension(775, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(775, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        konf_pw.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        konf_pw.setForeground(new java.awt.Color(204, 204, 204));
        konf_pw.setText("Konfirmasi Password");
        getContentPane().add(konf_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 38));

        pw_user.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        pw_user.setForeground(new java.awt.Color(204, 204, 204));
        pw_user.setText("Password");
        getContentPane().add(pw_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 38));

        username_user.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        username_user.setForeground(new java.awt.Color(204, 204, 204));
        username_user.setText("Username");
        getContentPane().add(username_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 38));

        email_user.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        email_user.setForeground(new java.awt.Color(204, 204, 204));
        email_user.setText("E-mail");
        getContentPane().add(email_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 38));

        nama_user.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        nama_user.setForeground(new java.awt.Color(204, 204, 204));
        nama_user.setText("Nama");
        getContentPane().add(nama_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 38));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BT_Regist.setBackground(new java.awt.Color(0, 0, 0));
        BT_Regist.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_Regist.setForeground(new java.awt.Color(204, 204, 204));
        BT_Regist.setText("Register");
        BT_Regist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        BT_Regist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_RegistMouseClicked(evt);
            }
        });
        jPanel1.add(BT_Regist, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 170, 50));

        BT_Regist1.setBackground(new java.awt.Color(0, 0, 0));
        BT_Regist1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_Regist1.setForeground(new java.awt.Color(204, 204, 204));
        BT_Regist1.setText("Cancel");
        BT_Regist1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        BT_Regist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_Regist1MouseClicked(evt);
            }
        });
        jPanel1.add(BT_Regist1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 170, 50));

        TF_emailuser.setBorder(null);
        jPanel1.add(TF_emailuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 290, 20));

        TF_userName.setBorder(null);
        jPanel1.add(TF_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 290, 20));

        user_pw.setBorder(null);
        jPanel1.add(user_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 290, 20));

        pw_konf.setBorder(null);
        jPanel1.add(pw_konf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 290, 20));

        TF_namauser.setBorder(null);
        TF_namauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_namauserActionPerformed(evt);
            }
        });
        jPanel1.add(TF_namauser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 290, 20));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Registrasi User");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 310, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regster.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_namauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_namauserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_namauserActionPerformed

    private void BT_Regist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_Regist1MouseClicked
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_BT_Regist1MouseClicked

    private void BT_RegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_RegistMouseClicked
        String username_us = TF_userName.getText();
        String nama_us = TF_namauser.getText();
        String email_us = TF_emailuser.getText();
        //int ttl_us = jDateChooser1.getDate().getDay();
        String password_us = user_pw.getText();
        //String username_us = TF_userName.getText();
        try{
            String regist = "insert into user_id (id_user, nama, username, password, email) values (id_user, '"+nama_us+"', '"+username_us+"', '"+password_us+"', '"+email_us+"')";
            Statement st = kon.con.createStatement();
            st.executeUpdate(regist);
            JOptionPane.showMessageDialog(rootPane, "Selamat! Registrasi anda telah berhasil! ");
            this.setVisible(false);
            new login().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_BT_RegistMouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Regist;
    private javax.swing.JButton BT_Regist1;
    private javax.swing.JTextField TF_emailuser;
    private javax.swing.JTextField TF_namauser;
    private javax.swing.JTextField TF_userName;
    private javax.swing.JLabel email_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel konf_pw;
    private javax.swing.JLabel nama_user;
    private javax.swing.JPasswordField pw_konf;
    private javax.swing.JLabel pw_user;
    private javax.swing.JPasswordField user_pw;
    private javax.swing.JLabel username_user;
    // End of variables declaration//GEN-END:variables
}