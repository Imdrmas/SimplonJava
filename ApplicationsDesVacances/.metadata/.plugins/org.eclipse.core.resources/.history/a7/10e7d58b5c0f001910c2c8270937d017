public class segmentDeDroite {
	
	int point;
	int segmentA;
	int segmentB;
	int longueur;
	
	public segmentDeDroite(int segmentA, int segmentB, int point) {
		this.segmentA = segmentA;
		this.segmentB = segmentB;
		this.point= point;
	}

	public int calculerLongueur() {
		longueur= segmentA - segmentB;
		if(longueur < 0) {
			longueur *= -1;
		}
		return longueur;
	}
	
	public void pointAppartien() {
		if(segmentA < segmentB) {
			if((segmentA <= point) && (point <= segmentB)) {
				System.out.println("  "+point +" appartient au segment [" + segmentA +", "+ segmentB + "]:");
			}else {
				System.out.println("  "+point +" n'appartient pas au segment [" + segmentA +", "+ segmentB + "]:");
			}
		}else if(segmentA > segmentB){
			if((point <= segmentA) && (point >= segmentB)) {
				System.out.println("  "+point +" appartient au segment [" + segmentA +", "+ segmentB + "]:");
			}else {
				System.out.println("  "+point +" n'appartient pas au segment [" + segmentA +", "+ segmentB + "]:");
			}
			
		}
	}
	
	public void verifierSegment() {
		System.out.println("Pour la commmande :");
		System.out.println("TestSegment "+ segmentA + " "+ segmentB +" "+ point);
		longueur = calculerLongueur();
		System.out.println("Longueur du segment[" + segmentA +", "+ segmentB + "]: "+ longueur);
		pointAppartien();
		
		
	}
}