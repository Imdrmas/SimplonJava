package issam.heritage;


public class RunApplaiction {
public static void main(String[] args) {

	
	Ville v1 = new Ville("Loyn", 1500000);
	Ville v2 = new Ville("Nice");
	
	Capitale c1 = new Capitale("Paris", 10000000, "France");
	Capitale c2 = new Capitale("Berlin","Allemagne");

	System.out.println(v1.pressentToi());
	System.out.println(v2.pressentToi());
	System.out.println(c1.pressentToi());
	System.out.println(c2.pressentToi());
	
	
}
}
