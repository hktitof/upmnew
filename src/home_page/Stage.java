/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_page;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import stagepannels.Ajouterstage;
import stagepannels.Homestage;
import stagepannels.Modifierstage;
import stagepannels.Supprimerstage;

/**
 *
 * @author ESSAKHI Hamza
 */
public class Stage extends javax.swing.JPanel {

    /**
     * Creates new form Stage
     */
      GridBagLayout layout = new GridBagLayout();
    Supprimerstage ss;
    Ajouterstage as;
    Modifierstage ms;
    Homestage hs;
    public Stage() {
        initComponents();
          initComponents();
        ss=new Supprimerstage();
        as=new Ajouterstage();
        ms=new Modifierstage();
        hs = new Homestage();
     
       stagepannel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        stagepannel.add(ss,c);
        c.gridx=0;
        c.gridy=0;
        stagepannel.add(hs,c);
        c.gridx=0;
        c.gridy=0;
        stagepannel.add(as,c);
        c.gridx=0;
        c.gridy=0;
        stagepannel.add(ms,c);
        c.gridx=0;
        c.gridy=0;
       
        ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
     
        hs.setVisible(true);
        back.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stagepannel = new javax.swing.JPanel();
        ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        back = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        stagepannel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout stagepannelLayout = new javax.swing.GroupLayout(stagepannel);
        stagepannel.setLayout(stagepannelLayout);
        stagepannelLayout.setHorizontalGroup(
            stagepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        stagepannelLayout.setVerticalGroup(
            stagepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        ajouter.setText("Add");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        modifier.setText("Modify");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\projetTutoù\\04.04.23.22\\upmnew\\src\\home_page\\sssssssssssss.jpg")); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        supprimer.setText("Delete");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stagepannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(stagepannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
          ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
        hs.setVisible(true);
        
        ajouter.setVisible(true);
        modifier.setVisible(true);
        supprimer.setVisible(true);
        
        back.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
          ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(true);
         hs.setVisible(false);
        
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        
        back.setVisible(true);
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
         ss.setVisible(true);
        as.setVisible(false);
        ms.setVisible(false);
         hs.setVisible(false);
       
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        
        back.setVisible(true);
    }//GEN-LAST:event_supprimerActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
        ss.setVisible(false);
        as.setVisible(true);
        ms.setVisible(false);
         hs.setVisible(false);
         
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
       
        back.setVisible(true);
    }//GEN-LAST:event_ajouterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JButton back;
    private javax.swing.JButton modifier;
    private javax.swing.JPanel stagepannel;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
