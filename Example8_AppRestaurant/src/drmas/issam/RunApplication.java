package drmas.issam;

public class RunApplication {

	public static void main(String[] args) {
		
		/*
		 * Combien souhaitez vous commander de menu
		 */
		
		//Choix 1
		//1- poulet
		//2- boeuf
		//3- vegetarien
		// Que souhaitez-vous comme menu?
		
		//2
		//Vous avez choisi comme menu : boeuf
		//Choix accompagnmzent
		
		//1- lègumes frais
		//2- frites
		//3- riz
		//Que souhaitez-vous comme accompagnement
		
		//Vous avez choisi comme accompagnement?
		//Résumé de votre commande:
		//Menu 1:
		//Vous avez choisi comme menu : beouf
		//Vous avez choisi comme accompagnement : frites
		
		
		Order order = new Order();
		order.runMenus();
		


	}

}
