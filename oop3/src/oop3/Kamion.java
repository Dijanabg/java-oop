package oop3;

public class Kamion extends Vozilo{
	
	private int brojOsovina;
	
	public Kamion(String marka, String tip, boolean radi, String tipMotora, int snaga, int kubikaza,String registracija, int godiste, Osoba vlasnik, int brojOsovina){
		super(marka, tip, radi, tipMotora, snaga, kubikaza, registracija, godiste, vlasnik);
		this.brojOsovina = brojOsovina;
	}
	
	public int getBrojOsovina() {
		return brojOsovina;
	}
	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	public void stampajPodatke() {
		System.out.println(getMarka() + " " +
		getTip() + " " +
		getGodiste() + " " +
		getRegistracija() + " " +
		getBrojOsovina() + " " +
		vlasnik.getIme() + " " +
		vlasnik.getPrezime());
	}
}
