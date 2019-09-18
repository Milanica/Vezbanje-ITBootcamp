package chnpo;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		/*
		 * Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih
		 * tela (kocke, kvadra, valjka, lopte). Koristiti do while petlju i switch
		 * grananje. Za izlaz koristiti nulu (0).
		 */
		Scanner sc = new Scanner(System.in);
		int povrs;
		do {

			System.out.println("Izaberi geometrijsko telo: ");
			System.out.println("0 - Izlaz ");
			System.out.println("1 - Kocka ");
			System.out.println("2 - Kvadar ");
			System.out.println("3 - Valjak ");
			System.out.println("4 - Lopta ");
			povrs = sc.nextInt();
			double a, b, c, h, r;
			switch (povrs) {

			case 1:
				System.out.println("Unesite vrednost stranice a: ");
				a = sc.nextDouble();
				if (a > 0) {
					System.out.println("Povrsina je" +6 * a * a);
				} else {
					System.out.println("Greska!Poluprecnik ne moze biti manji ili jednak nuli!");
				}
				break;

			case 2:
				System.out.println("Unesite vrednosti stranice a, b i c: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				System.out.println("Povrsina je: " + 2 * (a * b) + 2 * (b * c) + 2 * (b * c));
				if (b <= 0) {
					System.out.println("Greska!Stranica B ne moze biti manje ili jednako nuli!");
				}
				break;
			case 3:
				System.out.println("Unesite vrednosti poluprecnika kruga r i visine h: ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				if (r > 0) {
					System.out.println("Povrsina je "+ (2 * r * r * 3.14) * (r + h));
				} else {
					System.out.println("Greska!Poluprecnik ne moze biti manji ili jednak nuli!");
				}

				break;
			case 4:
				System.out.println("Unesite vrednost poluprecnika kruga r: ");
				r = sc.nextDouble();
				if (r > 0) {
					System.out.println("Povrsina je "+ 4 * r * r * 3.14);
				} else {
					System.out.println("Greska!Poluprecnik ne moze biti manji ili jednak nuli!");
				}
				break;
			default:
				System.out.println("Los unos!");
				break;
			case 0:
				System.out.println("Izlaz!");
				break;
			}
		} while (povrs > 0);
	}

}
