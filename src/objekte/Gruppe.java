package objekte;

import java.util.ArrayList;

public class Gruppe {
	private int id;
	private String name;

	public Gruppe() {

	}

	private ArrayList<Azubi> teilnehmer;

	public Gruppe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void aufnehmeInDieGruppe(Azubi jemand) {

		if (teilnehmer == null) {
			teilnehmer = new ArrayList<Azubi>();
		}
		teilnehmer.add(jemand);
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

	@Override
	public String toString() {
		return "Gruppe id: " + id + ", Name = " + name;
	}

}
