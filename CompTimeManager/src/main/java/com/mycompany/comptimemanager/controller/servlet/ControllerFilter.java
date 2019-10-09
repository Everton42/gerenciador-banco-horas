package com.mycompany.comptimemanager.controller.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.comptimemanager.controller.action.Action;

@WebFilter("/entry")
public class ControllerFilter implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		String className;
		String actionParam = request.getParameter("action");
		String actionRoot ="com.mycompany.comptimemanager.controller.action.";
		
		if (actionParam.contains("WorkHour"))
			className = actionRoot + "workhour." + actionParam;
		
		else
			className = actionRoot + actionParam;
		
		String name;
		try {
			@SuppressWarnings("rawtypes")
			Class classR = Class.forName(className);
			Action action = (Action) classR.newInstance();
			name = action.exec(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		String[] typeAddress = name.split(":");
 		if(typeAddress[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
			rd.forward(request, response);
		} 
 		else if(typeAddress[0].equals("redirect")) {
 			response.sendRedirect(typeAddress[1]);
 		}
 		else {
			response.sendRedirect(typeAddress[0]);	
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
