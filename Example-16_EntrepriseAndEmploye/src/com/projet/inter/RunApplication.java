package com.projet.inter;

import java.util.Date;

public class RunApplication {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	
  Profil profile[] = new Profil[2];
  profile[0] = new Profil("EMP", "Employé");
  profile[1] = new Profil("DG", "Directeur Général");
    
  Personne personnes[] = new Personne[6];

  personnes[0] = new Personne(1,"Drmas", "issam", new Date("04/05/1990"), 1000.0, profile[1]);
  personnes[1] = new Personne(2,"Ahmed", "Abdallah", new Date("01/06/1980"), 1000.0, profile[0]);
  personnes[2] = new Personne(3, "Asra", "Mohamed", new Date("02/03/1980"), 1000.0, profile[0]);
  personnes[3] = new Personne(4, "Tago", "Mossa", new Date("02/03/2000"), 1000.0, profile[0]);
  personnes[4] = new Personne(5, "Huda", "Mossa", new Date("02/03/2002"), 1000.0, profile[0]);
  personnes[5] = new Personne(6, "Aslam", "Ehmed", new Date("02/03/2006"), 1000.0, profile[0]);
		  
		  for(Personne pers : personnes) {
			  pers.affiche();
		  }
		  
	
}
}
