package co.hamza.darty.produit;

public class Tele extends Produit{
	
	private int taille;
	
	public Tele() {
		// TODO Auto-generated constructor stub
	}
	
	public Tele(String nom, String description, double prix, int taille) {
		
		super(nom, description, prix);
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}
	
	
		public void look() {
			System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + prix + " euros" + " - " + "taille : " + taille + " pouces.");
		
	}
	

	
	

}
