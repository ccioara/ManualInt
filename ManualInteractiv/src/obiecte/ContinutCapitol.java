package obiecte;

public class ContinutCapitol {
	private int id;
	private int idCapitol;
	private String text;
	
	public ContinutCapitol(int id, int idCapitol, String text) {
		super();
		this.id = id;
		this.idCapitol = idCapitol;
		this.text = text;
	}

	public ContinutCapitol() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCapitol() {
		return idCapitol;
	}

	public void setIdCapitol(int idCapitol) {
		this.idCapitol = idCapitol;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
