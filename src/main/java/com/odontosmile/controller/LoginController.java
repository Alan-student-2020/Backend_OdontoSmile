package com.odontosmile.controller;

import com.odontosmile.dto.LoginRequest;
import com.odontosmile.enums.UserProfile;
import com.odontosmile.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    private ResponseEntity<?> Login(@RequestBody LoginRequest loginRequest){
        try{
            if(loginRequest.getUserProfile().equals(UserProfile.Administrator)){
                return new ResponseEntity<>(loginService.loginAdministrator(loginRequest), HttpStatus.OK);
            }else if (loginRequest.getUserProfile().equals(UserProfile.Receptionist)){
                return new ResponseEntity<>(loginService.loginReceptionist(loginRequest), HttpStatus.OK);
            }else{
                return new ResponseEntity<>(loginService.loginDentist(loginRequest), HttpStatus.OK);
            }
        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
