package com.mycompany.comptimemanager.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.comptimemanager.model.entity.WorkHour;
import com.mycompany.comptimemanager.model.persistence.DataBase;

public class AddWorkHours implements Action {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String date = request.getParameter("date");
		
		WorkHour workHour = new WorkHour(date, start, end);
		DataBase db = new DataBase();
		db.addWorkHour(workHour, (Integer)session.getAttribute("Id"));
		
		return "redirect:entry?action=WorkHours";
	}

}
