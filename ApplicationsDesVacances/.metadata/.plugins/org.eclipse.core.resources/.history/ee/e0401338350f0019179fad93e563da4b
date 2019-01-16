
public class Segment {
	private Point origine;
	private Point extremite;
	
	public Segment(Point origine, Point extremite) {
		this.origine=origine;
		this.extremite=extremite;
	}

	Segment(char nomOr, double xOr, double yOr, char nomExt, double xExt, double yExt){
		this.origine=new Point(nomOr, xOr, yOr);
		this.extremite=new Point(nomExt, xExt, yExt);
	}
	
	double longueur() {
		double x=Math.pow(this.extremite.getX()-this.origine.getX(), 2);
		double y=Math.pow(this.extremite.getY()-this.origine.getY(), 2);
		
		return Math.sqrt(x+y);
	}
	
	  void deplaceOrigine (double dx, double dy){
	      this.origine.deplacer(dx, dy);
	   }
		
	   void deplaceExtremite (double dx, double dy){
	      this.extremite.deplacer(dx, dy);
	   }
		
	   void affiche(){
	      System.out.print("segment [" + this.origine.getNom() + this.extremite.getNom() + "] origine ");
	      this.origine.afficher();
	      System.out.print(" extremite ");
	      this.extremite.afficher();
	   }

}
