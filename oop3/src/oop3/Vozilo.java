package oop3;

public class Vozilo{
	
	protected String marka;
	protected String tip;
	protected String registracija;
	Motor pogonskiAgregat;
	protected int godiste;
	protected Osoba vlasnik;
	
	public Vozilo(String marka, String tip, boolean radi, String tipMotora, int snaga, int kubikaza, String registracija, int godiste, Osoba vlasnik){
		this.pogonskiAgregat = new Motor(radi, tipMotora, snaga, kubikaza);
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = vlasnik;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarkaString(String marka) {
		this.marka = marka;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getRegistracija() {
		return registracija;
	}
	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public Osoba getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
	
	public void prenosVlasnistva(Osoba nv2) {
		this.vlasnik = nv2;
	}
	public void stampajPodatke() {
		System.out.println(this.marka + " " + this.tip + " " + this.godiste + " " + this.pogonskiAgregat.getSnaga()+ " " + registracija + 
				           " " + vlasnik.ime + " " + vlasnik.prezime);
	}
}
