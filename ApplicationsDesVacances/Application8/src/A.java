
abstract class A {
    abstract void decrire();
    public String toString() {
    	return "Je suis A : ";
    }
}
class B extends A{
	void decrire() {
		System.out.println(this + "Je suis B la fille de A");
	}
}
class C extends A {
	void decrire() {
		System.out.println(this + "Je suis C la fille de A");
	}
}