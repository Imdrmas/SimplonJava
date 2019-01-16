import java.util.Scanner;

public class RunApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char confirm = 'y';
		while(confirm == 'y') {
		
		System.out.println("Enter nom d'etudiant ");
		String nom1 = sc.nextLine();

		System.out.println("Enter prenom d'etudiant ");
		String prenom1 = sc.nextLine();
		
		EtudiantNote et1 = new EtudiantNote(nom1, prenom1);
		et1.saisieNote(3);
			
		System.out.println("Calcul de la moyenne "+et1.moyenne());
		System.out.println("note de manimale "+et1.minimum());
		System.out.println("note de maximale "+et1.maximum());
		System.out.println("année valide "+et1.valide());
		System.out.println("Nom d'etudiant: "+nom1 + " " + prenom1 + "\n"); 
		
		System.out.println("\nCheck For Another Etudient Click (y) :");
		System.out.println("--------------------------------------");
		confirm = sc.nextLine().charAt(0);
		
		if(confirm != 'y') {
			System.out.println("Vous avez quité le programme");
		}

		}
	}

}
