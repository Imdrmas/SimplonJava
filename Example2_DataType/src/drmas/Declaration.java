package drmas;

public class Declaration {

	public static void main(String[] args) {
		
		String phrase;
		phrase = "Voici Mon Example";
		
		String str = new String();
		str = "Une autre chaîne de caracters";
		
		String string = "Une Autre Chaîne";		
		
		String chaine = new String("Et Une De Plus!");
		
		System.out.println("\n1 Déclaration String Methode : " + " String phrase: phrase = \'Voici mon example 1\'; ");
		System.out.println("Execute-> "+phrase);
		System.out.println("--------------------\n");
		
		
		System.out.println("\n2 Déclaration String Methode : " + " String str = new String(); str = \'Une autre chaine de caracter\'; ");
		System.out.println("Execute-> "+str);
		System.out.println("--------------------\n");
		
		System.out.println("\n3 Déclaration String Methode : " + " String string = \'Et Une Autre Chaîne\'; ");
		System.out.println("Execute-> "+string);
		System.out.println("--------------------\n");
		
		System.out.println("\n4 Déclaration String Methode : " + " String chaine = new String(\'Et Une De Plus!\'); ");
		System.out.println("Execute-> "+chaine);	
		System.out.println("--------------------\n");
		
		System.out.println("My String In Chaine: " + phrase + ", " + str + ", " + string + ", " + chaine);
		
		

	}

}
