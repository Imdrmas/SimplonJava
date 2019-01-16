package drmas;

public class RunCalcu {
	
	public int addition(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int soubtraire(int a, int b) {
		int c=a-b;
		return c;
	}
	public int multiplier(int a, int b) {
		int c=a*b;
		return c;
	}
	public int diviser(int a, int b) {
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		RunCalcu c = new RunCalcu();
		int result = c.addition(1, 2);
		System.out.println(result);
	}

}
