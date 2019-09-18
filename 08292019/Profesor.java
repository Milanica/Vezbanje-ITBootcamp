package ekof;

import java.util.ArrayList;

public class Profesor extends Covek {
	// Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
	// Predmeti mogu da se dodaju i oduzimaju iz liste.
	// Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)
	// koji drzi
	// nastavu na: <lista predmeta>.

	private String titula;
	private ArrayList<String> predmeti;

	public Profesor(String ime, String prezime, int godRodjenja, String titula) {
		super(ime, prezime, godRodjenja);
		this.titula = titula;
		this.predmeti = new ArrayList<String>();

	}

	public String getTitula() {
		return titula;
	}

	public ArrayList<String> getPredmeti() {
		return predmeti;
	}

	public void dodavanjeUListu(String nazivPredmeta) {
		predmeti.add(nazivPredmeta);
	}

	public void oduzimanjeIzListe(String nazivPredmeta) {
		predmeti.remove(nazivPredmeta);

	}

	public String ispis() {
		String s = getIme()+ "_"+getPrezime()+ "["+getGodRodjenja()+"] je "+"["+getTitula()+"] koji drzi nastavu na: \r\n";
		for (String predmet : predmeti) {
			s += predmet + "\n";
		}
		return s;
	}

}
