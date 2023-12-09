package oop6;

public class Krug extends Oblik implements Figura {
	private double r;

	public Krug(String boja, int brojStrana, double r) {
		super(boja, "Krug", brojStrana);
		this.r = r;
	}

	public double racunajPovrsinu() {
		return this.r * this.r * Math.PI;
	}

	public double racunajObim() {
		return 2 * this.r * Math.PI;
	}

	public void stampajPodatke() {
		System.out.println(
				getBoja() + " " + getTip() + " " + getBrojStrana() + " " + racunajPovrsinu() + " " + racunajObim());
	}

}
