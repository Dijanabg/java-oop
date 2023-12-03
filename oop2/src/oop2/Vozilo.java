package oop2;
/*Zadatak: Realizovati klasu Vozilo sa atributima marka
(String), tip (String), godiste (int),
registracija (String), maksBrzina (int), snaga
(int), standardnim konstruktorom i konstruktorom koji
postavlja inicijalne vrednosti, metodom za računanje
vrednosti automobila na osnovu formule:
cena = maksBrzina*snaga/(2021 – godiste)
kao i metodama za štampanje podataka o vozilu i poređenje cene dva vozila.
Klasu testirati kreiranjem više objekata u glavnom
programu i pozivanjem odgovarajućih metoda. Nacrtati i
dijagram klasa za klasu Vozilo.*/
public class Vozilo {
	private String marka;
	private String tip; 
	private int godiste;
	private String registracija;
	private int maksBrzina;
	private int snaga;
	private double cena;
	
	Vozilo(){}
	
	public Vozilo(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga) {
		this.setMarka(marka);
		this.setTip(tip);
		this.setGodiste(godiste);
		this.setRegistracija(registracija);
		this.setMaksBrzina(maksBrzina);
		this.setSnaga(snaga);
	}
	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getGodiste() {
		return this.godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public String getRegistracija() {
		return this.registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getMaksBrzina() {
		return this.maksBrzina;
	}

	public void setMaksBrzina(int maksBrzina) {
		this.maksBrzina = maksBrzina;
	}

	public int getSnaga() {
		return this.snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public double vrednostAutomobila() {
		cena = this.maksBrzina*this.snaga/(2024-this.godiste);
		return this.cena;
	}
	public void podaciVozila() {
		System.out.println("Vozilo " + this.getMarka() + " " + this.getTip() + " godiste " + this.getGodiste() + "\n maksimalne brzine " + this.getMaksBrzina() + " snage " + this.getSnaga() + " registrovano je do " + this.getRegistracija() + "\n vredi " + this.vrednostAutomobila());
	}
	public String porediCene(Vozilo voz2 ) {
		if(this.vrednostAutomobila() < voz2.vrednostAutomobila()) {
			return "Prvo vozilo je jeftinije.";
		}else if(this.cena > voz2.cena) {
			return "Drugo vozilo je jeftinije.";
		}else {
			return "Cena oba vozila je ista";
		}
	}
}
//  _____________________________
//  | Vozilo					|
//  |-------------------------	|
//  | marka:String				|
//  | tip:String				|
//  | int:godiste				|
//  | String:registracija		|
//  | int:maksBrzina			|
//  | int:snaga					|
//  |-------------------------	|
//  | Vozilo:					|
//  | vrednostAutomobila:void	|
//  | podaciVozila:void			|
//  | porediCene:void			|
//  |___________________________|