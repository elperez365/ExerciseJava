import java.util.Scanner;

public class AreaRettangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la base del rettangolo in cm");
        int base = scanner.nextInt();
        System.out.println("inserisci l'altezza del rettangolo in cm");
        int altezza = scanner.nextInt();
        int area = base * altezza;
        int perimetro = (base + altezza) * 2;

        System.out.println("Il perimetro è: " + perimetro + "cm");
        System.out.println("L'area è: " + area + "cmq");

    }
}
