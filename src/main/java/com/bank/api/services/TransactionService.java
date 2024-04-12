package com.bank.api.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.api.repository.TransactionRepository;


@Service
public class TransactionService {
	@Autowired
	private TransactionRepository transactionRepository;



	
}