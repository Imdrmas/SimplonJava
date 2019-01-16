package com.drmas;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i+j;
		
		HttpSession session = request.getSession();
		session.setAttribute("k", k);
	   
        response.sendRedirect("sq");
	    
	  //  RequestDispatcher rd = request.getRequestDispatcher("sq");
       // rd.forward(request, response);
	
	
	}
}
