package com.mycompany.comptimemanager.model.entity;

public class User extends BaseEntity implements IUser {
	private String Login;
	private String Password;
	
	public User() {
		super();
	}
	
	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		this.Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public boolean validate(String login, String Password) {
		if(!this.Login.equals(login)) {
			return false;
		}
		
		if(!this.Password.equals(Password)) {
			return false;
		}
		
		return true;
	}
}
