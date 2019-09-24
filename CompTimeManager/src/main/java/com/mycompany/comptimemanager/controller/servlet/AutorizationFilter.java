package com.mycompany.comptimemanager.controller.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AutorizationFilter", urlPatterns = { "/entry" })
public class AutorizationFilter implements Filter {

	public void destroy() {}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		String redirectLink = "entry?action=LoginForm";
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		String actionParam = request.getParameter("action");
		
		HttpSession session = request.getSession();
		boolean userNotAuthorized = (session.getAttribute("userAuthorized") == null);
		boolean unprotectedAction = !(actionParam.equals("Login") || actionParam.equals("LoginForm"));
		
		if(userNotAuthorized && unprotectedAction) {
			response.sendRedirect(redirectLink);
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
