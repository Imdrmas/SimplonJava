import java.util.TreeSet;

public class ExampleTreeSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		System.out.println(ts.lower("b"));
		System.out.println(ts.higher("b"));
	
		ts.remove("c");	
		System.out.println(ts);
		
		//System.out.println(ts.headSet("n"));
		//System.out.println(ts.tailSet(""));

	}

}
