package ekof;
//Student je covek koji se kreira sa brojem indeksa i ima  trenutnu godinu studija i trenutni prosek.

//Sva polja mogu samo da se dohvate. 
//Studenta ispisati u formatu:
//Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).

public class Student extends Covek {

	private int brIndexa;
	private int godStudija;
	private double prosekOcena;

	public Student(String ime, String prezime, int godRodjenja, int brIndexa, int godStudija, double prosekOcena) {
		super(ime, prezime, godRodjenja);
		this.brIndexa = brIndexa;
		this.godStudija = godStudija;
		this.prosekOcena = prosekOcena;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getProsekOcena() {
		return prosekOcena;
	}

	public String ispis() {
		String s = getIme() + "_" + getPrezime() + " (" + getGodRodjenja() + ") je student (" + getGodStudija()
				+ ") godine studija sa prosekom (" + getProsekOcena() + ")";
		return s;
	}
}
