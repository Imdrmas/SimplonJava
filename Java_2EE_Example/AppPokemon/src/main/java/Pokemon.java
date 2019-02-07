
public class Pokemon {
      private int point;
      private int total;
      private String name;
      
	public Pokemon(int point, String name) {
		super();
		this.point = point;
		this.name = name;
		total++;
	}
		
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndentifiant() {
		if(this.getName() == null ) {
			return "Name nout found ";
		}else {
			return "Je m'appelle " + this.getName();
		}
	}
    public String getPoint(Pokemon p) {
    	if(this.getPoint() < p.point) {
    		return "J'ai " + this.getPoint() + "points de vie";
    	}else if (this.getPoint() == p.point) {
    		return "Je suis du même niveau que "+p.getName();
    	}else {
    		return "Je suis moint fort que "+p.getName();
    	}
    }
      
}
