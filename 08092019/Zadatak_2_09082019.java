package dp;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Izaberi neki od sledecih objekata: Pravougaonik, Krug ili Kvadrat " );
		String s=sc.nextLine();
	
		switch (s) {
		case "Pravougaonik": System.out.println();
			System.out.println("Unesi stranicu A: " );
			double a =sc.nextDouble ();
			System.out.println("Unesi stranicu B: " );
			double b =sc.nextDouble ();
			if (a>0 && b>0) {
			System.out.println("Povrsina pravougaonika je "  + (a* b) );break;}
			else if (a>=0 || b>=0) {
		    System.out.println("Uneta vrednost A ili B ne sme biti negativna! "); break;}
		
	    case "Krug": System.out.println();
		System.out.println("Poluprecnik je: " );
		double r =sc.nextDouble ();
		if (r>0) {
		System.out.println("Povrsina kruga je "  + (r*r*3.14 ));break;}
		else if (r<=0) {
		System.out.println("Uneta vrednost ne sme biti negativna! ");
		} break;
	
        case "Kvadrat": System.out.println();
			System.out.println("Unesi stranicu A: " ); 
			double x =sc.nextDouble ();
			if (x>0) {
			System.out.println("Povrsina kvadrata je "  + (x * x)) ;break;}
			else if (x==0) {
            System.out.println("Uneta vrednost X ne sme biti negativna! "); break;}
		
			default: System.out.println("Uneli ste pogresan objekat! ");
		
		}
	}
}
