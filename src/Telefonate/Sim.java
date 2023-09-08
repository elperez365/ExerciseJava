package Telefonate;

public class Sim {

	private int numeroSim;
	private int importo;

	Telefonata[] telefonateFatte = new Telefonata[10];
	Telefonata[] telefonateRicevute = new Telefonata[10];

	public void costoTotaleTelefonate() {
		int costoTotale = 0;
		for (int i = 0; i < telefonateFatte.length; i++) {
			costoTotale = costoTotale + telefonateFatte[i].getCosto();
		}
		System.out.println("costo Totale �:" + costoTotale);
	}

	public void durataTotaleTelefonate() {
		int durataTotale = 0;
		for (int i = 0; i < telefonateFatte.length; i++) {
			durataTotale = durataTotale + telefonateFatte[i].getDurata();
		}
		System.out.println("durata Totale �:" + durataTotale);
	}

	public void aggiungiTelefonataFatta(Telefonata f) {
		for (int i = 0; i < telefonateFatte.length; i++) {
			telefonateFatte[i + 1] = telefonateFatte[i];
		}
	}

	public void stampaTelefonataFatte() {
		System.out.println("ELENCO TELEFONATE FATTE");
		for (int i = 0; i < telefonateFatte.length; i++) {
			System.out.println(telefonateFatte[i].getNumero());
		}
	}

	public void stampaTelefonataRicevute() {
		System.out.println("ELENCO TELEFONATE RICEVUTE");
		for (int i = 0; i < telefonateFatte.length; i++) {
			System.out.println(telefonateFatte[i].getNumero());
		}
	}

	public static void main(String[] args) {
		Telefonata t = new Telefonata();
		t.setNumero(122);
		t.setDurata(100);
		t.setCosto(200);

		Telefonata t1 = new Telefonata();
		t1.setNumero(122);
		t1.setDurata(100);
		t1.setCosto(200);

		Sim s = new Sim();
		s.aggiungiTelefonataFatta(t);
		s.aggiungiTelefonataFatta(t1);

		s.stampaTelefonataFatte();
		s.stampaTelefonataRicevute();
		s.costoTotaleTelefonate();
		s.durataTotaleTelefonate();
	}
}
