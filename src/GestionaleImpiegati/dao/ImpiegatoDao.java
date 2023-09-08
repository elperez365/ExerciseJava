package GestionaleImpiegati.dao;

import java.util.ArrayList;
import java.util.List;

import GestionaleImpiegati.model.Impiegato;

public class ImpiegatoDao {

	private List<Impiegato> listaImpiegato = new ArrayList<>();

	public Impiegato ricercaPerCodiceFiscale(String codiceFiscale) {
		// - ricercaPerCodiceFiscale, prende in ingresso un codice fiscale cerca
		// un impiegato, dentro listaImpiegato, con quel codice. Ritornare l'impiegato
		// cercato, altrimenti null.

		return null;
	}

	public void inserisci(Impiegato i) {
		// inserisci, prende in ingresso un'istanza i di Impiegato e l'aggiunge in
		// listaImpiegato.

	}

	public boolean aggiorna(Impiegato i) {
		// - aggiorna, prende in ingresso un'istanza i di Impiegato, la cerca, tramite
		// codice fiscale in listaImpiegato, e se la trova aggiorna il contenuto con
		// l'istanza
		// i. Ritornare vero, se l'istanza � stata trovata.

		return false;
	}

	public boolean elimina(String codiceFiscale) {
		// - elimina, prende in ingresso un codice fiscale e cerca, dentro
		// listaImpiegato,
		// un impiegato con quel codice fiscale. Se lo trova lo elimina. Ritorna vero se
		// ha trovato un impiegato con quel codice.

		return false;
	}

	public static void main(String[] args) {

	}
}
