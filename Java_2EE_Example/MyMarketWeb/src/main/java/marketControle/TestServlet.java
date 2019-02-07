package marketControle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livraison.Delivery;
import livraison.DirectDelivery;
import livraison.ExpressDelivery;
import livraison.RelayDelivery;
import livraison.TakAwayDelivery;
import model.Computer;
import model.Product;
import model.Telephone;
import model.Television;
import services.Bill;
import users.Customer;

/**
 * Servlet implementation class marketControlor
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Product product;
	Bill bill;
	Customer customer;
	Delivery delivery;

	Map<Product, Integer> map = new HashMap<Product, Integer>();
	ArrayList<Product> list = new ArrayList<Product>();

	public void init() throws ServletException {
		customer = new Customer();
		product = new Product();
		

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub

			 Television tv = new Television("TV", "LGDH343", 2019, 40);
			 Computer computer = new Computer("MacBook", "New MakPro", 2018, 60);
			 Telephone telephone = new Telephone("Samsung J3", "Telephone Noir", 2020, 50);
			 
			 list.add(tv);
			 list.add(computer);
			 list.add(telephone);
			 

			String splitValues = request.getQueryString();
			Map<String, String> params = new HashMap<String, String>();
			String[] paramBrut = splitValues.split("&");

			for (String param : paramBrut) {
				String[] tab = param.split("=");
				String name = tab[0];
				if (tab.length > 1) {
					String value = tab[1];
					params.put(name, value);
				}
			}

			String fullname = params.get("fullname").replace('+', ' ');
			request.setAttribute("fullname", fullname);

			String address = params.get("address").replace('+', ' ');
			request.setAttribute("address", address);
			
			customer = new Customer(fullname, address);

			String radioName = request.getParameter("radioName");
			if ("express".equals(radioName)) {
				delivery = new ExpressDelivery();
			} else if ("relay".equals(radioName)) {
				delivery = new RelayDelivery();
			} else if ("domcile".equals(radioName)) {
				delivery = new DirectDelivery();
			} else {
				delivery = new TakAwayDelivery();
			}
			
			bill = new Bill(customer, delivery);
			String[] produitsUrl = params.get("listeProduit").split("%0D%0A");

			for (String element : produitsUrl) {
				String[] produitQuantite = element.split("%3A");

			    product = list.get(Integer.parseInt(produitQuantite[0]));
				Integer quantite = Integer.parseInt(produitQuantite[1]);
				bill.addProduct(product, quantite);
			}

			Map<Product, Integer> listeProduits = bill.getProducts();
			
			StringBuilder afficher = bill.afficherBille(listeProduits);
            request.setAttribute("afficher", afficher);


			//String info = delivery.getInfo();
		//	request.setAttribute("info", info);
/*
			int quantity = 1;
			String strSplit = String.valueOf(quantity);

		    
			String test = "TV:MakBook:Samsung";


			customer.setFullname(fullname);
			customer.setAddress(address);
			bill = new Bill(customer, (livraison.Delivery) delivery);

			String[] newLine = test.split("\\:");
			String strTv = newLine[0];
			String strMac = newLine[1];
			String strSam = newLine[2];
*/

			//double strTv = bill.getTotal();
			//String strSplits = request.getParameter("listeProduit");
			//request.setAttribute("total", strSplits);

			/*
			 * String namePro = product.lookName(); String descPro = product.lookDesc();
			 * String qu = descPro + ", Quantity " + quantities; double totalPrice =
			 * Double.parseDouble(price) + delivery.getPrice();
			 * 
			 * request.setAttribute("namePro", namePro); request.setAttribute("descPro",
			 * qu); request.setAttribute("totalPrice", totalPrice+"$");
			 * 
			 * RequestDispatcher requestDispatcher =
			 * request.getRequestDispatcher("/index.jsp");
			 * requestDispatcher.forward(request, response);
			 */
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
	        requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
