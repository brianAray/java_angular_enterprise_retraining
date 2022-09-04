package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private final String userID = "admin";
	private final String password = "password";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// set response header
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("userName");
		String password = request.getParameter("userPass");
		
		if(username.equals(userID) && password.equals(this.password)) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome");
			
			/*
			 * Include this after the basic login demo
			 * Session Handling
			 */
			HttpSession session = request.getSession();
			session.setAttribute("user", "Brian");
			//setting session to expiry in 30 mins
			session.setMaxInactiveInterval(30*60);
			Cookie userName = new Cookie("user", username);
			userName.setMaxAge(30*60);
			response.addCookie(userName);
			
			
			
			requestDispatcher.forward(request, response);
		}else {
			out.println("<font color=red>Either user name or password is wrong.</font>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.html");
			requestDispatcher.include(request, response);
		}
	}
}
