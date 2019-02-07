package model;

public class Television extends Product {
 public int model;

public Television(String name, String desc, int model, double price) {
	super(name, desc, price);
	this.model = model;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public void buy() {
	System.out.println("Info Product - Name: "+this.getName()+ " Desc: "+this.getDesc()+ " Price: "+this.getPrice()+ " Model: "+this.getModel());
}


}
