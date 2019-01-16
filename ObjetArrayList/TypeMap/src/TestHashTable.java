import java.util.Enumeration;
import java.util.Hashtable;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "printemps");
		ht.put(2, "été");
		ht.put(3, "automne");
		ht.put(4, "hiver");
		
		Enumeration<String> e =ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
