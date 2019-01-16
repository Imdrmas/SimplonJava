import java.util.Scanner;

public class EtudiantNote {
	
		/*
		 * Etudiant(nom, prenom)
		 * note de cet etudiant
		 * 
		 * note min, note max, moyenne
		 * année validée?
		 */
		
		// enter le nombre de maties
		//3
		/*
		 * Etudiant note 80 Votre note min est 10
		 * Etudiant note 10 Votre note Max est 20
		 * Etudiant note 15 votre note moyenne = 17
		 * Vous avez validée votre anné
		 */
	
	    Scanner sc = new Scanner(System.in);		
		String nom, prenom;	
		
		private double notes[];

		public EtudiantNote(String nom, String prenom) {
			super();
			this.nom = nom;
			this.prenom = prenom;
		}
	
	public double moyenne() {
		double moyenne;
		double sum = 0;
		for(int i = 0; i < this.notes.length; i++) {
			sum =+ this.notes[i];
		}
		if(this.notes.length == 0) {
			System.out.println("Il n'y a pas de notes...");
			return 0.0;
		} else {
			moyenne = sum / this.notes.length;
			return moyenne;
		}
	}
	public double minimum() {
		double min = notes[0];
		for(int i = 0; i < notes.length; i++) {
			if(notes[i] < min) {
				min = notes[i];
			}
		}
		return min;
		
	}
	public double maximum() {
		double max = notes[0];
		for(int i = 0; i < notes.length; i++) {
			if(notes[i] > max) {
				max = notes[i];
			}
		}
		return max;
	}
	
	public void saisieNote(int nbNote) {
		    notes = new double[nbNote];
		for(int i =0; i < nbNote; i++) {
			System.out.println("Saisisez une note");	
			int note = sc.nextInt();
			notes[i] = note;
		}

	}
	
	public boolean valide() {
		if(this.moyenne() >= 10) {
			return true;
		}else {
			return false;
		}
	}
	/*
	public double getNote(int index) {
		return this.notes[index];
	}
	public double[] getNotes() {
		return notes;
	}

	public String valide() {
		String chine = "";
		int moyenne = (int) moyenne();
		if(moyenne > 10) {
			chine = "année validé";
		} else {
			chine = "année non validé";
		}
		return chine;

	}
	*/

}
