package oop5;

public class Zena extends Osoba{
	String devojackoPrezime;
	
	Zena(String ime, String prezime, String devojackoPrezime,
	int starost){
	super(ime, prezime, starost);
	this.devojackoPrezime = devojackoPrezime;
	}
	
	public String getDevojackoPrezime(){
	return this.devojackoPrezime;
	}
	public void setDevojackoPrezime(String devojackoPrezime){
	this.devojackoPrezime = devojackoPrezime;
	}
	
	public void predstaviSe() {
		System.out.println("Ime: " + getIme() +
		" Prezime: " + getPrezime() +
		" Devojacko prezime: " +
		getDevojackoPrezime());
		}
}
