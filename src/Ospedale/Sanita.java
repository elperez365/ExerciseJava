package Ospedale;

import java.util.ArrayList;
import java.util.List;

public class Sanita {
    List<Paziente> pazienti = new ArrayList<Paziente>();
    List<Medico> medici = new ArrayList<Medico>();

    public void aggiugniPersona(String nome, String cognome, String codiceFiscale) {
        pazienti.add(new Paziente(nome, cognome, codiceFiscale));
    }

    public Persona getPersona(String codiceFiscale) throws Exception {
        for (Paziente paziente : pazienti) {
            if (paziente.getCodiceFiscale().equals(codiceFiscale)) {
                return paziente;
            }
        }
        for (Medico medico : medici) {
            if (medico.getCodiceFiscale().equals(codiceFiscale)) {
                return medico;
            }
        }
        throw new Exception("Persona inesistente");
    }

    public void aggiungiMedico(String nome, String cognome, String codiceFiscale, String matricola) {
        medici.add(new Medico(nome, cognome, codiceFiscale, matricola));
    }

    public Medico getMedico(String matricola) throws Exception {
        for (Medico medico : medici) {
            if (medico.getMatricola().equals(matricola)) {
                return medico;
            }
        }
        throw new Exception("Medico inesistente");
    }

    public void assegnaMedico(String codiceFiscale, String matricola) throws Exception {
        this.getPersona(codiceFiscale).setMedico(this.getMedico(matricola));
    }

    public void caricaDati() {
        /*
         * scrivi il codice per caricare i dati dal file "dati.txt" e popolare le liste
         */

    }

}
