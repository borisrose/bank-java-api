package com.bank.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.model.Transaction;

import com.bank.api.services.TransactionService;

@RestController // This means that this class is a Controller
@RequestMapping(path = "/api/transactions") // This means URL's start with /demo (after Application path)
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    // @GetMapping(path = "/all")
    // public @ResponseBody Iterable<Transaction> getAllTransactions() {
    //     // This returns a JSON or XML with the users

    // }
}