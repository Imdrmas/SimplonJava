import java.util.Scanner;

public class MotDeviner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
		/*
		 * Ecrire une application guess qui permet de deviner la lettre que vous avez en tete
		 * 
		 * 
		 *Indication:
		 *Les lettres sont entre A et Z
		 *Autre methode pour lire un caractere du terminal ch = (char) System.in.read() // get a char
		 *Ces caracters ne seront pas accepeter:
		 *(ch == '\n' | ch = '\n')
		 */
		
		/*
		char ch = 0;
		
		do {
			System.out.println("Press a key follwed by Enter");
			try {
				ch = (char) System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(ch != 'q');
		*/

		System.out.print("I'm thinking of a number between A and Z ");
    	System.out.println("Can you gess it: ");

        Scanner sc = new Scanner(System.in);        
        char answer = 'k';
        char ch;

        do {
        	do {
        		ch = sc.nextLine().charAt(0);
        
        	}while(ch == '\n' | ch == '\r');
            
        	if(ch == answer) {
        		System.out.println("Right");
        	}else {
        		System.out.println("Sorry, you are");
        		if(ch < answer) {
        			System.out.println("Too Low");
        		}else {
        			System.out.println("Too High");
        		}
                System.out.println("\nDo you want to try again press any key");
   
        }
    	}while(answer != ch);

	}

}
