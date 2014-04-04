package obiecte;

public class Intrebare {
	private int id;
	private int idCapitol;
	private String intrebare;
	
	public Intrebare() {
		super();
	}
	public Intrebare(int id, int idCapitol, String intrebare) {
		super();
		this.id = id;
		this.idCapitol = idCapitol;
		this.intrebare = intrebare;
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
	public String getIntrebare() {
		return intrebare;
	}
	public void setIntrebare(String intrebare) {
		this.intrebare = intrebare;
	}
	
}