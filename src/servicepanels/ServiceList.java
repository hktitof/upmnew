/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicepanels;

/**
 *
 * @author ESSAKHI Hamza
 */
public class ServiceList {
    private int serviceid;
    private String serviceNom;

    public ServiceList(int serviceid, String serviceNom) {
        this.serviceid = serviceid;
        this.serviceNom = serviceNom;
    }

    public int getServiceid() {
        return serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public String getServiceNom() {
        return serviceNom;
    }

    public void setServiceNom(String serviceNom) {
        this.serviceNom = serviceNom;
    }
}
