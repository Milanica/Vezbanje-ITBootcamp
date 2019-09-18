package ekof;

public class Glavni_program {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Pera", "Peric", 1979, "docent");
		p1.dodavanjeUListu("Matematika");
		p1.dodavanjeUListu("Osnovi statisticke analize");
		p1.dodavanjeUListu("Ekonomska statistika");
		System.out.println(p1.ispis());
		System.out.println();
		Student s1 = new Student("Milana", "Petrovic", 1990, 0023, 4, 8.20);
		System.out.println(s1.ispis());

	}

}