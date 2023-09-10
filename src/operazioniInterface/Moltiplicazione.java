package operazioniInterface;

public class Moltiplicazione implements Operazioni {

	public void calcola(int a, int b) {
		int tmp = a * b;
		System.out.println("Il prodotto �:" + tmp);
	}

}