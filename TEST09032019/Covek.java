package test1;
//Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.

//Naziv i JMBG se zadaju prilikom kreiranja. Svi sadrzani podaci mogu samo da se dohvate.
//Novac moze da se doda i da se oduzme, gde je povratna vrednost indikator uspesnosti oduzimanja/dodavanja novca. 
//Moze da se sastavi tekstualni zapis u obliku: NAZIV[ID:JMBG:NOVAC]

public abstract class Covek {

	private static int UID = 0;
	private String naziv; // get
	private String JMBG; // get
	private double novac;// get

	private int id;

	public Covek(String naziv, String JMBG) {
		this.naziv = naziv;
		this.JMBG = JMBG;
		id = ++UID;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getJMBG() {
		return JMBG;

	}

	public double getNovac() {
		return novac;
	}

	public int getId() {
		return id;
	}

	abstract char getOznaka();

	public abstract boolean dodajNovac();

	public abstract boolean oduzmiNovac();

	@Override
	public String toString() {
		return naziv + "[" + id + ":" + JMBG + ":" + novac + "]";
	}
}
