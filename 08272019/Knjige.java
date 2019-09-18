package knjiga;

public class Knjige {
// Napisati klasu Knjige koja ima sledeca polja:  naziv knjige, autora, broj strana, godinu izdanja.
// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.

	private String nazivKnjige;
	private String autor;
	private int brStrana;
	private int godIzdanja;

	public Knjige(String nazivKnjige, String autor, int brStrana, int godIzdanja) {
		this.nazivKnjige = nazivKnjige;
		this.autor = autor;
		this.brStrana = brStrana;
		this.godIzdanja = godIzdanja;
	}

	public String getNazivknjige() {
		return nazivKnjige;
	}

	public String getAutor() {
		return autor;
	}

	public int getBrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}
}