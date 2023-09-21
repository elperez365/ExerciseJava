package BibliotecaCopy;

import java.util.ArrayList;

public class Ripiano {
    ArrayList<Libro> libri = new ArrayList<Libro>();

    Ripiano(int nLibriPerRipiano) {
        libri = new ArrayList<Libro>();
    }

    @Override
    public String toString() {
        String s = "";
        for (Libro libro : libri) {
            s = s + libro.toString() + "\n";

        }
        return "\n" + s;
    }
}
