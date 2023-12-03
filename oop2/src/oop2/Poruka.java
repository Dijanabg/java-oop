package oop2;

public class Poruka {
	private String tekst;
	
	public void postaviPoruku(String tekst){
		this.tekst = tekst;
	}
	public String pribaviTekst(){
		return this.tekst;
	}
	public void prikaziPoruku(){
		System.out.println(this.pribaviTekst());
	}
}
 