package com.mycompany.comptimemanager.controller.action.workhour;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.comptimemanager.controller.action.Action;
import com.mycompany.comptimemanager.model.entity.WorkHour;
import com.mycompany.comptimemanager.model.persistence.DataBase;

public class RemoveWorkHour implements Action {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		DataBase db = new DataBase();
		WorkHour workHour = db.getWorkHourById(id);
		
		if(workHour != null)
			db.removeWorkHour(workHour.getId());

		return "redirect:entry?action=Timesheet";
	}

}
