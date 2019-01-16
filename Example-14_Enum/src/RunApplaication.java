
public class RunApplaication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Langage l1 = Langage.JAVA;
		Langage l2 = Langage.PHP;
		l1.getEditor();
		l2.getEditor();
		
		System.out.println(l1.getEditor());
		System.out.println(l2.getEditor());
		
		Jour.action("LUNDI");
		Jour.action("mardi");
		Jour.action("SEMEDI");

	}

}
