package model;

public class Telephone extends Product{ 
	private int model;

	public Telephone(String name, String desc, int model, double price) {
		super(name, desc, price);
		this.model = model;
	}

	public Telephone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	

}
