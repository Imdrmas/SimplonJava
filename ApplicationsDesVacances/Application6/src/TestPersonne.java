
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne personneSeule;
		Personne  ami1;
		Personne ami2 = null;

		personneSeule = new Personne("Tom");
		ami1 = new Personne("Adam");
		ami2 = new Personne("Hugo");
         ami1.setAmi(ami2);
         ami2.setAmi(ami1);
		
		System.out.println(personneSeule);
		System.out.println(ami1); 
        System.out.println(ami2);

	}

}
