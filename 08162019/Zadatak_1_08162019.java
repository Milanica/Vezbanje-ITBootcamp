package chnpo;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		 // Prebrojati prirodne brojeve u intervalu od k do n koji su deljivi sa a.
         // Koristi se for petlja
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesi broj K");
		int k= sc.nextInt();
		System.out.println("Unesite broj N");
		int n= sc.nextInt();
		System.out.println("Unesi broj a");
		int a= sc.nextInt();
		int br=0;
		int interval;
		
		for ( interval = k; interval <= n; interval++) {
			if (interval % a==0) {
				br= br+1;
			}
			System.out.println("Prirodni brojevi deljivi sa a su: " +br);
		}
	
		
	}

}
