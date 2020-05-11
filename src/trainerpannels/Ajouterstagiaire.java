
package trainerpannels;

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

public class Ajouterstagiaire extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Ajouterstagiaire() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(153, 0, 153));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Ajouter ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 91, 35));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 130, 30));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 30));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, 30));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, 30));
        add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Nom complet :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Adresse mail :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel5.setText("Numéro du téléphone :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel6.setText("CIN :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Etablissement :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setText("Projet du stage :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel9.setText("Encadrent :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel10.setText("Spécialité :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selectionner" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, 30));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 200, 510, 160));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Actualiser ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 163, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_page/Stagiare Add.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom=jTextField1.getText();
        String mail=jTextField2.getText();
        String tele=jTextField4.getText();
        String cin=jTextField3.getText();
        String etabl=jTextField11.getText();
        String prj=jComboBox2.getSelectedItem().toString();
        String encad=jComboBox1.getSelectedItem().toString();
        String specia=jTextField5.getText();
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
        String sql= "insert into stagiaire(NomComplet,mail,NumTele,CIN,Etablissement,Projet,Encadrent,Specialite) values(?,?,?,?,?,?,?,?)";
        try {
            if(!nom.equals("")&&!mail.equals("")&&!tele.equals("")&&!cin.equals("")&&!etabl.equals("")&&!prj.equals("Selectionner")&&!encad.equals("Selectionner")&&!specia.equals("")){
            Pattern patt1 = Pattern.compile("^[a-zA-Z àâäéèêëîïôöûü]+$");
            Pattern patt2 = Pattern.compile("^[0-9]{10}$");
            Pattern patt3 = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)+$");
            Pattern patt4 = Pattern.compile("^[a-zA-Z 0123456789]+$");
            Matcher m1 = patt1.matcher(nom);
            Matcher m2 = patt1.matcher(etabl);
            Matcher m3 = patt1.matcher(specia);
            Matcher m4 = patt2.matcher(tele);
            Matcher m5 = patt3.matcher(mail);
            Matcher m6 = patt4.matcher(cin);
            if (m1.find()){
                if(m2.find()){
                    if(m3.find()){
                        if(m4.find()){
                            if(m5.find()){
                                if(m6.find()){
                                    st=cnx.prepareStatement(sql);
                                    st.setString(1, nom);
                                    st.setString(2, mail);
                                    st.setString(3, tele);
                                    st.setString(4, cin);
                                    st.setString(5, etabl);
                                    st.setInt(6,stageId );
                                    st.setInt(7, idEnca);
                                    st.setString(8, specia);
                                    st.execute();
                                    JOptionPane.showMessageDialog(null, "stagiaire ajouté avec succès!");
                                    jTextField1.setText("");
                                    jTextField2.setText("");
                                    jTextField4.setText("");
                                    jTextField3.setText("");
                                    jTextField11.setText("");
                                    jTextField5.setText("");
                                    jComboBox1.setSelectedItem("selectionner");
                                    jComboBox2.setSelectedItem("selectionner");
                                    UpdateTable();
                                }else{
                                    JOptionPane.showMessageDialog(null, "Veulliez saisir un CIN  valide");
                                }
                            }else{
                               JOptionPane.showMessageDialog(null, "Veulliez saisir un adresse mail valide"); 
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Le numéro de téléphone doit pas contenir que 10 chiffres");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Le nom de la spécialité doit pas contenir que des lettres");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Le nom de l'établissement doit pas contenir que des lettres");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Le nom du stagiaire doit pas contenir que des lettres");
            } 
            }else{
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Ajouterstagiaire.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
