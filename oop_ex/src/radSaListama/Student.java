package radSaListama;

public class Student {
	private String ime, prezime, jbmg, index;

	public Student(String ime, String prezime, String jbmg, String index) {
		this.ime = ime;
		this.prezime = prezime;
		this.jbmg = jbmg;
		this.index = index;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getJbmg() {
		return jbmg;
	}

	public String getIndex() {
		return index;
	}

	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", jbmg=" + jbmg + ", index=" + index + "]";
	}

}
