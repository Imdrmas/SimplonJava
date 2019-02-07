package co.hamza.darty.produit;

public class Produit {
	
	protected String nom;
	protected String description;
	protected double prix;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String nom, String description, double prix) {
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		
	}
	
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + prix+ " euros.");
	}
	
	public void buy() {
		
		
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}
	

}
	
