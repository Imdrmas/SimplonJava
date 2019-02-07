package com.issamdrmas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pointWriter = response.getWriter();
		
		String stId = request.getParameter("id");
		int id = Integer.parseInt(stId);
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		String date = request.getParameter("date");
		String city = request.getParameter("city");
		
		StudentInfo st = new StudentInfo();
		st.setId(id);
		st.setName(fname);
		st.setLast_name(lname);
		st.setAge(age);
		st.setDate(date);
		st.setCity(city);
		
		int num = DbDao.save(st);
		if(num > 0) {
			pointWriter.print("<h2> Update Successfully </h2>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			
		}else {
			pointWriter.print("<h2> Sorry Not Updated </h2>");
		}
		
		doGet(request, response);
	}

}
