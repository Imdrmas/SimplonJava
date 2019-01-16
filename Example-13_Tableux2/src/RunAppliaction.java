import java.util.Arrays;
import java.util.Scanner;

public class RunAppliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Donner la dimension de la matrice: 2
		// Enter un nombre entier pour la rangée 0 et colonne 0 : 1
		// Enter un nombre entier pour la rangée 0 et colonne 1 : 2
		// Enter un nombre entier pour la rangée 1 et colonne 0 : 3
		// Enter un nombre entier pour la rangée 1 et colonne 1 : 4

		// La matrice originale est :
		// 1 2
		// 3 4
		// La matrice transposée est:
		// 1 3
		// 2 4
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nomber Entier");
		
		
		int NumOfValues = sc.nextInt();
	
		int[][] math = new int[NumOfValues][NumOfValues];
		//int[][] array = new int[NumOfValues][NumOfValues];
		
		int k = 0;
		int j = 0;
		
		//int[] array = new int[NumOfValues];
		//int[] math = new int[NumOfValues];
		
		for(k = 0; k < math.length; k++) {			   
			   for(j = math.length; j < math.length; j++) {
				   math[k][j] = sc.nextInt();
				   System.out.print(math[k][j]);
			   }
		       System.out.println();
		}
	

		

        
}}


