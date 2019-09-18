package test1;

//Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK

public class Pacijent extends Covek {
	private double stanjeRacuna;
	private double novac;

	public Pacijent(String naziv, String JMBG, double novac, double StanjeRacuna) {
		super(naziv, JMBG);
		this.novac = novac;
		this.stanjeRacuna = 0;

	}

	public void dodajNovac(double novac) {
		if (novac > 0) {
			stanjeRacuna += novac;
		}
	}

	public void oduzmiNovac(double novac) {
		if (novac > 0 && stanjeRacuna >= novac) {
			stanjeRacuna -= novac;
		}
	}

	@Override
	public boolean dodajNovac() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean oduzmiNovac() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
public char getOznaka() {
	return 'P';
}
}
