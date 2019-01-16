package Collections;

import java.util.Comparator;

public class Students {
      int rollno;
      String name, address;
	public Students(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
      
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
      
}

class SortByRoll implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.rollno - o2.rollno;
	}
	
}