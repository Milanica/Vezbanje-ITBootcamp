package chnpo;

import java.util.Scanner;

public class Zadatak_2_a_08132019 {

	public static void main(String[] args) {
		/* Napisati program koji ce sabrati brojeve od 1 do 5. 
		 * Program treba da ispise zbir.
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj N: ");
		int n=sc.nextInt();
		int br=1;
		int sum=0;
		while (br<=5) {
			sum+=br;
			br= br+1;
	}
		System.out.println("Suma brojeva je " + sum);
	}
}
