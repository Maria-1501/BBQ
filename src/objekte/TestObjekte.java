package objekte;

import java.util.ArrayList;

public class TestObjekte {
public static void main(String[] args) {

	Fach fachIT = new Fach(1, "IT");

	Spezialisierung spezAE = new Spezialisierung(10, "Anwendungsentwicklung", fachIT);
	Spezialisierung spezSI = new Spezialisierung(20, "Systemintegration", fachIT);

	
	fachIT.addSpezialisierung(spezAE);
	fachIT.addSpezialisierung(spezSI);

	Modul modulAE1 = new Modul(101, "Java Programmierung", spezAE.getId());
	Modul modulAE2 = new Modul(102, "Datenbanken)", spezAE.getId());
	Modul modulAE3 = new Modul(103, "WISO", spezAE.getId());

	Gruppe gruppeAE = new Gruppe(1, "AE-2026");

	
	Azubi azubiAE1 = new Azubi(1, "Ivanov", "Ivan", spezAE.getId(), gruppeAE.getId());
	Azubi azubiAE2 = new Azubi(2, "Petrov", "Petr", spezAE.getId(), gruppeAE.getId());
	Azubi azubiAE3 = new Azubi(3, "Tuzikov", "Ivan", spezAE.getId(), gruppeAE.getId());
	Azubi azubiAE4 = new Azubi(4, "Popov", "Alex", spezAE.getId(), gruppeAE.getId());
	Azubi azubiAE5 = new Azubi(5, "Petrov", "Daniil", spezAE.getId(), gruppeAE.getId());


	gruppeAE.aufnehmeInDieGruppe(azubiAE1);
	gruppeAE.aufnehmeInDieGruppe(azubiAE2);
	gruppeAE.aufnehmeInDieGruppe(azubiAE3);
	gruppeAE.aufnehmeInDieGruppe(azubiAE4);
	gruppeAE.aufnehmeInDieGruppe(azubiAE5);



	Modul modulSI1 = new Modul(201, "Netzwerktechnik", spezSI.getId());
	Modul modulSI2 = new Modul(202, "BJava", spezSI.getId());
	Modul modulSI3 = new Modul(203, "IT-Grundlagen", spezSI.getId());

	Gruppe gruppeSI = new Gruppe(2, "SI-2026");

	
	Azubi azubiSI1 = new Azubi(6, "Kuznezov", "Nik", spezSI.getId(), gruppeSI.getId());
	Azubi azubiSI2 = new Azubi(7, "Vasiliev", "Vasia", spezSI.getId(), gruppeSI.getId());
	Azubi azubiSI3 = new Azubi(8, "Novikov", "Alex", spezSI.getId(), gruppeSI.getId());
	Azubi azubiSI4 = new Azubi(9, "Müller", "Anna", spezSI.getId(), gruppeSI.getId());
	Azubi azubiSI5 = new Azubi(10, "Moter", "Anton", spezSI.getId(), gruppeSI.getId());

	
	gruppeSI.aufnehmeInDieGruppe(azubiSI1);
	gruppeSI.aufnehmeInDieGruppe(azubiSI2);
	gruppeSI.aufnehmeInDieGruppe(azubiSI3);
	gruppeSI.aufnehmeInDieGruppe(azubiSI4);
	gruppeSI.aufnehmeInDieGruppe(azubiSI5);

	
	
	}
}
