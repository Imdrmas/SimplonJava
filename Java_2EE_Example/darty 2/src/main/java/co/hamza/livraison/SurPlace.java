package co.hamza.livraison;

public class SurPlace implements Livraison {

	public double getPrix() {
		return 0;
	}

	public String getInfo() {
		String info = "- A retirer sur place : " + getPrix() + " euros";
		return info;
	}

}
