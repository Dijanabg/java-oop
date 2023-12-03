package oop1;

public class Student {

	String ime;
	String prezime;
	
	double test1;
	double test2;
	double prosek;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getTest1() {
		return test1;
	}
	public void setTest1(double test1) {
		this.test1 = test1;
	}
	public double getTest2() {
		return test2;
	}
	public void setTest2(double test2) {
		this.test2 = test2;
	}
	
	public void racunajProsek() {
		prosek = (test1 + test2)/2;
	}
	void stampajProsek() {
		System.out.println("Student " + ime +" "+ prezime
				+ " - prosecan broj poena: " + prosek);
	}
}
