import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, String> ht = new HashMap<String, String>();
		ht.put("1", "printemps");
		ht.put("2", "été");
		ht.put("3", "automne");
		ht.put("4", "hiver");
		
		for(String str: ht.keySet()) {
			System.out.print(str +" ");
		}
		System.out.println("");
		for(String str: ht.values()) {
			System.out.print(str +" ");
		}
		System.out.println("\n");
		for(Map.Entry<String, String> str: ht.entrySet()) {
			System.out.println(str.getKey() + " " + str.getValue());
		}

	}

}
