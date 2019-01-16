import java.util.Comparator;

public class MyClassStagaire {
     int id;
     String fName;
     String lName;
     int age;
    
	public MyClassStagaire(int id, String fName, String lName, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public String toString() {
		return "ID: "+ this.id + ", Fname: " +this.fName + ", Lname: " + this.lName + ", Age: " + this.age;
	}
	
	public static Comparator<MyClassStagaire> byName = new Comparator<MyClassStagaire>() {
		public int compare(MyClassStagaire s1, MyClassStagaire s2) {
			return s1.fName.compareTo(s2.fName);
		}
	};
	
	public static Comparator<MyClassStagaire> byid = new Comparator<MyClassStagaire>() {
		public int compare(MyClassStagaire s1, MyClassStagaire s2) {
			return s1.id - s2.id;
		}
	};
    
}

class SortByAge implements Comparator<MyClassStagaire>{

	public int compare(MyClassStagaire o1, MyClassStagaire o2) {

    return o1.age - o2.age;
		
	}
	
}

