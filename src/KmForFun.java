import java.util.ArrayList;
import java.util.Scanner;

public class KmForFun {
    static ArrayList<Integer> tempi = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("inserisci tempo" + String.valueOf(i) + " in minuti");
            int tempo = scanner.nextInt();
            KmForFun.tempi.add(tempo);

        }
        scanner.close();
        int max = 0;
        int min;

        for (int tempo : KmForFun.tempi) {
            max = tempo > max ? tempo : max;
        }

        min = max;

        for (int tempo : KmForFun.tempi) {
            min = tempo < min ? tempo : min;
        }

        System.out.println("il tempo migliore è stato : " + min + " minuti");
        System.out.println("il tempo peggiore è stato : " + max + " minuti");

    }
}
