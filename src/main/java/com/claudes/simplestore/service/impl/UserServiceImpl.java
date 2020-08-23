package com.claudes.simplestore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudes.simplestore.dto.CreateUserDtoRequest;
import com.claudes.simplestore.dto.mapper.CreateUserMapper;
import com.claudes.simplestore.model.User;
import com.claudes.simplestore.repository.UserRepository;
import com.claudes.simplestore.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository repository;
	
	@Override
	public User createUser(CreateUserDtoRequest user) {
		return repository.save(CreateUserMapper.createToEntity(user));
	}

}
