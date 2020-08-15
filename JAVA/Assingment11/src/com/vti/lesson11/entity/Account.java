package com.vti.lesson11.entity;

public class Account {
	@Override
	public String toString() {
		return "Account [username=" + username + ", email=" + email + "]";
	}
	private String username;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	
}
