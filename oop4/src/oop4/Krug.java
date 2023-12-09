package oop4;

public class Krug extends Oblik{
	private double poluprecnik;

    public Krug(String boja, String tip, int brojStrana, double poluprecnik) {
        super(boja, tip, brojStrana);
        this.setPoluprecnik(poluprecnik);;
    }

    public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	public void racunajPovrsinu() {
        super.povrsina = Math.PI * poluprecnik * poluprecnik;
    }
}
