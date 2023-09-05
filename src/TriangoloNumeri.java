
import java.util.Scanner;

public class TriangoloNumeri {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire il  numero di righe");
		int numRighe = scan.nextInt();

		for (int i = 0; i < numRighe; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(j);
			System.out.println();
		}
	}

}
