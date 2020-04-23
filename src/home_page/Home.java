
package home_page;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import net.proteanit.sql.DbUtils;

public class Home extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Home() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        UpdateTable();
        remplirComboBox();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 460));
        setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox1);
        jComboBox1.setBounds(160, 52, 179, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Nom du stagiaire :");
        add(jLabel4);
        jLabel4.setBounds(26, 55, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Date d'absence :");
        add(jLabel5);
        jLabel5.setBounds(26, 87, 130, 20);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jFormattedTextField1);
        jFormattedTextField1.setBounds(160, 87, 179, 24);

        jCheckBox1.setText("Justifié");
        add(jCheckBox1);
        jCheckBox1.setBounds(345, 88, 100, 23);

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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 530, 250);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(263, 120, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(453, 153, 100, 30);

        jButton3.setText("Envoyer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(450, 20, 73, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom =jComboBox1.getSelectedItem().toString();
        String date=jFormattedTextField1.getText();
        String justif;
        if(jCheckBox1.isSelected()){
            justif="justifé";
        }else{
            justif="non justifié";
        }
        String sql1="select Id from stagiaire where NomComplet='"+jComboBox1.getSelectedItem().toString()+"'";
        int Id = 0;
        try {
            st=cnx.prepareStatement(sql1);
            result=st.executeQuery();
            if(result.next()){
                 Id=result.getInt("Id");
            }
            } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null,ex);
        }
        String sql= "insert into absence(nom,dateAbs,justifie) values(?,?,?)";
        try {
            if(!nom.equals("Selectionner")&&!date.equals("")){
                    st=cnx.prepareStatement(sql);
                    st.setInt(1, Id);
                    st.setString(2, date);
                    st.setString(3, justif);
                    st.execute();
                    jComboBox1.setSelectedItem("selectionner");
                    jFormattedTextField1.setText("");
                    JOptionPane.showMessageDialog(null, "absence ajoutée avec succès!");
                    jComboBox1.setSelectedItem("selectionner");
                    jCheckBox1.setSelected(false);
                    UpdateTable();
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed
 public void remplirComboBox(){
        String sql="select * from stagiaire";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            while(result.next()){
                String nom=result.getString("NomComplet");
                jComboBox1.addItem(nom);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public void UpdateTable(){
         String sql="select NomComplet,dateAbs,justifie from absence,stagiaire where nom=Id";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
