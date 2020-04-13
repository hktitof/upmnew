
package login_form;
import connection.ConnexionMysql;
import home_page.Home_page;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author abdellatifanaflous
 */
public class Lofin_Page extends javax.swing.JFrame {
    public Home_page home;
    public Connection cnx;
    public PreparedStatement st;
    public ResultSet result;
    public Lofin_Page() {
        initComponents();
        cnx=ConnexionMysql.ConnexionDB();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1_Username = new javax.swing.JTextField();
        jPasswordField1_Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_Username.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jTextField1_Username.setForeground(new java.awt.Color(150, 150, 150));
        jTextField1_Username.setText("username");
        jTextField1_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_UsernameFocusLost(evt);
            }
        });
        getContentPane().add(jTextField1_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 250, 40));

        jPasswordField1_Password.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jPasswordField1_Password.setForeground(new java.awt.Color(150, 150, 150));
        jPasswordField1_Password.setText("password");
        jPasswordField1_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1_PasswordFocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField1_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 250, 40));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(100, 100, 100));
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 140, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(100, 100, 100));
        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 140, 40));

        password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(100, 100, 100));
        password.setText("Show Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_form/last one 3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 551, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_UsernameFocusGained
        // TODO add your handling code here:
        if(jTextField1_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField1_Username.setText("");
            jTextField1_Username.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_jTextField1_UsernameFocusGained

    private void jTextField1_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_UsernameFocusLost
        // TODO add your handling code here:
        if(jTextField1_Username.getText().trim().equals("") || 
                jTextField1_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField1_Username.setText("username");
            jTextField1_Username.setForeground(new Color (150,150,150));
        }
        
    }//GEN-LAST:event_jTextField1_UsernameFocusLost

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        if (password.isSelected()){
            jPasswordField1_Password.setEchoChar((char)0);
        }else{
            jPasswordField1_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void jPasswordField1_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1_PasswordFocusLost
        // TODO add your handling code here:
         String pass = String.valueOf(jPasswordField1_Password.getPassword());
         if(pass.trim().equals("") || 
                pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1_Password.setText("password");
            jPasswordField1_Password.setForeground(new Color (150,150,150));
        }
        
    }//GEN-LAST:event_jPasswordField1_PasswordFocusLost

    private void jPasswordField1_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1_PasswordFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jPasswordField1_Password.getPassword());
         if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField1_Password.setText("");
            jPasswordField1_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField1_PasswordFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql="select * from admin where Username= '"+jTextField1_Username.getText()+"'and Password = '"+String.valueOf(jPasswordField1_Password.getPassword())+"'";
        try{
            st =cnx.prepareStatement(sql);
            result=st.executeQuery();
            if(result.next()){
                home=new Home_page();
                home.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nom d'utilisateur ou mot de passe incorrect");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "not connected to database");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lofin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lofin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lofin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lofin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lofin_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1_Password;
    private javax.swing.JTextField jTextField1_Username;
    private javax.swing.JCheckBox password;
    // End of variables declaration//GEN-END:variables
}
