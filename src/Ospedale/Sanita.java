package Ospedale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sanita {

    List<Paziente> pazienti = new ArrayList<Paziente>();
    List<Medico> medici = new ArrayList<Medico>();

    public void aggiugniPaziente(String nome, String cognome, String codiceFiscale) {
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

    public void caricaDati(String path) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get(path));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] dati = line.split(";");
            if (dati[0].equalsIgnoreCase("P")) {
                this.aggiugniPaziente((String) dati[1], (String) dati[2], (String) dati[3]);
            } else if (dati[0].equalsIgnoreCase("M")) {
                this.aggiungiMedico((String) dati[1], (String) dati[2], (String) dati[3], (String) dati[4]);
            }
            line = bufferedReader.readLine();
        }

    }

}
