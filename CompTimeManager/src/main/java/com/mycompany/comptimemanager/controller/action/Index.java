package com.mycompany.comptimemanager.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.comptimemanager.model.entity.User;

public class Index implements Action {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("userAuthorized");

		request.setAttribute("user", user);
		
		return "forward:index.jsp";
	}
}
