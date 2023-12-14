package listeIDatoteke;

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

		List<Planeta> planete = ucitajPlanete("planete.txt");
		Planeta glavna = ucitajGlavnuPlanetu("glavna.txt");

		Planeta saNajmanjomSilom = planete.get(0);
		for (Planeta planeta : planete) {
			if (glavna.getSilaPrivlacenja(planeta) < glavna.getSilaPrivlacenja(saNajmanjomSilom)) {
				saNajmanjomSilom = planeta;
			}
		}
		sacuvajPlanetu(saNajmanjomSilom, "izabrana.txt");
		System.out.println(saNajmanjomSilom);
	}

	public static List<Planeta> ucitajPlanete(String imeDatoteke) {
		List<Planeta> lista = new ArrayList<Planeta>();

		try {
			FileInputStream fis = new FileInputStream(imeDatoteke);
			Scanner s = new Scanner(fis);
			s.useLocale(Locale.ENGLISH); // Postavljanje engleske lokalizacije
			s.useDelimiter("\\s+");
			while (s.hasNext()) {
				double masa = s.nextDouble();
				double x = s.nextDouble();
				double y = s.nextDouble();
				String ime = s.nextLine();

				System.out.println("Učitana planeta: Masa=" + masa + ", X=" + x + ", Y=" + y + ", Ime=" + ime);
				Planeta p = new Planeta(masa, x, y, ime);
				lista.add(p);
			}

			s.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena!");
		} catch (IOException e) {
			System.out.println("Desila se neka greska.");
		}
		return lista;
	}

	public static Planeta ucitajGlavnuPlanetu(String imeDatoteke) {

		Planeta p = null;

		try {
			FileInputStream fis = new FileInputStream(imeDatoteke);
			Scanner s = new Scanner(fis);
			s.useLocale(Locale.ENGLISH); // Postavljanje engleske lokalizacije
			s.useDelimiter("\\s+");
			double masa = s.nextDouble();
			double x = s.nextDouble();
			double y = s.nextDouble();
			String ime = s.nextLine();

			System.out.println("Učitana glavna planeta: Masa=" + masa + ", X=" + x + ", Y=" + y + ", Ime=" + ime);

			p = new Planeta(masa, x, y, ime);

			s.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena!");
		} catch (IOException e) {
			System.out.println("Desila se neka greska pri ucitavanju datoteke!");
		}
		return p;
	}

	public static void sacuvajPlanetu(Planeta p, String imeDatoteke) {
		try {
			PrintWriter pw = new PrintWriter(imeDatoteke);
			pw.println(p);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// koriscenje buffer klase za citanje
//	public static List<Planeta> ucitajPlanete(String imeDatoteke) {
//		List<Planeta> lista = new ArrayList<>();
//
//		try (BufferedReader br = new BufferedReader(new FileReader(imeDatoteke))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				String[] parts = line.split("\\s+");
//				double masa = Double.parseDouble(parts[0]);
//				double x = Double.parseDouble(parts[1]);
//				double y = Double.parseDouble(parts[2]);
//				String ime = parts[3];
//
//				System.out.println("Učitana planeta: Masa=" + masa + ", X=" + x + ", Y=" + y + ", Ime=" + ime);
//
//				Planeta p = new Planeta(masa, x, y, ime);
//				lista.add(p);
//			}
//		} catch (IOException e) {
//			System.out.println("Desila se neka greska.");
//		}
//		return lista;
//	}
//
//	public static Planeta ucitajGlavnuPlanetu(String imeDatoteke) {
//		Planeta p = null;
//
//		try (BufferedReader br = new BufferedReader(new FileReader(imeDatoteke))) {
//			String line = br.readLine();
//			String[] parts = line.split("\\s+");
//			double masa = Double.parseDouble(parts[0]);
//			double x = Double.parseDouble(parts[1]);
//			double y = Double.parseDouble(parts[2]);
//			String ime = parts[3];
//
//			System.out.println("Učitana glavna planeta: Masa=" + masa + ", X=" + x + ", Y=" + y + ", Ime=" + ime);
//
//			p = new Planeta(masa, x, y, ime);
//		} catch (IOException e) {
//			System.out.println("Desila se neka greska pri ucitavanju datoteke!");
//		}
//		return p;
//	}

}
