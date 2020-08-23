package com.claudes.simplestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudes.simplestore.dto.CreateUserDtoRequest;
import com.claudes.simplestore.model.User;
import com.claudes.simplestore.repository.UserRepository;
import com.claudes.simplestore.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	@Autowired
	private UserRepository repository;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody CreateUserDtoRequest user){
		
		return new ResponseEntity<User>(service.createUser(user), HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> listUsers(){
		
		return new ResponseEntity<List<User>>(repository.findAll(), HttpStatus.OK);
	}
	
}
