package oop3;

public class Main {

	public static void main(String[] args) {
		
//		Zaposleni z1 = new Zaposleni("Petar",
//				"Petrovic",
//				35, 3800);
//		Zaposleni z2 = new Zaposleni("Ivana",
//				"Ivanovic",
//				32, 3900);
//		Student s1 = new Student("Marko", "Markovic",
//				19, 112/22, 22.2, 22.6);
//		Student s2 = new Student("Jelena", "Jelic",
//				22, 101/23, 25.5, 26.6);
//		Klijent k1 = new Klijent("Janko", "Jankovic", 25,"1203978755588","Novi Sad", "256-001" ,  50000, "st1");
//		Klijent k2 = new Klijent("Petar", "Petrovic", 33, "1526355836585", "Beograd","255-336", 70000 , "za1");
//		z1.predstaviSe();
//		z2.predstaviSe();
//		s1.predstaviSe();
//		s2.predstaviSe();
		//k1.predstaviSe();
		//k2.predstaviSe();
		
//		z1.postaviPlatu(22);
//		z2.postaviPlatu(23);
//		s1.racunajPoene();
//		s2.racunajPoene();
		
		
//		z1.stampajPlatu();
//		z2.stampajPlatu();
//		s1.stampajPoene();
//		s2.stampajPoene();
//		System.out.println("Klijenti:");
//        k1.stampajSvePodatke();
//        k2.stampajSvePodatke();
//        System.out.println("-----------------------");
//		k1.prebaciNovac(k2, 300.0);
//		System.out.println("Stanje posle transfera novca:");
//        k1.stampajPodatke();
//        k2.stampajPodatke();
//        System.out.println("-----------------------");
        
        
        
        
        
        Osoba o1 = new Osoba("Vuk", "Vukov", 26);
        Osoba o2 = new Osoba("Marko", "Markov", 48);
        
        Vozilo v = new Vozilo("Opel", "Corsa", false, "benzin", 55, 1199, "NS021IT",2004, o1);
		Automobil a = new Automobil("Opel", "Corsa", false, "benzin", 55, 1199,"NS021IT", 2004, o1, 5);
		Kamion k = new Kamion("Volvo", "FH", false, "dizel", 800, 5500,"NS021RS", 2016, o1, 3);
		Motocikl m = new Motocikl("Honda", "Rebel", false, "benzin", 22, 250,"ZA018RS", 1998, o1, false);

		v = a;

		v.stampajPodatke();
		a.stampajPodatke(); 
		k.stampajPodatke();
		m.stampajPodatke();
	
		a.prenosVlasnistva(o2); 
		k.prenosVlasnistva(o2); 
		m.prenosVlasnistva(o2);
		 
		a.stampajPodatke(); 
		k.stampajPodatke(); 
		m.stampajPodatke();
	}

}
