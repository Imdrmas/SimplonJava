package issam.drmas;

public class Students {
	
	private String nom;
	private String prenom;
	private String address;
	private String email;
	private String classRoom;
	private int age;
	private boolean active = true;
	
	private static int totalStudents = 0;

	public Students(String nom, String prenom, String address, String email, String classRoom, int age,
			boolean active) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
		this.email = email;
		this.classRoom = classRoom;
		this.age = age;
		this.active = active;
		totalStudents++;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public static void getTotalStudent() {
		System.out.println("\n-----------------");
		System.out.println("There is :" + totalStudents + " Students");
	}
	

}
