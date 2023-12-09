package el_prodavnica;

public class Poslasticarnica extends Prodavnica implements Imenovanje {
	protected String imeKompanije;
	protected String[] stavkeMenija = { "Sladoled", "Torta", "Krofna", "Kafa", "Caj", "Limunada" };

	public Poslasticarnica(String imeKompanije) {
		this.imeKompanije = imeKompanije;

	}

	public String[] getPonudaHrane() {
		return stavkeMenija;
	}

	public void setPonudaHrane(String[] stavkeMenija) {
		this.stavkeMenija = stavkeMenija;
	}

	@Override
	public String[] uzmiInventar() {

		return this.stavkeMenija;
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
