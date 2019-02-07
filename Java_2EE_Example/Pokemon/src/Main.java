import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon pokemon = new Pokemon();
		
		Pokemon pokemon1 = new Pokemon();
		Pokemon p1 = new Pokemon(90, "Tagow", pokemon1 );
		
		Pokemon pokemon2 = new Pokemon();
		Pokemon p2 = new Pokemon(60, "Drmas", pokemon2);
		
		Pokemon pokemon3 = new Pokemon();
		Pokemon p3 = new Pokemon(60, "Ahmed", pokemon3);
		
		List<Pokemon> list = new ArrayList<Pokemon>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("Total : " + Pokemon.total + "\n");
		for(Pokemon str : list ) {
			str.getIndentifiant();
			str.getAllPoint(pokemon);
		}
		/*
		p1.getIndentifiant();
		p1.getAllPoint(pokemon1);
		
		System.out.println("");
		
		p2.getIndentifiant();
		p2.getAllPoint(pokemon2);
		
	    System.out.println("");
		
		p3.getIndentifiant();
		p3.getAllPoint(pokemon3);
		*/
		
	

	}

}
