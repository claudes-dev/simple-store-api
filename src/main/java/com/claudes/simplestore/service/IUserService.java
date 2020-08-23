package com.claudes.simplestore.service;

import com.claudes.simplestore.dto.CreateUserDtoRequest;
import com.claudes.simplestore.model.User;

public interface IUserService {

	User createUser(CreateUserDtoRequest user);

}
