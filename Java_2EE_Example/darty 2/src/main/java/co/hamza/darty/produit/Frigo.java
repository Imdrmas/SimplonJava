package co.hamza.darty.produit;

public class Frigo extends Produit{
	
	private char classeEnergetique;
	
	public Frigo() {
		// TODO Auto-generated constructor stub
	}
	
	public Frigo(String nom, String description, double prix, char classeEnergetique) {
		
		super (nom, description, prix);
		this.classeEnergetique = classeEnergetique;
		
	}

	public char getClasseEnergetique() {
		return classeEnergetique;
	}
	
	public void look() {
		System.out.println("Marque : " + nom + " - " + description + " - " + "Prix : " + prix+ " euros" + " - " + "Classe énergétique : " + classeEnergetique);
	
}
	
	

}
