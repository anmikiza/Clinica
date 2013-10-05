
package com.clinica.bean;

/**
 *
 * @author GERARDO
 */
public class DoctorBean {
    
    private Long codDoc;
    private Integer dniDoc;
    private String nomDoc;
    private String sexDoc;
    private String nomEspe;

    public Long getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(Long codDoc) {
        this.codDoc = codDoc;
    } 

    public Integer getDniDoc() {
        return dniDoc;
    }

    public void setDniDoc(Integer dniDoc) {
        this.dniDoc = dniDoc;
    }     

    public String getNomDoc() {
        return nomDoc;
    }

    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }

    public String getNomEspe() {
        return nomEspe;
    }

    public void setNomEspe(String nomEspe) {
        this.nomEspe = nomEspe;
    }

    public String getSexDoc() {
        return sexDoc;
    }

    public void setSexDoc(String sexDoc) {
        this.sexDoc = sexDoc;
    }   
    
    
}
