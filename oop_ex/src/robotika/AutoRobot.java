package robotika;

public class AutoRobot extends Robot {

	private double brzina;

	public AutoRobot(double tezinaKg, String ime, String lozinka, double brzina) {
		super(tezinaKg, ime, lozinka);
		this.setBrzina(brzina);
	}

	public double getBrzina() {
		return this.brzina;
	}

	public void setBrzina(double brzina) {
		this.brzina = brzina;
	}

	@Override
	protected void izvrsenjeNaredbe(String naredjenje) {
		if (naredjenje.equals("POKRENI SE")) {
			System.out.println("Auto robot " + this.getIme() + " se pokrenuo");
		} else if (naredjenje.equals("ZAUSTAVI SE")) {
			System.out.println("Auto robot " + this.getIme() + "  se zaustavio");
		} else {
			System.out.println("Auto robot " + this.getIme() + "  ne prepoznaje naredjenje!");
		}

	}

}
