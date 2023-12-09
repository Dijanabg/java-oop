package oop3;

public class Klijent extends Osoba{
	private String jbmg;
	private String adresa;
	private String brojRacuna;
	private double stanjeRacuna;
    private String tipRacuna;
    
    public Klijent(String ime, String prezime, int starost, String jbmg, String adresa, String brojRacuna, double stanjeRacuna, String tipRacuna) {
        super(ime, prezime, starost);
        this.setJbmg(jbmg);
        this.setAdresa(adresa);
        this.setBrojRacuna(brojRacuna);
        this.setStanjeRacuna(stanjeRacuna);
        this.setTipRacuna(tipRacuna);
    }

	public String getJbmg() {
		return this.jbmg;
	}

	public void setJbmg(String jbmg) {
		this.jbmg = jbmg;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrojRacuna() {
		return this.brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public double getStanjeRacuna() {
		return this.stanjeRacuna;
	}

	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}

	public String getTipRacuna() {
		return this.tipRacuna;
	}

	public void setTipRacuna(String tipRacuna) {
		this.tipRacuna = tipRacuna;
	}
	//kod profesora!
//	private void promeniStanjeRacuna(double iznosTransakcije, boolean isplata) {
//    	if (isplata == true) {
//    		if (iznosTransakcije > stanjeRacuna) {
//    			System.out.println("Transakcija nije moguca jer nema dovoljno sredstava na racunu!");
//    			return;
//    		}
//    		else {
//    			this.stanjeRacuna -= iznosTransakcije;	
//    		}	
//    	} 
//    	else {
//    		this.stanjeRacuna += iznosTransakcije;
//    	}
//    	return;
//    }
//    
//    public void izvrsiTransakciju(Klijent k, int iznos, boolean isplata) {
//    	if (isplata) {
//    		this.promeniStanjeRacuna(iznos, true);
//    		k.promeniStanjeRacuna(-iznos, false);
//    	}
//    	else {
//    		this.promeniStanjeRacuna(-iznos, false);
//    		k.promeniStanjeRacuna(iznos, true);
//    	}
//    }
	public void prebaciNovac(Klijent drugiKlijent, double iznos) {
		 if (iznos <= this.getStanjeRacuna()) {
	            this.stanjeRacuna -= iznos;
	            drugiKlijent.stanjeRacuna += iznos;
	            System.out.println("Transfer uspešno izvršen.");
	        } else {
	            System.out.println("Nemate dovoljno sredstava na računu.");
	        }
	}
	public void stampajSvePodatke() {
        System.out.println("Ime klijenta: " + getIme());
        System.out.println("Prezime klijenta: " + getPrezime());
        System.out.println("Jbmg: " + getJbmg());
        System.out.println("Adresa: " + getAdresa());
        System.out.println("Stanje računa: " + getStanjeRacuna());
    }
	public void stampajPodatke() {
        System.out.println("Ime klijenta: " + getIme());
        System.out.println("Stanje računa: " + getStanjeRacuna());
    }
	
}
