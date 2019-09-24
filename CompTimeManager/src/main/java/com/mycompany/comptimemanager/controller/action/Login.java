package com.mycompany.comptimemanager.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.comptimemanager.model.entity.User;
import com.mycompany.comptimemanager.model.persistence.DataBase;

public class Login implements Action {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirectLinkDash = "entry?action=Dashboard";
		String redirectLinkLogin = "entry?action=LoginForm";
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		DataBase db = new DataBase();
		User user = db.validateLogin(login, password);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userAuthorized", user);
			return redirectLinkDash;
		}
		else
			return redirectLinkLogin;
	}

}
