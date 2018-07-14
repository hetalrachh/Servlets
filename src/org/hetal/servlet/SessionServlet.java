package org.hetal.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class showing implementation of session, servlet context, init params
 */
@WebServlet(urlPatterns = "/SessionServletPath", initParams=@WebInitParam(name="defaultUser", value="Rachh Hetal")) 
            //initParam is set in servlet config when the servlet object is created 
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello servlet using session</h3>");
		String username = request.getParameter("userName");
		
		//session value is avaailable only in one session
		HttpSession session = request.getSession();
		
		//Servlet context is available across entire application irrespective of any number of sessions
		//and available across all sessions
		ServletContext context = request.getServletContext();
		
		if(username != null && username != "") {
			session.setAttribute("userName", username);
			context.setAttribute("userName", username);
		}
		
		writer.println("Request param value " + username);
		writer.println("Value in session " + (String) session.getAttribute("userName"));
		writer.println("Value in context " + (String) context.getAttribute("userName"));
		
		//get the init param
		writer.println("Init param is " +  this.getServletConfig().getInitParameter("defaultUser"));
	}

}
