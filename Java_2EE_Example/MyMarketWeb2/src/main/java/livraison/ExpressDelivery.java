package livraison;

public class ExpressDelivery implements Delivery {

    private String city;


    public ExpressDelivery(String city) {

        this.city = city;

    }


   

    public double getPrice() {

        if (city.equals("Paris"))

            return 6.99;

        else

            return 9.99;

    }



	public String getInfo() {
		// TODO Auto-generated method stub
		return "Livraison Express " + getPrice();
	}


	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}

}
