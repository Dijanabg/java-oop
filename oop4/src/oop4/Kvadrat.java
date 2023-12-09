package oop4;

public class Kvadrat extends Oblik {
	
	private double duzina;
	
	public Kvadrat(String boja, String tip, int brojStrana, double duzina) {
		super(boja, tip, brojStrana);
		this.setDuzina(duzina);
	}

	public double getDuzina() {
		return duzina;
	}

	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}

	public void racunajPovrsinu() {
		super.povrsina = this.duzina * this.duzina;
    }
	
}

