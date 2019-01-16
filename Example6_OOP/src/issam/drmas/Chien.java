package issam.drmas;

public class Chien extends Test{

	
	public Chien(String nom) {
		super("chein", nom);
	}
	
	public void parler() {
		System.out.println("C'est le chien " +this.nom+ " Qui parle");
		System.out.println(this.sAnnoncer());
		
	}

}
