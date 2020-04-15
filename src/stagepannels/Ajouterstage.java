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

public class Ajouterstage extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Ajouterstage() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 88, 31));
        add(txt_internshipProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 150, 30));

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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 490, 140));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "selectionner" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 30));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Stage add.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String projet=txt_internshipProject.getText();
        String service=jComboBox1.getSelectedItem().toString();
        String debut=jFormattedTextField1.getText();
        String fin=jFormattedTextField2.getText();
        String sql2="select serviceId from service where serviceNom='"+jComboBox1.getSelectedItem().toString()+"'";
        int serviceId = 0;
        try {
            st=cnx.prepareStatement(sql2);
            result=st.executeQuery();
            if(result.next()){
                 serviceId=result.getInt("serviceId");
            }
            //JOptionPane.showMessageDialog(null, "j'ai retourner lid enca"+idEnca+"");
            } catch (SQLException ex) {
            Logger.getLogger(Ajouterstage.class.getName()).log(Level.SEVERE, null,ex);
        }
        String sql= "insert into stage(stageProjet,stageService,stageDebut,stageFin) values(?,?,?,?)";
        try {
            if(!projet.equals("")&&!service.equals("")&&!debut.equals("")&&!fin.equals("")){
            st=cnx.prepareStatement(sql);
            st.setString(1, projet);
            st.setInt(2, serviceId);
            st.setString(3, debut);
            st.setString(4, fin);
            st.execute();
            txt_internshipProject.setText("");
            jComboBox1.setSelectedItem("selectionner");
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");
            JOptionPane.showMessageDialog(null, "stage ajouté avec succès!");
            UpdateTable();
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterstage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void UpdateTable(){
         String sql="select stageProjet,serviceNom,stageDebut,stageFin from stage,service where stageService=serviceId";
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
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_internshipProject;
    // End of variables declaration//GEN-END:variables
}
