import java.util.Comparator;

public class Author implements Comparable<Author>{
	private String fName = "";
	private String lName = "";
	private String bookName = "";
	private int id;
	
	public Author(String fName, String lName, String bookName, int id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.bookName = bookName;
		this.id = id;
	}

	@Override
	public int compareTo(Author o) {
		if(this.id == o.id) {
			return 0;
		} else if(this.id == o.id) {
			return 1;
		} else {
			
			//COMPAR STRING
			// int last = this.lName.compareTo(o.lName);  
			//return last == 0 ? this.fName.compareTo(fName) : last;
			return -1;
		}
		
		
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static Comparator<Author> idComparetor = new Comparator<Author>() {
		public int compare(Author o1, Author o2) {
			int id1 = o1.getId();
			int id2 = o2.getId();
			
			return id1-id2;
		}
	};

}
