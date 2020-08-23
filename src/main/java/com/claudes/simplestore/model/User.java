package com.claudes.simplestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String senha;

	public User() {

	}

	public User(String name, String email, String senha) {
		this.name = name;
		this.email = email;
		this.senha = senha;
	}

}
