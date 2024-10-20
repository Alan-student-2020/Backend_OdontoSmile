package com.odontosmile.service.login;

import com.odontosmile.dto.LoginRequest;
import com.odontosmile.model.Administrator;
import com.odontosmile.model.Dentist;
import com.odontosmile.model.Receptionist;
import com.odontosmile.service.administrator.AdministratorService;
import com.odontosmile.service.dentist.DentistService;
import com.odontosmile.service.receptionist.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private ReceptionistService receptionistService;

    @Autowired
    private DentistService dentistService;

    @Override
    public Administrator loginAdministrator(LoginRequest loginRequest) {
        try{
            var administrator = administratorService.getByDocumentNumber(loginRequest.getDocumentNumber());
            if(administrator!=null){
                if(administrator.getPassword().equals(loginRequest.getPassword())){
                    return administrator;
                }else{
                    return null;
                }
            }else{
                return null;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Receptionist loginReceptionist(LoginRequest loginRequest) {
        try{
            var receptionist = receptionistService.getByDocumentNumber(loginRequest.getDocumentNumber());
            if(receptionist!=null){
                if(receptionist.getPassword().equals(loginRequest.getPassword())){
                    return receptionist;
                }else{
                    return null;
                }
            }else{
                return null;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Dentist loginDentist(LoginRequest loginRequest) {
        try{
            var dentist = dentistService.getByDocumentNumber(loginRequest.getDocumentNumber());
            if(dentist!=null){
                if(dentist.getPassword().equals(loginRequest.getPassword())){
                    return dentist;
                }else{
                    return null;
                }
            }else{
                return null;
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
