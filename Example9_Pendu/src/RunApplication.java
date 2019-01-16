import java.util.Random;
import java.util.Scanner;

public class RunApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * tab[] unAutreMot = "un mot" "un autre mot", "mot à deviner" nbCoup = 10
		 * nbErreur = 0 String motADev = Random(tab) mot = new String[motDev.String
		 * for(i=0; motADev.length; i++ if(lettre == motADev.adchar[i] motATrouv[i] =
		 * lettre else nbRreur++ nbCoup--
		 */


		Scanner sc = new Scanner(System.in);

		int nbCoup = 10;
		int nbErreur = 0;
		char lettre = ' ', confirm = 'y';
		String motTrouv = "";
		
		while(confirm == 'y') {

		String[] list = new String[] { "un", "mot", "deviner", "autre" };
		Random generator = new Random();
		int randomIndex = generator.nextInt(list.length);
		String motDev = list[randomIndex];

		 motDev = motDev.replaceAll("\\s+", "");

		// char[] arr = motDev.toCharArray();
		// motTrouv = arr[0] + motDev.substring(motDev.length() -1);
	  	 System.out.println(motDev);

		for (int i = 0; i < motDev.length(); i++) {

			System.out.println("Entrer un lettre");
			lettre = sc.next().charAt(0);

			if (lettre == motDev.charAt(i)) {
				motTrouv += lettre;
				System.out.println("Points: " + nbCoup);
			} else {
				nbCoup--;
				nbErreur++;	
				 System.out.println("Error: " + nbErreur);
				 System.out.println("Wrong Lettre ");

				
			}
			 System.out.println(motTrouv);
			
		}
		
		 
		 if(motTrouv.equals(motDev)) {
			 System.out.println("Error: " + nbErreur);
			 System.out.println("You Won Le Mot est: "+motTrouv);
		 }
	
		 System.out.println("\nIf you want to try again click (y) :");
		 motTrouv = "";
		 confirm = sc.next().charAt(0);
		
		if(confirm != 'y') {
			System.out.println("You have been exit of program !!");
		}
		}


	}}
