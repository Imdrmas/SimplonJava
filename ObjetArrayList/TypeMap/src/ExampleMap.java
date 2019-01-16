import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "data1");
		map.put(2, "data2");
		map.put(3, "data3");
		map.put(4, "data4");
		System.out.println("This is Normal");
		System.out.println(map);
		
		System.out.print("\nThis is With For");
		for(Map.Entry<Integer, String> str: map.entrySet()) {
			System.out.println("\nKey is = "+str.getKey() + " and Value is = "+str.getValue());
		}
		
		System.out.print("\nThis is With Iterator");
		
		Set<?> set = map.entrySet();
		Iterator<?> it = set.iterator();
		while(it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)it.next();
			System.out.println("\nKey is = "+mentry.getKey() + " and Value is = "+mentry.getValue());
		}
		
		/*
		for(Map.Entry<String, String> str: map.entrySet()) {
			System.out.println(str.getKey() + " " + str.getValue());
		}
		System.out.println("");
		for(String str: map.values()) {
			System.out.println(str +" ");
		}
		
		System.out.println("");
		for(String str: map.keySet()) {
			System.out.print(str +" ");
		}
		*/

	}

}
