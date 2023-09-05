
public class TriangoloPascal {

	public static void main(String[] args) {

		int n = 5;
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					matrix[i][j] = 1;

				} else {
					int tmp = matrix[i - 1][j - 1] + matrix[i - 1][j];
					matrix[i][j] = tmp;
				}
			}

		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}

	}

}
