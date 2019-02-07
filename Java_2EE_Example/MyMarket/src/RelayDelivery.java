
public class RelayDelivery implements Delivery {
 
	private int number;
	public RelayDelivery(int number) {
		this.number = number;
	}
	@Override
	public double getPrice() {
		if(number >= 300 && number <= 301) {
			return 4.99;
		}else {
			return 6.99;
		}
		
	}
	@Override
	public String getCity() {
		if(number >= 300 && number <= 301) {
			return "Paris";
		}else {
			return "Autre City";
		}

	}
}
