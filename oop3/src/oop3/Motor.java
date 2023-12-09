package oop3;

public class Motor {
	private boolean radi;     	  //pokrenut ili ne
	private String tip;   //dizel ili benzin
	private int snaga;    // snaga u kW
	private int kubikaza; // kubikaza u ccm
	
	public Motor() {}
	
	public Motor(boolean radi, String tip, int snaga, int kubikaza){
		this.radi = radi;
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
	}
	
	// dodati get i set metode za svaki od atributa

	public void setRadi(boolean radi) {
		this.radi = radi;
	}
	
	public boolean getRadi() {
		return this.radi;
	}
	public void ukljuci() {
		this.setRadi(true);
	}

	public void iskljuci() {
		this.setRadi(false);
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public String getTip() {
		return this.tip;
	}
	
	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}
	
	public int getSnaga() {
		return this.snaga;
	}
	
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	
	public int getKubikaza() {
		return this.kubikaza;
	}
	
	public void stampajPodatke() {
		System.out.println("Informacije o motoru:");
		System.out.println("Ukljucen:" + getRadi() + " Tip: " + getTip() + " Snaga: " + getSnaga() + " Kubikaza: " + getKubikaza());
	}
}
