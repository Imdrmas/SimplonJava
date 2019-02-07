package livraison;

public class ExpressDelivery implements Delivery {

	public double getPrice() {

		return 9.99;

	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return "Livraison � Express - " + getPrice()+"$";
	}

}
