package oop_ex;

public class Main {

	public static void main(String[] args) {

		Nastavnik n1 = new Nastavnik("Dusan", "Gajic", "Doktor nauka", 25);
		Asistent a1 = new Asistent("Tamara", "Tami", "Dusan Gajic", 2);
		NenastavniRadnik nr1 = new NenastavniRadnik("Mara", "Maric", "Sekretar", 30);

		// Zaposleni z = new Zaposleni("Tamara", "Tami", "Dusan Gajic", 2);

		n1.racunajPlatu();
		a1.racunajPlatu();
		nr1.racunajPlatu();

		n1.predstaviSe();
		a1.predstaviSe();
		nr1.predstaviSe();

	}

}
