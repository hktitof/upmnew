/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainerpannels;

import home_page.Encadrent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESSAKHI Hamza
 */
public class Homestagiaire extends javax.swing.JPanel {

    /**
     * Creates new form Homestagiaire
     */
    public Homestagiaire() {
        initComponents();
         showecad();
    }
    public ArrayList<StagiaireListe> stgrList () {
     ArrayList<StagiaireListe> stgrList;
        stgrList = new ArrayList<>();
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gsdba","root","");
             Statement st=con.createStatement();
             ResultSet rs = st.executeQuery("select stagiaireId,stagiaireNom,stagiairePrenom,stagiaireCin,stagiairetelephone,stagiaireadress,nometablissement,specialiteNom,encadrentnom,encadrentprenom,stageprojet from stagiaire,etablissement,specialite,stage,encadrent where stagiaire.stagiairespecialite=specialite.specialiteID and stagiaire.stgiaireEtablissement=etablissement.etablissementId and stagiaire.stagiaireencadrent=encadrent.encadrentID and stagiaire.stagiairestage=stage.stageid;");
             StagiaireListe ser;
             while(rs.next()){
                 ser= new StagiaireListe(rs.getInt("stagiaireId"),rs.getInt("stagiairetelephone"),rs.getString("stagiaireNom"),rs.getString("stagiaireprenom"),rs.getString("stagiaireCin"),rs.getString("stagiaireadress"),rs.getString("nometablissement"),rs.getString("specialiteNom"),rs.getString("encadrentnom"),rs.getString("encadrentprenom"),rs.getString("stageprojet")); 
                      
                 stgrList.add(ser);
             }
                 }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return stgrList;
    }
     public void showecad(){
        ArrayList<StagiaireListe> list = stgrList();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        Object[] row =new Object [11];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getNom();
            row[2]=list.get(i).getPrenom();
            row[3]=list.get(i).getCin();
            row[4]=list.get(i).getTele();
            row[5]=list.get(i).getAdress();
            row[6]=list.get(i).getEta();
            row[7]=list.get(i).getSpec();
            row[8]=list.get(i).getEnca();
            row[9]=list.get(i).getTp();
            row[10]=list.get(i).getStag();
                    
            model.addRow(row);   
        }   
    }
   
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOM", "PRENOM", "CIN", "ADRESS", "TELEPHON", "ETABLISSEMENT", "SPECIALITE", "ENCADREMENTNom", "Encadrementprenom", "STAGE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("CIN :");

        jButton1.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
