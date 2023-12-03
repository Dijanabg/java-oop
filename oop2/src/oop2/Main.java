package oop2;

public class Main {

	public static void main(String[] args) {
//		Poruka p = new Poruka();
//		//p.tekst = "Zdravo svete!“; greska!!!
//		p.postaviPoruku("Zdravo OOP svete!");
//		p.prikaziPoruku();
//		Student prvi = new Student("Petar", "Petrovic",
//				39.5,53.8);
//		Student drugi = new Student("Ivana", "Ivanovic",
//				38.7, 57.5);
//		prvi.racunajProsek();
//		drugi.racunajProsek();
//		prvi.stampajPoene();
//		drugi.stampajPoene();
//		
//		Zaposleni z1 = new Zaposleni("Petar", "Petrovic", 35.4,24);
//		Zaposleni z2 = new Zaposleni("Jovan", "Jovanovic", 40.1,23);
//		Zaposleni z3 = new Zaposleni("Marko", "Markovic", 38.5,26);
//		
//		z1.vrednostZarade(22);
//		z2.vrednostZarade(23);
//		z3.vrednostZarade(24);
//		
//		z1.stampajPlatu();
//		z2.stampajPlatu();
//		z3.stampajPlatu();
		
		Vozilo v1 = new Vozilo("Renault", "Megan", 2002, "8.3.2024", 220, 66);
		Vozilo v2 = new Vozilo("Renault", "Megan", 2020, "8.3.2024", 280, 85);
		Vozilo v3 = new Vozilo();
		
		v1.vrednostAutomobila();
		v1.podaciVozila();
		
		v2.vrednostAutomobila();
		v2.podaciVozila();
		
		v3.setMarka("Fiat");
		v3.setTip("500");
		v3.setSnaga(55);
		v3.setRegistracija("25.5.2024");
		v3.setGodiste(2023);
		v3.setMaksBrzina(180);
		
		v3.vrednostAutomobila();
		v3.podaciVozila();
		String rezultatPoredjenja = v1.porediCene(v2);
		System.out.println(rezultatPoredjenja);
		String rezultatPoredjenja1 = v3.porediCene(v2);
		System.out.println(rezultatPoredjenja1);
	}
}
