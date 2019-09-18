package parcela;

//Parcela ima jedinstven automatski generisan celobrojan identifikator i zadatu povrsinu(u kvadratnim metrima) 
//prilikom kreiranja. Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char).
//Moze da joj se odredi prinos u periodu zadatom brojem godina.
//Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].


public abstract class Parcela {
	private int id;
	private double povrsina;

	public Parcela(int id, double povrsina) {
		super();
		this.id = id;
		this.povrsina = povrsina;
	}

	public int getId() {
		return id;
	}

	public double getPovrsina() {
		return povrsina;
	}
	public abstract char getVrsta(); 
	
	public abstract double izracunajPrinos(int brGodina);
	
	@Override
	public String toString() {
		return getVrsta()+"-"+id+"["+getPovrsina()+"]";
	}
	
}
