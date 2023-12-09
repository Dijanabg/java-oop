package oop_ex;

public class Nastavnik extends Zaposleni implements Olala_interface {
	/*
	 * Klasa Nastavnik ima dodatne atribute zvanje (tipa String) i brojSCIRadova
	 * (tipa int)
	 */
	private String zvanje;
	private int brojSCIRadova;

	public Nastavnik(String ime, String prezime, String zvanje, int brojSCIRadova) {
		super(ime, prezime);
		this.setZvanje(zvanje);
		this.setBrojSCIRadova(brojSCIRadova);
	}

	public String getZvanje() {
		return this.zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public int getBrojSCIRadova() {
		return this.brojSCIRadova;
	}

	public void setBrojSCIRadova(int brojSCIRadova) {
		this.brojSCIRadova = brojSCIRadova;
	}

	public void racunajPlatu() {
		super.plata = 60000 + brojSCIRadova * 3000;
	}

	public void predstaviSe() {
		System.out.println("------------------");
		System.out.println("Profesor: " + this.getIme() + " " + this.getPrezime() + "\nzvanje: " + getZvanje()
				+ "\nplata: " + this.plata);
		System.out.println("------------------");
	}
}
