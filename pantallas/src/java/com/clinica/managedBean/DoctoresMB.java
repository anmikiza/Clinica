package com.clinica.managedBean;

import com.clinica.bean.DoctorBean;
import com.clinica.datamodel.DoctorDataModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "doctoresMB")
@ViewScoped
public class DoctoresMB {

    public List<DoctorBean> listaBusquedaDoctores;
    
    public DoctorDataModel doctorDM;
    
    public DoctorBean doctorSelected;
           

    public DoctoresMB() {
        listaBusquedaDoctores = new ArrayList<DoctorBean>();
        doctorDM = new DoctorDataModel(listaBusquedaDoctores);
    }

    public List<DoctorBean> getListaBusquedaDoctores() {
        return listaBusquedaDoctores;
    }

    public void setListaBusquedaDoctores(List<DoctorBean> listaBusquedaDoctores) {
        this.listaBusquedaDoctores = listaBusquedaDoctores;
    }

    public DoctorBean getDoctorSelected() {
        return doctorSelected;
    }

    public void setDoctorSelected(DoctorBean doctorSelected) {
        this.doctorSelected = doctorSelected;
    }

    public DoctorDataModel getDoctorDM() {
        return doctorDM;
    }

    public void setDoctorDM(DoctorDataModel doctorDM) {
        this.doctorDM = doctorDM;
    }   

    public void consultaDoctores() {       
        DoctorBean doctor;
        for (int i = 0; i < 5; i++) {
           doctor = new DoctorBean();
           doctor.setCodDoc(i + 1l);
           doctor.setDniDoc(5468471 + i);
           doctor.setNomDoc("Gerardo Pacheco" + (i + 1));
           doctor.setSexDoc("Masculino");
           doctor.setNomEspe("Cirugia");
           listaBusquedaDoctores.add(doctor);
        }
        doctorDM = new DoctorDataModel(listaBusquedaDoctores);
        RequestContext.getCurrentInstance().update("frmConsultaDoctor:tblConsultaDoctor");
    }
    
    public void preEditarDoctor(){
        RequestContext.getCurrentInstance().update("frmConsultaDoctor:dlgEditaDoctor");
        RequestContext.getCurrentInstance().execute("frmConsultaDoctor:dlgEditaDoctor.show()");
    }
    
}
