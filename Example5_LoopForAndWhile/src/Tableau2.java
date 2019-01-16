
public class Tableau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ecrire une application power qui retour la puissance 2 des valeurs entre 0 Et 9
		
		System.out.println("\nApplication power qui retour la puissance 2 des valeurs entre 0 Et 9");
		
		
		System.out.println("--------- With For And While ----------\n");
		
		int e, res;

		for (int i = 0; i < 10; i++) {

			res = 1;
			e = i;
			while(e > 0) {
				res *= 2;
				e--;
			}
			 System.out.println("2 To The Power Of " + i + " is "+ res);
			
		 
		}
		
		System.out.println("\n--------- With Math Pow ----------\n");
		
		for(int x = 0; x < 10; x++) {
			int sum = (int) Math.pow(2, x);
			System.out.println("2 To The Power Of " + x + " is "+ sum);
		}
		
		System.out.println("\n--------- With For ----------\n");
		int tab[] = {0,1,2,3,4,5,6,7,8,9};
		for(int o = 0; o < tab.length; o++) {
			System.out.println("2 To The Power Of " + o + " is "+ (int)Math.pow(2, o));
		}

	}

}
