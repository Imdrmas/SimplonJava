
public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Déclaration de type les [] désignant le type d'un tableau
		 * int tableEntier[]
		 * int tabelEntier[] new int[6]
		 * pour les tableaux la valeur spéciale unll représente un tableau sans aucune valeur
		 */
		
		/*
		 * Ecrire une application qui permet d'afficher un tableau de voyellles l'indice qui correspond à chaque lettre
		 * Définir un tableau tableAuCaracters[]bavec les voylles
		 * utiliser pour parcourir tout le tableau tableAuCaracters.length
		 * 
		 * 
		 */

		System.out.println("\nApplication qui permet d'afficher un tableau de voyellles l'indice qui correspond à chaque lettre");
		String tableAuCaracters[] = new String[]{
				"A ", "E ", "I ", "O ", "U ", "Y "
		};
		System.out.println("----- This With Index--------");
		System.out.print(tableAuCaracters[0]);
		System.out.print(tableAuCaracters[1]);
		System.out.print(tableAuCaracters[2]);
		System.out.print(tableAuCaracters[3]);
		System.out.print(tableAuCaracters[4]);
		System.out.println(tableAuCaracters[5]);
		
		System.out.println("\n----- This Length --------");
		System.out.println(tableAuCaracters.length);
		
		
		System.out.println("\n------ This With For -------\n");
		for(int i = 0; i < tableAuCaracters.length; i++ ) {
			
			System.out.println("A L'emplacemnt " + i + " Du Tableau Nous Avons " + tableAuCaracters[i] );
		
		}

	}

}
