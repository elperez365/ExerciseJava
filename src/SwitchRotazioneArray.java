
import java.util.Scanner;

public class SwitchRotazioneArray {

	public static void main(String[] args) {

		int[] tmp = { 3, 4, 6, 8 };

		// // shift verso sinistra
		// for (int i = 0; i < tmp.length - 1; i++) {
		// tmp[i] = tmp[i + 1];
		// }

		// shift verso destra
		// for (int i = tmp.length-1; i>0 ; i--) {
		//
		// tmp[i] = tmp[i-1];
		//
		// }

		// // rotazione verso sinistra
		// int first = tmp[0];
		// for (int i = 0; i < tmp.length - 1; i++) {
		// tmp[i] = tmp[i + 1];
		// }
		// tmp[tmp.length-1] = first;

		// rotazione verso destra
		int last = tmp[tmp.length - 1];
		for (int i = tmp.length - 1; i > 0; i--) {

			tmp[i] = tmp[i - 1];

		}
		tmp[0] = last;

		// stampa
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);

		}

	}

}
