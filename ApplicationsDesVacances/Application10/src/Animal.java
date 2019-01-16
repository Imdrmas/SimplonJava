import java.util.Random;

abstract class Animal {
     abstract void devine();
}
 class Oiseau extends Animal{
    void devine() {
    	System.out.println("Je suis un oiseau");
    }
}
 class Chat extends Animal{
    void devine() {
 	   System.out.println("Je suis un chat");
    }
}
class TextApp {
	
	static Random random = new Random();
	static Animal tirage() {
		return (Math.abs(random.nextInt())%2==0?new Oiseau():new Chat());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tirage().devine();

	}

}