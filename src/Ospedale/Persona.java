package Ospedale;

public class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private Medico medico;

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
