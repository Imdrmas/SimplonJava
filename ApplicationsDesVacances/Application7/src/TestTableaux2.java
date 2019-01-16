import java.util.Arrays;

public class TestTableaux2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ecire une application tabeau qui pourrait afficher la trace ci dessous :
		
	   int[] tab = {3, -8, 14, 4};
	   System.out.println("Le tableau initial est : "+Arrays.toString(tab));
	   
	   System.out.println("\nLongueur du tableau = "+tab.length);
	   
	   int sum = 0;
	   for(int i : tab) {
		   sum += i;
	   }
        System.out.println("\nSomme du tableau = "+sum);
        
        int maxAt = 0;
        for (int i = 0; i<tab.length; i++) {
        	maxAt = tab[i] > tab[maxAt] ? i : maxAt;
        }
        System.out.println("\nIndice du max du tableau = "+maxAt);
        System.out.println("\nAprés ajout de 20 : "); 
        System.out.println("\nLe tableau initial est : "+Arrays.toString(tab));
    
        tab = Arrays.copyOf(tab, tab.length + 1); //create new array from old array and allocate one more element
        tab[tab.length - 1] = 20;
        System.out.println(("\net initial est : "+Arrays.toString(tab)));
        
	}

}
