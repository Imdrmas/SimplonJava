
public class Personne {
	private String nom;
	private Personne ami;
	
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	
	public Personne(String nom, Personne ami) {
		this.nom = nom;
		this.ami = ami;
	}


	public Personne getAmi() {
		
		return ami;
	}


	public void setAmi(Personne ami) {
		this.ami = ami;
	}
	
	public String toString() {
		if(this.getAmi() == null) {
			return this.nom + " n'a pas de ami";
		}else {
			return this.nom + " a pour ami "+this.getAmi().nom;
		}
		
}
	
   
}
