package com.springboot.mongodb.example.springbootmongo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.example.springbootmongo.repository.User;
import com.springboot.mongodb.example.springbootmongo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping(value = "/saveUser")
	public User saveUser() {
		User user = new User();
		user.setName("Samarth");
		return userRepository.insert(user);
	}


	@GetMapping(value = "/saveUser1")
	public User saveUser1() {
		User user = new User();
		user.setName("Esha");
		return userRepository.save(user);
	}

}
