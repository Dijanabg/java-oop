package oop1;

public class Zaposleni {
	
	String ime;
	String prezime;
	
	double koeficijentRadnogMesta;
	double plata;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getKoeficijentRadnogMesta() {
		return koeficijentRadnogMesta;
	}

	public void setKoeficijentRadnogMesta(double koeficijentRadnogMesta) {
		this.koeficijentRadnogMesta = koeficijentRadnogMesta;
	}
	public void racunajPlatu() {
		plata = 3600 * koeficijentRadnogMesta;
	}
	public void stampajPlatu() {
		System.out.println("Zaposleni " + ime +" "+ prezime
				+ " - zarada: " + plata);
	}
}
