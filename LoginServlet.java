package com.codegnan.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("uname");
		String password=request.getParameter("upswd");
		if(userName.equals("admin")&&password.equals("admin123")) {
			response.sendRedirect("dashboard?role=ADMIN");
		} else {
			if(userName.equals("user")&&password.equals("user123")) {
				response.sendRedirect("dashboard?role=USER");
			} else {
				response.sendRedirect("login.html");
			}
		}
	}

}
