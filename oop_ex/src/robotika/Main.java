package robotika;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//		Robot r1 = new AutoRobot(100, "Auto 1", "test1", 45);
//		Robot r2 = new LeteciRobot(2, "letelica 1", "test2", 600);
//
//		r1.izvrsiNaredjenje("test1", "POKRENI SE");
//		r1.izvrsiNaredjenje("test1", "ZAUSTAVI SE");
//		r1.izvrsiNaredjenje("test12", "ZAUSTAVI SE");
//		r2.izvrsiNaredjenje("test2", "POLETI");
//		r2.izvrsiNaredjenje("test123", "SLETI");
//		r2.izvrsiNaredjenje("test1", "SLETIl");

		ArrayList<Robot> roboti = new ArrayList<Robot>();

		roboti.add(new AutoRobot(100, "Auto 1", "test1", 45));
		roboti.add(new LeteciRobot(2, "letelica 1", "test2", 600));
		roboti.add(new TajniRobot(300, "Super tajni robot", "test3"));
		// roboti.add(new LazniLeteciRobot(3.0, "Lazni leteci robot 1", "test4", 500));

		for (Robot r : roboti) {
//			r.izvrsiNaredjenje("test1", "POKRENI SE");
//			r.izvrsiNaredjenje("test1", "ZAUSTAVI SE");
//			r.izvrsiNaredjenje("test12", "ZAUSTAVI SE");
//			r.izvrsiNaredjenje("test2", "POLETI");
//			r.izvrsiNaredjenje("test123", "SLETI");
//			r.izvrsiNaredjenje("test1", "SLETIl");
			System.out.println("Tvoje ime? " + r.getIme());
			System.out.println("Tvoja tezina? " + r.getTezinaKg());
		}
	}

}
