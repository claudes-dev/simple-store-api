package com.claudes.simplestore.dto.mapper;

import com.claudes.simplestore.dto.CreateUserDtoRequest;
import com.claudes.simplestore.model.User;

public class CreateUserMapper {

	 public static User createToEntity(CreateUserDtoRequest createUserDTO){
	        return new User(createUserDTO.getName(),
	        				createUserDTO.getEmail(),
	        				createUserDTO.getSenha());
	                
	    }
}
