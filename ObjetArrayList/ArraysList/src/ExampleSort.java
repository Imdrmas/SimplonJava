
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ExampleSort {

	public static void main(String[] args) {
		// Sort the List
		
		//System.out.println("Black, Green, Orange, Red, While");
		//String[] list = {"Red", "Green", "Orange", "White", "Black"};
		//System.out.println("\"Red\", \"Green\", \"Orange\", \"White\", \"Black\"\n");

		    System.out.println("");

		    List<String> list = new ArrayList<String>();
		    list.add("Red");
		    list.add("Green");
	        list.add("Orange");
	        list.add("White");
	        list.add("Black");
	        System.out.println(list);
       

	        TreeSet <String> tree = new TreeSet<String>();     
	        tree.addAll(list);
	           
	        Iterator<String> iterator = tree.iterator();

	        System.out.println("");
	        while (iterator.hasNext()){
	            System.out.print(iterator.next() + "; ");
	        }

	    System.out.println("");
	    ArrayList<String> list2 = new ArrayList<String>(3);
	    list2.add("Red");
	    list2.add("Green");
        list2.add("Black");
        System.out.println("\n"+list2);
        
        System.out.println("");
        list2.ensureCapacity(6);
        list2.add("white");
        list2.add("pink");
        list2.add("yellow");
             
        System.out.println(""+list2);
        
        /*
        Collections.reverse(list);
           
        Collections.reverse(list);        
        List<String> sousListe = list.subList(0, 3);
        System.out.println("Liste Rmove Lists Sort "+sousListe);
        
        sousListe.remove(2);
      
        sousListe.add("black");
        sousListe.add("white");
        sousListe.add("pink");
        sousListe.add("yellow");
        
        System.out.println("Liste Inscrese Sort "+sousListe);
       // System.out.println(sousListe.get(3));
        
       // Iterator<String> iterator = sousListe.iterator();
        
      */
          

	}

}
