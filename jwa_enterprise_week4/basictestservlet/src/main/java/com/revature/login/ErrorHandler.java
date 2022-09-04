package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandler extends HttpServlet {
	 
	   // Method to handle GET method request.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	         
	      // Analyze the servlet exception       
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");

	      // Set response content type
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		
		out.println("The status code : " + statusCode);
		out.println("<h2>Error information</h2>");
		out.println("Servlet Name : " + servletName + "</br></br>");
		out.println("Exception Type : " + throwable.getClass( ).getName( ) + "</br></br>");
		out.println("The request URI: " + requestUri + "<br><br>");
		out.println("The exception message: " + throwable.getMessage( ));

	   }
	   
	   // Method to handle POST method request.
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	}