package livraison;

public class DirectDelivery implements Delivery {

	

	 public double getPrice() {

	        return 4.99;

	    }

		
		public String getInfo() {
			// TODO Auto-generated method stub
			return "Livraison à Domicile "+ getPrice();
		}

}
