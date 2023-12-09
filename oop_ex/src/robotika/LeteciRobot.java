package robotika;

//ako je final klasa, niko ne moze da je nasledi!!!
//final 
public class LeteciRobot extends Robot {

	private double maxVisina;

	public LeteciRobot(double tezinaKg, String ime, String lozinka, double maxVisina) {
		super(tezinaKg, ime, lozinka);
		this.maxVisina = maxVisina;
	}

	public double getMaxVisina() {
		return maxVisina;
	}

	public void setMaxVisina(double maxVisina) {
		this.maxVisina = maxVisina;
	}

	@Override
	final public double getTezinaKg() {
		return super.getTezinaKg();
	}

	@Override
	protected void izvrsenjeNaredbe(String naredjenje) {
		if (naredjenje.equals("POLETI")) {
			System.out.println("Robot je " + this.getIme() + "  poleteo!");
		} else if (naredjenje.equals("SLETI")) {
			System.out.println("Robot je " + this.getIme() + "  sleteo");
		} else {
			System.out.println("Robot " + this.getIme() + " ne prepoznaje naredjenje!");
		}

	}

}
