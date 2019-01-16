package com.projet.inter;

import java.util.Date;

public class TestApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Profil profile[] = new Profil[2];
		  profile[0] = new Profil("EMP", "Employé");
		  profile[1] = new Profil("DG", "Directeur Général");
		    
		  Personne personnes[] = new Personne[6];

		  personnes[0] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[1]);
		  personnes[1] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[0]);
		  personnes[2] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[0]);
		  personnes[3] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[0]);
		  personnes[4] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[0]);
		  personnes[5] = new Personne(1, "Issam Drmas", new Date("04/05/1990"), 1000.0, profile[0]);

				  
				  for(Personne pers : personnes) {
					  pers.afficher();
				  }


	}

}
