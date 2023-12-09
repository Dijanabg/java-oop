package oop5;

public class RacunarskaUcionica extends Ucionica {
	private static final int maxBroj = 20;
	private Racunar[] spisakRacunara;
	private int brojRacunara;

	public RacunarskaUcionica(String brojUcionice, int brojMesta, int brojRacunara) {
		super(brojUcionice, brojMesta);
		this.spisakRacunara = new Racunar[maxBroj];
		this.setBrojRacunara(0);
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}

	public Racunar[] racunari() {
		return spisakRacunara;
	}

	public boolean dodajRacunar(Racunar r) {
		if (this.getBrojRacunara() == maxBroj)
			return false;
		spisakRacunara[brojRacunara++] = r;
		return true;
	}

	public Racunar racunar(int i) {
		return spisakRacunara[i];
	}

	public String toString() {
		return super.toString() + ", broj racunara: " + this.getBrojRacunara();
	}
}
