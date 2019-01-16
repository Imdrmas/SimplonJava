package drmas;

public class Calcul {

	public static void main(String[] args) {
		System.out.println("\n--------------------");

		System.out.println("1 Declaration 2 Variables A et B de type INT");
		System.out.println("2 Declaration 2 Variables C et D de type DOUBLE");
		System.out.println("3 Afficher INT Resultat en INt type. Et Afficher DOUBLE Resultat en DOUBLE type et En verse");
		
		System.out.println("\n---------------");
		
		int iRs, iRem;
		double dRs, dRem;
		
		iRs = 10/3;
		iRem = 10%3;
		System.out.println(iRs);
		System.out.println(iRem);
		
		dRs = 10.0 / 3.0;
		dRem = 10.0 % 3.0;
		
		System.out.println(dRs);
		System.out.println(dRem);
		
		// Operation is Division
		//! Example a = 5 And b = 3 
		
		System.out.println("\n--------- INT -----------");
		
		int a = 888, b = 7;
		int z = a / b;
		double di = z;
		System.out.println("Resultat est -> "+z);
		System.out.println("Resultat est Double -> "+(double)(di));
		
		System.out.println("\n---------- DOUBLE ----------");
		
		double c = 120, d = 11;
		double x = c / d;
		int xd = (int) x;
		System.out.println("Resultat est -> "+x);
		System.out.println("Resultat est Int -> "+xd);
		
		System.out.println("\n--------- LONG -----------");
		Long m = (long) (x + z);
		System.out.println("Resultat est -> "+m);
		
		System.out.println("\n---------- FLOAT ----------");
		float f = (float) (x + z);
		System.out.println("Resultat est -> "+f);
		
		
		System.out.println("\n---------- SHORT ----------");
		short s = (short) (x + z);
		System.out.println("Resultat est -> "+s);
		
		System.out.println("\n---------- Condition ----------");
		
		int temp = 13;
		
		if(temp < 0 || temp == 0) {
			System.out.println("Il Fait tres froid ");
		}
		
		else if(temp >= 10 && temp > 15) {
			System.out.println("Il Fait Beau + Choud ");
		}else {
			System.out.println("Il Fait Tres Choud ");
		}
		

	}

}
