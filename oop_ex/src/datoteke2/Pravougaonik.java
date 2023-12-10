package datoteke2;

public class Pravougaonik {
	private double a;
	private double b;

	public Pravougaonik(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	@Override
	public String toString() {
		String izlaz = "";
		izlaz = String.format("(a, b = %12.4f, %12.4f; P, O = %12.4f, %12.4f)", a, b, getPovrsina(), getObim());
		return izlaz;
	}

	public double getPovrsina() {
		return a + b;
	}

	public double getObim() {
		return a * b;
	}

}
