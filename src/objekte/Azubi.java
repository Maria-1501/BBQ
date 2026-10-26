package objekte;

public class Azubi {
	private int id;
	private String name;
	private String vorname;
	private int spezialiesierung_id;
	private int gruppe_id;

	public Azubi() {
	}

	public Azubi(int id, String name, String vorname, int spezialiesierung_id, int gruppe_id) {

		this.id = id;
		this.name = name;
		this.vorname = vorname;
		this.spezialiesierung_id = spezialiesierung_id;
		this.gruppe_id = gruppe_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getSpezialiesierung_id() {
		return spezialiesierung_id;
	}

	public void setSpezialiesierung_id(int spezialiesierung_id) {
		this.spezialiesierung_id = spezialiesierung_id;
	}

	public int getGruppe_id() {
		return gruppe_id;
	}

	public void setGruppe_id(int gruppe_id) {
		this.gruppe_id = gruppe_id;
	}

	@Override
	public String toString() {
		return "Azubi id: " + id + ", Name = " + name + ", Vorname = " + vorname + "Spezialiesierung_id = "
				+ spezialiesierung_id + ", Gruppe_id = " + gruppe_id;
	}

}
