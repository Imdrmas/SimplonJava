
public enum Langage {
	
	JAVA("Langage", "Eclipse"),
	C("Langage C","Code Block"),
	CPLUS("Langage C++", "Visual Studio"),
	PHP("Langage PHP", "PS Pad");
	
	private String  name ="";
	private String editor = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	private Langage(String name, String editor) {
		this.name = name;
		this.editor = editor;
	}
	

	
	

}
