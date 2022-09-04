package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("homepage.html");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("userName");
		out.println("Welcome " + username);
	}
}
