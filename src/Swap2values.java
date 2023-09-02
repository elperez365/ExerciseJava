import java.util.Scanner;

public class Swap2values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il valore della variabile A");
        int A = scanner.nextInt();
        System.out.println("inserisci il valore della variabile B");
        int B = scanner.nextInt();
        int C = A;
        System.out.println("il valore originale di A : " + A);
        System.out.println("il valore originale di B : " + B);
        System.out.println("adesso scambio le variabili");
        A = B;
        B = C;
        System.out.println("il nuovo valore  di A : " + A);
        System.out.println("il nuovo valore  di B : " + B);
        scanner.close();

    }
}
