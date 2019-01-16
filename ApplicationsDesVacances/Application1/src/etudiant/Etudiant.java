package etudiant;

public class Etudiant {
	private String nom;
	public Etudiant(String nom) {
		this.nom = nom;
	}
	public void travailler() {
		System.out.println(this.nom + " Se met au travail!");
	}
	public void seRepose() {
		System.out.println(this.nom + " Se repose");
	}

}
