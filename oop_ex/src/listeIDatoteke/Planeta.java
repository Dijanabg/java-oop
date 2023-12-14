package listeIDatoteke;

public class Planeta {

	String ime;
	double masa, x, y;

	public Planeta(double masa, double x, double y, String ime) {

		this.masa = masa;
		this.x = x;
		this.y = y;
		this.ime = ime;
	}

	public double getUdaljenost(Planeta p) {
		return Math.sqrt(Math.pow(p.getX() - this.x, 2) + Math.pow(p.getY() - this.y, 2));
	}

	public double getSilaPrivlacenja(Planeta p) {
		return 67408e-11 * this.getMasa() / Math.pow(this.getUdaljenost(p), 2);
	}

	@Override
	public String toString() {
		return "Planeta [ime=" + ime + ", masa=" + masa + ", x=" + x + ", y=" + y + "]";
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
