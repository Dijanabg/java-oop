package oop3;

public class Motocikl extends Vozilo{
	
	public boolean registrovan;
	
	public Motocikl(String marka, String tip, boolean radi, String tipMotora, int snaga, int kubikaza,String registracija, int godiste, Osoba vlasnik, boolean registrovan){
		super(marka, tip, radi, tipMotora, snaga, kubikaza, registracija, godiste, vlasnik);
		this.registrovan = registrovan;
	}

	public boolean getRegistrovan() {
		return this.registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
	public void stampajPodatke() {
		System.out.println(getMarka() + " " +
				getTip() + " " +
				getGodiste() + " " +
				getRegistrovan() + " " +
				vlasnik.getIme() + " " +
				vlasnik.getPrezime());
	}
}
