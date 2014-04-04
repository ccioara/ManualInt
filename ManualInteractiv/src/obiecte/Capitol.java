package obiecte;

public class Capitol {
	private int id;
	private String nume;
	
	public Capitol(int id, String nume) {
		super();
		this.id = id;
		this.nume = nume;
	}
	public Capitol() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
		
}