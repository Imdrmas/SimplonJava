import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
	public static void afficherSet( Set<String> set) {
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.print(element);
			if(it.hasNext()) {
				System.out.print(", ");	
			}
		}
	}

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<String>();
		for(int i = 1; i<10; i++) {
			set.add(""+i);
		}
        System.out.println(set);
        System.out.println("higher = "+set.higher("5"));
        System.out.println("lower = "+set.lower("5"));
        System.out.println("floor = "+set.floor("5"));
        System.out.println("first = "+set.first());
        System.out.println("size = "+set.size());
		afficherSet(set.descendingSet());
		
		System.out.println("\n");
		
		System.out.print("headSet(5) = ");
		afficherSet(set.headSet("5"));
		System.out.println("\n");
		
		System.out.print("headSet = true");
		System.out.print(set.headSet("5", true));
		System.out.println("\n");
		
		System.out.print("subSet(3,5) = ");
		System.out.print(set.subSet("3", "5"));
		System.out.println("\n");
		
		System.out.print("subSet(3, true, 5, true) = ");
		System.out.print(set.subSet("3", true, "5", true));
		System.out.println("\n");
		
		System.out.print("tailSet(5) = ");
		System.out.print(set.tailSet("5"));
		System.out.println("\n");
		
		System.out.print("tailSet(5,true) = ");
		System.out.print(set.tailSet("5", true));
		System.out.println("\n");
		
		System.out.println("pollFirst() = "+set.pollFirst());
		System.out.println("pollLast() = "+set.pollLast());
		
	}

}
