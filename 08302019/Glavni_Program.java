package parcela;

//Napisati i glavni program koji kreira niz parcela koje mogu da budu ili sume ili njive 
//i ispisuje njihov prinos u toku 3 godine.

public class Glavni_Program {

	public static void main(String[] args) {
		Parcela[] nizParcela = new Parcela[5];
		nizParcela[0] = new Suma(2, 150, 5, 1000, 2);
		nizParcela[1] = new Suma(3, 260, 26, 900, 1);
		nizParcela[2] = new Suma(4, 500, 12, 870, 3);
		nizParcela[3] = new Njiva(1, 150, 580);
		nizParcela[4] = new Njiva(8, 200, 700);
		for (Parcela parcela : nizParcela) {
			System.out.println(parcela);
			System.out.println(parcela.izracunajPrinos(5));

		}
	}

}
