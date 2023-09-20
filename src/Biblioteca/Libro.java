package Biblioteca;

public class Libro {
    String titolo;
    String autore;

    Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public boolean equals(Object obj) {
        Libro libro = (Libro) obj;
        if (libro.getAutore().equals(this.autore) &&
                libro.getTitolo().equals(this.titolo)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro [titolo=" + titolo + ", autore=" + autore + "]";
    }
}
