import java.util.Scanner;

public class PartitaCalcio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome della squadra 1");
        String squadra1 = scanner.next();
        System.out.println("Inserisci il tuo nome della squadra 2");
        String squadra2 = scanner.next();
        System.out.println("Inserisci il numero di goal squadra 1");
        int goalSq1 = scanner.nextInt();
        System.out.println("Inserisci il numero di goal squadra 2");
        int goalSq2 = scanner.nextInt();
        scanner.close();
        int totalGoal = goalSq1 + goalSq2;
        if (goalSq1 > goalSq2) {
            System.out.println("La squadra vioncente è : " + squadra1);
        } else if (goalSq1 == goalSq2) {
            System.out.println("Le due squadre hanno pareggiato");
        } else {
            System.out.println("La squadra vioncente è : " + squadra2);
        }

        System.out.println("Il totale dei goal segnati è : " + totalGoal);

    }
}
