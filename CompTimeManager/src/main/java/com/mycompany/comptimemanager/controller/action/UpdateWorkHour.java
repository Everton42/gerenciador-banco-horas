package com.mycompany.comptimemanager.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.comptimemanager.model.entity.WorkHour;
import com.mycompany.comptimemanager.model.persistence.DataBase;

public class UpdateWorkHour implements Action {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String date = request.getParameter("date");
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		DataBase db = new DataBase();
		WorkHour workHour = db.getWorkHourById(id);
		workHour.setDate(date);
		workHour.setStart(start);
		workHour.setEnd(end);
		
		return "redirect:entry?action=Dashboard";
	}

}
