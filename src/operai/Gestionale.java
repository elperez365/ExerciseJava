package operai;

import java.util.ArrayList;
import java.util.List;

public class Gestionale {

	private List<Impiegato> impiegati = new ArrayList<Impiegato>();
	private List<Dipartimento> dipartimenti = new ArrayList<Dipartimento>();
	private List<Progetto> progetti = new ArrayList<Progetto>();

	public void aggiungiImpiegato(Impiegato i) {
		impiegati.add(i);
	}

	public void eliminaImpiegato(String codFisc) {
		for (Impiegato impiegato : impiegati) {
			if (impiegato.getCodiceFiscale().equals(codFisc)) {
				impiegati.remove(impiegato);
				break;
			}
		}
	}

	public void aggiungiProgetto(Progetto p) {
		progetti.add(p);

	}

	public void associaImpiegatoProgetto(Progetto p, Impiegato i) {
		for (Progetto prog : progetti) {
			if (prog.getNome().equals(p.getNome())) {
				prog.getPartecipanti().add(i);
			}
		}
	}

	public void aggiungiDipartimento(Dipartimento d) {
		dipartimenti.add(d);
	}

	public static void main(String[] args) {
		Gestionale g = new Gestionale();

		Impiegato i = new Impiegato();
		i.setCodiceFiscale("iii");

		g.aggiungiImpiegato(i);
		Progetto p = new Progetto("provaProgetto");
		g.aggiungiProgetto(p);

		Impiegato f = new Impiegato();
		f.setCodiceFiscale("ffffffffff");

		g.associaImpiegatoProgetto(p, f);

		Dipartimento d = new Dipartimento();
		d.setNome("provaDipartimento");
		System.out.println(g.toString());

	}
}
