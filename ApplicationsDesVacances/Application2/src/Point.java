
public class Point {
	private double x;
	private double y;
	private char nom;
	
	public Point(char nom, double x, double y) {
		this.nom = nom;
		this.x = x;
		this.y = y;
	}
	public void deplacer(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public char getNom() {
		return this.nom;
	}
	public void afficher() {
		System.out.println(this.nom + "(" + this.x + ";" + this.y + ")");
	}

}
