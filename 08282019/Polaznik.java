package ucionica;
//Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 

//Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti. 
//Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
//Polaznik se ispisuje u obliku: IME_PREZIME{ID}.

public class Polaznik {

	private static int UID = 0;
	private String imePolaznika;
	private String prezime;
	private int id;

	public Polaznik(String imePolaznika, String prezime) {
		this.imePolaznika = imePolaznika;
		this.prezime = prezime;
		id = ++UID;
	}

	public String getImePolaznika() {
		return imePolaznika;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	public static int getUID() {
		return UID;
	}

	public String ispisi() {
		return imePolaznika+"_"+prezime + "{" + id + "}";
	}
}
