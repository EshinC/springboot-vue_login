package com.example.login.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin")
public class Admin implements Serializable

{
	@Column(nullable = false)
	private String name;

	@Column(nullable = false,unique = true)
	protected String username;

	@Column(nullable = false,unique = false)
	protected String password;

	@Id
	@Column(unique = true,nullable = false)
	@GeneratedValue(strategy= GenerationType.TABLE)
	protected int id;

	public Admin(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



}

