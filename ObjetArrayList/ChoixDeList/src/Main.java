import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Author> o = new ArrayList<Author>();
		o.add(new Author("issam","nader","ma vie",2));
		o.add(new Author("ahmed","kaled","la mèsire",3));
		o.add(new Author("ali","jalal","qui es tu",1));
		o.add(new Author("rasha","wlid","dit chose",4));
		o.add(new Author("tago","mossa","non chose",5));
		
		Collections.sort(o);
		for(Author str: o) {
			System.out.println("Fname: "+str.getfName()+" Lname: "+str.getlName()+" Book: "+str.getBookName()+" ID: "+str.getId());
		}
		
		System.out.println("\n");
		
		Collections.sort(o, Author.idComparetor);
		for(Author str: o) {
			System.out.println("Fname: "+str.getfName()+" Lname: "+str.getlName()+" Book: "+str.getBookName()+" Id: "+str.getId());
		}
		

	}

}
