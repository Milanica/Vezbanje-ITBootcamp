package ucionica;

public class Glavni_ucionica {

	public static void main(String[] args) {

		Polaznik p1 = new Polaznik("Milana", "Petrovic");
		Laptop l1 = new Laptop("DELL");
		l1.setPolaznik(p1);
		System.out.println(p1.ispisi());
		System.out.println(l1.ispisi());
		l1.resetPolaznik();
		System.out.println(l1.ispisi());

	}

}
