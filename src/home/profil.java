
package home;

import connection.ConnexionMysql;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

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
                jLabel10.setText(result.getString("nomUtilisatr"));
                jLabel11.setText(result.getString("nomUser"));
                jLabel8.setText(result.getString("teleUser"));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 420));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Nom d'utilisateur :");
        add(jLabel3);
        jLabel3.setBounds(50, 110, 130, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Nom complet :");
        add(jLabel4);
        jLabel4.setBounds(50, 180, 170, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Numéro de téléphone :");
        add(jLabel5);
        jLabel5.setBounds(50, 260, 170, 20);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(jLabel1);

        add(jPanel1);
        jPanel1.setBounds(320, 110, 220, 200);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        add(jLabel6);
        jLabel6.setBounds(280, 20, 240, 40);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Bienvenue ");
        add(jLabel7);
        jLabel7.setBounds(140, 20, 140, 40);

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("jLabel8");
        add(jLabel8);
        jLabel8.setBounds(50, 280, 240, 30);

        jLabel10.setBackground(new java.awt.Color(153, 153, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 255));
        jLabel10.setText("jLabel8");
        add(jLabel10);
        jLabel10.setBounds(50, 130, 260, 30);

        jLabel11.setBackground(new java.awt.Color(153, 153, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("jLabel8");
        add(jLabel11);
        jLabel11.setBounds(50, 200, 250, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
