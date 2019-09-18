package chnpo;

import java.util.Scanner;

public class Zadatak_2_b_08132019 {

	public static void main(String[] args) {
		/*Napisati program koji ce sabrati sve brojeve od 1 do n
		 *  (n uneti preko konzole). 
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj N: ");
		int n=sc.nextInt();
		int br=1;
		int sum=0;
		while (br<n) {
			sum+=br;
			br= br+1;
			
		}
		System.out.println ("Zbir svih brojeva je " + sum);
	}

}
