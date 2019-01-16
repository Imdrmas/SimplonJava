
public class TestTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tab[] = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
		System.out.print("Exemple d'exécution du programme: ");
	
		Tableaux t = new Tableaux();
		
		int[] tab1 = t.remplir1(5);
		int[] tab2 = t.remplir1(10);
		int[] tab3 = t.remplir1(6);
		
		t.runTableaux(tab);
		t.runTableaux(tab1);
		t.runTableaux(tab2);
		t.runTableaux(tab3);
		
		
		

	}

}
