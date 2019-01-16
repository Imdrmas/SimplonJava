
public class Palindrome {
	
	public static void main(String[] args) {
	
		String strBon="bonjour", strLaval = "laval";
		String valBon = "", valLaval = "";
		
		char[] chBon=strBon.toCharArray(), chLaval=strLaval.toCharArray();
		
		for(int i = chBon.length-1; i >= 0; i--) {
			valBon=valBon+chBon[i];
		}
		System.out.println("Exemple1 : \nL'inverse de bonjour est " + valBon);
		System.out.println(strBon+" n'est palindrame");
		
		for(int i = 0; i <= chLaval.length-1; i++) {
			valLaval=valLaval+chLaval[i];
		}
		System.out.println("\nExemple2 : \nL'inverse de laval est " + valLaval);
		System.out.println(strLaval+" est palindrame");
	
	}	
}
