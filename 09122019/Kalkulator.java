package calculator;

public class Kalkulator {

	private static double vrednost = 0;

	public Kalkulator add(double b) {
		vrednost += b;
		return this;
	}

	public Kalkulator sub(double b) {
		vrednost -= b;
		return this;
	}

	public Kalkulator mul(double b) {
		vrednost *= b;
		return this;
	}

	public Kalkulator div(double b) {
		vrednost /= b;
		return this;
	}

	public double value() {
		return vrednost;
	}

}
