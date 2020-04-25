
package home;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author latifa
 */
public class mails extends javax.swing.JPanel {

    /**
     * Creates new form conversations
     */
    public mails() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(570, 420));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 26, 498, 31));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 68, 498, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Envoyer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 84, 33));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 117, 498, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("à   :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, 54, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Objet :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 54, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mail=jTextField1.getText();
        try {
            sendMail(mail);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Echec d'envoie!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public  void sendMail(String recepient) throws Exception {
        
        System.out.println("Preparing to send email...");
        Properties properties = new Properties();

        //Enable authentication
        properties.put("mail.smtp.auth", "true");
        //Set TLS encryption enabled
        properties.put("mail.smtp.starttls.enable", "true");
        //Set SMTP host
        properties.put("mail.smtp.host", "smtp.gmail.com");
        //Set smtp port
        properties.put("mail.smtp.port", "587");

        //Your gmail address
        final String myAccountEmail = "m.latiiifa@gmail.com";
        //Your gmail password
        final String password = "123456azer";

        //Create a session with account credentials
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //Prepare email message
        Message message = prepareMessage(session, myAccountEmail, recepient);

        //Send mail
        Transport.send(message);
        JOptionPane.showMessageDialog(null, "Message envoyé");
    }
    private  Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        String text=jTextArea1.getText();
        String objet=jTextField2.getText();
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject(objet);
            String htmlCode = "<h1> "+ text +" </h1> <br/> <h2><b> </b></h2>";
            message.setContent(htmlCode, "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(mails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
