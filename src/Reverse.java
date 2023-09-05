
public class Reverse {
	public static void main(String[] args) {
		int[] r = { 20, 10, 5, 4, 3, 2, 1 };

		int index = r.length - 1;
		for (int i = 0; i < r.length / 2; i++) {
			int tmp = r[i];
			r[i] = r[index];
			r[index] = tmp;
			index--;
		}

		for (int k = 0; k < r.length; k++) {
			System.out.println(r[k]);
		}
	}

}
