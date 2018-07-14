package org.hetal.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class showing how to pass post parameters i.e from html form
 */
public class PassingPostParametersServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello from POST method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello servlet using xml based config </h3>");
		String username = request.getParameter("userName");
		writer.println("<h3>Hello servlet passing post params </h3>");
		writer.println("Hello user " + username);
		String profession = request.getParameter("prof");
		writer.println("Your profession is " + profession);

		writer.println("You are at location ");
		String[] location = request.getParameterValues("location");
		for (String x : location) {
			writer.println(x);
		}
	}

}
