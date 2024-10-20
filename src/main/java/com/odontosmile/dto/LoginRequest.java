package com.odontosmile.dto;

import com.odontosmile.enums.UserProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private UserProfile userProfile;
    private Long documentNumber;
    private String password;
}
