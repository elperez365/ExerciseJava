package Distributore;

import java.util.ArrayList;

public class ProvaDistributore {
    public static void main(String[] args) {

        Bevanda acqua = new Bevanda("A", "Acqua", 0.20);
        Bevanda coca = new Bevanda("B", "Coca", 0.30);
        Bevanda birra = new Bevanda("C", "Birra", 1.00);

        Tessera tessera1 = new Tessera(12);
        Tessera tessera2 = new Tessera(21);
        Tessera tessera3 = new Tessera(99);

        tessera1.caricaTessera(5.5);
        tessera2.caricaTessera(10.0);
        tessera3.caricaTessera(0.75);

        Distributore distributore1 = new Distributore();
        distributore1.aggiornaColonna(1, acqua, 40);
        distributore1.aggiornaColonna(2, coca, 1);
        distributore1.aggiornaColonna(3, birra, 50);
        distributore1.aggiornaColonna(4, acqua, 50);

        distributore1.addTesseraInMemoria(tessera1);
        distributore1.addTesseraInMemoria(tessera2);
        distributore1.addTesseraInMemoria(tessera3);

        System.out.println(distributore1.getApprovvigionamento());

        System.out.println();
        System.out.println(distributore1.lattineDisponibili("A"));
        System.out.println();
        System.out.println(distributore1.leggiCredito(12));
        System.out.println();
        System.out.println(distributore1.eroga("C", 21));
        System.out.println();
        System.out.println("approvvigionamento aggiornato");
        System.out.println(distributore1.getApprovvigionamento());
    }
}
