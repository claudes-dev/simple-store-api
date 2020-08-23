package com.claudes.simplestore.dto;

import lombok.Data;

@Data
public class CreateUserDtoRequest {
	
	private String name;
	private String email;
	private String senha;

}
