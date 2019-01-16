import java.util.Scanner;

public class Exo3Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char confirm = 'y';
		while(confirm == 'y') {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of Candidat : ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Please Enter Number");
		}

		int note = sc.nextInt();

		switch (note) {
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("Excellent");
			break;
		case 15:
		case 14:
		case 13:
			System.out.println("Bien");
			break;
		case 12:
		case 11:
		case 10:
			System.out.println("Trés Bien");
			break;
		case 9:
		case 8:
			System.out.println("Assez Bien");
			break;
		case 7:
		case 6:
			System.out.println("Insuffisant");
			break;
		default:
			if(note > 20) {
				System.out.println("Number Trés Grand Taper Moins Du 20");
			} else if(note < 9) {
				System.out.println("Number Trés Petit Taper Grand Que 6");
			}
			//System.out.println("Rejer");
		}
		System.out.println("\nSi Vous Voulez Essayer Encore Taper (y) ? :");
		confirm = sc.next().charAt(0);
		
		if(confirm != 'y') {
			System.out.println("Vous Avez Quité Le Programme !!");
		}
		
		}
	}

}
