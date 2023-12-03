package oop1;

public class Racunar {

	String procesor;
	double radniTakt;
	int kapacitetMemorije;
	
	double indeksPerformansi;
	
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public double getRadniTakt() {
		return radniTakt;
	}
	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}
	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}
	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}
	public void racunajIndeksPerformansi() {
		indeksPerformansi = 10 * radniTakt + kapacitetMemorije;
	}
	public void stampajIndeksPerformansi() {
		System.out.println("Racunar " + procesor +" sa memorijom od " + kapacitetMemorije + " GB ima indeks performansi -" + indeksPerformansi);
	}

	
}
