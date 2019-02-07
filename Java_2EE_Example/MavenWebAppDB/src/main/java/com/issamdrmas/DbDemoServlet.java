package com.issamdrmas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.issamdrmas.DbDao;

@WebServlet("/servletDbConnectionDemo")
public class DbDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		    /***** This Method Is Called By The Servlet Container To Process A 'GET' Request *****/

		    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
	
		    }

		    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
/*
		    	try {
		    		Connection con = DbDao.connectDb();
		    		String sql = "INSERT INTO StudentInfo (id, first_name, last_name, age, date, city) VALUES (?, ?, ?, ?, ?, ?)";
					
					PreparedStatement st =con.prepareStatement(sql);
					//st.setString(1, request.getParameter(String.valueOf(id)));
					st.setString(2, request.getParameter("first_name"));
					st.setString(3, request.getParameter("last_name"));
					st.setString(4, request.getParameter("age"));
					st.setString(5, request.getParameter("date"));
					st.setString(6, request.getParameter("city"));
					st.executeUpdate();
					st.close();
					con.close();
					
					PrintWriter out = response.getWriter(); 
		            out.println("<html><body><b>Successfully Inserted"
		                        + "</b></body></html>"); 
		            
		            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
					requestDispatcher.forward(request, response);
					
		    	}catch(Exception e) {
		    		e.printStackTrace();
		    	}
		    	*/
	
		    }
		
	
		   
}
