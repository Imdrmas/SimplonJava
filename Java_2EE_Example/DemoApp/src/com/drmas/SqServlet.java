package com.drmas;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException {
    	  
       // int k = Integer.parseInt(request.getParameter("k"));
		HttpSession session = request.getSession();
		int k = (int) session.getAttribute("k");
        
        k = k*k;
        
    	PrintWriter out = response.getWriter();
    	out.print("Result is: "+k);
    	
      }
}
