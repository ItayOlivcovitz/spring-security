package com.easybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String seyWelcome() {
        return "Welcome to Spring Application with out security";
    }

}
