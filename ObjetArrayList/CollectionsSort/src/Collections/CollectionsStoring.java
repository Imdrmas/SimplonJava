package Collections;
import java.util.*;

public class CollectionsStoring {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Issam drmas");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Super");
		
		Collections.sort(al);
		System.out.println("List after the use of Collections.sort():"+ al);
		
		System.out.println("\n");
		
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("List use of Collections.reverseOrder():"+ al);
		
		System.out.println("\n Students Class");
		ArrayList<Students> sl = new ArrayList<Students>();
		sl.add(new Students(111, "bbbb", "London"));
		sl.add(new Students(131, "aaaa", "Paris"));
		sl.add(new Students(121, "cccc", "Brelin"));
		
		System.out.println("\n List UnSorted");
		for(int i=0; i<sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		Collections.sort(sl, new SortByRoll());
		System.out.println("\n List Sort By Rollno");
		for(int i=0; i<sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		
		System.out.println("\n Create an array of string objs");
		String domains[] = {"Paractice", "Geeks", "Code", "Quiz"};
		
		List<String> colList = new ArrayList<String>(Arrays.asList(domains));
		Collections.sort(colList);
		System.out.println("List after the use of Collections.sprt()"+colList);
		
		
		

	}

}
