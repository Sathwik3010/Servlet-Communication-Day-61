package com.codegnan.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LoginServlet")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String userpassword = request.getParameter("upwd");
		if(username.equals("Dev")&&userpassword.equals("dev123")) {
			rd=request.getRequestDispatcher("/success.html");
			rd.forward(request, response);
		} else {
			rd=request.getRequestDispatcher("/failure.html");
			rd.forward(request, response);
		}
	}

}
