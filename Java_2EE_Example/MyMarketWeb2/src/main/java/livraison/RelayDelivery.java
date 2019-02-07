package livraison;

public class RelayDelivery implements Delivery {
 
	private int number;
	 public RelayDelivery(int number) {

	        this.number = number;

	    }


	   

	    public double getPrice() {

	        if (number >= 1 && number <= 22)

	            return 0;

	        else if (number >= 23 && number <= 47)

	            return 2.99;

	        else if( number > 47){

	            return 4.99;
	}else {
		return 0;
	}

	    }


		
		public String getInfo() {
			// TODO Auto-generated method stub
			return "Livraison dans un point Relay " + getPrice();
		}


		public String getCity() {
			// TODO Auto-generated method stub
			return null;
		}

}
