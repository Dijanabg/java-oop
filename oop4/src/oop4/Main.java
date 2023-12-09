package oop4;

public class Main {

	public static void main(String[] args) {
		Kvadrat kvadrat = new Kvadrat("Crvena", "Kvadrat", 4, 5.0);
        Krug krug = new Krug("Plava", "Krug", 0, 3.0);

        kvadrat.racunajPovrsinu();
        krug.racunajPovrsinu();
        kvadrat.stampajPodatke();
        System.out.println("---------------");
        krug.stampajPodatke();
        System.out.println("---------------");
        kvadrat.promeniBoju("Zelena");
        kvadrat.stampajPodatke();

	}

}
