package com.demo.model;

/*
private String role;

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}*/
public class UserRegistration {
	private String username;
	private String password;
	private String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
}