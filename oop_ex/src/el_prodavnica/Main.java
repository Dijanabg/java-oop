package el_prodavnica;

public class Main {

	public static void main(String[] args) {
		Poslasticarnica p1 = new Poslasticarnica("Denis napast");
		Picerija sundjerBob = new Picerija("Sundjer Bob");
		sundjerBob.setIme("Evropa");
		p1.setIme("Ciao");
		sundjerBob.kupiInventar("Sladoled");
		p1.kupiInventar("Pica");

	}

}
