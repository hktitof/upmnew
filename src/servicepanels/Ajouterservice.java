package servicepanels;

import connection.ConnexionMysql;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Ajouterservice extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Ajouterservice() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(580, 418));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 90, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom du service"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 490, 150));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("actualier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 90, 30));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Chef du service:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Nom d'u service :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Service add.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String Nomsrv=jTextField1.getText();
        String chef=jTextField2.getText();
        String sql= "insert into service(serviceNom,serviceChef) values(?,?)";
        try {
            if(!Nomsrv.equals("")&&!chef.equals("")){
                Pattern patt1 = Pattern.compile("^[a-zA-Z àâäéèêëîïôöûü]+$");
                Matcher m1 = patt1.matcher(Nomsrv);
                Matcher m2 = patt1.matcher(chef);
                if (m1.find()&& m2.find()){   
                   
                    st=cnx.prepareStatement(sql);
                    st.setString(1, Nomsrv);
                    st.setString(2, chef);
                    st.execute();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    JOptionPane.showMessageDialog(null, "Service ajouté avec succès!");
                    UpdateTable();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Les champs de saisi doivent pas contenir que des lettres");
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed
      public void UpdateTable(){
         String sql="select serviceNom,serviceChef from service";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Homeservice.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
