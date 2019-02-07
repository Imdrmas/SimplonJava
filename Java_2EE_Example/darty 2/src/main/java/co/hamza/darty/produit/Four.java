package co.hamza.darty.produit;

public class Four extends Produit{
	
	private int puissance;
	
	public Four() {
		// TODO Auto-generated constructor stub
	}
	
	public Four(String nom, String description, double prix, int puissance) {
		super(nom, description, prix);
		this.puissance = puissance;
	}

	public int getPuissance() {
		return puissance;
	}
	
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + prix + " euros" + " - " + "Puissance : " + puissance + " watts");
	
}
	
	

}
