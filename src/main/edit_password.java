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
public class edit_password extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form register
     */
    public edit_password() {
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

        title = new javax.swing.JLabel();
        old_password = new javax.swing.JLabel();
        new_password = new javax.swing.JLabel();
        BT_save = new javax.swing.JButton();
        BT_cancel = new javax.swing.JButton();
        new_password1 = new javax.swing.JLabel();
        TF_oldpw = new javax.swing.JPasswordField();
        TF_newpw = new javax.swing.JPasswordField();
        TF_newpw1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        title.setText("UBAH PASSWORD");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 38));

        old_password.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        old_password.setText("Password Lama");
        getContentPane().add(old_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 38));

        new_password.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        new_password.setText("Password Baru");
        getContentPane().add(new_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 38));

        BT_save.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_save.setText("Save");
        BT_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_saveMouseClicked(evt);
            }
        });
        getContentPane().add(BT_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 113, 38));

        BT_cancel.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_cancel.setText("Cancel");
        BT_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_cancelMouseClicked(evt);
            }
        });
        getContentPane().add(BT_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 113, 38));

        new_password1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        new_password1.setText("Konfirmasi Password");
        getContentPane().add(new_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 38));
        getContentPane().add(TF_oldpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, 30));
        getContentPane().add(TF_newpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, 30));

        TF_newpw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_newpw1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF_newpw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_saveMouseClicked
        String old_pw = TF_oldpw.getText();
        String new_pw = TF_newpw.getText();
        try{
            Statement st = kon.con.createStatement();
            ResultSet result = st.executeQuery("select * from user_id where password= '"+old_pw+"'");
            if(result.next()){
            if(TF_oldpw.getText().equals(result.getString("password"))){
            if(TF_newpw.getText().equals(TF_newpw1.getText())){
            String ubah = "update user_id set password = '"+new_pw+"' where password = '"+old_pw+"'";
            st.executeUpdate(ubah);
            JOptionPane.showMessageDialog(this,"Password berhasil diganti!");
            this.setVisible(false);
            new navbar().setVisible(true);
            }
            else{JOptionPane.showMessageDialog(this,"Password Baru dan Konfirmasi Password tidak sama!");}
            }}
            else{JOptionPane.showMessageDialog(this,"Password Lama salah!");}
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_BT_saveMouseClicked

    private void BT_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_cancelMouseClicked
        this.setVisible(false);
        new navbar().setVisible(true);
    }//GEN-LAST:event_BT_cancelMouseClicked

    private void TF_newpw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_newpw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_newpw1ActionPerformed

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
            java.util.logging.Logger.getLogger(edit_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_cancel;
    private javax.swing.JButton BT_save;
    private javax.swing.JPasswordField TF_newpw;
    private javax.swing.JPasswordField TF_newpw1;
    private javax.swing.JPasswordField TF_oldpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel new_password;
    private javax.swing.JLabel new_password1;
    private javax.swing.JLabel old_password;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}