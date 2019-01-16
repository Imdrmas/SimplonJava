import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Example et Application de la boucle While
		 * Ecrire Une application qui permet d'afficher des nombres entrés par l'utilisateur tant qu'ils sont inférieur à 10
		 */
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Please");	
		int num = sc.nextInt();
			
		
		while(num <=  10) {
			System.out.println("Nombers Is: "+num);
			num++;
		
		}
		
		if(num > 11) {
			System.out.println("Your number " +num+ " is very Big ? you have to enter smaller then 10");
		}

	}

}
