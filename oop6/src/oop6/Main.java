package oop6;

public class Main {

	public static void main(String[] args) {
		// Oblik o = new Oblik("Plava", "Krug", 1);

		Krug krug1 = new Krug("Crno-bela", 1, 2.2);
		Kvadrat kvad1 = new Kvadrat("Ljubicasta", 4, "kvadrat", 1.5);

		krug1.stampajPodatke();
		kvad1.stampajPodatke();

	}
}
