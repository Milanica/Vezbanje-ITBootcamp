package ucionica;

//Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. 
//Marka moze samo da se dohvati. Laptop takdje moze da menja polaznika ili da ostane bez polaznika. 
//Moze da se ispise u obliku: MARKA{POLAZNIK}

public class Laptop {

	private Polaznik polaznik;
	private String marka;

	public Laptop( String marka) {
		this.marka = marka;
		polaznik=null;
	}

	public String getMarka() {
		return marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik (Polaznik polaznik) {
		this.polaznik=polaznik;
	}
	public void resetPolaznik() {
		polaznik = null;
}

	public String ispisi() {
		String s;
		if (polaznik == null) {
			s = "Nema Polaznika";
		} else {
			s = polaznik.ispisi();
		}
		return marka + "{" + s + "}";
	}

}