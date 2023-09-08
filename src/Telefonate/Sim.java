package Telefonate;

public class Sim {
	private int numero;
	private int importo;

	private Telefonata[] elencoTelefonateFatte = new Telefonata[10];
	private Telefonata[] elencoTelefonateRicevute = new Telefonata[10];

	public void aggiungiTelefonataFatta(Telefonata t) {

		// traslare verso destra
		for (int i = elencoTelefonateFatte.length - 1; i >= 1; i--) {

			elencoTelefonateFatte[i] = elencoTelefonateFatte[i - 1];

		}

		elencoTelefonateFatte[0] = t;

	}

	public void aggiungiTelefonataRicevuta(Telefonata t) {

		// traslare verso destra
		for (int i = elencoTelefonateRicevute.length - 1; i >= 1; i--) {

			elencoTelefonateRicevute[i] = elencoTelefonateRicevute[i - 1];

		}

		elencoTelefonateRicevute[0] = t;

	}

	public int costoTotaleChiamate() {
		int costoTotale = 0;
		for (int i = 0; i < elencoTelefonateFatte.length; i++) {
			if (elencoTelefonateFatte[i] != null)
				costoTotale = costoTotale + elencoTelefonateFatte[i].getCosto();
		}

		return costoTotale;
	}

	public int durataTotaleChiamate() {
		int durataTotale = 0;
		for (int i = 0; i < elencoTelefonateFatte.length; i++) {
			if (elencoTelefonateFatte[i] != null)
				durataTotale = durataTotale + elencoTelefonateFatte[i].getDurata();
		}

		for (int i = 0; i < elencoTelefonateRicevute.length; i++) {
			if (elencoTelefonateRicevute[i] != null)
				durataTotale = durataTotale + elencoTelefonateRicevute[i].getDurata();
		}

		return durataTotale;
	}

	public void stampaTelefonateFatte() {
		for (int i = 0; i < elencoTelefonateFatte.length; i++) {
			if (elencoTelefonateFatte[i] != null)
				System.out.println(elencoTelefonateFatte[i].getNumero());
		}
	}

	public void stampaTelefonateRicevute() {
		for (int i = 0; i < elencoTelefonateRicevute.length; i++) {
			if (elencoTelefonateRicevute[i] != null)
				System.out.println(elencoTelefonateRicevute[i].getNumero());
		}
	}
}
