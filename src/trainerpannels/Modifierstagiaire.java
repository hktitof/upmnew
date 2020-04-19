
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
        setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(456, 380, 100, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Nom complet :");
        add(jLabel3);
        jLabel3.setBounds(40, 40, 81, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Adresse mail :");
        add(jLabel4);
        jLabel4.setBounds(180, 40, 75, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Numéro du téléphone :");
        add(jLabel5);
        jLabel5.setBounds(320, 40, 140, 15);
        add(jTextField1);
        jTextField1.setBounds(40, 60, 130, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(180, 60, 130, 30);
        add(jTextField4);
        jTextField4.setBounds(320, 60, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("CIN :");
        add(jLabel6);
        jLabel6.setBounds(40, 90, 27, 15);
        add(jTextField3);
        jTextField3.setBounds(40, 110, 130, 30);
        add(jTextField11);
        jTextField11.setBounds(180, 110, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Etablissement :");
        add(jLabel7);
        jLabel7.setBounds(180, 90, 83, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Projet du stage :");
        add(jLabel8);
        jLabel8.setBounds(320, 90, 93, 15);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox2);
        jComboBox2.setBounds(320, 110, 130, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox1);
        jComboBox1.setBounds(40, 160, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("Encadrent :");
        add(jLabel9);
        jLabel9.setBounds(40, 140, 64, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("Spécialité :");
        add(jLabel10);
        jLabel10.setBounds(180, 140, 59, 15);
        add(jTextField7);
        jTextField7.setBounds(180, 160, 130, 30);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(32, 200, 510, 160);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualiser ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(433, 163, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Stagiare Modify copy.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ligne=jTable1.getSelectedRow();
        String id= jTable1.getModel().getValueAt(ligne, 0).toString();
        String sql="select NomComplet,mail,NumTele,CIN,Etablissement,stageProjet,nomEnca,Specialite from stagiaire,encadrent,stage where Encadrent=idEnca and Projet=stageId and Id = '"+ id+"'";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            if(result.next()){
                jTextField1.setText(result.getString("NomComplet"));
                jTextField2.setText(result.getString("mail"));
                jTextField4.setText(result.getString("NumTele"));
                jTextField3.setText(result.getString("CIN"));
                jTextField11.setText(result.getString("Etablissement"));
                jComboBox2.setSelectedItem(result.getString("stageProjet"));
                jComboBox1.setSelectedItem(result.getString("nomEnca"));
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
        String sql2="select idEnca from encadrent where nomEnca='"+jComboBox1.getSelectedItem().toString()+"'";
        int idEnca = 0;
        try {
            st=cnx.prepareStatement(sql2);
            result=st.executeQuery();
            if(result.next()){
                 idEnca=result.getInt("idEnca");
            }
            //JOptionPane.showMessageDialog(null, "j'ai retourner lid enca"+idEnca+"");
            } catch (SQLException ex) {
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null,ex);
        }
        String sql1="select stageId from stage where stageProjet='"+jComboBox2.getSelectedItem().toString()+"'";
        int stageId = 0;
        try {
            st=cnx.prepareStatement(sql1);
            result=st.executeQuery();
            if(result.next()){
                 stageId=result.getInt("stageId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        } 
        try {
            if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField11.getText().equals("")&&!jComboBox2.getSelectedItem().toString().equals("Selectionner")&&!jComboBox1.getSelectedItem().toString().equals("Selectionner")&&!jTextField7.getText().equals("")){
            st=cnx.prepareStatement(sql);
            st.setString(1, jTextField1.getText());
            st.setString(2, jTextField2.getText());
            st.setString(3, jTextField4.getText());
            st.setString(4, jTextField3.getText());
            st.setString(5, jTextField11.getText());
            st.setInt(6, stageId);
            st.setInt(7, idEnca);
            st.setString(8, jTextField7.getText());
            st.execute();
            JOptionPane.showMessageDialog(null, "le stagiaire a été modifié avec succès!");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField4.setText("");
            jTextField3.setText("");
            jTextField11.setText("");
            jTextField7.setText("");
            jComboBox1.setSelectedItem("selectionner");
            jComboBox2.setSelectedItem("selectionner");
            UpdateTable();
            }else{
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstagiaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void UpdateTable(){
         String sql="select Id,NomComplet,mail,NumTele,CIN,Etablissement,stageProjet,nomEnca,Specialite from stagiaire,encadrent,stage where Projet=stageId and Encadrent=idEnca";
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
