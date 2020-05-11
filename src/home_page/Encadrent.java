/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_page;

import Ecadpannels.Ajouterencad;
import Ecadpannels.Homeencad;
import Ecadpannels.Modifierencad;
import Ecadpannels.Suipprimerencad;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author ESSAKHI Hamza
 */
public class Encadrent extends javax.swing.JPanel {

    GridBagLayout layout = new GridBagLayout();
    Suipprimerencad ss;
    Ajouterencad as;
    Modifierencad ms;
    Homeencad hs;
  
    public Encadrent() {
        initComponents();
        ss=new Suipprimerencad();
        as=new Ajouterencad();
        ms=new Modifierencad();
        hs = new Homeencad();
        
     
       Encapannel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        Encapannel.add(ss,c);
        c.gridx=0;
        c.gridy=0;
        Encapannel.add(hs,c);
        c.gridx=0;
        c.gridy=0;
        Encapannel.add(as,c);
        c.gridx=0;
        c.gridy=0;
        Encapannel.add(ms,c);
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

        ajouter = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Encapannel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        ajouter.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        supprimer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        modifier.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/flesh.jpg"))); // NOI18N
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Encapannel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EncapannelLayout = new javax.swing.GroupLayout(Encapannel);
        Encapannel.setLayout(EncapannelLayout);
        EncapannelLayout.setHorizontalGroup(
            EncapannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EncapannelLayout.setVerticalGroup(
            EncapannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(Encapannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Encapannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:*
             ss.setVisible(false);
        as.setVisible(false);
        ms.setVisible(false);
        hs.setVisible(true);
        
        ajouter.setVisible(true);
        modifier.setVisible(true);
        supprimer.setVisible(true);
        
        back.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Encapannel;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton back;
    private javax.swing.JButton modifier;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
