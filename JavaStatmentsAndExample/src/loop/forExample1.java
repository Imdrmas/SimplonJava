package loop;

import java.util.Scanner;

public class forExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String stD1 = "", stD2 = "", stD3 = "";
		int g1 = 0, g2 = 0, g3 = 0;
		for (int x = 1; x <= 3; x++) {
			System.out.println("Enter name of Student number " + x + ":");
			switch (x) {
			case 1:
				stD1 = sc.next();
				break;
			case 2:
				stD2 = sc.next();
				break;
			default:
				stD3 = sc.next();
				break;

			}

			System.out.println("Enter grade of Student number " + x +":");
			switch(x) {
			case 1:
				g1 = sc.nextInt();
				break;
			case 2:
				g2 = sc.nextInt();
				break;
			default:
				g3 = sc.nextInt();
				break;
			}
		}
		String strResult = "";
		for(int i = 1; i<=3; i++) {
			switch(i) {
			case 1:
				strResult = "Name: "+ stD1 + " ; Grade: "+g1; 
				break;
			case 2:
				strResult = "Name: "+ stD2 + " ; Grade: "+g2; 
				break;
			case 3:
				strResult = "Name: "+ stD3 + " ; Grade: "+g3; 
				break;
			}
			System.out.println(strResult); 
		}

	}

}
