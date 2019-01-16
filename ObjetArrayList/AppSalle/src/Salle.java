
public class Salle {
	private int id;
	private String leblle;
	private int capicite;
	private boolean dispo;

	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salle(int id, String leblle, int capicite, boolean dispo) {
		super();
		this.id = id;
		this.leblle = leblle;
		this.capicite = capicite;
		this.dispo = dispo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeblle() {
		return leblle;
	}

	public void setLeblle(String leblle) {
		this.leblle = leblle;
	}

	public int getCapicite() {
		return capicite;
	}

	public void setCapicite(int capicite) {
		this.capicite = capicite;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

}
