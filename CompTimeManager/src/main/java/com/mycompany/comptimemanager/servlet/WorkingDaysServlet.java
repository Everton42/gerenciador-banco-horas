package com.mycompany.comptimemanager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		String start = request.getParameter("start");
		String startLunch = request.getParameter("startLunch");
		String endLunch = request.getParameter("endLunch");
		String end = request.getParameter("end");

		FakeDb db = new FakeDb();
		db.setWorkingDays(start, startLunch, endLunch, end);

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr>");
		for (WorkDay workDay : db.getWorkingDays()) {

			out.println("<td>" + workDay.getStart() + "</td>");
			out.println("<td>" + workDay.getStartLunch() + "</td>");
			out.println("<td>" + workDay.getEndLunch() + "</td>");
			out.println("<td>" + workDay.getEnd() + "</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
	}

}
