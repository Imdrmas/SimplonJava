package livraison;

public class RelayDelivery implements Delivery {

	public double getPrice() {

		return 6.99;

	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return "Livraison � Relay - " + getPrice()+"$";
	}

}
