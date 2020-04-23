package servicepanels;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Modifierservice extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Modifierservice() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
    }

     public void UpdateTable(){
         String sql="select * from service";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            tableEditService.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Homeservice.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEditService = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 89, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("actualier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 30));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tableEditService.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEditService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEditServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEditService);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 490, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Nom d'u service :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 20));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Chef du service:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 20));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Service Modify.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
        
    }//GEN-LAST:event_formMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
       
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tableEditServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEditServiceMouseClicked

        int ligne=tableEditService.getSelectedRow();
        String id= tableEditService.getModel().getValueAt(ligne, 0).toString();
        String sql="select * from service where serviceId = '"+ id+"'";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            if(result.next()){
                jTextField2.setText(result.getString("serviceChef"));
                jTextField1.setText(result.getString("serviceNom"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modifierservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableEditServiceMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int ligne=tableEditService.getSelectedRow();
        String id= tableEditService.getModel().getValueAt(ligne, 0).toString();
        String sql="update service set serviceNom = ? ,serviceChef = ? where serviceId='"+id+"'";
        try {
            if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")){
                Pattern patt1 = Pattern.compile("^[a-zA-Z àâäéèêëîïôöûü]+$");
                Matcher m1 = patt1.matcher(jTextField1.getText());
                Matcher m2 = patt1.matcher(jTextField2.getText());
                if (m1.find()&& m2.find()){  
                    st=cnx.prepareStatement(sql);
                    st.setString(1, jTextField1.getText());
                    st.setString(2, jTextField2.getText());
                    st.execute();
                    JOptionPane.showMessageDialog(null, "le service a été modifié avec succès!");
                    jTextField2.setText("");
                    jTextField1.setText("");
                    UpdateTable();
                }else{
                    JOptionPane.showMessageDialog(null, "Les champs de saisi doivent pas contenir que des lettres");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Modifierservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tableEditService;
    // End of variables declaration//GEN-END:variables
}
