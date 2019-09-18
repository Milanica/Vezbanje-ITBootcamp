package knjiga;

public class GlavniKnjige {

	public static void main(String[] args) {

		Knjige k1 = new Knjige("Senka Vetra ||", "Karlos Luis Safon ||", 477, 2015);
		Knjige k2 = new Knjige("Moc podsvesti ||", "Dzozef Marfi ||", 260, 2013);
		Knjige k3 = new Knjige("Pariska skola sarma ||", "Dzejmi Ket Kolan ||", 207, 2016);
		System.out.println(k1.getNazivknjige() + " " + k1.getAutor() + " " + k1.getBrStrana() + " " + k1.getGodIzdanja());
		System.out.println(k2.getNazivknjige() + " " + k2.getAutor() + " " + k2.getBrStrana() + " " + k1.getGodIzdanja());
		System.out.println(k3.getNazivknjige() + " " + k3.getAutor() + " " + k2.getBrStrana() + " " + k3.getGodIzdanja());

	}

}
