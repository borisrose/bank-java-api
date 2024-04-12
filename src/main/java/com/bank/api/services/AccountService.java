package com.bank.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.api.repository.AccountRepository;


@Service
public class AccountService  {
	@Autowired
	private AccountRepository accountRepository;



	
}