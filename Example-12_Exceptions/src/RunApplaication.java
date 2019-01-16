
public class RunApplaication {

	static Boolean var = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Coucou 1");

			if (var)
				throw new Ville();
			System.out.println("Coucou 2");

		} catch (Ville e) {

			System.out.println("Coucou 3");
		}

		System.out.println("Coucou 4");
	}

}
