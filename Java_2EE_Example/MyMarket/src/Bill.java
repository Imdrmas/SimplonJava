
import java.util.HashMap;
import java.util.Map;

public class Bill{

	int quantity = 0;
	private Customer customer;
	private Delivery delivery;
	private Map<Product, Integer> map = new HashMap<Product, Integer>();

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
		System.out.println("Mode de livration : " + delivery.getCity());
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

}
