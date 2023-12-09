package oop_ex;

public abstract class Zaposleni {
	protected String ime;
	protected String prezime;
	protected double plata;

	public Zaposleni(String ime, String prezime) {
		this.setIme(ime);
		this.setPrezime(prezime);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	// protected abstract void racunajPlatu();

	public void predstaviSe() {
		System.out.println(
				"Ime: " + this.getIme() + " Prezime: " + this.getPrezime() + " primio/la je platu: " + this.plata);
	}
}
