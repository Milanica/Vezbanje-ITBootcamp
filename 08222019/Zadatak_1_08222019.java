package funkcije;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva.
		// Druga metoda ispisuje najmanji od unesenih brojeva.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ukupno 3 realna broja: A, B i C");
		double[] niz = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Unesi broj " + (i + 1));
			niz[i] = sc.nextDouble();
		}

		double d = proizvodBrojeva(niz[0], niz[1], niz[2]);
		System.out.println("Proizvod brojeva je:" + d);

		najmanjiBroj(niz);

	}

	public static double proizvodBrojeva(double a, double b, double c) {
		double p = a * b * c;
		return p;
	}

	public static void najmanjiBroj(double[] niz) {
		double min = 0;
		for (int i = 0; i < 2; i++) {
			if (niz[i] <= niz[i + 1]) {
				min = niz[i];
				niz[i + 1] = niz[i];
			} else {
				min = niz[i + 1];
			}

		}
		System.out.println("Najmanji broj je: " + min);
	}
}
