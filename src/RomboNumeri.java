
import java.util.Scanner;

public class RomboNumeri {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 0; i <= n; i++) {

			// 1� for
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}

			// 2� for
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println("");
		}

		for (int i = n - 1; i > 0; i--) {
			// 1� for
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}

			// 2� for
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println("");
		}
	}

}
