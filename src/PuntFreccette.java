import java.util.ArrayList;
import java.util.Scanner;

public class PuntFreccette {
    static ArrayList<String> punteggi = new ArrayList<String>();

    static void positionWinner(int max) {
        int i = 1;
        while (i < PuntFreccette.punteggi.size()) {
            int currentValue = Integer.valueOf(punteggi.get(i));
            if (currentValue == max) {
                System.out.println("Miglior punteggio");
                System.out.println(PuntFreccette.punteggi.get(i - 1));
            }
            i++;
            i++;
        }
    }

    public static void main(String[] args) {

        int NumGiocatori;

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di giocatori");
        NumGiocatori = scanner.nextInt();

        for (int i = 0; i < NumGiocatori; i++) {
            System.out.println("inserisci il nome del giocatore " + (i + 1));
            String giocatore = scanner.next();
            System.out.println("quanti centri ha totalizzato " + giocatore + " ?");
            int numCentri = scanner.nextInt();
            PuntFreccette.punteggi.add(giocatore);
            PuntFreccette.punteggi.add(String.valueOf(numCentri));
        }
        scanner.close();
        System.out.println(PuntFreccette.punteggi);

        int max = 0;
        int i = 1;
        while (i < PuntFreccette.punteggi.size()) {
            int currentValue = Integer.valueOf(PuntFreccette.punteggi.get(i));
            max = currentValue > max ? currentValue : max;
            i++;
            i++;
        }

        positionWinner(max);
        System.out.println(max);

    }
}
