package Distributore;

public class Prodotto {
    String nome;
    String codice;
    int quantita = 0;
    double prezzo = 0;
    Bevanda bevanda;

    Prodotto(Bevanda bevanda) {
        this.nome = bevanda.getNome();
        this.codice = bevanda.getCodice();
        this.prezzo = bevanda.getPrezzo();
        this.bevanda = bevanda;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
