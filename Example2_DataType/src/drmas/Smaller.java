package drmas;

import java.util.Scanner;

public class Smaller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number 1 :");
		int input1 = scan.nextInt();
		System.out.println("Please enter number 2 :");
		int input2 = scan.nextInt();
		
			if (input1 < input2) {
			System.out.println(input1+ " Smaller Than " + input2 );
			}
			else if (input1 == input2) {
				System.out.println(" Numbers Are Equals ");
			}
			else {
				System.out.println(input2+ " Smaller Than " + input1 );
         }

	}

}
