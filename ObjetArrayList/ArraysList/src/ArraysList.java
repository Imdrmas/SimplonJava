import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList {
 public static void main(String[] args) {
	 String[] tableau = {"tab1", "tab2", "tab3", "tab4 "};
	 List<String> list = new ArrayList<>();

	 System.out.println("Contenu du tableau\n");
	 for(String str: tableau) {
		 System.out.print(" "+str);
	 }
	  
	 list = Arrays.asList(tableau);
	 for(String str: list) {
		 System.out.println("Contenu de la liste");
		 System.out.print(" "+str);
	 }
	 System.out.println("\n");
	 tableau[0] = "tab";
	  
	 
	 System.out.println("Contenu de la liste");
	 for(String str : list) {
		 System.out.print(" "+str);
	 }
	 System.out.println("\n");
	 list.add("newTab");
	 
	 System.out.println("Contenu du tableau");
	 for(String str: tableau) {
		 System.out.print(" "+str);
	 }
 }
}
