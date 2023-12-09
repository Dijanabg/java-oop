package oop3;

public class Zaposleni extends Osoba{
	private double koefRadnogMesta;
	private double plata;
	
	Zaposleni(String ime, String prezime, int starost,
			double koefRadnogMesta) {
		super(ime, prezime, starost);
		this.koefRadnogMesta = koefRadnogMesta;
	}
	public double getKoefRadnogMesta() {
		return koefRadnogMesta;
	}
	public void setKoefRadnogMesta(double koefRadnogMesta) {
		this.koefRadnogMesta = koefRadnogMesta;
	}
	public void postaviPlatu(int brojDana){
		plata = getKoefRadnogMesta() * brojDana;
	}
	public double getPlatu(){
		 return plata;
	}
	public void stampajPlatu() {
		System.out.println(getIme() + " " +
		getPrezime() +
		", na radnom mestu sa koeficijentom "
		+ getKoefRadnogMesta() +
		" ima platu " + getPlatu());
	}
}
