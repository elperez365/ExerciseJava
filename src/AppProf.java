import java.util.ArrayList;

import java.util.Scanner;

public class AppProf {
    static ArrayList<String> GoldCat = new ArrayList<String>();
    static ArrayList<String> SilverCat = new ArrayList<String>();
    static ArrayList<String> BronzeCat = new ArrayList<String>();

    public static void pushCategory(String name, int download) {
        if (download < 500000) {
            BronzeCat.add(name);
        } else if (download > 2000000) {
            GoldCat.add(name);
        } else {
            SilverCat.add(name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Inserisci i download della App " + String.valueOf(i));
            AppProf.pushCategory("App" + String.valueOf(i), scanner.nextInt());
        }

        scanner.close();

        System.out.println("Categoria Gold: " + AppProf.GoldCat.size());
        System.out.println("Categoria Silver: " + AppProf.SilverCat.size());
        System.out.println("Categoria Bronze: " + AppProf.BronzeCat.size());

    }
}
