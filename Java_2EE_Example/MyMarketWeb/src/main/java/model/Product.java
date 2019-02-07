package model;

public class Product {
   public String name;
   public String desc;
   public double price;
   
public Product(String name, String desc, double price) {
	super();
	this.name = name;
	this.desc = desc;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public String lookName() {
	return "Name: "+ this.getName() + ", Price: "+this.getPrice()+"$";
}
 public String lookDesc() {
	 return "Desc: " + this.getDesc();
 }
}
