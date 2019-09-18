package funkcije;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja
		// i metodu koja ispisuje brojeve od prvog do drugog (ukljucujuci i njih)
		// koji su deljivi trecim

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: A, B i C ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		interval_Deljiv_Sa_C(a, b, c);
	}

	public static void interval_Deljiv_Sa_C(int a, int b, int c) {
		if (a > b) {
			int temp = a;
			a = b;
			temp = b;
		}
		for (int i = a; i <= b; i++) {
			if (i % c == 0 && c!=0) {
				System.out.println(i);
			}
		}
	}
}
