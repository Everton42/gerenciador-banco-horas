package com.mycompany.comptimemanager.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.comptimemanager.entities.WorkDay;
import com.mycompany.comptimemanager.persistence.FakeDb;

/**
 * Servlet implementation class WorkingDaysServlet
 */
@WebServlet("/WorkingDaysServlet")
public class WorkingDaysServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String startDay = request.getParameter("startDay");
		String startLunch = request.getParameter("startLunch");
		String endLunch = request.getParameter("endLunch");
		String endDay = request.getParameter("endDay");

		FakeDb db = new FakeDb();
		db.setWorkingDays(startDay, startLunch, endLunch, endDay);
		
	    List<WorkDay> lista = db.getWorkingDays();

	    request.setAttribute("workdays", lista);
		
	    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	    rd.forward(request, response);
	}

}
