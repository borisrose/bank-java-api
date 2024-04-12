package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.model.Account;
import com.bank.api.services.AccountService;



@RestController // This means that this class is a Controller
@RequestMapping(path = "api/accounts") // This means URL's start with /demo (after Application path)
public class AccountController {
    @Autowired
    private AccountService accountService;

    // @GetMapping(path = "/all")
    // public @ResponseBody Iterable<Account> getAllAccounts() {
    //     // This returns a JSON or XML with the users
      
    // }
}