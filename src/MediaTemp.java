import java.util.ArrayList;
import java.util.Scanner;

public class MediaTemp {

    public static void main(String[] args) {

        ArrayList<String> temperature = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 12; i++) {
            System.out.println("inserisci la temperatura " + i + " in °C");
            int temperatura = scanner.nextInt();
            temperature.add(String.valueOf(temperatura));
        }
        scanner.close();
        int accumulatore = 0;
        for (int i = 0; i < temperature.size(); i++) {
            accumulatore = accumulatore + Integer.valueOf(temperature.get(i));
        }

        double mediaTemp = Double.valueOf(accumulatore) / temperature.size();

        System.out.println("la media delle temperatur inserite è: " + mediaTemp);

    }

}
