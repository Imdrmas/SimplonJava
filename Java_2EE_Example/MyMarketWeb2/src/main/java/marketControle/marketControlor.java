package marketControle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livraison.Delivery;
import model.Product;
import services.Bill;
import users.Customer;
import boutiqueWriter.*;

/**
 * Servlet implementation class marketControlor
 */
public class marketControlor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StringReader strRead;
     Product produits; 
     Bill bill;
     Customer customer;
     Delivery modlivre;
     FileWriter writer;
     Map<Product, Integer> map = new HashMap<Product, Integer>();
     
	@Override
	public void init() throws ServletException {
		customer = new Customer();
	
		
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public marketControlor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "";
		String address = "";
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		customer.setFullname(name);
		customer.setAddress(address);
		request.getQueryString();
		
		
		
		
		//bill = new Bill(customer, modlivre, map );

		String text =request.getParameter("listeProduit");
		
		BufferedReader entree = new BufferedReader(new StringReader(text));
		List<String> listProduits = new ArrayList<String>(); 
		
		while (entree.readLine() != null) {
			
			listProduits.add(entree.readLine());
			
		}
		
		request.setAttribute("listproduits", listProduits);
		
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
