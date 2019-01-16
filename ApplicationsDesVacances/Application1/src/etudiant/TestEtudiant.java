package etudiant;

public class TestEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant et1 = new Etudiant("Toto");
		Etudiant et2 = new Etudiant("Toto");
		
		System.out.println("\n-------------------");
		et1.travailler();
		et2.seRepose();

	}

}
