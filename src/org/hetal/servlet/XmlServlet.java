package org.hetal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet class using xml based configuration
 */
public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello servlet using xml based config </h3>");
		writer.println("Init param configured in web.xml is " + this.getServletConfig().getInitParameter("defaultUser"));
	}
	
}
