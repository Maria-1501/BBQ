package objekte;

public class TestObjekte {
	
	

	public static void main(String[] args) {
		//Fach 1
		Fach fach1;
		fach1 = new Fach();
		fach1.setId(1);
		fach1.setBezeichnung("IT");
		IO.println(fach1);
		// Fach 1 Spezial.1
		Spezialisierung spezi1 = new Spezialisierung();
		spezi1.setId(1);
		spezi1.setBezeichnung("AE");
		spezi1.setFach_id(fach1.getId());
		IO.println(spezi1);
		// Fach 1 Spezial. 2
		Spezialisierung spezi2 = new Spezialisierung(2, "SI", fach1.getId());
		IO.println(spezi2);
		
		
		Fach fach2;
		fach2 = new Fach(2, "Medi");

		IO.println(fach2);
		
	
		
		

	}

}
