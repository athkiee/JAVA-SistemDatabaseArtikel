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
public class home_admin extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form login
     */
    public home_admin() {
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

        add_campus = new javax.swing.JButton();
        StudentCampus = new javax.swing.JLabel();
        StudentOrmawa = new javax.swing.JLabel();
        StudentEvent = new javax.swing.JLabel();
        StudentTechno = new javax.swing.JLabel();
        StudentJournal = new javax.swing.JLabel();
        StudentJob = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        add_job = new javax.swing.JButton();
        add_event = new javax.swing.JButton();
        add_journal = new javax.swing.JButton();
        add_ormawa = new javax.swing.JButton();
        add_techno = new javax.swing.JButton();
        edit_job = new javax.swing.JButton();
        edit_campus = new javax.swing.JButton();
        edit_event = new javax.swing.JButton();
        edit_journal = new javax.swing.JButton();
        edit_ormawa = new javax.swing.JButton();
        edit_techno = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(775, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(775, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_campus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_campus.setText("Add");
        add_campus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_campus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_campusMouseClicked(evt);
            }
        });
        getContentPane().add(add_campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, 90));

        StudentCampus.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentCampus.setText("Student Campus");
        getContentPane().add(StudentCampus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        StudentOrmawa.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentOrmawa.setText("Student Ormawa");
        getContentPane().add(StudentOrmawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        StudentEvent.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentEvent.setText("Student Event");
        getContentPane().add(StudentEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        StudentTechno.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentTechno.setText("Student Techno");
        getContentPane().add(StudentTechno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        StudentJournal.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentJournal.setText("Student Journalism");
        getContentPane().add(StudentJournal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        StudentJob.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        StudentJob.setText("Student Job");
        getContentPane().add(StudentJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/navbar.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 30, 30));

        add_job.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_job.setText("Add");
        add_job.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_job.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_jobMouseClicked(evt);
            }
        });
        getContentPane().add(add_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 70, 90));

        add_event.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_event.setText("Add");
        add_event.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_eventMouseClicked(evt);
            }
        });
        getContentPane().add(add_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 90));

        add_journal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_journal.setText("Add");
        add_journal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_journal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_journalMouseClicked(evt);
            }
        });
        getContentPane().add(add_journal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 90));

        add_ormawa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_ormawa.setText("Add");
        add_ormawa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_ormawa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_ormawaMouseClicked(evt);
            }
        });
        getContentPane().add(add_ormawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 70, 90));

        add_techno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add_techno.setText("Add");
        add_techno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        add_techno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_technoMouseClicked(evt);
            }
        });
        getContentPane().add(add_techno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 70, 90));

        edit_job.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_job.setText("Edit");
        edit_job.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        edit_job.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_jobMouseClicked(evt);
            }
        });
        getContentPane().add(edit_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 70, 90));

        edit_campus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_campus.setText("Edit");
        edit_campus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_campusMouseClicked(evt);
            }
        });
        getContentPane().add(edit_campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 70, 90));

        edit_event.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_event.setText("Edit");
        edit_event.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        edit_event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_eventMouseClicked(evt);
            }
        });
        getContentPane().add(edit_event, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 70, 90));

        edit_journal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_journal.setText("Edit");
        edit_journal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        edit_journal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_journalMouseClicked(evt);
            }
        });
        getContentPane().add(edit_journal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 70, 90));

        edit_ormawa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_ormawa.setText("Edit");
        edit_ormawa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        edit_ormawa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_ormawaMouseClicked(evt);
            }
        });
        getContentPane().add(edit_ormawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 70, 90));

        edit_techno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        edit_techno.setText("Edit");
        edit_techno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        edit_techno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_technoMouseClicked(evt);
            }
        });
        getContentPane().add(edit_techno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 70, 90));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("View and Delete Data");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, null, null));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 180, 120));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttt.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        new navbar_admin().setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void add_campusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_campusMouseClicked
        this.setVisible(false);
        new add_campus().setVisible(true);
    }//GEN-LAST:event_add_campusMouseClicked

    private void add_jobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_jobMouseClicked
        this.setVisible(false);
        new add_job().setVisible(true);
    }//GEN-LAST:event_add_jobMouseClicked

    private void add_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_eventMouseClicked
        this.setVisible(false);
        new add_event().setVisible(true);
    }//GEN-LAST:event_add_eventMouseClicked

    private void add_journalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_journalMouseClicked
       this.setVisible(false);
        new add_journal().setVisible(true);
    }//GEN-LAST:event_add_journalMouseClicked

    private void add_ormawaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_ormawaMouseClicked
        this.setVisible(false);
        new add_ormawa().setVisible(true);
    }//GEN-LAST:event_add_ormawaMouseClicked

    private void add_technoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_technoMouseClicked
        this.setVisible(false);
        new add_techno().setVisible(true);
    }//GEN-LAST:event_add_technoMouseClicked

    private void edit_jobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_jobMouseClicked
        this.setVisible(false);
        new edit_job().setVisible(true);
    }//GEN-LAST:event_edit_jobMouseClicked

    private void edit_campusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_campusMouseClicked
        this.setVisible(false);
        new edit_campus().setVisible(true);
    }//GEN-LAST:event_edit_campusMouseClicked

    private void edit_eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_eventMouseClicked
        this.setVisible(false);
        new edit_event().setVisible(true);
    }//GEN-LAST:event_edit_eventMouseClicked

    private void edit_journalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_journalMouseClicked
        this.setVisible(false);
        new edit_journal().setVisible(true);
    }//GEN-LAST:event_edit_journalMouseClicked

    private void edit_ormawaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_ormawaMouseClicked
        this.setVisible(false);
        new edit_ormawa().setVisible(true);
    }//GEN-LAST:event_edit_ormawaMouseClicked

    private void edit_technoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_technoMouseClicked
        this.setVisible(false);
        new edit_techno().setVisible(true);
    }//GEN-LAST:event_edit_technoMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        new view_del().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudentCampus;
    private javax.swing.JLabel StudentEvent;
    private javax.swing.JLabel StudentJob;
    private javax.swing.JLabel StudentJournal;
    private javax.swing.JLabel StudentOrmawa;
    private javax.swing.JLabel StudentTechno;
    private javax.swing.JButton add_campus;
    private javax.swing.JButton add_event;
    private javax.swing.JButton add_job;
    private javax.swing.JButton add_journal;
    private javax.swing.JButton add_ormawa;
    private javax.swing.JButton add_techno;
    private javax.swing.JButton edit_campus;
    private javax.swing.JButton edit_event;
    private javax.swing.JButton edit_job;
    private javax.swing.JButton edit_journal;
    private javax.swing.JButton edit_ormawa;
    private javax.swing.JButton edit_techno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
