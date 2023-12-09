package el_prodavnica;

public class SpisakKlijenata {

	protected String[] ime;
	private int brojKlijenata;
	private int maxBrojKlijenata;

	public SpisakKlijenata(int maxBrojKlijenata) {
		this.maxBrojKlijenata = maxBrojKlijenata;
		this.brojKlijenata = 0;
		this.ime = new String[maxBrojKlijenata];
	}

	public String[] getIme() {
		return ime;
	}

	public void setIme(String[] ime) {
		this.ime = ime;
	}

	public String nadjiKlijenta(String ime) {
		for (int i = 0; i < brojKlijenata; i++) {
			if (this.ime[i].equals(ime)) {
				return this.ime[i];
			}

		}
		return ("Klijent nije pronadjen...");
	}

	public void dodajKlijenta(String ime) {
		if (this.brojKlijenata < this.maxBrojKlijenata) {
			this.ime[this.brojKlijenata++] = ime;
		} else {
			System.out.println("Spisak klijenata je pun!");
		}
	}
}
