package stagepannels;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Modifierstage extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Modifierstage() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
        remplirComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txt_internshipProject = new javax.swing.JTextField();
        txt_startDate = new javax.swing.JTextField();
        txt_endDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 88, 31));
        add(txt_internshipProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 150, 30));
        add(txt_startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));
        add(txt_endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Nom du service :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Projet du stage :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Date début :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setText("date fin :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 20));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 500, 110));

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selectionner" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Stage Modify.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int ligne=jTable1.getSelectedRow();
        String id= jTable1.getModel().getValueAt(ligne, 0).toString();
        String sql="select * from stage where stageId = '"+ id+"'";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            if(result.next()){
                jComboBox1.setSelectedItem(result.getString("stageService"));
                txt_internshipProject.setText(result.getString("stageProjet"));
                txt_startDate.setText(result.getString("stageDebut"));
                txt_endDate.setText(result.getString("stageFin"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ligne=jTable1.getSelectedRow();
        String id= jTable1.getModel().getValueAt(ligne, 0).toString();
        String sql="update stage set stageService = ? ,stageProjet = ?,stageDebut= ?,stageFin = ? where stageId='"+id+"'";
        try {
            st=cnx.prepareStatement(sql);
            st.setString(1, jComboBox1.getSelectedItem().toString());
            st.setString(2, txt_internshipProject.getText());
            st.setString(3, txt_startDate.getText());
            st.setString(4, txt_endDate.getText());
            st.execute();
            JOptionPane.showMessageDialog(null, "le stage a été modifié avec succès!");
        } catch (SQLException ex) {
            Logger.getLogger(Modifierstage.class.getName()).log(Level.SEVERE, null, ex);
        }
        UpdateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void UpdateTable(){
         String sql="select * from stage";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterstage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void remplirComboBox(){
        String sql="select * from service";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            while(result.next()){
                String nom=result.getString("serviceNom");
                jComboBox1.addItem(nom);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterstage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_endDate;
    private javax.swing.JTextField txt_internshipProject;
    private javax.swing.JTextField txt_startDate;
    // End of variables declaration//GEN-END:variables
}
