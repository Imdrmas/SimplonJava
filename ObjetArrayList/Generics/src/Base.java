
public class Base {

	public void display() {
		System.out.println("Base Display");
	}

}
class Derived extends Base{
	//@Override
	public void display(int x) {
		System.out.println("Derived display(int)");
	}
	
	public static void main(String args) {
		Derived d = new Derived();
		d.display();
	}
}

//Print 
/*
error: method does not override or implement
a method from a supertype
*/