package calculator;

public class GlavniProgram {
	//Napisati klasu Kalkulator koja omogucava korisniku da izvrsava sledci kod:
	//Kalkulator calc=new Kalkulator();
	//double rezultat= calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();

	public static void main(String[] args) {
		Kalkulator calc=new Kalkulator();
		double rezultat= calc.add(12).div(2).sub(2).mul(20.5).add(-5).value();
		System.out.println("Rezultat je: " +rezultat);

	}

}
