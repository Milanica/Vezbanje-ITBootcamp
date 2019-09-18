package test1;

import java.awt.List;
import java.util.ArrayList;

//Ordinacija poseduje naziv, listu stomatologa, listu pacijenata, cenu usluge kao i stanje racuna.
//Naziv i cena  se zadaju prilikom kreiranja i mogu samo da se dohvate.
//Moze da se dohvati/ukloni doktor. Moze da se dohvati/ukloni pacijent. 
//Moze da se dohvati broj pacijenata/doktora.
//Moze da se naplati usluga pacijentima, ali ukoliko neki pacijent ne poseduje dovoljno novca ispisuje se poruka:
//“PACIJENT ide u zatvor”. Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu,
//a povratna vrednost je indikator da li je plata uspesno isplacena.
//Moze da se sastavi tekstualni opis:
//NAZIV:CENA
//DOKTORI
//Doktor 0
//Doktor 1
//.
//.
//PACIJENTI
//Pacijent 0
//Pacijent 1
//Pacijent 2

public class Ordinacija extends Covek {
	private String nazivOrdinacije; // get
	private ArrayList<Stomatolog> stomatolozi= new ArrayList<>();
	private ArrayList<Pacijent> pacijenti= new ArrayList<>();
	private int cenaUsluge = 0;// get
	
	private int stanje = 0;

	public Ordinacija( String nazivOrdinacije) {
		super(naziv, JMBG, novac);
		this.nazivOrdinacije = nazivOrdinacije;
		this.cenaUsluge = cenaUsluge;
	}

	public void getPacijent(Pacijent p) {
		return pacijenti.size();
	}

	public void ukloniPacijenta(Pacijent p) {
		pacijenti.remove(p);
	}

	public void ukloniStomatologa(Stomatolog s) {
		stomatolozi.remove(s);
	}

	public String getNazivOrdinacije() {
		return nazivOrdinacije;
	}

	public ArrayList<Stomatolog> getStomatolozi() {
		return stomatolozi;
	}

	public ArrayList<Pacijent> getPacijenti() {
		return pacijenti.size();
	}

	public int getCenaUsluge() {
		return cenaUsluge;
	}
	public int getBrPacijenata() {
		return pacijenti.size();
	}
	public void addPacijenti(Pacijent p) {
		if (p.getNovac() >= cenaUsluge) {
			p.oduzmiNovac(cenaUsluge);
		} else
			System.out.println("PACIJENT ide u zatvor!");
	}

	public void NaplataUsluge() {
		for (Pacijent p : pacijenti) {
			p.oduzmiNovac(cenaUsluge);
		}
	}
}
