/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_page;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import stagepannels.Ajouterstage;
import stagepannels.Chercherstage;
import stagepannels.Homestage;
import stagepannels.Modifierstage;
import stagepannels.Supprimerstage;

/**
 *
 * @author latifa
 */
public class Stage extends javax.swing.JPanel {

     GridBagLayout layout = new GridBagLayout();
    Supprimerstage ss;
    Ajouterstage as;
    Modifierstage ms;
    Homestage hs;
    Chercherstage cs ;
    public Stage() {
        initComponents();
        ss=new Supprimerstage();
        as=new Ajouterstage();
        ms=new Modifierstage();
        hs = new Homestage();
        cs  =new  Chercherstage ();
     
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
       stagepannel.add(cs,c);
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

        stagepannel = new javax.swing.JPanel();
        ajouter = new javax.swing.JButton();
        back = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        chercher = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 460));

        stagepannel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout stagepannelLayout = new javax.swing.GroupLayout(stagepannel);
        stagepannel.setLayout(stagepannelLayout);
        stagepannelLayout.setHorizontalGroup(
            stagepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        stagepannelLayout.setVerticalGroup(
            stagepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        ajouter.setText("Add");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(67, 23));
        back.setMinimumSize(new java.awt.Dimension(67, 23));
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

        modifier.setText("Modify");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        chercher.setText("Search");
        chercher.setRequestFocusEnabled(false);
        chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stagepannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stagepannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void chercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercherActionPerformed
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

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
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
    private javax.swing.JButton modifier;
    private javax.swing.JPanel stagepannel;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
