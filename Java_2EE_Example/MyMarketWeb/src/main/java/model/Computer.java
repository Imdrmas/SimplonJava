package model;

public class Computer extends Product {
 private int model;

public Computer(String name, String desc, int model, double price) {
	super(name, desc, price);
	this.model = model;
	// TODO Auto-generated constructor stub
}

public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public void buy() {
	System.out.println("Info Product - Name: "+this.getName()+ " Desc: "+this.getDesc()+ " Price: "+this.getPrice()+  " Model: "+this.getModel());
}
}
