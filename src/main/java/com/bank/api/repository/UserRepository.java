package com.bank.api.repository;
import org.springframework.data.repository.CrudRepository;

import com.bank.api.model.User;


public interface UserRepository  extends CrudRepository<User, Integer> {

}

