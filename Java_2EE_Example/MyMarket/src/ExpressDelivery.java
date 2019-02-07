
public class ExpressDelivery implements Delivery {
	private int number;

	public ExpressDelivery(int number) {
		this.number = number;
	}
	@Override
	public double getPrice() {
		if(number >= 300 && number <= 301) {
			return 4.99;
		}else {
			return 9.99;
		}
		
	}

	@Override
	public String getCity() {
		if(number >= 300 && number <= 301) {
			return "Paris";
		}else {
			return "Autre Ville";
		}
	}

}
