package com.bank.api.repository;
import org.springframework.data.repository.CrudRepository;

import com.bank.api.model.Transaction;



public interface TransactionRepository  extends CrudRepository<Transaction, Integer> {

}

