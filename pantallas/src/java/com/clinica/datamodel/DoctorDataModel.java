
package com.clinica.datamodel;

import com.clinica.bean.DoctorBean;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;


public class DoctorDataModel extends ListDataModel<DoctorBean> implements SelectableDataModel<DoctorBean> {
    public DoctorDataModel(){}
    
    public DoctorDataModel(List<DoctorBean> h){
        super(h);
    }
    
    @Override
    public Object getRowKey(DoctorBean d) {
        return d.getCodDoc().intValue()+"";
    }

    @Override
    public DoctorBean getRowData(String rowKey) {
        List<DoctorBean> DoctorList = (List<DoctorBean>)getWrappedData();
        
        for(DoctorBean d : DoctorList){
            if(d.getCodDoc().compareTo(Long.parseLong(rowKey))==0){
                return d;
            }
        }
        return null;
    }   
    
}
