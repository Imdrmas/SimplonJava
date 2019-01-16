package issam.drmas;

public class Application {

	public static void main(String[] args) {
		System.out.println("\n");
		
		
		Animal animal1 = new Animal("Lyon", 4, "Orange");
		String nom = animal1.getName();
		String nombreDePatte = animal1.getPatte();
		String coleur = animal1.getColeur();
		
		
		System.out.print(nom + " " + nombreDePatte + " " + coleur);
		System.out.println("\n-----------------------------------------\n");
		
		
		Animal animal2 = new Animal("Vache", 4, "Blanche");
		String nom2 = animal2.getName();
		String nombreDePatte2 = animal2.getPatte();
		String coleur2 = animal2.getColeur();
		
		System.out.print(nom2 + " " + nombreDePatte2 + " " + coleur2);
		System.out.println("\n-----------------------------------------\n");
		
		Animal animal3 = new Animal("Cheval", 4, "Noir\n");
		String nom3 = animal3.getName();
		String nombreDePatte3 = animal3.getPatte();
		String coleur3 = animal3.getColeur();
		
		System.out.print(nom3 + " " + nombreDePatte3 + " " + coleur3);
		Animal.getTotalNumber();
		System.out.println("-----------------\n");
		
		
		Chien c = new Chien("Rex");
		c.parler();
				
		
		System.out.println("\n____________Student Informations_____________________\n");
		Students st1 = new Students("Nina", "Issam", "Paris", "nina@gmail.com", "Collage", 12, true);
		System.out.println("Nom : "+st1.getNom());
		System.out.println("Prenom: "+st1.getPrenom());
		System.out.println("Address: "+st1.getAddress());
		System.out.println("Email: "+st1.getEmail());
		System.out.println("Class: "+st1.getClassRoom());
		System.out.println("Age: "+st1.getAge());
		Students.getTotalStudent();
	

	}


}
