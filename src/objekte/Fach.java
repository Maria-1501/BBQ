package objekte;

public class Fach {
	private int id;
	private String bezeichnung;

	public Fach() {
	}

	public Fach(int id, String bezeichnung) {
		this.id = id;
		this.bezeichnung = bezeichnung;

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

	@Override
	public String toString() {

		return "Fach: " + bezeichnung + " id " + id;
	}

}
