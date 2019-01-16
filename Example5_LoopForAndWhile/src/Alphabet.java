
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example et Application de la boucle While
		// Ecrire une application qui permet d'afficher, en sa basent de la boucle while,
		// Tootes les lettres de l'aphabet.
		
		    int count = 0;
	        int userNum = 25;
	        char userLetter = 0;
	        
	        System.out.println("\n\n-----------------");

	        userLetter = 'A';
	        while (count <= userNum) {
	        	
	            System.out.print( (char)(userLetter+count));
	            count++;
	            
	        }
	        System.out.println("\n-----------------");
	        
		    int countM = 0;
	        int userNumM = 25;
	        char userLetterM = 0;
	        
	        System.out.println("\n\n-----------------");

	        userLetterM = 'a';
	        while (countM <= userNumM) {
	        	
	            System.out.print( (char)(userLetterM + countM));
	            countM++;
	            
	        }



	}

}
