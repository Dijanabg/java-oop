package oop5;

public class Ucionica {
	protected String brojUcionice;
	protected int brojMesta;

	public Ucionica(String brojUcionice, int brojMesta) {
		this.brojUcionice = brojUcionice;
		this.brojMesta = brojMesta;
	}

	public String getBrojUcionice() {
		return brojUcionice;
	}

	public void setBrojUcionice(String brojUcionice) {
		this.brojUcionice = brojUcionice;
	}

	public int getBrojMesta() {
		return brojMesta;
	}

	public void setBrojMesta(int brojMesta) {
		this.brojMesta = brojMesta;
	}

	public String toString() {
		return brojUcionice + "broj mesta: " + brojMesta + ".";
	}
}
