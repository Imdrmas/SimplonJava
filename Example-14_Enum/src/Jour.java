
public enum Jour {
	LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI, SEMEDI, DIMANCHE;
	
	static void action(String nom) {
		try {
		Jour jour = Jour.valueOf(nom);
		switch(jour) {
		case SEMEDI:
		case DIMANCHE:
			System.out.println("Se Reposer");
			break;
			default:
				System.out.println("Travailler");
		}
		}catch(Exception e) {
			System.out.println("nom de jour incorrect "+e.getMessage());
		}
	}

}
