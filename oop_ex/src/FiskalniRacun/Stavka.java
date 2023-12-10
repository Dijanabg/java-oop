package FiskalniRacun;

public class Stavka {
	private String naziv;
	private double cena;

	public Stavka(String stavka, double cena) {
		this.naziv = stavka;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public void stampajStavku(int sirinaRacuna) {
		int sirinaImena = sirinaRacuna - 13;// 13 za poziciju cene
		String nazivZaIspis = getNaziv();
		if (getNaziv().length() > sirinaImena) {
			nazivZaIspis = getNaziv().substring(0, sirinaImena - 3) + "...";
		}
		String format1 = "%%-%ds%%12.2f\n";
		String format2 = String.format(format1, sirinaImena);
		System.out.printf(format2, nazivZaIspis, getCena());
	}
}
