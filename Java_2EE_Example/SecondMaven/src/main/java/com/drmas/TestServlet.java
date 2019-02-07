package com.drmas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public TestServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		String allNames = "My name's: "+firstName;
		
		request.setAttribute("firstName", allNames);
		request.setAttribute("lastName",  lastName);
				
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		doGet(request, response);
	}

}
