package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import livraison.Delivery;
import model.Product;
import users.Customer;

public class Bill{

	int quantity = 0;
	private Customer customer;
	private Delivery delivery;
	private Map<Product, Integer> map = new HashMap<Product, Integer>();
	
	 StringBuilder str = new StringBuilder();
	 StringBuilder s = new StringBuilder();

	public Bill() {
		super();
	}

	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
		
	}


	public void addProduct(Product pro, int quante) {
		map.put(pro, quante);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Map<Product, Integer> getProducts() {
		return map;
	}

	public void getProducts(Map<Product, Integer> map) {
		this.map = map;
	}

	public void generate() {
		if(!map.isEmpty()) {
		System.out.println("\nHom Shop Company");
		System.out.println("55 Rue vancinne 93000 Montruit");
		System.out.println("");
		System.out.println("Facture à l'attention");
		System.out.println(customer.getFullname());
		System.out.println(customer.getAddress());
		System.out.println("");
		System.out.println("Mode de livration : " + delivery.getInfo());
		System.out.println("");
		System.out.println("Produits : ");
		//System.out.println("\n-------------------------------");
		
		for(Map.Entry<Product, Integer> str : map.entrySet()) {
			Product pro = str.getKey();
			Integer quantity = str.getValue();
			System.out.println(pro.getName() + " - " + pro.getPrice() + "$ - " + quantity + " unité");
			System.out.println(pro.getDesc());
			System.out.println("");
		}
		//int allQun = quantity + quantity;
		System.out.println("Liviration "+delivery.getPrice()+"$");
		System.out.println("Total Price: " +this.getTotal()+"$");
		System.out.println("\n_________________________________");
		
	}else {
		System.out.println("Sorry Is Empty ");
	}
	}
	public double getTotal() {
		double total = 0;
		for (Map.Entry<Product, Integer> str : map.entrySet()) {
			total += str.getKey().getPrice();
			 quantity = str.getValue();		
		}
		
		return total + delivery.getPrice();
	}
	
	public StringBuilder afficherBille(Map<Product, Integer> produits) {
		s.append("------------------- FACTURE --------------------").append("<br> <br>");
		s.append(customer.getFullname()).append("<br>");
		s.append(customer.getAddress()).append("<br><br>");
		s.append("------------------- PRODUITS -------------------").append("<br><br>");
		s.append(resumePanier(produits));
		s.append("<br>-------------- MODE DE LIVRAISON ---------------").append("<br><br>");
		s.append(delivery.getInfo()).append("<br>");
		s.append("<br>------------------------------------------------").append("<br><br>");
		s.append("TOTAL : ").append(getTotal()).append("$").append("<br>");
		
		return s;
	}

	
	public StringBuilder resumePanier(Map<Product, Integer> produits) {
		
		for (Entry<Product, Integer> element : this.map.entrySet()) {
			 str.append(element.getKey().getName()).append(" - ").append(element.getKey().getDesc()).append(" - ").append(element.getKey().getPrice()).append("$").append(" - ").append(element.getValue()).append(" unités").append("<br>");
			 
		} 
		
		System.out.println("");
		return str ;
	}
	

}
