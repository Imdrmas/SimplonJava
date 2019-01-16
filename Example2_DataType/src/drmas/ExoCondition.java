package drmas;

import java.util.Scanner;

public class ExoCondition {

	public static void main(String[] args) {
		/*
		System.out.println("Ecrire une application qui permet de comparer 2 Nombres entiers etafficher le plus G ?");
		System.out.println("Ecrire une application qui permet d'indiquer pour un nombre entier donné s'il est positif, négatif ou null");
		System.out.println("Ecrire une application qui permet de vérifier pour un nombre entier s'il est dans l'intervalle[50,100]?");
		*/
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("\n--------- Example 1 ---------");
		char confirm = 'y';
		while(confirm == 'y') {
		
			
		System.out.println("Enter Number 1");
		int x = s.nextInt();
		
		System.out.println("Enter Number 2");
		int y = s.nextInt();

			if(x > y) {
				System.out.println(x+" Is Greater Than "+y);
			} else if (x < y){
				System.out.println(y+" Is Greater Than "+x);
			} else {
				System.out.println("Number Are Equals");
			}
		
			
		 System.out.println("\n--------- Example 2 ---------");
		 System.out.println("Enter Number Négatif, Positif où Null ");
		 int sum2 = s.nextInt();
		 int ex2Num = 0;
		 if(sum2 < ex2Num -0) {
			 System.out.println("Négatif");
		 } else if (sum2 > ex2Num){
			 System.out.println("Positif");
		 }else {
			 System.out.println("Null");
		 }
	
		 System.out.println("\n--------- Example 3 ---------");
		 System.out.println("Enter Number vérifier pour Intervalle");
		 int sum3 = s.nextInt();
		 if(sum3 == 50.100 || sum3 <= 50.100) {
			 System.out.println("Number n'est pas intier ");
		 } else{
			 System.out.println("Sortir de range");
		 }
		
			System.out.println("\nIf You Want To Continue Click (y) ?:");
			confirm = s.next().charAt(0);
			
			if(confirm != 'y') {
				System.out.println("You Have Been Exit");
			}
			
			
		}


	}//Main

}
