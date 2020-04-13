
package trainerpannels;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Modifierstagiaire extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Modifierstagiaire() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
        remplirComboBox1();
        remplirComboBox2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 76, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Nom complet :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Adresse mail :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Numéro du téléphone :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 140, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, 30));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("CIN :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 30));
        add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Etablissement :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Projet du stage :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("Encadrent :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("Spécialité :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 510, 160));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualiser ");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 163, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Stagiare Modify copy.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ligne=jTable1.getSelectedRow();
        String id= jTable1.getModel().getValueAt(ligne, 0).toString();
        String sql="select * from stagiaire where Id = '"+ id+"'";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            if(result.next()){
                jTextField1.setText(result.getString("NomComplet"));
                jTextField2.setText(result.getString("mail"));
                jTextField4.setText(result.getString("NumTele"));
                jTextField3.setText(result.getString("CIN"));
                jTextField11.setText(result.getString("Etablissement"));
                jComboBox2.setSelectedItem(result.getString("Projet"));
                jComboBox1.setSelectedItem(result.getString("Encadrent"));
                jTextField7.setText(result.getString("Specialite"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ligne=jTable1.getSelectedRow();
        String id= jTable1.getModel().getValueAt(ligne, 0).toString();
        String sql="update stagiaire set NomComplet = ? ,mail = ?,NumTele= ?,CIN = ?,Etablissement = ?,Projet = ?,Encadrent = ?,Specialite = ? where Id='"+id+"'";
        try {
            st=cnx.prepareStatement(sql);
            st.setString(1, jTextField1.getText());
            st.setString(2, jTextField2.getText());
            st.setString(3, jTextField4.getText());
            st.setString(4, jTextField3.getText());
            st.setString(5, jTextField11.getText());
            st.setString(6, jComboBox2.getSelectedItem().toString());
            st.setString(7, jComboBox1.getSelectedItem().toString());
            st.setString(8, jTextField7.getText());
            st.execute();
            JOptionPane.showMessageDialog(null, "le stagiaire a été modifié avec succès!");
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        UpdateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void UpdateTable(){
         String sql="select * from stagiaire";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void remplirComboBox1(){
        String sql="select * from encadrent";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            while(result.next()){
                String nom=result.getString("nomEnca");
                jComboBox1.addItem(nom);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void remplirComboBox2(){
        String sql="select * from stage";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            while(result.next()){
                String nom=result.getString("stageProjet");
                jComboBox2.addItem(nom);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
