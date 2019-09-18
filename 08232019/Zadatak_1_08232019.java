package funkcije;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n.
		// Taj broj n se prosledjuje metodi koja formira i vraca ceo broj koji
		// predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ceo broj N: ");
		int n = sc.nextInt();
		int rezultat = vracaInverzanBroj(n);
		System.out.print("Inverzan broj je: " + rezultat);
	}

	public static int vracaInverzanBroj(int n) {
		int i = 0;
		while (n != 0) {
			int c = n % 10;
			i = i * 10;
			i = i + c;
			n/=10;
		}
		return (i);
	}
}