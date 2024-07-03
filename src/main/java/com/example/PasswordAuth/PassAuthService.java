package com.example.PasswordAuth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PassAuthService {
    private String passwordInput;

    public String getPasswordInput() {
        return passwordInput;
    }

    public PassAuthService(String passwordInput){

        this.passwordInput =passwordInput;

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
        String result = encoder.encode(passwordInput);

        System.out.println(result);
    }
    public void encodeAndPrintPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String result = encoder.encode(password);
        System.out.println(result);
    }

    public static void main(String[] args) {

        PassAuthService newPass = new PassAuthService("Hello1234Pass");
        
    }
}
