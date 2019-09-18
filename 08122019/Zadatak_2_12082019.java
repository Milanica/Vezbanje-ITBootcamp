package chnpo;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		/* Program koji racuna sumu parnih brojeva 
		 * i proizvod neparnih brojeva od 0 do n. 
		 * Koristiti jednu petlju
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite N: ");
		int n=sc.nextInt();
		int br=0;
		int sp=0;
		int pn =1;
		
		while (br<=n) {

		 if  (br % 2 == 0) {
			 sp += br; 
		     br+=1 ; 
		     }
		 else {
			 pn *= br;
		     br+=1; 
		     }
		
	   }
		System.out.println("Zbir svih parnih brojeva je " + sp);
		System.out.println("Proizvod svih neparnih brojeva je " + pn);
	}

}

