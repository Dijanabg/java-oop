package oop6;

public class Kvadrat extends Oblik implements Figura {

	private double stranica;

	public Kvadrat(String boja, int brojStrana, String tip, double stranica) {
		super(boja, tip, brojStrana);
		this.stranica = stranica;
	}

	public void setTip(String tip) {
		this.tip = "Krug";
	}

	public double racunajPovrsinu() {
		return this.stranica * this.stranica;
	}

	public double racunajObim() {
		return 4 * this.stranica;
	}

	public void stampajPodatke() {
		System.out.println(
				getBoja() + " " + getTip() + " " + getBrojStrana() + " " + racunajPovrsinu() + " " + racunajObim());
	}
}
