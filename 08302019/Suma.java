package parcela;

//Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, 

//prinos po zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju godina. 
//Oznaka vrste je S. Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje). 
//Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
//*Ovo se ostvaruje pozivom super.toString();

public class Suma extends Parcela {
	private double povrsStabla;
	private double prinosPoStablu;
	private int periodSazrevanja;

	public Suma(int id, double povrsina, double povrsStabla, double prinosPoStablu, int periodSazrevanja) {
		super(id, povrsina);
		this.povrsStabla = povrsStabla;
		this.prinosPoStablu = prinosPoStablu;
		this.periodSazrevanja = periodSazrevanja;
	}

	@Override
	public char getVrsta() {
		return 'S';
	}

	@Override
	public double izracunajPrinos(int brGodina) {
		double FruskaGora = 0;
		FruskaGora = getPovrsina() / this.povrsStabla * this.prinosPoStablu * (brGodina / this.periodSazrevanja);
		return FruskaGora;
	}

	@Override
	public String toString() {
		String result;
		result = super.toString() + ":" + "(" + this.povrsStabla + "," + this.prinosPoStablu + ","
				+ this.periodSazrevanja + ")";
		return result;
	}
}
