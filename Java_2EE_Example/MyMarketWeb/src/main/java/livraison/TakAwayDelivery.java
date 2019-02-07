package livraison;

public class TakAwayDelivery implements Delivery {

	 public double getPrice() {

	        return 4.99;

	    }

	
		public String getInfo() {
			// TODO Auto-generated method stub
			return "Livraison � Tak Away - "+ getPrice()+"$";
		}



}
