package com.mycompany.comptimemanager.model.entity;

public interface IUser {
	public String getLogin();
	public void setLogin(String login);
	public String getPassword(); 
	public void setPassword(String Password);
	public boolean validate(String login, String Password);
}
