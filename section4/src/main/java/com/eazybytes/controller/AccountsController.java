package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/myAccount")
    public String getAcountDetails() {
        return "Here are the account details from the db";
    }

}
