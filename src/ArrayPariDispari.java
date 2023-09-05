
public class ArrayPariDispari {

	public static void main(String[] args) {

		int[] tmp = { 3, 4, 7, 10, 30, 37, 5 };
		int[] tmp2 = new int[7];

		// trovo tutti i numeri pari
		int posPari = 0;
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] % 2 == 0) {
				tmp2[posPari] = tmp[i];
				posPari++;

			}
		}

		// trovo tutti i numeri dipari
		int posDispari = posPari;
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] % 2 != 0) {
				tmp2[posDispari] = tmp[i];
				posDispari++;

			}
		}

		// stampa array ordinato
		for (int i = 1; i < tmp.length; i++) {
			System.out.println(tmp2[i]);
		}
	}

}
