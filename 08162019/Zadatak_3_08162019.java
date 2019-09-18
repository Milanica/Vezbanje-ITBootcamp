package chnpo;

import java.util.Scanner;

public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// Ucitati stranice trougla. Napisati program da ponudi korisniku izbor
		// racunaranja obima i povrsine.
		// (za obim ucitati 1 a za povrsinu 2).

		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj stranicu trougla a: ");
		int a = sc.nextInt();
		System.out.println("Ucitaj stranicu trougla b: ");
		int b = sc.nextInt();
		System.out.println("Ucitaj stranicu trougla c: ");
		int c = sc.nextInt();
		System.out.println("Za racunanje obima pritisnite 1 , za  racunanje povrsine pritisnite 2 ");
		int i= sc.nextInt();
		int o = a + b + c;
		int p = (a * b) / 2;
		
		if (i == 1) {
			
			System.out.println("Obim trougla je:" + o);
		}
		
		if (i == 2) {
			
			System.out.println("Povrsina trougla je: " + p);
		}

	}

}
