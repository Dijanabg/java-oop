package oop2;

public class Zaposleni {
	
	private String ime;
	private String prezime;
	private double koeficijentRadnogMesta; 
	private double plata;
	private int brojRadnihDana;
	
	public Zaposleni() {}

	public Zaposleni(String ime, String prezime, double koeficijentRadnogMesta, int brojRadnihDana) {
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setKoeficijentRadnogMesta(koeficijentRadnogMesta);
		this.setBrojRadnihDana(brojRadnihDana);
	}
	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getKoeficijentRadnogMesta() {
		return this.koeficijentRadnogMesta;
	}

	public void setKoeficijentRadnogMesta(double koeficijentRadnogMesta) {
		this.koeficijentRadnogMesta = koeficijentRadnogMesta;
	}
	public int getBrojRadnihDana() {
		return brojRadnihDana;
	}

	public void setBrojRadnihDana(int brojRadnihDana) {
		this.brojRadnihDana = brojRadnihDana;
	}
	public double vrednostZarade(int brojRadnihDana) {
		plata = this.koeficijentRadnogMesta*brojRadnihDana*100;
		return plata;
	}
	public double getPlata() {
		return plata;
	}

	public void stampajPlatu() {
		System.out.println("Zaposleni " + this.getIme() +" "+ this.getPrezime()
				+ " - zarada: " + this.vrednostZarade(this.brojRadnihDana));
	}
}
