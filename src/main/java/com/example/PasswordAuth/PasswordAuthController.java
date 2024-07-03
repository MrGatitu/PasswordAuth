package com.example.PasswordAuth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordAuthController {

    @Autowired
    private PassAuthService passAuthService;

    @GetMapping("/encode")
    public String encodePassword(@RequestParam String password) {
        passAuthService.encodeAndPrintPassword(password);
        return "Password encoded and printed in the console";
    }
}
