package Distributore;

import java.util.ArrayList;
import java.util.HashMap;

public class Distributore {

    private HashMap<Integer, Prodotto> approvvigionamento = new HashMap<Integer, Prodotto>();
    private ArrayList<Tessera> tessereInMemoria = new ArrayList<Tessera>();

    public void addTesseraInMemoria(Tessera tessera) {
        tessereInMemoria.add(tessera);
    }

    public double leggiCredito(int codiceTessera) {
        for (Tessera tessera : tessereInMemoria) {
            if (tessera.getCodice() == codiceTessera) {
                return tessera.getCredito();
            }
        }
        return 0;
    }

    public String getApprovvigionamento() {

        return " \n l'approvvigionamento del distributore: \n " + "colonna 1 - " + approvvigionamento.get(1)
                + " - quantità: " + approvvigionamento.get(1).quantita
                + "\n colonna 2 - " + approvvigionamento.get(2)
                + " - quantità: " + approvvigionamento.get(2).quantita
                + "\n colonna 3 - " + approvvigionamento.get(3)
                + " - quantità: " + approvvigionamento.get(3).quantita
                + "\n colonna 4 - " + approvvigionamento.get(4)
                + " - quantità: " + approvvigionamento.get(4).quantita;
    }

    public int lattineDisponibili(String codice) {
        int accumulator = 0;

        for (int i = 1; i < 5; i++) {
            if (approvvigionamento.get(i).codice == codice) {
                accumulator = accumulator + approvvigionamento.get(i).quantita;

            }
        }
        return accumulator;

    }

    public void aggiornaColonna(int colonna, Bevanda bevanda, int quantita) {
        Prodotto newProduct = new Prodotto(bevanda);
        newProduct.setQuantita(quantita);
        approvvigionamento.put(colonna, newProduct);
    }

    public String eroga(String codiceBevanda, int codiceTessera) {
        double creditotessera = -1;
        String nomeBevanda = "";
        double costoBevanda = 0;
        int colonnaBevanda = 0;

        for (Tessera tessera : tessereInMemoria) {
            if (tessera.getCodice() == codiceTessera) {
                creditotessera = tessera.getCredito();
            }
        }
        for (int i = 1; i < 5; i++) {
            if (approvvigionamento.get(i).codice == codiceBevanda) {
                nomeBevanda = approvvigionamento.get(i).nome;
                colonnaBevanda = i;
                costoBevanda = approvvigionamento.get(i).prezzo;
            }
        }
        if (costoBevanda <= creditotessera) {
            this.aggiornaColonna(colonnaBevanda, this.approvvigionamento.get(colonnaBevanda).bevanda,
                    this.approvvigionamento.get(colonnaBevanda).quantita - 1);
            return "IL prodotto verrà erogato dalla colonna " + colonnaBevanda;

        }
        return "non erogo";

    }
}
