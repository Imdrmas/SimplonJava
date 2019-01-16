package issam.encapsulation;


public class Client extends Personne{

	private int numberoClient;
	
	
	public Client(String nom, String prenom, int age, boolean enCours) {
		super(nom, prenom, age, enCours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NumberoClient:" + numberoClient + ", Nom:" + nom + ", Prenom:" 
	            + prenom + ", Age:" + age + ", En cours:" + enCours ;
	}

	public int getNumberoClient() {
		return numberoClient;
	}

	public void setNumberoClient(int numberoClient) {
		this.numberoClient = numberoClient;
	}
	
	
	

}
