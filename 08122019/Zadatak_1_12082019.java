package chnpo;

import java.util.Scanner;

public class Zadatak_1_12082019 {

	public static void main(String[] args) {
		/* Program koji ispisuje poruku “Hello World!” 10 puta.
		 *  Koristi while petlju.
		 */

		Scanner sc = new Scanner (System.in);
		System.out.println("Unesi n ");
		int n=sc.nextInt();
		int br=0;
		
		while (br<10){
			// ovde je br<10 jer je postavljen da krece od 0
			System.out.println("Hello World! " +br );
			br+=1;
		}
	}

}
