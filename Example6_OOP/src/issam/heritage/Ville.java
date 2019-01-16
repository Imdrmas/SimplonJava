package issam.heritage;

public class Ville{

	protected String nomVille;
	protected int numHabitat;
	
	public Ville(String lNomVille) {
		nomVille = lNomVille.toUpperCase();
		numHabitat = -1;
	}

	public Ville(String lNomVille, int lNumHabitat) {

		nomVille = lNomVille.toUpperCase();
		if(lNumHabitat < 0) {
			System.out.println("Un nombre d'hitant doit être poisif");
			numHabitat = -1;
		}else {
			numHabitat  = lNumHabitat;
		}

	}


	public String getNomVille() {
		return nomVille;
	}

	public int getNumHabitat() {
		return numHabitat;
	}

	public void setNumHabitat(int newNbHabitat) {
		if(newNbHabitat < 0) {
			System.out.println("Nombre d'habitant doit être positif. ");
		}else {
			numHabitat = newNbHabitat;
		}

	}

	public String pressentToi() {

		String chine = "Ville "+nomVille+ " Number d'Habitats ";
		if(numHabitat == -1) {	
		
			chine = chine + "Inconnu";
		} else {
			chine = chine + "= " + numHabitat;
		}
		return chine;
	
	}
	
	
}
