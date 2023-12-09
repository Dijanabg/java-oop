package robotika;

public abstract class Robot {
	private double tezinaKg;
	private String ime;
	private String lozinka;

	public Robot(double tezinaKg, String ime, String lozinka) {
		this.tezinaKg = tezinaKg;
		this.ime = ime;
		this.lozinka = lozinka;
	}

	public double getTezinaKg() {
		return tezinaKg;
	}

	public void setTezinaKg(double tezinaKg) {
		this.tezinaKg = tezinaKg;
	}

	final public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	protected abstract void izvrsenjeNaredbe(String naredjenje);

	final public void izvrsiNaredjenje(String lozinka, String naredjenje) {
		if (lozinka.equals(this.lozinka)) {
			izvrsenjeNaredbe(naredjenje);
		} else {
			System.out.println("Onemogucen pristup!!!");
		}
	}
}
