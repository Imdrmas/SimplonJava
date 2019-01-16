
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedLists {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList<Comparable> listChaine = new LinkedList<Comparable>();
		listChaine.add(12);
		listChaine.add("Tatao !!");
		listChaine.add(14.45f);
		
		for(int i = 0; i<listChaine.size(); i++) {
			System.out.println("Element to index "+i+" = "+listChaine.get(i));
			System.out.println("\n \tParcours avec un itérateur ");
			System.out.println("========================= ");
			
			@SuppressWarnings("rawtypes")
			Iterator<Comparable> itelrator = listChaine.iterator();
			
			while(itelrator.hasNext()) {
				System.out.println("Object = "+itelrator.next());
			}
		}

	}

}
