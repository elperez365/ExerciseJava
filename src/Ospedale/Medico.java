package Ospedale;

import java.util.ArrayList;

import java.util.List;

public class Medico extends Persona {

    private String matricola;
    List<Paziente> pazienti = new ArrayList<Paziente>();

    public Medico(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;

    }

    public String getMatricola() {
        return matricola;
    }

    public List<Paziente> getPazienti() {
        return pazienti.stream().sorted((p1, p2) -> p1.getCognome().compareTo(p2.getCognome())).toList();
    }

}
