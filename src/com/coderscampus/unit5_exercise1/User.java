package com.coderscampus.unit5_exercise1;

public class User {
	private String username;
	private String password;
	private String name;
	
	User (String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	

	String getInfo () {
		return "Username: " + username + ", Password: " + password + ", Name: " + name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
