package issam.drmas;

public class Animal {
	
	private static int totalAnimal = 0;
	public String nom;
	private int nombreDePatte;
	private String coleur;
	
	
	public Animal(String nom, int nombreDePatte, String coleur) {
		this.nom = nom;
		this.nombreDePatte = nombreDePatte;
		this.coleur = coleur;
		totalAnimal++;
		
	}
	
	public String getName() {
		return "Je m'appelle " + this.nom;
	}
	
	public String getColeur() {
		return "Mon Couleur est "+ this.coleur;
	}
	
	public String getPatte() {
		return "J'ai " + this.nombreDePatte + " Pattes";
	}
	
	public static void getTotalNumber() {
		System.out.println("\n-----------------");
		System.out.println("Il y a " + totalAnimal + " animaux");
		
	}
	


}
