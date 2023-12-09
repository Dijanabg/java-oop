package oop5;

public class Zaposleni extends Osoba {
	private static final int stdBrojDana = 20;
	private double koefRadnogMesta;
	private double plata;
	private String pozicija;

	Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta, String pozicija) {
		super(ime, prezime, starost);
		this.koefRadnogMesta = koefRadnogMesta;
		this.pozicija = pozicija;
		setPlata(stdBrojDana);
	}

//	public String ime() {
//		return super.ime;
//	}
//
//	public String prezime() {
//		return super.prezime;
//	}
//
//	public int starost() {
//		return super.starost;
//	}

	public double getKoefRadnogMesta() {
		return koefRadnogMesta;
	}

	public void setKoefRadnogMesta(double koefRadnogMesta) {
		this.koefRadnogMesta = koefRadnogMesta;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public void setPlata(int brojDana) {
		plata = getKoefRadnogMesta() * brojDana;
	}

	public double getPlata() {
		return plata;
	}

	public void stampajPlatu() {
		System.out.println(getIme() + " " + getPrezime() + ", na radnom mestu sa koeficijentom " + getKoefRadnogMesta()
				+ " na poziciji " + getPozicija() + " ima platu " + getPlata());
	}

	public String toString() {
		return this.getIme() + " " + this.getPrezime() + ", na radnom mestu sa koeficijentom "
				+ this.getKoefRadnogMesta() + " ima platu " + this.getPlata();
	}
}
