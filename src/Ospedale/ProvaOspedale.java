package Ospedale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sound.sampled.AudioFileFormat.Type;

public class ProvaOspedale {
    public static void main(String[] args) throws Exception {

        Sanita sanita = new Sanita();
        sanita.caricaDati("./src/Ospedale/dati.txt");
        sanita.aggiungiMedico("antonio", "gialli", "cfgialliantonio", "matricola123");
        sanita.assegnaMedico("mratcg88h46g678p", "matricola123");
        System.out.println(sanita.getPersona("mratcg88h46g678p").getMedico().getNome());

    }

}
