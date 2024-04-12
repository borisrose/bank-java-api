package com.bank.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.bank.api.services.JWTService;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class LoginController {
    public JWTService jwtService;
    public LoginController(JWTService jwtService){
        this.jwtService = jwtService;

    }

    @PostMapping("/login")
    public String getToken(Authentication authentication) {
        String token = jwtService.generateToken(authentication);
        return token;
    }
    
}
