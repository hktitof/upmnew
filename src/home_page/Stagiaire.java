/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_page;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import trainerpannels.Ajouterstagiaire;
import trainerpannels.Chercherstagiaire;
import trainerpannels.Homestagiaire;
import trainerpannels.Modifierstagiaire;
import trainerpannels.Supprimerstagiaire;

/**
 *
 * @author latifa
 */
public class Stagiaire extends javax.swing.JPanel {

    GridBagLayout layout = new GridBagLayout();
    Supprimerstagiaire ss;
    Ajouterstagiaire as;
    Modifierstagiaire ms;
    Homestagiaire hs;
    Chercherstagiaire cs ;
    public Stagiaire() {
        initComponents();
        initComponents();
        ss=new Supprimerstagiaire();
        as=new Ajouterstagiaire();
        ms=new Modifierstagiaire();
        hs = new Homestagiaire();
        cs  =new  Chercherstagiaire ();
     
       stagiairepannel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
         stagiairepannel.add(ss,c);
        c.gridx=0;
        c.gridy=0;
        stagiairepannel.add(hs,c);
        c.gridx=0;
        c.gridy=0;
        stagiairepannel.add(as,c);
        c.gridx=0;
        c.gridy=0;
        stagiairepannel.add(ms,c);
        c.gridx=0;
        c.gridy=0;
       stagiairepannel.add(cs,c);
        c.gridx=0;
        c.gridy=0;
        ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
        cs.setVisible(false);
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

        jButton1 = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        chercher = new javax.swing.JButton();
        stagiairepannel = new javax.swing.JPanel();
        back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 460));

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        chercher.setText("Chercher");
        chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stagiairepannelLayout = new javax.swing.GroupLayout(stagiairepannel);
        stagiairepannel.setLayout(stagiairepannelLayout);
        stagiairepannelLayout.setHorizontalGroup(
            stagiairepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stagiairepannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(241, 241, 241))
        );
        stagiairepannelLayout.setVerticalGroup(
            stagiairepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stagiairepannelLayout.createSequentialGroup()
                .addContainerGap(333, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(chercher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(stagiairepannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stagiairepannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modifier, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
      ss.setVisible(false);
        as.setVisible(true);
        ms.setVisible(false);
         hs.setVisible(false);
         cs.setVisible(false);
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        chercher.setVisible(false);
        back.setVisible(true);
    }//GEN-LAST:event_ajouterActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here
        ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(true);
         hs.setVisible(false);
         cs.setVisible(false);
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        chercher.setVisible(false);
        back.setVisible(true);
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        ss.setVisible(true);
        as.setVisible(false);
        ms.setVisible(false);
         hs.setVisible(false);
         cs.setVisible(false);
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        chercher.setVisible(false);
        back.setVisible(true);
    }//GEN-LAST:event_supprimerActionPerformed

    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed
        // TODO add your handling code here:
        ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
         hs.setVisible(false);
         cs.setVisible(true);
        ajouter.setVisible(false);
        modifier.setVisible(false);
        supprimer.setVisible(false);
        chercher.setVisible(false);
        back.setVisible(true);
    }//GEN-LAST:event_chercherActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
         hs.setVisible(true);
         cs.setVisible(false);
        ajouter.setVisible(true);
        modifier.setVisible(true);
        supprimer.setVisible(true);
        chercher.setVisible(true);
        back.setVisible(false);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter;
    private javax.swing.JButton back;
    private javax.swing.JButton chercher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton modifier;
    private javax.swing.JPanel stagiairepannel;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
