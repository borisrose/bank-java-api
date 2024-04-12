package com.bank.api.repository;
import org.springframework.data.repository.CrudRepository;

import com.bank.api.model.Account;


public interface AccountRepository  extends CrudRepository<Account, Integer> {

}

