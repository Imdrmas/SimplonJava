package login.submit.register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    CustomerDao cd = new CustomerDaoImpl();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		Customer c = cd.getCustomer(name, password);
		
		if(submitType.equals("login") && c != null && c.getName() != null) {
			request.setAttribute("msg", c.getUsername());
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		} else if(submitType.equals("register")) {
			c.setName(name);
			c.setUsername(request.getParameter("flastname"));
			c.setPassword(password);
			request.setAttribute("SuccessMsg", "Registeration done !! please login to continue !!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "Date Not Found, Click On Register !!");
		}
	}

}
