package org.hetal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Passing parameters from request url e.g
 * http://localhost:8080/SimpleServletProject/requestParamServletPath?userName=
 * hetal
 */
public class PassingRequestParametersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("userName");
		writer.println("<h3>Hello servlet using xml based config </h3>");
		writer.println("Hello user " + username);
	}

}
