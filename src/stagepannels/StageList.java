/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stagepannels;

import java.sql.Date;

/**
 *
 * @author ESSAKHI Hamza
 */
public class StageList {
   
    private String stage,service, encanom,encadprenom;
    private Date de;
    private Date fin;

    public StageList(String stage, String service, String encanom, String encadprenom, Date de, Date fin) {
        this.stage = stage;
        this.service = service;
        this.encanom = encanom;
        this.encadprenom = encadprenom;
        this.de = de;
        this.fin = fin;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getEncanom() {
        return encanom;
    }

    public void setEncanom(String encanom) {
        this.encanom = encanom;
    }

    public String getEncadprenom() {
        return encadprenom;
    }

    public void setEncadprenom(String encadprenom) {
        this.encadprenom = encadprenom;
    }

    public Date getDe() {
        return de;
    }

    public void setDe(Date de) {
        this.de = de;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
    

}