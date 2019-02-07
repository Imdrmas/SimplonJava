package co.hamza.livraison;

public class ADomicile implements Livraison {


	public ADomicile() {
		// TODO Auto-generated constructor stub
	}

	public double getPrix() {
		return 4.99;
	}

	public String getInfo() {
		String info = "- Livraison à domicile : " + getPrix() + " euros";
		return info;
	}

	

	

}
