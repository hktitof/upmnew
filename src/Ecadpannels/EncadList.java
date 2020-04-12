/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecadpannels;

import java.util.logging.Logger;

/**
 *
 * @author ESSAKHI Hamza
 */
public class EncadList {
    private int encadrentId ;
    private String  encadrentNom,  encadrentPrenom, encadrentNiveau, sexe,  adresse;

    public EncadList(int encadrentId, String encadrentNom, String encadrentPrenom, String encadrentNiveau, String sexe, String adresse) {
  
        this.encadrentNom = encadrentNom;
        this.encadrentPrenom = encadrentPrenom;
        this.encadrentNiveau = encadrentNiveau;
        this.sexe = sexe;
        this.adresse = adresse;
        this.encadrentId=encadrentId;
    }

    /**
     * @return the encadrentId
     */
    public int getEncadrentId() {
        return encadrentId;
    }

    /**
     * @param encadrentId the encadrentId to set
     */
    public void setEncadrentId(int encadrentId) {
        this.encadrentId = encadrentId;
    }

    /**
     * @return the encadrentNom
     */
    public String getEncadrentNom() {
        return encadrentNom;
    }

    /**
     * @param encadrentNom the encadrentNom to set
     */
    public void setEncadrentNom(String encadrentNom) {
        this.encadrentNom = encadrentNom;
    }

    /**
     * @return the encadrentPrenom
     */
    public String getEncadrentPrenom() {
        return encadrentPrenom;
    }

    /**
     * @param encadrentPrenom the encadrentPrenom to set
     */
    public void setEncadrentPrenom(String encadrentPrenom) {
        this.encadrentPrenom = encadrentPrenom;
    }

    /**
     * @return the encadrentNiveau
     */
    public String getEncadrentNiveau() {
        return encadrentNiveau;
    }

    /**
     * @param encadrentNiveau the encadrentNiveau to set
     */
    public void setEncadrentNiveau(String encadrentNiveau) {
        this.encadrentNiveau = encadrentNiveau;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}