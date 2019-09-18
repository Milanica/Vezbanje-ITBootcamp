package chnpo;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		// Primer: ulaz int m=7, n=3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu stranice pravougaonika n");
		int n = sc.nextInt();
		System.out.println("Unesi duzinu druge stranice pravougaonika m");
		int m = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
