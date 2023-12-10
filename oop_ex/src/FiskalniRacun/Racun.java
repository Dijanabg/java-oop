package FiskalniRacun;

import java.util.Random;

public class Racun {
	private String imeRadnje, ulicaIBr, grad;
	private String datum, vreme;
	private String imeKasira;

	private int brTransakcije;

	private Stavka[] stavka = new Stavka[50];
	private int sledStavka = 0;

	public Racun(String imeRadnje, String ulicaIBr, String grad, String datum, String vreme, String imeKasira) {
		this.imeRadnje = imeRadnje;
		this.ulicaIBr = ulicaIBr;
		this.grad = grad;
		this.datum = datum;
		this.vreme = vreme;
		this.imeKasira = imeKasira;

		Random r = new Random();
		this.brTransakcije = r.nextInt(10000000);
	}

	public void dodajStavku(Stavka s) {
		stavka[sledStavka] = s;
		sledStavka++;
	}

	private void stampajSeparator(int sirinaRacuna) {
		for (int i = 0; i < sirinaRacuna / 2; i++) {
			System.out.printf("= ");
		}
		System.out.println();
	}

	public void stampajRacun(int sirinaRacuna) {
		// 30 ukupna sirina racuna
		System.out.println(imeRadnje);
		System.out.println(ulicaIBr + " " + grad);
		stampajSeparator(sirinaRacuna);
		System.out.println(datum);
		System.out.println(vreme);
		stampajSeparator(sirinaRacuna);
		double suma = 0;

		for (int i = 0; i < sledStavka; i++) {
			stavka[i].stampajStavku(sirinaRacuna);
			suma += stavka[i].getCena();
		}
		stampajSeparator(sirinaRacuna);

		double porez = suma * 0.2;
		double iznos = suma + porez;
		int sirinaImena = sirinaRacuna - 13;
		String format1 = "%%-%ds%%12.2f\n";
		String format2 = String.format(format1, sirinaImena);

		System.out.printf(format2, "Ukupan iznos:", suma);
		System.out.printf(format2, "PDV:", porez);
		System.out.printf(format2, "Ukupno za uplatu:", iznos);
		stampajSeparator(sirinaRacuna);

		System.out.println("Kasir: " + imeKasira);
		System.out.println("Broj transakcije " + brTransakcije);
	}
}
