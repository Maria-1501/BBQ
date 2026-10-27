package objekte;

import java.util.ArrayList;

public class Fach {
	private int id;
	private String bezeichnung;
	ArrayList<Spezialisierung> spezialisierungen;
	

	public Fach() {
	}

	public Fach(int id, String bezeichnung) {
		this.id = id;
		this.bezeichnung = bezeichnung;

	}

	 public String addSpezialisierung(Spezialisierung sp) {
		 if (spezialisierungen == null)
			 spezialisierungen = new ArrayList<Spezialisierung>();
		 if(spezialisierungen.contains(sp)) {
			 return "Das Objekt ist berets in der Liste";
		 }
		 spezialisierungen.add(sp);
		 return null;
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
