
package com.clinica.dao;

import com.clinica.bean.Personal;


public class PersonalDAO {
    
    public Personal validarUsuario(String user, String password){
        Personal personal = null;
        try{
            if(user.equals("admin123") && password.equals("123456")){
                personal = new Personal();
                personal.setUsr_psn(user);
                personal.setClav_psn(password);
            }
        }catch(Exception e){
            e.getMessage();
        }        
        return personal;
    }
    
    
}
