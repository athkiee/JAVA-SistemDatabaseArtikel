/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import static javax.swing.ScrollPaneConstants.*;
import java.util.Scanner;



/**
 *
 * @author windows
 */
public class content_campus extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form content_campus
     */
    public content_campus() {
        kon = new koneksi();
        initComponents();
        Object header[] = {"Kode Artikel", "Judul Artikel", "Likes", "Views"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        tabel_campus.setModel(data);
        String tampil = "select*from content_id where kategori='campus'";
        try{
            Statement st = kon.con.createStatement();
            ResultSet rs = st.executeQuery(tampil);
            while(rs.next()){
                String kolom1 = rs.getString(1);
                String kolom2 = rs.getString(2);
                String kolom3 = rs.getString(5);
                String kolom4 = rs.getString(6);
                String kolom[] = {kolom1,kolom2,kolom3,kolom4};
                data.addRow(kolom);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_campus = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        title_id = new javax.swing.JLabel();
        like = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        isi_id = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(775, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_campus.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_campus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_campusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_campus);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 690, 110));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 363, 37));

        cari.setBackground(new java.awt.Color(0, 0, 0));
        cari.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        cari.setForeground(new java.awt.Color(204, 204, 204));
        cari.setText("SEARCH");
        cari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 122, 37));

        title_id.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        title_id.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(title_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 470, 30));

        like.setBackground(new java.awt.Color(0, 0, 0));
        like.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        like.setForeground(new java.awt.Color(204, 204, 204));
        like.setText("Like!");
        like.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        like.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                likeMouseClicked(evt);
            }
        });
        getContentPane().add(like, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 80, -1));

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(204, 204, 204));
        refresh.setText("Refresh");
        refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 80, -1));

        title.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Kategori : Campus");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        title1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Masukkan Kode Artikel :");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 473, 120, 30));

        jScrollPane2.setViewportView(isi_id);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 690, 190));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tt.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_campusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_campusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabel_campusMouseClicked

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        Object header[] = {"Kode Artikel", "Judul Artikel", "Likes", "Views"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        tabel_campus.setModel(data);
        String tampil = "select * from content_id where id_konten like '%"+search.getText()+"%' and kategori='campus'";
        try{
            Statement st = kon.con.createStatement();
            ResultSet rs = st.executeQuery(tampil);
            while(rs.next()){
                int numb = rs.getInt("views");
                int sumviews = numb+1;
                String kolom1 = rs.getString(1);
                String kolom2 = rs.getString(2);
                String kolom3 = rs.getString(5);
                String kolom4 = rs.getString(6);
                String kolom[] = {kolom1,kolom2,kolom3,kolom4};
                data.addRow(kolom);
                title_id.setText(rs.getString("title_id"));
                isi_id.setText(rs.getString("isi"));
                String ubah = "update content_id set views = '"+sumviews+"' where id_konten = '"+search.getText()+"'";
                st.executeUpdate(ubah);
            }
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_cariMouseClicked

    private void likeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeMouseClicked
        String lk = "select * from content_id where id_konten='"+search.getText()+"'";
        try{
        Statement st = kon.con.createStatement();
        ResultSet rs = st.executeQuery(lk);
        while(rs.next()){
            int number = rs.getInt("likes");
            int sumlikes = number+1;
               //String tolikes = Integer.toString(sumlikes);
               String ubah = "update content_id set likes = '"+sumlikes+"' where id_konten = '"+search.getText()+"'";
               st.executeUpdate(ubah);
               JOptionPane.showMessageDialog(rootPane, "Like diterima! ");
            }    
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
    }//GEN-LAST:event_likeMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        this.setVisible(false);
        new content_campus().setVisible(true);
    }//GEN-LAST:event_refreshMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        new home_user().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(content_campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(content_campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(content_campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(content_campus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new content_campus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JTextPane isi_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton like;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField search;
    private javax.swing.JTable tabel_campus;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title_id;
    // End of variables declaration//GEN-END:variables
}
