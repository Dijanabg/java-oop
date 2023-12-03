package oop2;

public class Student {
	private String ime; //ime studenta
	private String prezime; //prezime studenta
	private double test1, test2, prosek; //ocene na testovima i
	//njihov prosek
	Student(String ime, String prezime, double test1, double
			test2){
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setTest1(test1);
		this.setTest2(test2);
	}
	public String getIme() {
		return this.ime;
	}
	public void setIme(String ime) {
			this.ime = ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getTest1() {
		return this.test1;
	}
	public void setTest1(double test1) {
		this.test1 = test1;
	}
	public double getTest2() {
		return this.test2; 
	}
	public void setTest2(double test2) {
		this.test2 = test2;
	}
	public double racunajProsek() { //prosek poena
		prosek = (this.getTest1() + this.getTest2()) / 2;
		return this.prosek;
	}
	public void stampajPoene(){ // metoda za stampu
		System.out.println("Student " + this.getIme() +" "+
				this.getPrezime() + " - prosecan broj poena: " + this.racunajProsek());
	}
}
