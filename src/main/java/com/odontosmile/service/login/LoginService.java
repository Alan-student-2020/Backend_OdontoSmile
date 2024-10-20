package com.odontosmile.service.login;

import com.odontosmile.dto.LoginRequest;
import com.odontosmile.model.Administrator;
import com.odontosmile.model.Dentist;
import com.odontosmile.model.Receptionist;

public interface LoginService {
    Administrator loginAdministrator(LoginRequest loginRequest);
    Receptionist loginReceptionist(LoginRequest loginRequest);
    Dentist loginDentist(LoginRequest loginRequest);
}
