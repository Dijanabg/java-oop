package oop3;

public class Automobil extends Vozilo{
	private int brojVrata;
	Automobil(String marka, String tip, boolean radi, String tipMotora, int snaga, int kubikaza,String registracija, int godiste, Osoba vlasnik, int brojVrata){
		super(marka, tip, radi, tipMotora, snaga, kubikaza, registracija, godiste, vlasnik);
		this.brojVrata = brojVrata;
	}
	public int getBrojVrata() {
		return this.brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public void stampajPodatke() {
		System.out.println(getMarka() + " " +
		getTip() + " " +
		getGodiste() + " " +
		getRegistracija() + " " +
		getBrojVrata() + " " +
		vlasnik.getIme() + " " +
		vlasnik.getPrezime());
	}
	
	
	
}
