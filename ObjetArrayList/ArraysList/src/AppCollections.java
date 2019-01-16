import java.util.ArrayList;

public class AppCollections {
	
	public static void main(String[] args) {
		/*
		String[] names = {"François", "Juliette", "Deniel", "Jack", "Patrick", "Franck"};
		for(String str: names) {
			System.out.print(", "+str);
		}
		*/
		ArrayList<String> etudients = new ArrayList<String>();
		etudients.add("François");
		etudients.add("Juliette");
		etudients.add("Deniel");
		etudients.add("Jack");
		etudients.add("Patrick");
		etudients.add("Franck");
		System.out.print("\n "+etudients);
		
		etudients.remove(0);
		etudients.remove(4);
		System.out.print("\n "+etudients);
		
		System.out.println("");
		
		etudients.remove(2);
		for(String str: etudients) {
			System.out.println(" "+str   );
		}
	}


}
