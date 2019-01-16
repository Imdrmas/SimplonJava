package array;

public class arrayExo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		String names[] = new String[5];
		int grades[] = new int[5];
		
		for(int x=0; x<names.length; x++) {
			System.out.println("Enter Name Of Studant Number "+String.valueOf(x +1) + ": ");
			names[x] = s.next();
			System.out.println("Enter Grade Of Studant Number "+String.valueOf(x +1) + ": ");
			grades[x] = s.nextInt();
		}
		
		for(int x=0; x<grades.length; x++) {
			System.out.println("Studant Number "+String.valueOf(x+1) +" "+names[x] + " ; Grade: "+grades[x]);
		}

	}

}
