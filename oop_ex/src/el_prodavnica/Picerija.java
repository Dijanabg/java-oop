package el_prodavnica;

public class Picerija extends Prodavnica implements Imenovanje {
	protected String imeKompanije;
	protected String[] ponudaHrane = { "Margarita", "Capriccosa", "Quatro Carne", "Piroške", "Salata", "Limunada" };

	public Picerija(String imeKompanije) {
		this.imeKompanije = imeKompanije;
		// this.ponudaHrane = ponudaHrane;
	}

	public void setPonudaHrane(String[] ponudaHrane) {
		this.ponudaHrane = ponudaHrane;
	}

	@Override
	public String[] uzmiInventar() {
		return ponudaHrane;
	}

	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nNarucili ste artikal " + artikal);
	}

	@Override
	public String getIme() {
		return this.imeKompanije;
	}

	@Override
	public void setIme(String imeKompanije) {
		this.imeKompanije = imeKompanije;
	}

}
