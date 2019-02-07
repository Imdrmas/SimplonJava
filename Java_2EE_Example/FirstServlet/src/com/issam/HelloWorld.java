package com.issam;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void inti() throws ServletException{
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align: center; color: #f1f2f6; font-size: 40psx; background: #7f8fa6; padding: 20px; border: 2px solid #718093;'>" + "Welcome Issam Drmas - First Servlet" + "</h1>");
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String requiredDate = df.format(new Date()).toString();
		out.println("<p style='color: #0097e6; text-decoration: underline; font-size: 24px; text-align: center'>" + requiredDate + "</p>");
		
		response.getWriter().print("<h1 style='color: #c23616; font-size: 20px; text-align: center; margin-top: 10px'>" + "This With getWirter" + "</h1>");
		
		out.println("<br><p style='text-align: center;'> <a href='http://localhost:8080/FirstServlet/Test' style='background: #efefef; padding: 10px 20px; border-radius: 10px; color: blue;'> Go To Sevlet </a></p> ");
		
	   out.println("<html>"
	   		+ "<head><title>" + "My Page" + "</title></head>"
	   				+ "<body style='text-align: center;'>"
	   		        + "<div style='display: inline-block; background: #dfe4ea; padding: 20px; width: 25%; margin-top: 20px; border-radius: 5px;'>"
	   		        + " <input style='border: 1px solid #747d8c; padding: 10px; margin-bottom: 10px; width: 320px;' type='text' placeholder='Username'/> "
	   		        + " <input style='border: 1px solid #747d8c; padding: 10px; margin-bottom: 10px; width: 320px;' type='text' type='email' placeholder='Email'/> "
	   		        + " <input style='border: 1px solid #747d8c; padding: 10px; margin-bottom: 10px; width: 320px;' type='text' type='password' placeholder='Password'/> "
	   		        + "<button style='border: 1px solid #747d8c; background: aliceblue; padding: 10px 20px; margin-bottom: 10px; font-size:22px; width: 320px;'>" + "Login" + "</button>"
	   		        + "</div><br><br>"
	   				+ "</body></html>");
	   
	 //  String name = "drmas";
	   response.getWriter().println("Hello ");
	   		
	   
		String paramName = "myparam";
		String paramValue = request.getParameter(paramName);
		
		out.write(paramName);
		out.write(" = ");
		
		out.write(paramValue);
		out.write("n");
		
		paramName = "UNKNOWN";
		paramValue = request.getParameter(paramName);
		
		if(paramValue == null) {
			out.write("Parameter " + paramName + " Not found");
		}
		
		out.close();
		
		
	}
	


}
