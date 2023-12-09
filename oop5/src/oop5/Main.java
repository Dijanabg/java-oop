package oop5;

public class Main {

	public static void main(String[] args) {

		Institucija ftn = new Institucija("FTN");

		ftn.dodajUcionicu("A1 amfiteatar", 150, false, 30);
		ftn.dodajUcionicu("MI A2-1 kabinet", 32, true, 50);
		ftn.dodajRacunarUUcionicu("MI A-21", "Intel");
		ftn.dodajRacunarUUcionicu("MI A-21", "AMD");
		ftn.dodajZaposlenog("Dusan", "Gajic", 41, 4.0, "prof");
		ftn.dodajZaposlenog("Dinu", "Dragan", 44, 6.0, "prof");
		ftn.prikaziPodatke();
	}

}
