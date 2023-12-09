package oop5;

public class Institucija {

	private static final int maxBroj = 20;
	private String naziv;
	private Ucionica[] spisakUcionica;
	private Zaposleni[] spisakZaposlenih;
	private int brojUcionica;
	private int brojZaposlenih;

	public Institucija(String naziv) {
		this.naziv = naziv;
		this.spisakUcionica = new Ucionica[maxBroj];
		this.spisakZaposlenih = new Zaposleni[maxBroj];
		this.brojUcionica = 0;
		this.brojZaposlenih = 0;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Ucionica[] getUcionica() {
		return spisakUcionica;
	}

	public Zaposleni[] getZaposleni() {
		return spisakZaposlenih;
	}

	public int getBrojUcionica() {
		return brojUcionica;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public boolean dodajZaposlenog(String ime, String prezime, int starost, double koefRadnogMesta, String pozicija) {
		if (brojZaposlenih == maxBroj) {
			return false;
		}
		spisakZaposlenih[brojZaposlenih++] = new Zaposleni(ime, prezime, starost, koefRadnogMesta, pozicija);
		return true;
	}

	private Ucionica nadjiUcionicu(String oznaka) {
		for (int i = 0; i < brojUcionica; i++)
			if (spisakUcionica[i].brojUcionice.equals(oznaka))
				return spisakUcionica[i];
		return null;
	}

	public boolean dodajUcionicu(String brojUcionice, int brojMesta, boolean racunarska, int brojRacunara) {
		if (brojUcionica == maxBroj) {
			return false;
		}
		if (racunarska) {
			spisakUcionica[brojUcionica++] = new RacunarskaUcionica(brojUcionice, brojMesta, brojRacunara);
		} else {
			spisakUcionica[brojUcionica++] = new Ucionica(brojUcionice, brojMesta);
		}
		return true;
	}

	public boolean dodajRacunarUUcionicu(String model, String brojUcionice) {
		Ucionica u = nadjiUcionicu(brojUcionice);
		if (u == null) {
			return false;
		}
		if (!(u instanceof RacunarskaUcionica)) {
			System.out.println("Racunari se mogu dodati samo u racunarsku ucionicu!");
			return false;
		}
		RacunarskaUcionica ru = (RacunarskaUcionica) u;
		ru.dodajRacunar(new Racunar(model));
		return true;
	}

	public String toString() {
		return "Naziv: " + naziv + ".";
	}

	public void prikaziPodatke() {
		System.out.println(this.toString());
		System.out.println("Spisak zaposlenih: ");
		for (int i = 0; i < brojZaposlenih; i++)
			System.out.println(this.spisakZaposlenih[i]);
		System.out.println("Spisak ucionica: ");
		for (int i = 0; i < brojUcionica; i++)
			System.out.println(this.spisakUcionica[i]);
	}
}
