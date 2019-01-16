import java.util.Scanner;

public class TestMatriceCarre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nb;
		
		System.out.println("Donnez la dimension de la matrice :");
		nb = sc.nextInt();
		int[][] tab = new int[nb][nb];
		int nbEnter = 0;
		
		for(int i = 0; i < tab.length; i++) {

			for(int j = 0; j<tab.length; j++) {
				nbEnter++;
				System.out.println("Enter un nomber entier pour la rangé "+i+" et de la colonne "+j+":" +nbEnter);
				tab[i][j] = sc.nextInt();
			}
		}
		System.out.println("La matrice originale est: ");
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j <tab.length; j++) {
				System.out.print(tab[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("La matrice transposé est: ");
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j<tab.length; j++) {
				System.out.print(tab[j][i]+" ");
			}
			System.out.println();
		}


	}

}
