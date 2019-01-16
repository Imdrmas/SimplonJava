import java.util.Random;
import java.util.Scanner;

public class Devinette {
	
	static String motCherche;

	static String[] motCache = new String[motCherche.length()];



	static String[] tab = { "un mot", "un autre mot", "Bonjour" };



	public static String[] comparerMot(String motDevine) {



		Scanner sc = new Scanner(System.in);



		// mot a deviner existe



		// saisir ma lettre pour tenter



		char lettre; // lettre saisi par l'utilisateur en console



		lettre = sc.nextLine().charAt(0);



		int nbreIteration = motDevine.length();



		String motConst; // mot a construire lettre par lettre



		// je aussi le nbre d'iteration = taille du mot a deviner



		while (nbreIteration > 0) {



			boolean seTrouve = true;



			// parcourir mon mot a deviner carac par carac



			for (int i = 0; i < motDevine.length(); i++)



			{



				if (motDevine.charAt(i) == lettre)



				{



					seTrouve = true;



					motCache[i] = "" + lettre;



					nbreIteration = nbreIteration;



				}



				else {



					nbreIteration--;



					seTrouve = false;



				}



			}



		}



		return motCache;



	}



	public static String choisirMot() {



		Random generator = new Random();

		int randomIndex = generator.nextInt(tab.length);

		motCherche = tab[randomIndex];

		return motCherche;



	}



	public String initialisationMotCherche(char l, String motDeviner) {



		return "";



	}



	public static void main(String[] args) {



		int nbIteration;



		System.out.println("Bienvenue dans le pendu vous pouvez choisir le niveau de jeu !");



		System.out.println("1- facile ");



		System.out.println("2- Moyen ");



		System.out.println("3- Dificile ");

		Scanner sc = new Scanner(System.in);

		int choix = sc.nextInt();

		if (choix == 1) {

			nbIteration = 10;

		} else if (choix == 2) {

			nbIteration = 8;

		} else {

			nbIteration = 6;

		}

		String motCherche = choisirMot();

		String[] mot = comparerMot(motCherche);

		

	}

}
