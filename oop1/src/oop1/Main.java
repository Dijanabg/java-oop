package oop1;

import java.util.Arrays;

public class Main {
	public enum Poredak {RASTUCI, OPADAJUCI}; 
	public static void main(String[] args) {
		/*Kreirati klasu Student sa atributima ime,
prezime, broj poena na testu 1 i testu 2,
prosečan broj poena, kao i metodama za
postavljanje imena i prezimena studenta, broja
poena i računanje prosečnog broja poena na
testovima i štampanje uspeha studenata
• Potom testirati klasu kreiranjem dva objekta u
okviru glavnog programa, kojima postavljamo
imena i prezimena i broj poena na testovima i za
koje potom računamo i prikazujemo uspe*/
		//******STUDENT******
//		Student prvi = new Student();
//		Student drugi = new Student();
//		prvi.setIme("Petar");
//		prvi.setPrezime("Petrovic");
//		drugi.setIme("Ivana");
//		drugi.setPrezime("Ivanovic");
//		prvi.setTest1(39.5);
//		prvi.setTest2(53.8);
//		drugi.setTest1(38.7);
//		drugi.setTest2(57.5);
//		prvi.racunajProsek();
//		drugi.racunajProsek();
//		prvi.stampajProsek();
//		drugi.stampajProsek();
		
		//******ZAPOSLENI******
		/*Kreirati klasu Zaposleni sa atributima ime (tipa
String), prezime (tipa String) i koefRadnogMesta
(tipa double), kao i metodama za postavljanje imena i
prezimena zaposlenog i postavljanje koeficijenta radnog
mesta, računanje plate po formuli plata = 3600 *
koefRadnogMesta i štampanje plate zaposlenog.
• Potom testirati klasu kreiranjem tri objekta u okviru
glavnog programa, kojima postavljamo imena i prezimena
i koeficijente radnog mesta i za koje potom računamo i
prikazujemo platu*/
//		Zaposleni z1 = new Zaposleni();
//		Zaposleni z2 = new Zaposleni();
//		Zaposleni z3 = new Zaposleni();
//		
//		z1.setIme("Petar");
//		z1.setPrezime("Petrovic");
//		z1.setKoeficijentRadnogMesta(44.5);
//		z2.setIme("Jovan");
//		z2.setPrezime("Jovanovic");
//		z2.setKoeficijentRadnogMesta(35.7);
//		z3.setIme("Dijana");
//		z3.setPrezime("Jovanovic");
//		z3.setKoeficijentRadnogMesta(55);
//		
//		z1.racunajPlatu();
//		z2.racunajPlatu();
//		z3.racunajPlatu();
//		
//		z1.stampajPlatu();
//		z2.stampajPlatu();
//		z3.stampajPlatu();
		
		//******RACUNAR*****
		/*Kreirati klasu Racunar sa atributima procesor (tipa
String), radniTakt (tipa double), kapacitetMemorije
(tipa int), kao i metodama za postavljanje naziva i radnog
takta procesora, postavljanje kapaciteta memorije u GB,
računanje indeksa performansi računara po formuli:
indeksPerformansi = 10*radniTakt + kapacitetMemorije
i štampanje indeksa performansi računara.
• Potom testirati klasu kreiranjem pet objekta u okviru glavnog
programa, kojima prvo postavljamo vrednosti atributa, a
potom računamo i prikazujemo njihovu rang listu uređenu
po indeksu performansi u opadajućem redosledu.*/
		// kreiranje objekata 
		//Racunar[] racunari = new Racunar[5];
        Racunar racunar1 = new Racunar();
        Racunar racunar2 = new Racunar();
        Racunar racunar3 = new Racunar();
        Racunar racunar4 = new Racunar();
        Racunar racunar5 = new Racunar();

        // setovanje
        racunar1.setProcesor("Intel i5");
        racunar1.setRadniTakt(3.2);
        racunar1.setKapacitetMemorije(8);
        racunar1.racunajIndeksPerformansi();

        racunar2.setProcesor("AMD Ryzen 7");
        racunar2.setRadniTakt(3.8);
        racunar2.setKapacitetMemorije(16);
        racunar2.racunajIndeksPerformansi();

        racunar3.setProcesor("Intel i7");
        racunar3.setRadniTakt(4.0);
        racunar3.setKapacitetMemorije(32);
        racunar3.racunajIndeksPerformansi();

        racunar4.setProcesor("AMD Ryzen 5");
        racunar4.setRadniTakt(3.5);
        racunar4.setKapacitetMemorije(12);
        racunar4.racunajIndeksPerformansi();

        racunar5.setProcesor("Intel i9");
        racunar5.setRadniTakt(4.2);
        racunar5.setKapacitetMemorije(64);
        racunar5.racunajIndeksPerformansi();

        // Prikaz rang liste prema indeksu performansi
        prikaziRangListu(Poredak.OPADAJUCI, racunar1, racunar2, racunar3, racunar4, racunar5);
    }

    // Metoda za prikazivanje rang liste
	//Racunar... racunari **** ovako napisano moze da se stavi bilo koji broj argumenata tipa Racunar
    public static void prikaziRangListu(Poredak poredak, Racunar... racunari) {
        
	        boolean zameni;
	        int n = racunari.length;
	        do {
	            zameni = false;
	            for (int i = 0; i < n-1; i++) {
	                if ((poredak == Poredak.RASTUCI && racunari[i].indeksPerformansi > racunari[i + 1].indeksPerformansi) ||
	                    (poredak == Poredak.OPADAJUCI && racunari[i].indeksPerformansi < racunari[i + 1].indeksPerformansi)) {
	                    
	                    double privremena = racunari[i].indeksPerformansi;
	                    racunari[i].indeksPerformansi = racunari[i + 1].indeksPerformansi;
	                    racunari[i + 1].indeksPerformansi = privremena;
	                    zameni = true;
	                }
	            }
	            n--;
	        } while (zameni);
	 //SVE OVO PREKO JEDNE LINIJE KODA ISPOD :))))
	     // sortiranje opadajuce
	    	/*Arrays.sort je metoda u Javi koja se koristi 
	    	 * za sortiranje niza objekata ili niza primitivnih tipova podataka. 
	    	 * Ova metoda koristi algoritam brzog sortiranja (quicksort) za objekte 
	    	 * i algoritam za sortiranje mešanjem (merge sort) za primitivne tipove podataka. 
	    	 * Sortiranje se vrši u mestu, što znači da se originalni niz menja, a ne vraća se novi niz.*/
	    	//Double.compare se koristi za poredjenje dva double broja.
	        
	    	/* Arrays.sort(racunari, (r1, r2) -> Double.compare(r2.indeksPerformansi, r1.indeksPerformansi));*/

        // prikaz rang liste
        System.out.println("\n\t  ******* Rang lista računara: *******");

        for (int i = 0; i < racunari.length; i++) {
            System.out.println("\t"+(i + 1) + ". " + racunari[i].getProcesor() +
                    " - Indeks performansi: " + racunari[i].indeksPerformansi);
        }
	}
}
