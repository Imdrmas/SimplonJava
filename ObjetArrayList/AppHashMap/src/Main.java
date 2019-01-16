
import java.util.*;

public class Main {

	public static void main(String args[]) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");

		System.out.println("\nBefore Sorting");
		System.out.println("");
		for (Map.Entry<Integer, String> str : hmap.entrySet()) {
			System.out.println(str.getKey() + ":" + str.getValue());
		}

		System.out.println("\nAfter Sorting");
		System.out.println("");

		Map<Integer, String> treeMap = new TreeMap<>(hmap);
		for (Map.Entry<Integer, String> str : treeMap.entrySet()) {
			System.out.println(str.getKey() + ":" + str.getValue());
		}

		System.out.println("\nAfter Sorting By Value");
		System.out.println("");

		MyComparator comparator = new MyComparator(hmap);

		Map<Integer, String> newMap = new TreeMap<Integer, String>(comparator);
		newMap.putAll(hmap);
		for (Map.Entry<Integer, String> str : newMap.entrySet()) {
			System.out.println(str.getKey() + ":" + str.getValue());
		}

		System.out.println("\nPrint Just Values Sorting By Value");
		System.out.println("");

		String[] strings = new String[hmap.values().size()];
		hmap.values().toArray(strings);

		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String s1, String s2) {
				int c = s2.length() - s1.length();
				if (c == 0)
					c = s1.compareToIgnoreCase(s2);
				return c;
			}
		});

		for (String s : strings) {
			System.out.println(s + " ");
		}

	}

}

class MyComparator implements Comparator<Object> {

	Map<Integer, String> map;

	public MyComparator(HashMap<Integer, String> hmap) {
		this.map = hmap;
	}

	public int compare(Object o1, Object o2) {

		if (map.get(o2) == map.get(o1))
			return 1;
		else
			return ((String) map.get(o1)).compareTo((String) map.get(o2));

	}
}
