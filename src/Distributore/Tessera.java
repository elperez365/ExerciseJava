package Distributore;

public class Tessera {
    private int codice;
    private double credito = 0;

    Tessera(int codice) {
        this.codice = codice;
    }

    public int getCodice() {
        return codice;
    }

    public double getCredito() {
        return credito;
    }

    public void caricaTessera(double credito) {
        this.credito = credito;
    }

}
