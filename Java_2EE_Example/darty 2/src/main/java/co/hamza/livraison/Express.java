package co.hamza.livraison;

public class Express implements Livraison {

	public Express() {
		// TODO Auto-generated constructor stub
	}

	public double getPrix() {
		return 9;
	}

	public String getInfo() {
		String info = "- Livraison Express : " + getPrix() + " euros";
		return info;
	}

}
