package model;

public class Salle {

	public int id;
	private String code;
	private String liballe;

	public Salle() {
		super();
	}

	public Salle(int id, String code, String liblle) {
		this.code = code;
		this.liballe = liblle;
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLiballe() {
		return liballe;
	}

	public void setLiballe(String liballe) {
		this.liballe = liballe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
