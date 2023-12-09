package oop_ex;

public class NenastavniRadnik extends Zaposleni implements Olala_interface {
	/*
	 * NenastavniRadnik ima dodatne atribute radnoMesto (tipa String) i godineStaza
	 * (tipa int)
	 */
	private String radnoMesto;
	private int godineStaza;

	public NenastavniRadnik(String ime, String prezime, String radnoMesto, int godineStaza) {
		super(ime, prezime);
		this.setRadnoMesto(radnoMesto);
		this.setGodineStaza(godineStaza);
	}

	public String getRadnoMesto() {
		return this.radnoMesto;
	}

	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public int getGodineStaza() {
		return this.godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public void racunajPlatu() {
		super.plata = 30000 + godineStaza * 500;
	}

	public void predstaviSe() {
		System.out.println("------------------");
		System.out.println(getRadnoMesto() + " " + getIme() + " " + getPrezime() + "\nradni staz: " + getGodineStaza()
				+ " godina " + "\nplata: " + this.plata);
		System.out.println("------------------");
	}

}
