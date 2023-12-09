package el_prodavnica;

public abstract class Prodavnica {

	public void izracunajPDV() {
		System.out.println("Stopa PDV je 20%!");
	}

	public abstract String[] uzmiInventar();

	public abstract void kupiInventar(String artikal);
}
