package chnpo;

import java.util.Scanner;

public class Zadatak_3_neobavezan_12082019 {

	public static void main(String[] args) {
		/*  Program koji unosi i sabira brojeve dokle god nije unesen
		 *  negativan broj, i ispisuje njihov zbir 
		 *  (zbir pozitivnih brojeva).
		 *  primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		 */ 
            
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite N: ");
		int n=sc.nextInt();
		int sum=0;
    	while (n>0) {
    		int br=n%10;
			sum= sum+br;
			n/=10;
				
			}
    	System.out.println("Suma brojeva je " + sum);
    	
	}

}
