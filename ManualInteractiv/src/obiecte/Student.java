package obiecte;

public class Student {
	private int id;
	private int grupa;
	private int punctaj;
	private String nume;
	private String prenume;
	private String email;
	public Student(int id, int grupa, int punctaj, String nume, String prenume,
			String email) {
		super();
		this.id = id;
		this.grupa = grupa;
		this.punctaj = punctaj;
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
	}
	public Student() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrupa() {
		return grupa;
	}
	public void setGrupa(int grupa) {
		this.grupa = grupa;
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}