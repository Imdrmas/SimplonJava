
public class Telephone extends Product{ 
	private String model;

	public Telephone(String name, String desc, double price, String model) {
		super(name, desc, price);
		this.model = model;
	}

	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telephone(String name, String desc, double price) {
		super(name, desc, price);
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
