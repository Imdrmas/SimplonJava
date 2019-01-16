
public class Tableaux {
	
	
	public void operation1(int[] tab) {
		int nb = 0;
		for(int i = 1; i<tab.length; i++) {
			if(tab[i] == 9) {
				nb++;
			}
		}
		System.out.println("\nIl y a "+nb+" éléments de valeur 9 dans le tableau");
	}
	public void operation2(int[] tab) {
		int nb = 0;
		for(int i = 1; i<tab.length; i++) {
			if((tab[i] > 4) || (tab[i] < 2)) {
				nb++;
			}
		}
		System.out.println("Il y a "+nb+" éléments plus grand que 4 ou plus petit que 2");
	}
	public void operation3(int[] tab) {
		int res = 0;
		for(int i = 0; i<tab.length; i++) {
			res+=tab[i];
		}
		System.out.println("La somme des éléments est "+res);
	}
	public void operation4(int[] tab) {
		double sum = 0;
		for(int i = 0; i<tab.length; i++) {
			sum+=tab[i];
		}
		System.out.println("La moyenne arithmétique des éléments est "+sum/tab.length);
	}
	public void operation5(int[] tab) {
		int max = 0;
		for(int i = 0; i<tab.length; i++) {
			if(tab[i] > max) {
				max = tab[i];
			}
		}
		System.out.println("Le plus grand éléments vaut: "+max+"");
	}

	public int[] remplir1(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < tab.length; i++) {
			tab[i]=i;
		}
		return tab;
	}
	public int[] remplir2(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < tab.length; i++) {
			tab[i]=i+5;
		}
		return tab;
	}
	public int[] remplir3(int nb) {
		int[] tab = new int[nb];
		for(int i = 0; i < tab.length; i++) {
			tab[i]= (tab.length-i);
		}
		return tab;
	}
	public void afficher(int[] tab) {

		for(int i = 0; i < tab.length; i++) {
			int res = tab[i];
			System.out.print(res+" ");
		}

	}
	public void runTableaux(int[] tab) {
		
		afficher(tab);
		operation1(tab);
		operation2(tab);
		operation3(tab);
		operation4(tab);
		operation5(tab);
	}
}
