package chnpo;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		/*Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), 
		 * post dekrementu (i--) i pre dekrementu (--i) 
		 * i u programu u komentarima opisati kako koji primer funkcionise.
		 *  Napisati po 2 primera o svakom
		 */

		int x=4 , y=5, z=9;
		
		// preinkrement
		
		 x=++y + ++z; 
		 /*  vrednosti y i z se prvo uvecavaju za 1,
		  * tako da je y=6, z=10, a x=16 je zbir te dve vrednosti
		  */
		 y=++z * ++x;
		 /* obe vrednosti z i x se prvo uvecavaju za 1,
		  * tako da je z=11, x=17, a njihov proizvod x=187
		  */
		 
		 
		// postinkrement
		 
		 y=x++ - z++;
		 /*  vrednosti y i z se prvo uzimaju,pa se onda povecavaju za 1,
		  * tako da je x=18, z=12, a y=6 je razlika te dve vrednosti
		  */
		 
		 x/=z=y++;
		 /* ovde se prvo racuna deo y++ a to je y=6 (prvo smo ueli vrednost iz tabele, 
		  * pa ga posle uvecamo za 1 i bice 7), 
		  * sto dalje implicira  da je z=6 i sada racunamo x cija je vrednost iz tabele bila 18 
		  * i dobijamo novo x=18/6 pa je nova vrednost x=3
		  */
		 
		 
		// predekrement
		 
		 y=--x + --z;
	     /* ovde se prvo smanji vrednost za x, pa se onda u tabeli doda tako da je novo x=2,
	      * i za z se prvo smanji vrednost pa je z=5,
	      * a nova vrednost za y je y=2+5 a to je y=7 i upisuje se u tabelu
	      */
	     
		 x*=--z * --y;
		 /* ovde se vrednosti z i y prvo smanje pa se onda uzme vrednost,
		  * bice z=4 i y=6, njihov proizvod je 24
		  * na osnovu toga racunamo x, tako sto gledamo staru vrednost x=2 i pomnoyimo sa 24, 
		  * to implicira da ce novo x biti x=48 i to upisujemo u tabelu
		  */
		 
	  // postdekrement
		 
	     y=x-- / z--;
	     /* prvo uzimamo vrednost x=48 pa je smanjimo u tabeli,
	      *  zatim isto prvo uzmemo vrednost za z=4, pa smanjimo u tabeli
	      *  y= 48/4 sto implicira vrednost y=12 i nju unosimo u tabelu
	      */
	     
		 x/=z=y--;
		 /* uyimsmo vrednost za y=12, pa je smanjimo u tabeli
		  * dalje implicira da je z=y=12
		  * postojeca vrednost x iz tabele je x=47, 
		  * a novu vrednost x dobijamo kada staru podelimo sa z
		  * u tom slucaju x=47/12 pa je x=3 nova vrednost za x
		  */
		 
		 
		 
		 
		 
		
				
	}

}
