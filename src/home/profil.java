
package home;

import connection.ConnexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class profil extends javax.swing.JPanel {
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public profil() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        String sql ="select * from userconnect where idUser=(select MAX(idUser) from userconnect)";
        try {
            st=cnx.prepareStatement(sql);
            result=st.executeQuery();
            while(result.next()){
                jTextField2.setText(result.getString("nomUtilisatr"));
                jTextField1.setText(result.getString("Mdp"));
                jTextField4.setText(result.getString("nomUser"));
                jTextField5.setText(result.getString("teleUser"));
                byte[] img =result.getBytes("photo");
                ImageIcon image=new ImageIcon(img);
                java.awt.Image im =image.getImage();
                java.awt.Image myImg=im.getScaledInstance(220, 240, java.awt.Image.SCALE_SMOOTH);
                ImageIcon imgg=new ImageIcon(myImg);
                jLabel1.setIcon(imgg);
                jLabel6.setText(result.getString("nomUser"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "une erreur qlq part");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 30));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Mot de passe :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Nom d'utilisateur :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Nom complet :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 20));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Numéro de téléphone :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, 20));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 30));

        jPanel1.setLayout(new java.awt.GridLayout());
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 240));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 240, 40));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Bienvenue ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
