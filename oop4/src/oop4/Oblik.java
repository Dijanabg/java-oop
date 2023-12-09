package oop4;

public class Oblik {
	protected String boja;
    protected String tip;
    protected int brojStrana;
    protected double povrsina;
    
    public Oblik() {}
    
    public Oblik(String boja, String tip, int brojStrana) {
		this.setBoja(boja);
		this.setTip(tip);
		this.setBrojStrana(brojStrana);
	}

	public String getBoja() {
		return this.boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return this.brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getPovrsina() {
		return this.povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public void promeniBoju(String novaBoja) {
        this.boja = novaBoja;
    }

    public void stampajPodatke() {
        System.out.println("Boja: " + this.getBoja());
        System.out.println("Tip: " + this.getTip());
        System.out.println("Broj strana: " + this.getBrojStrana());
        System.out.println("Povrsina: " + this.getPovrsina());
    }
}
