package GestionaleImpiegati.dao;

import java.util.ArrayList;
import java.util.List;

import GestionaleImpiegati.model.Impiegato;

public class ImpiegatoDao {

	private List<Impiegato> listaImpiegato = new ArrayList<>();

	public Impiegato ricercaPerCodiceFiscale(String codiceFiscale) {
		Impiegato impiegatoFound = new Impiegato("null", "null", "null", 0);
		for (Impiegato impiegato : listaImpiegato) {
			if (impiegato.getCodiceFiscale() == codiceFiscale) {
				impiegatoFound = impiegato;
			}
		}
		// - ricercaPerCodiceFiscale, prende in ingresso un codice fiscale cerca
		// un impiegato, dentro listaImpiegato, con quel codice. Ritornare l'impiegato
		// cercato, altrimenti null.

		return impiegatoFound;
	}

	public void inserisci(Impiegato i) {
		listaImpiegato.add(i);
		// inserisci, prende in ingresso un'istanza i di Impiegato e l'aggiunge in
		// listaImpiegato.

	}

	public boolean aggiorna(Impiegato impiegato) {
		boolean found = false;
		for (Impiegato i : listaImpiegato) {
			if (impiegato.getCodiceFiscale() == i.getCodiceFiscale()) {
				i.setNome(impiegato.getNome());
				i.setMatricola(impiegato.getMatricola());
				i.setCognome(impiegato.getCognome());
				found = true;
			}

		}

		// - aggiorna, prende in ingresso un'istanza i di Impiegato, la cerca, tramite
		// codice fiscale in listaImpiegato, e se la trova aggiorna il contenuto con
		// l'istanza
		// i. Ritornare vero, se l'istanza � stata trovata.

		return found;
	}

	public boolean elimina(String codiceFiscale) {
		boolean found = false;

		for (Impiegato impiegato : listaImpiegato) {
			if (impiegato.getCodiceFiscale() == codiceFiscale) {
				found = true;
				break;
			}
		}
		if (found) {
			List<Impiegato> listaImpiegatoNuova = new ArrayList<>();
			for (Impiegato impiegato : listaImpiegato) {
				if (impiegato.getCodiceFiscale() != codiceFiscale) {
					listaImpiegatoNuova.add(impiegato);
				}

			}
			if (listaImpiegatoNuova.size() > 0) {
				this.listaImpiegato = listaImpiegatoNuova;
			}

		}
		return found;
	}

	public static void main(String[] args) {
		ImpiegatoDao impiegati = new ImpiegatoDao();
		impiegati.inserisci(new Impiegato("Paolo", "Rossi", "plarvs88h45g098q", 1552));
		impiegati.inserisci(new Impiegato("Giacomo", "Vinci", "gcmvnc88h45g098q", 1553));
		impiegati.inserisci(new Impiegato("Antonio", "Bool", "ntnbla88h45g098q", 1554));
		impiegati.inserisci(new Impiegato("Giuseppe", "Strai", "gspstr88h45g098q", 1555));
		impiegati.inserisci(new Impiegato("Vasco", "Rossi", "vscrss88h45g098q", 1551));

		System.out.println(impiegati.elimina("vscrss88h45g098q"));
		System.out.println(impiegati.listaImpiegato);
	}
}
