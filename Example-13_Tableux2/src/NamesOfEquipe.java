import java.util.Random;
import java.util.Scanner;

public class NamesOfEquipe {

	static String motCherche;
	static String motCache[] = new String[motCherche.length()];
	static String[] tab = { "un mot", "un autre mot", "Bonjour" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afficher();
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		int nbIteration = 0;

		if (choix == 1) {
			nbIteration = 10;
		} else if (choix == 2) {
			nbIteration = 8;
		} else {
			nbIteration = 5;
		}
		System.out.println(choisirMot());



	}

	public static void afficher() {
		System.out.println("\nBienvenue dans le pendu vous pouvez choisir le niveau de jeu !");
		System.out.println("1- Facile");
		System.out.println("2- Moyen");
		System.out.println("3- Difficile");

	}

	public static String choisirMot() {
		Random generator = new Random();
		int randomIndex = generator.nextInt(tab.length);
		return motCherche = tab[randomIndex];
	}

	public String motTrouver(char c, String motDeviner) {
		return "";
	}

}
