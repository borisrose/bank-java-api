package com.bank.api.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bank.api.model.User;
import com.bank.api.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Iterable<User> findAll(){
		return userRepository.findAll();
	}

	
}