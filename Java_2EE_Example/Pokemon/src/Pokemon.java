public class Pokemon {
      private int point;
      public static int total;
      private String name;
      private Pokemon p;
      
	public Pokemon(int point, String name, Pokemon p) {
		super();
		++total;
		this.point = point;
		this.name = name;
		this.p = p;
		
	}
	
	public Pokemon() {
      
	}

	public Pokemon getP() {
		return p;
	}
		
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getIndentifiant() {
		if(this.getP() == null ) {
			System.out.println("null");
		}else {
			System.out.println("Je m'appelle " + this.getName());
			System.out.println("J'ai " + this.getPoint() + " points de vie");
		}
	}
	
	
    public void getAllPoint(Pokemon p1) {
    	if(this.point < p1.point) {
    		System.out.println("Je suis du plus niveau que "+this.getName());
    	}else if (this.point == p1.point) {
    	    System.out.println("Je suis du même niveau que "+this.getName());
    	}else {
    		System.out.println("Je suis moint fort que "+this.getName());
    	} 
    	System.out.println("");
    }


      
}