package parcela;
//Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. 

//Prinos po kvadratnom metru moze da se promeni. Oznaka vrste je N. 
//Prinos njive se racuna po formuli: povrsina_parcele*prinosPoKvM. 
//Tekstualni oblik je Parcela:PrinosPoKvM.

public class Njiva extends Parcela {

	private double godPrinosPoKvM; // ima setter

	public Njiva(int id, double povrsina, double godPrinosPoKvM) {
		super(id, povrsina);
		this.godPrinosPoKvM = godPrinosPoKvM;
	}

	
	public void setGodPrinosPoKvM(double godPrinosPoKvM) {
		this.godPrinosPoKvM = godPrinosPoKvM;
	}


	@Override
	public double izracunajPrinos(int brGodina) {
		double atar = 0;
		atar = getPovrsina() * this.godPrinosPoKvM;
		return atar;

	}

	@Override
	public char getVrsta() {

		return 'N';
	}

	@Override
	public String toString() {
		String result;
		result = super.toString() + ":" + this.godPrinosPoKvM;
		return result;
	}

}
