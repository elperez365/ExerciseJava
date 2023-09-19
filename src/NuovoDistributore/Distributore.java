package NuovoDistributore;

import java.util.ArrayList;
import java.util.HashMap;

public class Distributore {

	ArrayList<Colonna> colonne = new ArrayList<Colonna>();

	HashMap<String, Bevanda> bevande = new HashMap<String, Bevanda>();
	HashMap<Integer, Tessera> tessere = new HashMap<Integer, Tessera>();

	public void aggiungiBevanda(Bevanda b) {
		bevande.put(b.getCodice(), b);
	}

	public double getPrice(String codice) {
		try {
			Bevanda b = bevande.get(codice);
			return b.getPrezzo();
		} catch (NullPointerException e) {
			return -1;
		}
	}

	public String getName(String codice) {
		try {
			Bevanda b = bevande.get(codice);
			return b.getNome();
		} catch (NullPointerException e) {
			return null;
		}
	}

	public void caricaTessera(Tessera t) {
		tessere.put(t.getCodice(), t);
	}

	public double leggiCredito(int codice) {
		try {
			Tessera t = tessere.get(codice);
			return t.getCredito();
		} catch (NullPointerException e) {
			return -1;
		}
	}

	public void aggiornaColonna(int numeroColonna, String tipoBevanda, int numeroLattine) {
		Colonna c = new Colonna();
		c.setNumeroColonna(numeroColonna);
		c.setTipoBevanda(tipoBevanda);
		c.setNumeroLattine(numeroLattine);
		colonne.add(c);
	}

	public int lattineDisponibili(String codice) {
		int lattine = 0;
		for (Colonna c : colonne) {
			if (c.getTipoBevanda().equals(codice)) {
				lattine += c.getNumeroLattine();
			}
		}
		return lattine;
	}

	public int eroga(String codice, int codiceTessera) {
		Bevanda b = bevande.get(codice);
		Tessera t = tessere.get(codiceTessera);
		Colonna c = null;

		for (Colonna col : colonne) {
			if (col.getTipoBevanda().equals(codice)) {
				c = col;
				break;
			}
		}

		try {
			if (b.getPrezzo() <= t.getCredito()) {
				t.setCredito(t.getCredito() - b.getPrezzo());
				return c.getNumeroColonna();
			} else if (b.getPrezzo() > t.getCredito()) {
				throw new IllegalArgumentException("Credito insufficiente");
			} else if (c.getNumeroLattine() == 0) {
				throw new IllegalArgumentException("Lattine esaurite");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}
}
