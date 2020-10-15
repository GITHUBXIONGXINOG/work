package com.chinasoft.controller._06_paramuser;

public class login_User {
 
	private String username;
	private String password;
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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	public login_User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public login_User() {
		super();
		// TODO Auto-generated constructor stub
	}
   
 

}
