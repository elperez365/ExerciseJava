
import java.util.Scanner;

public class Triple {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserire un numero");
		int v = s.nextInt();

		for (int x = 0; x < v; x++) {
			for (int y = x + 1; y < v; y++) {
				for (int z = y + 1; z < v; z++) {
					if (x + y + z == v) {
						System.out.println(x + "+" + y + "+" + z + "=" + v);
					}
				}
			}
		}
	}

}
