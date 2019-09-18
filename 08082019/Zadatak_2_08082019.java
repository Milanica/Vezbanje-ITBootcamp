package pp;

import java.util.Scanner;

public class Zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Ucitaj A: " );
		a = sc.nextInt();
		System.out.println("Ucitaj B: " );
		b = sc.nextInt();
		int p; 
		p = a * b ;
		System.out.println("Povrsina pravougaonika je: "+p );
		
		int o;
		o = 2 * a + 2 *b ; 
		System.out.println("Obim pravougaonika je: " + o );

	}

}
