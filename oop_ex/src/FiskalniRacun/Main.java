package FiskalniRacun;

public class Main {

	public static void main(String[] args) {

//		int sirinaImena = 20;
//		String format1 = "%%%ds%12.2f";
//		String format2 = String.format(format1, sirinaImena, 33.2);
//		System.out.println(format2);
//		System.out.println(" ");

		Racun r = new Racun("Diksilend", "Svetog Save 1", "Beograd", "01.01.2024", "12:00", "Bokica");

		r.dodajStavku(new Stavka("mleko", 55));
		r.dodajStavku(new Stavka("vocni jogurt", 155));
		r.dodajStavku(new Stavka("palmino ulje", 65321));
		r.dodajStavku(new Stavka("paprika u pavlaci sa renom", 5511));

		r.stampajRacun(30);
	}

}
