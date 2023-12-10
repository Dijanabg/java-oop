package datoteke2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Pravougaonik> pravougaonici = new ArrayList<Pravougaonik>();

		try {
			FileInputStream fis = new FileInputStream("pravougaonici.dat");
			Scanner s = new Scanner(fis).useLocale(Locale.ENGLISH);

			while (s.hasNext()) {
				// System.out.println("Linija pre čitanja: " + s.nextLine());
				double a = s.nextDouble();
				double b = s.nextDouble();
				s.nextLine();

				Pravougaonik p = new Pravougaonik(a, b);
				pravougaonici.add(p);

			}
			s.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka nepostoji.");
		} catch (IOException e) {
			System.out.println("Desila se neka greska pri radu sa datotekom.");
		}

		// ispis u drugi fajl
		try {
			PrintWriter pw = new PrintWriter("pravougaonici.info");

			for (Pravougaonik p : pravougaonici) {
				pw.println(p);
				// pw.println("Povrsina i obim su: " + p.getPovrsina() + " " + p.getObim());
			}
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ispis u konzoli
//		for (Pravougaonik p : pravougaonici) {
//			System.out.println(p);
//			System.out.println("Povrsina je: " + p.getPovrsina() + " obim je: " + p.getObim());
//		}
	}
}
