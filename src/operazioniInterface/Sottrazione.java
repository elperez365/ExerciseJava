package operazioniInterface;

public class Sottrazione implements Operazioni {

	public void calcola(int a, int b) {
		int tmp = a - b;
		System.out.println("La differenza �:" + tmp);
	}

}