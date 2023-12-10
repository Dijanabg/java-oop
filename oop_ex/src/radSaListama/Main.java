package radSaListama;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> lista = new ArrayList<>();

		lista.add(new Student("Paja", "Patak", "2201977785485", "255/23"));
		lista.add(new Student("Gaja", "Patak", "5020255785485", "352/23"));
		lista.add(new Student("Vlaja", "Patak", "3012525585485", "034/23"));
		lista.add(new Student("Raja", "Patak", "2201977785485", "559/23"));

		lista.size();// koliko elem ima lista

		System.out.println("Broj elemenata liste: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getJbmg());
		}
		System.out.println("=======");
		// lista.get(i) pristup el po indexu
		// drugi nacin preko foreach
//		for (Student student : lista) {
//			System.out.println(student.getJbmg());
//		}
		// brisanje el liste
		lista.remove(1);
		for (Student student : lista) {
			System.out.println(student.getJbmg());
		}
		System.out.println("=======");
		// dodavanje elementa
		lista.add(1, new Student("Pink", "Panter", "111111111111", "011/23"));
		for (Student student : lista) {
			System.out.println(student.getJbmg());
		}
	}

}
