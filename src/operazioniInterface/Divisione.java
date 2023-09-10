package operazioniInterface;

public class Divisione implements Operazioni {

	public void calcola(int a, int b) {
		int tmp = a / b;
		System.out.println("La divisione �:" + tmp);
	}

}