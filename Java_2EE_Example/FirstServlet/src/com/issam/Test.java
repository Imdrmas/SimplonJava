package com.issam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Hello").append(request.getContextPath());
	
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print("<h1 style='color: #2980b9; font-size: 40px; text-decoration: underline; text-align: center; margin-top: 30px'>" + "Hello From My Servlet" + "</h1>");
		
		out.println("<p style='text-align: center;'> <a href='http://localhost:8080/FirstServlet/HelloWorld' style='background: #efefef; padding: 10px 20px; border-radius: 10px; color: blue;'> Go To Home </a></p> ");
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
