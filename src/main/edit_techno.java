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
public class edit_techno extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form register
     */
    public edit_techno() {
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
        title = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        TF_title = new javax.swing.JTextField();
        pw_konf = new javax.swing.JPasswordField();
        BT_cancel = new javax.swing.JButton();
        BT_add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        BT_cancel1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(775, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(775, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        konf_pw.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        konf_pw.setText("Konfirmasi Password Admin");
        getContentPane().add(konf_pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 40));

        title.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        title.setText("Kode Artikel");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 38));

        link.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        link.setText("Isi Artikel");
        getContentPane().add(link, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 38));
        getContentPane().add(TF_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 480, 40));
        getContentPane().add(pw_konf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 260, 29));

        BT_cancel.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_cancel.setText("Cancel");
        BT_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_cancelMouseClicked(evt);
            }
        });
        getContentPane().add(BT_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 113, 38));

        BT_add.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_add.setText("Update");
        BT_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_addMouseClicked(evt);
            }
        });
        getContentPane().add(BT_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 113, 38));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setText("Edit Artikel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jScrollPane2.setViewportView(isi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 480, 140));

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel3.setText("Kategori: Techno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        title1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        title1.setText("Judul Artikel");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 38));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 30));

        BT_cancel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        BT_cancel1.setText("Search");
        BT_cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_cancel1MouseClicked(evt);
            }
        });
        getContentPane().add(BT_cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_cancelMouseClicked
           this.setVisible(false);
           new home_admin().setVisible(true);
       
    }//GEN-LAST:event_BT_cancelMouseClicked

    private void BT_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_addMouseClicked
        String pw = pw_konf.getText();
        String title = TF_title.getText();
        String link = isi.getText();
        try{
            Statement st = kon.con.createStatement();
            ResultSet result = st.executeQuery("select * from admin_id where password= '"+pw+"'");
            if(result.next()){
            if(pw_konf.getText().equals(result.getString("password"))){
                
            String regist = "update content_id set title_id='"+title+"', isi='"+link+"' where id_konten='"+search.getText()+"'";
            st.executeUpdate(regist);
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil diUpdate! ");
            
            this.setVisible(false);
            new home_admin().setVisible(true);
            }}
            else{JOptionPane.showMessageDialog(this,"Password Admin salah!");}
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_BT_addMouseClicked

    private void BT_cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_cancel1MouseClicked
        String tampil = "select * from content_id where id_konten like '%"+search.getText()+"%' and kategori='techno'";
        try{
            Statement st = kon.con.createStatement();
            ResultSet rs = st.executeQuery(tampil);
            while(rs.next()){
                TF_title.setText(rs.getString("title_id"));
                isi.setText(rs.getString("isi"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," Artikel pada Kategori ini tidak ditemukan! ");
        }
    }//GEN-LAST:event_BT_cancel1MouseClicked

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
            java.util.logging.Logger.getLogger(edit_techno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_techno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_techno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_techno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_techno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_add;
    private javax.swing.JButton BT_cancel;
    private javax.swing.JButton BT_cancel1;
    private javax.swing.JTextField TF_title;
    private javax.swing.JTextPane isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel konf_pw;
    private javax.swing.JLabel link;
    private javax.swing.JPasswordField pw_konf;
    private javax.swing.JTextField search;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
