package nizovi;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neki broj br.
		// Program ispisuje elemente niza deljive brojem br.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi niz elemenata N: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesi broj br");
		int br = sc.nextInt();
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi element " + i);
			niz[i] = sc.nextInt();

		}
		System.out.println("Niz je uspesno unesen");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println("Element niza deljiv sa " + br + " je " + niz[i]);
			}
		}
	}
}
