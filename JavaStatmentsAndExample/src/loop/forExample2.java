package loop;

import java.util.Scanner;

public class forExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the Count: ");
		int count = sc.nextInt();
		int temp = num;
		for(int i = 0; i < count; i++) {
			num *= temp; 
		}
		System.out.println(num);

	}

}
