package chnpo;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// Napisati sumu neparnih brojeva od 1 do N

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj N: ");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("Suma neparnih brojeva je: " + sum);
	}
}
