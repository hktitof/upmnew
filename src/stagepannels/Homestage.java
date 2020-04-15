package stagepannels;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import servicepanels.Homeservice;
import trainerpannels.StagiaireListe;

public class Homestage extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Homestage() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
    }

     public void UpdateTable(){
         String sql="select stageProjet,serviceNom,stageDebut,stageFin from stage,service where stageService=serviceId";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Homeservice.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROJET", "SERVICE", "DATE DE DEBUT", "DATE DE FIN", "ENCADRENT NOM", "ENCADRENT PRENOM"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 550, 268));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Chercher");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 90, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Le projet du stage : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
