/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_page;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author abdellatifanaflous
 */
public class Home_page extends javax.swing.JFrame {

    GridBagLayout layout = new GridBagLayout();
    Stagiaire p1;
    Stage p2;
    Service p3;
    Encadrent p4;
    Attestation p5;
    Home p6;
    public Home_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        p1 = new Stagiaire();
        p2=new Stage();
        p3=new Service();
        p4=new Encadrent();
        p5=new Attestation();
        p6=new Home();
        dynamicPanel.setLayout(layout);
        GridBagConstraints c= new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p1,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p2,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p3,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p4,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p5,c);
        c.gridx=0;
        c.gridy=0;
        dynamicPanel.add(p6,c);
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
     
        
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
        dynamicPanel = new javax.swing.JPanel();
        jLabel_home = new javax.swing.JLabel();
        jLabel2_service = new javax.swing.JLabel();
        jLabel_stage = new javax.swing.JLabel();
        jLabel_stagiaire = new javax.swing.JLabel();
        jLabel_encadrent = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_attestation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dynamicPanel.setBackground(new java.awt.Color(255, 255, 255));
        dynamicPanel.setName(""); // NOI18N
        dynamicPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jPanel1.add(dynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 580, 509));

        jLabel_home.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_home.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        jLabel_home.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_home.setText("Accueil");
        jLabel_home.setPreferredSize(new java.awt.Dimension(40, 14));
        jLabel_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_homeMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 40));

        jLabel2_service.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        jLabel2_service.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_service.setText("Service");
        jLabel2_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_serviceMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel_stage.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_stage.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        jLabel_stage.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_stage.setText("Stage");
        jLabel_stage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_stageMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_stage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel_stagiaire.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        jLabel_stagiaire.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_stagiaire.setText("Stagiaire");
        jLabel_stagiaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_stagiaireMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_stagiaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jLabel_encadrent.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel_encadrent.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_encadrent.setText("Encadent");
        jLabel_encadrent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_encadrentMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_encadrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tsukushi B Round Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attestation");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel_attestation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/final back 2.jpg"))); // NOI18N
        jLabel_attestation.setText("jLabel1");
        jPanel1.add(jLabel_attestation, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 930, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2_serviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_serviceMouseClicked
        p1.setVisible(false);
        p3.setVisible(true);
        p2.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
    }//GEN-LAST:event_jLabel2_serviceMouseClicked

    private void jLabel_stageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_stageMouseClicked
        p1.setVisible(false);
        p3.setVisible(false);
        p2.setVisible(true);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
    }//GEN-LAST:event_jLabel_stageMouseClicked

    private void jLabel_stagiaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_stagiaireMouseClicked
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
    }//GEN-LAST:event_jLabel_stagiaireMouseClicked

    private void jLabel_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_homeMouseClicked
        
       p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(true);
    }//GEN-LAST:event_jLabel_homeMouseClicked

    private void jLabel_encadrentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_encadrentMouseClicked
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(true);
        p5.setVisible(false);
        p6.setVisible(false);
    }//GEN-LAST:event_jLabel_encadrentMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(true);
        p6.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home_page().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_service;
    private javax.swing.JLabel jLabel_attestation;
    private javax.swing.JLabel jLabel_encadrent;
    private javax.swing.JLabel jLabel_home;
    private javax.swing.JLabel jLabel_stage;
    private javax.swing.JLabel jLabel_stagiaire;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
