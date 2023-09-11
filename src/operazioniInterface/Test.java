package operazioniInterface;

public class Test {

	public static void main(String[] args) {
		Addizione a = new Addizione();
		a.calcola(3, 2);

		Moltiplicazione m = new Moltiplicazione();
		m.calcola(3, 2);

		Divisione d = new Divisione();
		d.calcola(3, 2);

		Sottrazione s = new Sottrazione();
		s.calcola(3, 2);

	}

}
