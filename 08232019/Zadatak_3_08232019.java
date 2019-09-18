package funkcije;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva
		// i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama,
		// a druga vraca zbir parnih elemenata niza.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesi element " + i);
			niz[i] = sc.nextInt();
		}
		System.out.println("Niz uspesno unesen");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i]);

		}
		int proizvod= proizNeparnih_pozicija ( niz);
		int suma =zbirParnih_pozicija (niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama je: " + proizvod);
		System.out.println("Zbir elemenata na parnim pozicijama je: " + suma);
	}

	public static int proizNeparnih_pozicija(int[] niz) {
		int pr = 1;

		for (int i = 0; i < niz.length; i = i + 2) {
			pr = pr * niz[i];
		}
		return (pr);
	}

	public static int zbirParnih_pozicija(int[] niz) {
		int sum = 0;

		for (int i = 1; i < niz.length; i = i + 2) {
			sum = sum + niz[i];
		}
		return (sum);
	}

}
