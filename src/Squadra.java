import java.util.Scanner;

public class Squadra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String name = scanner.next();
        System.out.println("Inserisci il tuo cognome");
        String surname = scanner.next();
        System.out.println("Inserisci la tua squadra");
        String squadra = scanner.next();
        System.out.println("Ciao " + name + " " + surname + "!" + "\n" + "La tua squadra del cuore è : " + squadra);

        scanner.close();
    }
}
