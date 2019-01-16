import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<MyClassStagaire> infoStagaires = new ArrayList<MyClassStagaire>();
		infoStagaires.add(new MyClassStagaire(225, "Jean", "L", 25));
		infoStagaires.add(new MyClassStagaire(100, "Franck", "D", 27));
		infoStagaires.add(new MyClassStagaire(220, "Alain", "J", 20));
		infoStagaires.add(new MyClassStagaire(150, "Victor", "T", 22));
		
		System.out.println("\n Liste Oring\n");
		for(int i=0; i<infoStagaires.size(); i++) {
			System.out.println(infoStagaires.get(i));
		}

		System.out.println("\n Liste triée par Age\n");
		Collections.sort(infoStagaires, new SortByAge());
		for(int i=0; i<infoStagaires.size(); i++) {
			System.out.println(infoStagaires.get(i));
		}
		
		System.out.println("\n Liste triée par noms\n");
		Collections.sort(infoStagaires, MyClassStagaire.byName);
		for(int i=0; i<infoStagaires.size(); i++) {
			System.out.println(infoStagaires.get(i));
		}
	
		System.out.println("\n Liste triée par Id\n");
		Collections.sort(infoStagaires, MyClassStagaire.byid);
		for(int i=0; i<infoStagaires.size(); i++) {
			System.out.println(infoStagaires.get(i));
		}

	}

}
