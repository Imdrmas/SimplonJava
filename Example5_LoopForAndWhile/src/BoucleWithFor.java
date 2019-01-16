import java.util.Currency;
import java.util.Locale;

public class BoucleWithFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * L'initialisation, la condition et la modification de l'index sont optionnelles.
		 * Dans l'insitialisation on peut déclarer une varuable qui servira d'index et qui sera dans ce cas locale à la boucle
		 * il est possible d'inclure plusieurs traiements dans l'initialisation et modification de la boucle : chaun des traitement
		 */
		
		// Write a program whitch can be used to display a conversion table, e.g Euros to Malta Liri
		//We can do in second example Metres to Kilometres
		
		/*
		 *  The euro converter is 1Eu = 0,5 ML
		 *  Note loop starts at 1 and finishes at 100
		 *  in this case since the conversion rate does not change  we did not use a Var 
		 *  but assaigned it directive in print satament
		 */
		
		/*
		for(int i = 1; i <= 10; i++) {
			System.out.println("Money is " +i);
		}
		*/


		    for (int i = 1; i <= 100; i++) {
		    
		        System.out.println("Money is: " + i + " => " + i * 1.5 +" £");
		    }
		

	}

}
