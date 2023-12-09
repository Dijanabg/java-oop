package robotika;

public class LazniLeteciRobot extends LeteciRobot {

	public LazniLeteciRobot(double tezinaKg, String ime, String lozinka, double maxVisina) {
		super(tezinaKg, ime, lozinka, maxVisina);
	}
	// ne moze zbog final metoda u roditeljskoj klasi
//	@Override
//	public double getTezinaKg() {
//		// TODO Auto-generated method stub
//		return 0.4;
//	}
}
