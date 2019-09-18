package chnpo;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// Fibonacijev niz

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi N ");
		int n = sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;

		if (n <= 0) {
			System.out.println("Nije moguce uneti 0 elemenata! ");

		}

		for (int br = 1; br <= n; ++br) {
			if (n == 1) {
				System.out.println("0");
			} else if (n == 2) {
				System.out.println("0,1");
				break;

			} else if (n > 2) {

				System.out.print(fib1 + ", ");
				int sum = fib1 + fib2;
				fib1 = fib2;
				fib2 = sum;
			}
		}

	}

}
