package objekte;

public class Spezialisierung {
	private int id;
	private String bezeichnung;
	private Fach fach;

	public Spezialisierung() {
	}

	public Spezialisierung(int id, String bezeichnung, Fach fach) {
		super();
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.fach = fach;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public Fach getFach() {
		return fach;
	}

	public void setFach(Fach fach) {
		this.fach = fach;
	}

	@Override
	public String toString() {
		return "Spezialisierung id: " + id + ", Bezeichnung = " + bezeichnung + ", Fach_id = " + fach.getId();
	}

}
