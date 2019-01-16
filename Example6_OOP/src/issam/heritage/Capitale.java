package issam.heritage;

public class Capitale extends Ville{

	private String nomPays;

	public Capitale(String lNomVille, int lNumHabitat, String nomPays) {
		super(lNomVille, lNumHabitat);
		this.nomPays = nomPays;
		// TODO Auto-generated constructor stub
	}

	public Capitale(String lNomVille, String nomPays) {
		super(lNomVille);
		this.nomPays = nomPays;
	}
		
	
	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String pressentToi() {
		
		String chine = super.pressentToi();
		chine = chine + ", Capitale de " + nomPays;
		return chine;
				
	}


}
