import java.util.ArrayList;
import java.util.List;

public class ListAndArrays {
	
	public static void afficherList(final String nom, final List<String> sousListe) {
		int i = 0;
		for(String str: sousListe) {
			System.out.format("%s %2d : %s\n", nom, i, str);
			i++;
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		afficherList("Liste ", list);
	
		List<String> sousListe = list.subList(1, 5);
		System.out.println("");
		afficherList("Sous Liste ", sousListe);
		System.out.println("");
		sousListe.remove(1);
		afficherList("Liste ", list);
		System.out.println("");
		afficherList("Sous Liste ", sousListe);
		System.out.println("");
		list.remove(0);
		afficherList("Liste ", list);
		System.out.println("");
		afficherList("Sous Liste ", sousListe);
		System.out.println("");

	}

}
