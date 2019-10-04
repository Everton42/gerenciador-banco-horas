package com.mycompany.comptimemanager.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.comptimemanager.model.entity.User;
import com.mycompany.comptimemanager.model.entity.WorkHour;
import com.mycompany.comptimemanager.model.persistence.DataBase;

public class Dashboard implements Action{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DataBase db = new DataBase();
		List<WorkHour> listWk = db.getWorkHours();
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("userAuthorized");

		request.setAttribute("user", user);
		request.setAttribute("listWk", listWk);
		
		return "forward:dashboard.jsp";
	}

}
