package drmas;

import java.util.Scanner;

public class BilletCinema {

	Scanner sc = new Scanner(System.in);

	public void acheterBillet() {

		char confirm = 'y';
		while (confirm == 'y') {

			System.out.println("Quel âge avez-vous");
			int age = sc.nextInt();

			if (age <= 3 && age >= 1) {
				System.out.println("Le billet est gratuit");

			} else if (age >= 61 && age <= 120) {
				System.out.println("Le billet coûte 4 euros");

			} else if (age >= 4 && age <= 60) {

				System.out.println("Habitez-vous à Montruit ? 1 oui / 2 non");
				int choixVille = sc.nextInt();

				if (choixVille == 1 || choixVille == 2) {

					switch (choixVille) {
					case 1:
						if (age <= 60 && age >= 4 ) {
							System.out.println("Le billet coûte 5 euros");
						} 
						break;
					default:
						System.out.println("Le billet coûte 8 euros");
						break;
					}

				} else {
					System.out.println("S'il vous plaît choisir 1 ou 2");
				}

			} else {
				System.out.println("S'il vous plaît donner votre l'age");
			}

			System.out.println("\nSi vous voulez acheter encore un billet enter  (y) : ");
			confirm = sc.next().charAt(0);

			if (confirm != 'y') {
				System.out.println("Vous avez quitté le programme :");
			}
		}

	}

}
