import java.util.*;
public class TestGenericsOld {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
          String value;
		for(int i = 1; i < 5; i++) {
			value = ""+i;
			list.add(value);
			//list.addAll(new Date());
		}
		for(Iterator<String> it = list.iterator(); it.hasNext();) {
			 value = (String) it.next();
			System.out.println(value);
		}

	}

}
