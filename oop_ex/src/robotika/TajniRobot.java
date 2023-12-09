package robotika;

public class TajniRobot extends Robot {

	public TajniRobot(double tezinaKg, String ime, String lozinka) {
		super(tezinaKg, ime, lozinka);

	}
	// ukoliko je final u roditeljskoj klasi ne moze override te metode!!!!
//	@Override 
//	public String getIme() {
//		return "Ne mogu da ti kazem";
//	}

	@Override
	public double getTezinaKg() {
		return 0;
	}

	@Override
	protected void izvrsenjeNaredbe(String naredjenje) {

	}

}
