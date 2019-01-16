package issam.drmas;

public class Test {
	private String race;
	protected String nom;
	public String name;
	
	public Test(String race, String nom) {
		this.race = race;
		this.nom = nom;
	}
	
	protected String sAnnoncer() {
		return ("Je suis le "+this.race+ " "+this.nom);
	}

}
