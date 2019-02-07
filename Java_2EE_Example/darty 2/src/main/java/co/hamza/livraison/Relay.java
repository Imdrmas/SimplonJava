package co.hamza.livraison;

public class Relay implements Livraison {

	public Relay() {
		// TODO Auto-generated constructor stub
	}

	public double getPrix() {
		return 3;
	}

	public String getInfo() {
		String info = "- Livraison en point Relais : " + getPrix() + " euros";
		return info;
	}

}
