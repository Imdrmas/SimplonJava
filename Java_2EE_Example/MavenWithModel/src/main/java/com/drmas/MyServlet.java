package com.drmas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Person person = new Person();
		
	 	person.setId(Integer.parseInt(request.getParameter("id")));
		person.setfName(request.getParameter("firstName"));
		person.setlName(request.getParameter("lastName"));
		person.setAge(Integer.parseInt(request.getParameter("age")));
		person.setEmail(request.getParameter("email"));
		person.setCity(request.getParameter("city"));
		person.setSchool(request.getParameter("school"));
		
		int idStr = person.getId();
		String fNameStr = person.getfName();
		String lNameStr = person.getlName();
		int ageStr = person.getAge();
		String email = person.getEmail();
		String city = person.getCity();
		String school = person.getSchool();
		
		request.setAttribute("id", idStr);
		request.setAttribute("firstName", fNameStr);
		request.setAttribute("lastName", lNameStr);
		request.setAttribute("age", ageStr);
		request.setAttribute("email", email);
		request.setAttribute("city", city);
		request.setAttribute("school", school);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
