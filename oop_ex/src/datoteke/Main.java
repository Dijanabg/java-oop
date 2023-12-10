package datoteke;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		FileInputStream fis;
		try {
			fis = new FileInputStream("ulaz.txt");
			Scanner s = new Scanner(fis);

			String ime = s.nextLine();
			String prezime = s.nextLine();
			String index = s.nextLine();
			String kategorija = s.nextLine();

			s.close();
			fis.close();

			System.out.println("Ime " + ime + " " + prezime);
			System.out.println("broj indeksa " + index + " kategorija " + kategorija);

		} catch (FileNotFoundException e) {
			System.out.println("Datoteka ne postoji...");
		} catch (IOException e) {
			System.out.println("Doslo je do greske u radu sa datotekom.");
		}

	}

}
