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
public class login extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form login
     */
    public login() {
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

        username = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        TF_username = new javax.swing.JTextField();
        PW_user = new javax.swing.JPasswordField();
        BT_Login = new javax.swing.JButton();
        Link_register = new javax.swing.JLabel();
        Link_User = new javax.swing.JLabel();
        Link_Admin = new javax.swing.JLabel();
        about = new javax.swing.JButton();
        etc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(775, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(775, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 38));

        username1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("Password");
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 38));

        TF_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(TF_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 191, 38));
        getContentPane().add(PW_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 191, 38));

        BT_Login.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_Login.setText("LOGIN");
        BT_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_LoginMouseClicked(evt);
            }
        });
        getContentPane().add(BT_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 113, 38));

        Link_register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Link_register.setForeground(new java.awt.Color(204, 204, 204));
        Link_register.setText("Register");
        Link_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Link_registerMouseClicked(evt);
            }
        });
        getContentPane().add(Link_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        Link_User.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Link_User.setForeground(new java.awt.Color(204, 204, 204));
        Link_User.setText("User");
        Link_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Link_UserMouseClicked(evt);
            }
        });
        getContentPane().add(Link_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        Link_Admin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Link_Admin.setForeground(new java.awt.Color(204, 204, 204));
        Link_Admin.setText("Admin");
        Link_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Link_AdminMouseClicked(evt);
            }
        });
        getContentPane().add(Link_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        about.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        about.setText("About");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        etc.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        etc.setForeground(new java.awt.Color(255, 255, 255));
        etc.setText("|");
        getContentPane().add(etc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tt.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_usernameActionPerformed

    private void BT_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_LoginMouseClicked
        String us_name = TF_username.getText();
        try{
            Statement st = kon.con.createStatement();
            ResultSet result = st.executeQuery("select * from user_id where username= '"+us_name+"'");
            if(result.next()){
            if(PW_user.getText().equals(result.getString("password"))){
            JOptionPane.showMessageDialog(rootPane, "Selamat Datang, " + us_name);
            this.setVisible(false);
            new home_user().setVisible(true);
            }
            else{
                    JOptionPane.showMessageDialog(rootPane, "Password Salah!");
                    }
            }
            else{
            JOptionPane.showMessageDialog(rootPane, "Username tidak ditemukan!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_BT_LoginMouseClicked

    private void Link_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Link_UserMouseClicked
        
    }//GEN-LAST:event_Link_UserMouseClicked

    private void Link_AdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Link_AdminMouseClicked
        this.setVisible(false);
        new login_admin().setVisible(true);
    }//GEN-LAST:event_Link_AdminMouseClicked

    private void Link_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Link_registerMouseClicked
        this.setVisible(false);
        new register().setVisible(true);
    }//GEN-LAST:event_Link_registerMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        this.setVisible(false);
        new about().setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Login;
    private javax.swing.JLabel Link_Admin;
    private javax.swing.JLabel Link_User;
    private javax.swing.JLabel Link_register;
    private javax.swing.JPasswordField PW_user;
    private javax.swing.JTextField TF_username;
    private javax.swing.JButton about;
    private javax.swing.JLabel etc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
