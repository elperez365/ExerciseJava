package ImpiegatiPaghe;

public class Ufficio {

	private Impiegato[] listaImpiegati;

	public Ufficio(Impiegato[] listaImpiegati) {
		super();
		this.listaImpiegati = listaImpiegati;
	}

	public int media(int[] m) {
		int somma = 0;
		int numImpiegatiTrovati = 0;
		// scorrere listaimpiegati
		for (Impiegato impiegato : listaImpiegati) {

			// se l impiegato � compreso in m
			// allora aggiorna media
			for (int impiegato2 : m) {
				if (impiegato.getMatricola() == impiegato2) {
					numImpiegatiTrovati++;
					somma = somma + impiegato.getRetribuzione();
				}

			}

		}
		int media = somma / numImpiegatiTrovati;
		return media;
	}

	public String[] dipendentiPiuPagati(int[] a) {
		String[] h = new String[this.listaImpiegati.length];
		int posImp = 0;
		// calcolo media degli impiegati contenuti in a
		int media = media(a);

		// ritorno impiegati con retribuzione piu alta di media
		for (Impiegato imp : listaImpiegati) {
			if (imp.getRetribuzione() > media) {
				h[posImp] = imp.getCognome();
				posImp++;
			}

		}
		return h;

	}

	public static void main(String[] args) {

		Impiegato r = new Impiegato(1, "pagano", "antonio", 50000);
		Impiegato r1 = new Impiegato(2, "lagana", "cesare", 4000);
		Impiegato r2 = new Impiegato(3, "rossi", "flavio", 1000);

		Impiegato[] elencoImp = new Impiegato[3];
		elencoImp[0] = r;
		elencoImp[1] = r1;
		elencoImp[2] = r2;

		Ufficio u = new Ufficio(elencoImp);

		int[] m = new int[4];
		m[0] = 2;
		m[1] = 3;
		m[2] = 40;
		m[3] = 10;

		// int media = u.media(m);
		// System.out.println(media);
		//

		String[] res = u.dipendentiPiuPagati(m);

		for (String s : res) {
			if (s != null)
				System.out.println(s);
		}

	}

}
