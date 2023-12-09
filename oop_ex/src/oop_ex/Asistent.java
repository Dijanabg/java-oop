package oop_ex;

public class Asistent extends Zaposleni implements Olala_interface {
	/*
	 * Asistent ima dodatne atribute mentor (tipa String) i godinaDoktorskihStudija
	 * (tipa int)
	 */
	private String mentor;
	private int godinaDoktorskihStudija;

	public Asistent(String ime, String prezime, String mentor, int godinaDoktorskihStudija) {
		super(ime, prezime);
		this.setMentor(mentor);
		this.setGodinaDoktorskihStudija(godinaDoktorskihStudija);
	}

	public String getMentor() {
		return this.mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public int getGodinaDoktorskihStudija() {
		return this.godinaDoktorskihStudija;
	}

	public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) {
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}

	public void racunajPlatu() {
		super.plata = 40000 + godinaDoktorskihStudija * 2000;
	}

	public void predstaviSe() {
		System.out.println("------------------");
		System.out
				.println("Asistent: " + getIme() + getPrezime() + "\nmentor " + getMentor() + "\nplata: " + this.plata);
		System.out.println("------------------");
	}
}
