
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ecrire une application Word Count qui permet de retourner pour une chaine de
		 * caracters donnés le nombre de mots le nombre de lignes et le nombres de
		 * caractéres
		 * 
		 */

		// String str = "TeamViewer Host est utilisé pour un accès 24 heures sur 24 et 7
		// jours sur 7 sur des ordinateurs distants, en faisant la solution idéale pour
		// des utilisations telles que la surveillance à distance, la maintenance de
		// serveurs ou la connexion à un PC ou Mac au bureau ou à domicile. Installez
		// TeamViewer Host sur un nombre illimité d’ordinateurs et d’appareils. En tant
		// qu’utilisateur sous licence, vous avez accès à tous ces postes!";

		String str = "Hello\n World \n Welcome to\n ";
		int numChar = 0, numWord = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				numChar++;

			} else {
				numWord++;
			}

		}

		System.out.println("\n----------------------");
		System.out.println("Numbre de chars " + numChar);

		System.out.println("----------------------");
		System.out.print("Numbre de mots " + numWord);

		System.out.println("\n------------------------");
		System.out.println("Line count: " + countLines(str));
		
		
		System.out.println("\n------------ With Switch------------\n");
		
		boolean dansMot = false;
		int nChar = 0, nMot = 0, nLigne = 0;
		for(int x =0; x < str.length(); x++) {
			char c = str.charAt(x);
			nChar++;
			switch(c) {
			case '\n':
				nLigne++;
				break;
			case '\r':
				continue;
			case ' ':
				
				if (dansMot) {
					nMot++;
					dansMot = true;
				}
				break;
			default:
				dansMot = true;
			}		
	
		}
		System.out.println("\tLigne " +nLigne+"\tMot " +nMot+"\tChar " +nChar);

	}

	private static int countLines(String s) {
		return (s + " ").split("[\n|\r]").length;
	}

}
