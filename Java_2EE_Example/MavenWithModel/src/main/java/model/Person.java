package model;

public class Person {
	private int id;
	private String fName;
	private String lName;
	private int age;
	private String email;
	private String city;
	private String school;
	
	public Person(int id, String fName, String lName, int age, String email, String city, String school) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.email = email;
		this.city = city;
		this.school = school;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

   
 
}

